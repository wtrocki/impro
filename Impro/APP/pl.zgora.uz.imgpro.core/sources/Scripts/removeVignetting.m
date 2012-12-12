function [preIm] = removeVignetting(im, bfIm)
%REMOVEVIGNETTING Removes vignetting from an image.
%   im - image to remove vignetting
%   bfIm - image of blank frame

bfIm = double(bfIm);

% separate channels RGB
r = bfIm(:,:,1);
g = bfIm(:,:,2);
b = bfIm(:,:,3);
 
% find maximum value             | max(max(r))
% divide actual value of blank   | r - max(max(r))
% frame by the maximum           |
% subtract result from 1         | 1 - r/max(max(r))
% mask is an image size matrix containing values between 1 and 2, 
% it represents how much darker particular pixels are and how much
% they need to be brightened (eg. 1 means there's no vignetting at all,
% 1.12 means the pixel is 12% darker than it should be)
mask = ones(size(im));
mask(:,:,1) = 2 - r/max(max(r)); % R channel
mask(:,:,2) = 2 - g/max(max(g)); % G channel
mask(:,:,3) = 2 - b/max(max(b)); % B channel

% multiply the image by the mask to brighten pixels according to vignetting
preIm = uint8(double(im) .* mask);

end

