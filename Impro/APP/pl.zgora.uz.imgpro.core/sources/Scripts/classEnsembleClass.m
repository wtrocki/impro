function [class] = classEnsembleClass(varargin)
%CLASSENSEMBLECLASS classify data using classification results of other
%classifiers. Classification is done by voting.
%   group - affiliation to classifying group (1 - benign, 2 - malignant, etc...)
%   key      - key and schedule are
%   schedule - used for cross-validation
%   varargin - a set of classification results

data = cell2mat(varargin);
s = size(data,1); % number of images
class = zeros(s, 1);

for i=1:s % classify for each image
    class(i) = mode(data(i, :));
end

end

