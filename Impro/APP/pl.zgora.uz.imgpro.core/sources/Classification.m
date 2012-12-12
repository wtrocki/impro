function [ ] = Classification(features, style, varargin)
%CLASSIFY Classifies using given features and available classifiers.
%   features - features extracted from objects on pictures
%   style - style of result presentation (basic, standard, extended or full)
%   varargin - feature list to be used in classification

% preparing data
[training, group, key, schedule] = prepareClassData(features, true, varargin{:});

% k-nearest neighbours
clKNN = classKNN(training, group, key, schedule);
generateResults(clKNN, group, key, schedule, style, 'KNN');

% naive Bayes
clNB = classNaiveBayes(training, group, key, schedule);
generateResults(clNB, group, key, schedule, style, 'Naive Bayes');

% decision trees
clDT = classDecisionTrees(training, group, key, schedule);
generateResults(clDT, group, key, schedule, style, 'Decision trees');

% ensemble classifier
clEC = classEnsembleClass(clKNN, clNB, clDT);
generateResults(clEC, group, key, schedule, style, 'Ensemble classifier');

end

