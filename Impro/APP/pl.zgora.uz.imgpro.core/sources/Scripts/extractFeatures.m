function [features] = extractFeatures(imDir, segMethod) 
%EXTRACTFEATURES Extract features of objects on images from folder imDir.
%   imDir - input images folder path
%   segMethod - segmentation method, it's used for setting segmented images
%               folder path and name of file where features are supposed to
%               be saved
%   features - features extracted from objects on pictures

startTime = now;
segImDir = [imDir '_seg' segMethod];
disp(' ');
disp(['Extracting features from files in ' segImDir ':']);   

% construct a name of the file where the extracted features are or will be saved
[~, name, ~] = fileparts(imDir);
fName = ['../Data/Features_seg' segMethod '_' name '.mat'];
skipped = 0; % number of skipped files due to no objects on image

% check if the file with the features already exists and load it or
% extract features and save them into file
if (exist(fName, 'file') == 2)
    disp('FE: Loading features from file');
    load(fName);
    disp(['FE: Features for ' segImDir ' has been loaded from file']);
else
    imFiles = dir([imDir '/*.tif']);
    
    nF = numel(imFiles);
    for i = 1:nF
        % read original and segmented image
        im = imread([imDir '/' imFiles(i).name]);
        segIm = imread([segImDir '/' imFiles(i).name]);
        
        % get number and labels of objects on the image
        [l, n] = bwlabel(segIm, 4);
        
        % check if there are objects on the image
        if (n == 0)
            skipped = skipped + 1; % it means how many files has been skipped
            disp(['FE: No objects in ' segImDir '/' imFiles(i).name ', file has been skipped']);
        else
            % calculate basic features
            rp = regionprops(l, 'all');

            % calculate luminance variance and mean
            h = [0 1 1; -1 0 1; -1 -1 0]; % sets gradient filter
            imGrad = imfilter(rgb2gray(im), h);
            luminanceVariance = zeros(1, n);
            luminanceMean = zeros(1, n);
            for j=1:n
                luminanceVariance(j) = var(double(imGrad(l == j)));
                luminanceMean(j) = mean(double(imGrad(l == j)));
            end
            
            % calculate distance from centroid
            sumX = 0;
            sumY = 0;
            for j = 1:n
                sumX = sumX + rp(j).Centroid(1);
                sumY = sumY + rp(j).Centroid(2);
            end
            cogX = sumX/n;
            cogY = sumY/n;
            distToCentroid = zeros(1, n);
            for j = 1:n
               distToCentroid(j) = pdist([cogX cogY; rp(j).Centroid(1) rp(j).Centroid(2)], 'euclidean'); 
            end
            
            % saving features into the structure
            f = []; % clearing f
            f.Area = [rp.Area];
            f.Perimeter = [rp.Perimeter];
            f.Eccentricity = [rp.Eccentricity];
            f.MajorAxisLength = [rp.MajorAxisLength];
            f.MinorAxisLength = [rp.MinorAxisLength];
            f.LuminanceVariance = luminanceVariance;
            f.LuminanceMean = luminanceMean;
            f.DistToCentroid = distToCentroid;

            f.Area_mean = mean(f.Area);
            f.Area_var = var(f.Area);
            f.Perimeter_mean = mean(f.Perimeter);
            f.Perimeter_var = var(f.Perimeter);
            f.Eccentricity_mean = mean(f.Eccentricity);
            f.Eccentricity_var = var(f.Eccentricity);
            f.MajorAxisLength_mean = mean(f.MajorAxisLength);
            f.MajorAxisLength_var = var(f.MajorAxisLength);
            f.MinorAxisLength_mean = mean(f.MinorAxisLength);
            f.MinorAxisLength_var = var(f.MinorAxisLength);
            f.LuminanceVariance_mean = mean(f.LuminanceVariance);
            f.LuminanceVariance_var = var(f.LuminanceVariance);
            f.LuminanceMean_mean = mean(f.LuminanceMean);
            f.LuminanceMean_var = var(f.LuminanceMean);
            f.DistToCentroid_mean = mean(f.DistToCentroid);
            f.DistToCentroid_var = var(f.DistToCentroid);
             
            f.FileName = imFiles(i).name;
            f.PatientNo = str2double(imFiles(i).name(:,1:4));
            f.Diagnosis = name;
            
            
            switch name % gives a number for each diagnosis, it's for classification purposes
                case 'Benign'; f.ClassificationGroup = 1;
                case 'Malignant'; f.ClassificationGroup = 2;
                case 'AdenomaFibroma'; f.ClassificationGroup = 3;
                otherwise; error(['Unknow classification group: ' name]);
            end
            
            features(i - skipped, 1) = f; % saves features f into the structure

            disp(['FE: Features has been extracted from ' segImDir '/' imFiles(i).name ' [' num2str(i) '/' num2str(nF) ' | ' num2str(100*i/nF, '% .1f') '%]']);
        end
    end
    
    % save extracted features to file
    save(fName, 'features');
    disp(['FE: Extracted features has been saved to file ' fName]);
end

if (skipped > 0)
    disp(['FE: WARNING - ' num2str(skipped) ' images contain no objects!']);
end
disp(['FE: Feature extraction time - ' datestr(now - startTime, 'HH:MM:SS.FFF')]);

end

