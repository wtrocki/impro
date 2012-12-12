classdef ExtractFeatures < Operation
    %# ExtractFeatures
    %% Extracts features from given set of segmented images
    
    %% Class Properties
    properties (SetAccess = public)
        ClassificationName
    end
    
    methods
        function EF = ExtractFeatures(classificationName)
            EF@Operation();
            if nargin < 1
                error('Invalid input arguments. Please provide DirInput object')
            end
            EF.ClassificationName=classificationName;
        end
        
        function features = processOperation(EF,args)
            if(size(args,2)~=4)
                error('Invalid processing arguments for ExtractFeatures');
            end
            features= EF.extractFeatures(args{1},args{2},args{3},args{4});
        end

        function [feature] = extractFeatures(EF,FE,segImage,originalImage,index)
                skipped = 0; % number of skipped files due to no objects on image
                % get number and labels of objects on the image
                [label, number] = bwlabel(segImage, 4);
                
                % check if there are objects on the image
                if (number == 0)
                    skipped = skipped + 1; % it means how many files has been skipped
                    if(FE.verbose)
                        disp(['ExtractFeatures: No objects in ' segImage', file has been skipped']);
                    end
                    feature=0;
                else
                    % calculate basic features
                    rp = regionprops(label, 'all');
                    
                    % calculate luminance variance and mean
                    h = [0 1 1; -1 0 1; -1 -1 0]; % sets gradient filter
                    imGrad = imfilter(rgb2gray(originalImage), h);
                    luminanceVariance = zeros(1, number);
                    luminanceMean = zeros(1, number);
                    for j=1:number
                        luminanceVariance(j) = var(double(imGrad(label == j)));
                        luminanceMean(j) = mean(double(imGrad(label == j)));
                    end
                    
                    % calculate distance from centroid
                    sumX = 0;
                    sumY = 0;
                    for j = 1:number
                        sumX = sumX + rp(j).Centroid(1);
                        sumY = sumY + rp(j).Centroid(2);
                    end
                    cogX = sumX/number;
                    cogY = sumY/number;
                    distToCentroid = zeros(1, number);
                    for j = 1:number
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
                    
                    name=FE.DirInput.getFileName(index);
                    f.FileName = name;
                    if(size(name,2)>5)
                        f.PatientNo = name(1:4);
                    else
                        error('Unknown file standard');
                    end
                    
                    f.Diagnosis = EF.ClassificationName;
                    f.ClassificationGroup = GroupConventer.performConversion(EF.ClassificationName);
                    feature = f; % saves features f into the structure
                    if(FE.verbose)
                        disp(['FE: Features has been extracted [' num2str(index) '/' num2str(FE.DirInput.ImagesLength) ' | ' num2str(100*index/FE.DirInput.ImagesLength, '% .1f') '%]']);
                    end
                end
        end
    end
end
