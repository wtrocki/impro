function [center] = segKMOffInit(clusterN)
%SEGKMOFFINIT Calculates cluster centers for given set of images.
%   clusterN - number of clusters

% check if the file with centers already exists and load it or calculate and save them into file
fName = '../Data/KMOff_Centers.mat';
if (exist(fName, 'file') == 2)
    load(fName);
    disp('KMOff: Initialized from file');
else
    disp('KMOff: Calculating cluster centers');
   
    % load and aggregate images
    imFiles = dir('../Data/KMOff_LearningImages/*.tif');

    imMat = []; % matrix of images
    for i = 1:numel(imFiles)
        im = imread(['../Data/KMOff_LearningImages/' imFiles(i).name]);
        imMat = [imMat im];
    end

    % calculate centers
    data = double(reshape(imMat, size(imMat, 1)*size(imMat,2), 3)); % reshapes image into form accepted by fcm function
    [~, center] = kmeans(data, clusterN);

    % save centers to file
    save(fName, 'center');
    disp(['KMOff: Cluster centers has been saved to file ' fName]);
end

end

