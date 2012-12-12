function [bestScore, bestSet] = fullSearch(classifier, cvType, features, minK, maxK, varargin)
%FULLSEARCH Finds optimal set of features for given classifier and number of features.
%   classifier - defines which classifier will be used
%   cvType - cross-validation type ('image' or 'patient')
%   features - features extracted from objects on pictures
%   minK - minimum number of features
%   maxK - maximum number of features
%   varargin - features to select
%   bestScore - the best efficiency found
%   bestSet - the set of features which gives the best efficiency

% if the first given feature name is 'all' use all available features
if (strcmp(varargin{1}, 'all'))
    varargin = {'Area_mean', 'Area_var',...
                'Perimeter_mean', 'Perimeter_var',...
                'Eccentricity_mean', 'Eccentricity_var',...
                'MajorAxisLength_mean', 'MajorAxisLength_var',...
                'MinorAxisLength_mean', 'MinorAxisLength_var',...
                'LuminanceMean_mean', 'LuminanceMean_var',...
                'LuminanceVariance_mean', 'LuminanceVariance_var',...
                'DistToCentroid_mean', 'DistToCentroid_var'};
end

disp(' ');
disp(['Full search for ' classifier ' (' cvType '):']);
bestScore = 0;

% try all combination for all number of features between minK and maxK
for k = minK:maxK
    disp(['Searching for k = ' num2str(k) '...']);
    comb = combnk(varargin, k); % generate all combination for k
    s = size(comb, 1);          % number of combinations
    
    for i = 1:s     % for all combinations calculate score
        [training, group, key, schedule] = prepareClassData(features, false, comb{i,:});
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
                score = imEff;

            case 'patient'
                score = patEff;

            otherwise
                error(['Unknow cross-validation type: ' cvType]);
        end
        
        % prepare string with the names of features for displaying purpose
        combStr = [];
        for j = 1:k
            combStr = [combStr, comb{i,j}, ', '];
        end
        
        % if the score is better than previously the best save it as the best
        if (score > bestScore)
            bestScore = score;
            bestSet = comb(i,:);
            disp(['+ ' num2str(score, '% .2f') '% [' num2str(i) '/' num2str(s) ']: ' combStr(1:end-2)]);
        else
            disp(['  ' num2str(score, '% .2f') '% [' num2str(i) '/' num2str(s) ']: ' combStr(1:end-2)]);
        end
    end
end

% display results
disp(' ');
disp(['The best score = ' num2str(bestScore, '% .2f') '% for following features:']);
for i=1:size(bestSet, 2)
    disp(['• ' bestSet{i}]);
end
disp(' ');
disp(['Full search for ' classifier ' (' cvType ') has finished.']);

end

