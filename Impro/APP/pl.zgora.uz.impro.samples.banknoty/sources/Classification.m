function [ ] = Classification(features, style, varargin)
%CLASSIFY Classifies using given features and available classifiers.
%   features - features extracted from objects on pictures
%   style - style of result presentation (basic, standard, extended or full)
%   varargin - feature list to be used in classification

% preparing data
[training, group, key, schedule] = prepareClassData(features, true, varargin{:});

% decision trees
clDT = classDecisionTrees(training, group, key, schedule);
generateResults(clDT, group, key, schedule, style, 'Decision trees');

end

