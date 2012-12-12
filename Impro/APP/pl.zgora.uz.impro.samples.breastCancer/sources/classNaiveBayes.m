function [class] = classNaiveBayes(training, group, key, schedule)
%CLASSKNN classify data using naive Bayes classifier and cross-validation.
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
    
    classifier = NaiveBayes.fit(training(~idx,:), group(~idx), 'Distribution', 'kernel', 'KSType', 'normal');
    class(idx) = classifier.predict(training(idx,:));
end

end