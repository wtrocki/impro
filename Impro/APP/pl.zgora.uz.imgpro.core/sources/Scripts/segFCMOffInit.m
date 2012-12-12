function [center] = segFCMOffInit(clusterN, options)
%SEGFCMOFFINIT Calculates cluster centers for given set of images.
%   clusterN - number of clusters
%   options - it's a matrix [a b c d] where:
%           a: exponent for the partition matrix U (default: 2.0)
%           b: maximum number of iterations (default: 100)
%           c: minimum amount of improvement (default: 1e-5)
%           d: info display during iteration (default: 1)

% check if the file with centers already exists and load it or calculate and save them into file
fName = '../Data/FCMOff_Centers.mat';
if (exist(fName, 'file') == 2)
    load(fName);
    disp('FCMOff: Initialized from file');
else
    disp('FCMOff: Calculating cluster centers');
   
    % load and aggregate images
    imFiles = dir('../Data/FCMOff_LearningImages/*.tif');

    imMat = []; % matrix of images
    for i = 1:numel(imFiles)
        im = imread(['../Data/FCMOff_LearningImages/' imFiles(i).name]);
        imMat = [imMat im];
    end

    % calculate centers
    data = double(reshape(imMat, size(imMat, 1)*size(imMat, 2), 3)); % reshapes image into form accepted by fcm function
    [center, ~, ~] = fcm(data, clusterN, options);    

    % save centers to file
    save(fName, 'center');
    disp(['FCMOff: Cluster centers has been saved to file ' fName]);
end

end

