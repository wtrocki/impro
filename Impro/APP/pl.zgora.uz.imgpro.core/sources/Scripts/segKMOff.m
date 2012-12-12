function [segIm] = segKMOff(im, center)
%SEGKMOFF K-Means Off-Line segmentation.
%   The Off-Line version does not calculate clusters for every image.
%   Clustering is done only once for a given set of images and using gained
%   centers segmentation is performed.
%
%   im - input image
%   center - precalculated centers of clusters

data = double(reshape(im, size(im, 1)*size(im,2), 3)); % reshapes image into form accepted by fcm function
cluster_n = size(center, 1); % defines clusters number

% K-MEANS STARTS HERE
nData = size(data, 1);
dist = [];
U = ones(nData, 1);

for i=1:cluster_n,
    c = center(i, :);
    c = c(ones(nData, 1), :);
    D = data - c;
    D = D.*D;
    D = sqrt(sum(D,2));
    if (i == 1)
        dist = D;
        U = ones(nData, 1);
    else
        idx = find(D<dist);
        U(idx) = U(idx)+1;
    end;
end;
% K-MEANS STOPS HERE

[~, idx] = sort(mean(center,2));  % finds the darkest cluster, which represents nuclei
U(U ~= idx(1)) = 0;
U(U == idx(1)) = 255;
segIm = reshape(U, size(im, 1), size(im,2)); % reshapes data back into image format
segIm = uint8(segIm);

end

