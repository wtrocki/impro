function [class] = classKNN(training, group, key, schedule)
%CLASSKNN classify data using KNN classifier and cross-validation.
%   training - data with selected features
%   group - affiliation to classifying group (1 - benign, 2 - malignant, etc...)
%   key      - key and schedule are
%   schedule - used for cross-validation
%   style - style of result presentation (basic, extended, full)
%   class - classification results

s = size(schedule, 1); % number of cases
class = zeros(size(group,1), 1);

for i=1:s % classify for each case in schedule
    idx = key == schedule(i); % indexes for sample
    class(idx) = knnclassify(training(idx,:), training(~idx,:), group(~idx), 7);
end

end