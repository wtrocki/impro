function [training group key schedule] = prepareClassData(features, display, varargin)
%PREPARECLASSDATA prepares data of selected features into form used in
%classificators.
%   features - features extracted from objects on pictures
%   display - logical variable indicating if the list of featres should be
%             displayed (true) or not (false)
%   varargin - feature list to be used in classification
%   training - data prepared for classifiers
%   group - affiliation to classifying group (1 - benign, 2 - malignant, etc...)
%   key      - key and chedule are
%   schedule - used for cross-validation

fSize = size(features, 1);
training = zeros(fSize, 2);
group = zeros(fSize, 1);

key = 1:fSize;
schedule = unique(key);

for i = 1:fSize
    training(i,1) = features(i).ikona;
    training(i,2) = features(i).odcien;
    group(i) = features(i).wynik;
end

end