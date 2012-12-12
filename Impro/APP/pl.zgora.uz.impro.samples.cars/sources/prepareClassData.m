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

featureN = size(varargin, 2); % number of features to prepare
s = size(features, 1); % number of images
training = zeros(s, featureN); % data for classifiers
group = zeros(s, 1); % affiliation to classifying group (1 - benign, 2 - malignant, etc...)
key = zeros(s, 1); % key is used with schedule to cross-validation

if (display)
    disp(' ');
    disp('_____________________________________');
    disp('Classifying using following features:');
    for i=1:featureN
        disp(['• ' cell2mat(varargin(i))]);
    end
    disp(' ');
end

% translate features into classifier friendly matrix
for i=1:s
    for j=1:featureN
        training(i,j) = features(i).(cell2mat(varargin(j)));
    end
    group(i) = features(i).ClassificationGroup;
    key(i) = features(i).PatientNo;
end

% set cross-validation schedule
schedule = unique(key); % sets "patient" cross-validation schedule
% key = (1:s)';   % it's for developing purposes, uncomment it if you
% schedule = key; % like to use "image" cross-validation schedule

% standardization or normalization of the features
for j=1:featureN
    % normalization
%     training(:,j) = training(:,j) - min(training(:,j));
%     training(:,j) = training(:,j) / max(training(:,j));
    
    % standardization
    training(:,j) = (training(:,j) - mean(training(:,j))) / std(training(:,j));
end

end