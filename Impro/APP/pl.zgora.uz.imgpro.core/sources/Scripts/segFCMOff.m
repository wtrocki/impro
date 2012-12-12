function [segIm] = segFCMOff(im, center, options, threshold)
%SEGFCMOFF Fuzzy C-Means Off-Line segmentation.
%   The Off-Line version does not calculate clusters for every image.
%   Clustering is done only once for a given set of images and using gained
%   centers segmentation is performed.
%
%   im - input image
%   center - precalculated centers of clusters
%   options - it's a matrix [a b c d] where:
%           a: exponent for the partition matrix U (default: 2.0)
%           b: maximum number of iterations (default: 100)
%           c: minimum amount of improvement (default: 1e-5)
%           d: info display during iteration (default: 1)
%   threshold - it's used for final thresholding of nuclei cluster

data = double(reshape(im, size(im, 1)*size(im,2), 3)); % reshapes image into form accepted by fcm function
cluster_n = size(center, 1); % defines clusters number

% FUZZY C-MEANS STARTS HERE
if options(1) <= 1,
    error('FCMOff: The exponent should be greater than 1');
end
expo = options(1); % exponent for U

dist = distfcm(center, data);  % fill the distance matrix
tmp = dist.^(-2/(expo-1));     % calculate new U, suppose expo != 1
U = tmp./(ones(cluster_n, 1)*sum(tmp));
% mf = U_new.^expo;                  % it's not used in the segmentation
% obj_fcn = sum(sum((dist.^2).*mf)); % leaved for future development
% FUZZY C-MEANS STOPS HERE

[~, idx] = sort(mean(center,2));  % finds the darkest cluster,
segIm = U(idx(1),:);              % which represents nuclei
segIm = reshape(segIm, size(im, 1), size(im,2)); % reshapes data back into image format
segIm(segIm<threshold) = 0;    % final
segIm(segIm>=threshold) = 255; % thresholding
segIm = uint8(segIm);

end