function [segIm] = segAT(im, ws, C, tm)
%SEGAT An adaptive thresholding segmentation.
%   im - input image
%   ws - window size
%   C  - threshold is mean-C or median-C
%   tm - a switch between mean and median (0-mean(default), 1-median).

if (nargin<3)
    error('There must be provided the image im, the window size ws, and C.');
elseif (nargin==3)
    tm = 0;
elseif (tm~=0 && tm~=1)
    error('tm must be 0 or 1.');
end

IM = mat2gray(im);

if tm==0
    mIM = imfilter(IM, fspecial('average', ws), 'replicate');
else
    mIM = medfilt2(IM, [ws ws]);
end

sIM = mIM - IM - C;
segIm = im2bw(sIM,0);

end