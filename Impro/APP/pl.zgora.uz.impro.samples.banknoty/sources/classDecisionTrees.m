function [class] = classDecisionTrees(training, group, key, schedule)
%CLASSDECISIONTREES classify data using decision trees classifier and cross-validation.
%   training - data with selected features
%   group - affiliation to classifying group (1 - benign, 2 - malignant, etc...)
%   key      - key and schedule are
%   schedule - used for cross-validation
%   style - style of result presentation (basic, extended, full)
%   class - classification results

s = size(schedule, 2); % number of cases
class = zeros(size(group,1), 1);

for i=1:s % classify for each case in schedule
    idx = key == schedule(i); % indexes for sample
    
    decisionTree = classregtree(training(~idx,:), group(~idx), 'method', 'classification');
   % decisionTree = prune(decisionTree, 'level', 3);
    class(idx) = str2num(cell2mat(decisionTree(training(idx,:))));
end

end

