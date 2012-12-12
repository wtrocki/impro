function [resultScore, resultSet] = forwardSelectionRecursive(classifier, cvType, features, set, startScore, varargin)
%FORWARDSELECTIONRECURSIVE Finds quasi-optimal set of features for given classifier (recursively).
%   classifier - defines which classifier will be used
%   cvType - cross-validation type ('image' or 'patient')
%   features - features extracted from objects on pictures
%   set - starting set of features (in case of empty set use cell(0))
%   startScore - starting score for given staring set (it should be 0 for empty starting set)
%   varargin - features to select
%   resultScore - the best efficiency found
%   resultSet - the set of features which gives the best efficiency

disp(' ');
disp(['Forward selection: Starting ' classifier ' (' cvType ') score = ' num2str(startScore, '% .2f') '%']);

featureN = size(varargin, 2);
setN = size(set, 2);

% prepare string with the names of features for displaying purpose
setStr = [];
for i = 1:setN
    setStr = [setStr, set{i}, ', '];
end

% calculate score for each new feature
score = zeros(featureN, 1);
for i = 1:featureN
    [training, group, key, schedule] = prepareClassData(features, false, set{:}, varargin{i});
    switch classifier
        case 'KNN'
            clKNN = classKNN(training, group, key, schedule);
            [imEff, patEff] = generateResults( clKNN, group, key, schedule, 'none', classifier);
            
        case 'Naive Bayes'
            clNB = classNaiveBayes(training, group, key, schedule);
            [imEff, patEff] = generateResults(clNB, group, key, schedule, 'none', classifier);
            
        case 'Decision trees'
            clDT = classDecisionTrees(training, group, key, schedule);
            [imEff, patEff] = generateResults(clDT, group, key, schedule, 'none', classifier);
            
        case 'Ensemble classifier'
            clKNN = classKNN(training, group, key, schedule);
            clNB = classNaiveBayes(training, group, key, schedule);
            clDT = classDecisionTrees(training, group, key, schedule);
            clEC = classEnsembleClass(clKNN, clNB, clDT);
            [imEff, patEff] = generateResults(clEC, group, key, schedule, 'none', classifier);
            
        otherwise
            error(['Unknow classifier: ' classifier]);
    end

    % save score depending on cross-validation type
    switch cvType
        case 'image'
            score(i) = imEff;
            
        case 'patient'
            score(i) = patEff;
            
        otherwise
            error(['Unknow cross-validation type: ' cvType]);
    end
    disp([num2str(score(i), '% .2f') '%: [' setStr(1:end-2) '] ' varargin{i}]);
end

% go forwad and return results
[sortedScore, sortedIdx] = sort(score, 'descend'); % sort results to find the best ones

if (sortedScore(1) <= startScore) % IF there is no better results
    disp('No better results.');
    resultScore = startScore;                       % return startScore...
    resultSet = set;                                % and starting set of features 

elseif (featureN > 1)            % IF there are better results and there is more features to check
    bestScore = sortedScore(sortedScore == sortedScore(1)); % saves best score (might be more then 1 occurrence of the highest value)
    bestScoreN = size(bestScore, 1);                        % usually it's 1, but there might be draw (more then 1 value with the highest value)
    newSet = cell(bestScoreN, 1);                           % for all instances of the best score prepares cell for new set
    newScore = zeros(bestScoreN, 1);                        % prepares matrix with new scores
    disp(['There are better results (' num2str(bestScoreN) 'x ' num2str(sortedScore(1), '% .2f') '%). Going forward...']);
    for i = 1:bestScoreN                                    % for all instances of the best score go forward
        newSet{i} = set;                                    % set current set of features and...
        newSet{i}(setN + 1) = varargin(sortedIdx(i));       % add the feature which has the hightes score
        idx = true(1, featureN);                            % create index where all values are true...
        idx(sortedIdx(i)) = false;                          % except the feature which was added to newSet
        [newScore(i), newSet{i}] = forwardSelectionRecursive(classifier, cvType, features, newSet{i}, sortedScore(i), varargin{idx}); % recursive call of forwardSelectionRecursive
    end
    
    [newSortedScore, newSortedIdx] = sort(newScore, 'descend'); % sort new results to find the best ones
    if (newSortedScore(1) > sortedScore(1))    % if there is better result than previously the best return the new ones
        resultScore = newSortedScore(1);
        resultSet = newSet{newSortedIdx(1)};  
    else                                       % if there is not better result return previously the best
        resultScore = sortedScore(1);
        resultSet = set;
        resultSet(setN + 1) = varargin(sortedIdx(1));
    end

else                             % IF there are better results but there is no more features to check
    disp('No more features to check.');
    resultScore = sortedScore(1);                   % return the best score...
    resultSet = set;                                % and the set...
    resultSet(setN + 1) = varargin(sortedIdx(1));   % giving the best score
end

end

