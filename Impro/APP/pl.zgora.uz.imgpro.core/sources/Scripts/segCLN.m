function [segIm] = segCLN(im, net)
%SEGCLN Competitive Lerning Network based segmentation.
%   im - source image
%   net - trained neural network used to segmentation

% prepare neural network input vector from image im
r = im(:,:,1);
g = im(:,:,2);
b = im(:,:,3);
p = double([r(:)'; g(:)'; b(:)']);

% segment image
a = sim(net, p);
segIm = vec2ind(a);
s = size(im);                         % reshape result vector to the size
segIm = reshape(segIm, s(1), s(2));   % of the source image
segIm = uint8(segIm);

% find the neuron describing nuclei
w = mean(net.IW{1}); % gives mean weight of each neuron

if w(1) == min(w)
    segIm(segIm == 1) = 255;
else
    segIm(segIm == 1) = 0;
end

if w(2) == min(w)
    segIm(segIm == 2) = 255;
else
    segIm(segIm == 2) = 0;
end

if w(3) == min(w)
    segIm(segIm == 3) = 255;
else
    segIm(segIm == 3) = 0;
end

end

% the old way of finding the neuron describing nuclei
% RGBMean = [mean(im(segIm==1)), mean(im(segIm==2)), mean(im(segIm==3))];
% 
% if RGBMean(1) == min(RGBMean)
%     segIm(segIm == 1) = 255;
% else
%     segIm(segIm == 1) = 0;
% end
% 
% if RGBMean(2) == min(RGBMean)
%     segIm(segIm == 2) = 255;
% else
%     segIm(segIm == 2) = 0;
% end
% 
% if RGBMean(3) == min(RGBMean)
%     segIm(segIm == 3) = 255;
% else
%     segIm(segIm == 3) = 0;
% end
