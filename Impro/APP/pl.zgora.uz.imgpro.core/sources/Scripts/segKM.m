function [segIm] = segKM(im, clusterN)
%SEGKM K-means segmentation.
%   im - input image
%   clusterN - number of clusters

data = double(reshape(im, size(im, 1)*size(im, 2), 3)); % reshapes image into form accepted by kmeans function
[U, center] = kmeans(data, clusterN, 'start', 'cluster', 'emptyaction', 'singleton');

[~, idx] = sort(mean(center,2));  % finds the darkest cluster, which represents nuclei
U(U ~= idx(1)) = 0;
U(U == idx(1)) = 255;
segIm = reshape(U, size(im, 1), size(im,2)); % reshapes data back into image format
segIm = uint8(segIm);

end

