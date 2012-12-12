function [bestScore, bestSet] = FullSelection(cvType, features, minK, maxK, varargin)
%FULLSEARCH Finds optimal set of features for given classifier and number
%of features by checking all combination for any number of elements between
%minK and maxK.
%   classifier - defines which classifier will be used
%   cvType - cross-validation type ('image' or 'patient')
%   features - features extracted from objects on pictures
%   minK - minimum number of features
%   maxK - maximum number of features
%   varargin - features to select
%   bestScore - the best efficiency found
%   bestSet - the set of features which gives the best efficiency

varargin=varargin{:};
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
disp(['Full search (' cvType '):']);
bestScoreKNN = 0;
bestScoreNB = 0;
bestScoreDT = 0;
bestScoreEC = 0;

% try all combination for all number of features between minK and maxK
for k = minK:maxK
    disp(['Searching for k = ' num2str(k) '...']);
    comb = combnk(varargin, k); % generate all combination for k
    s = size(comb, 1);          % number of combinations
    
    for i = 1:s     % for all combinations calculate score
        % prepare string with the names of features for displaying purpose
        combStr = [];
        for j = 1:k
            combStr = [combStr, comb{i,j}, ', '];
        end
        disp(['[' num2str(i) '/' num2str(s)  ' | ' num2str(100*i/s, '% .1f') '%] features: ' combStr(1:end-2)]);

        % prepare data
        [training, group, key, schedule] = prepareClassData(features, false, comb{i,:});
        
        % KNN
        clKNN = classKNN(training, group, key, schedule);
        [imEffKNN, patEffKNN] = generateResults( clKNN, group, key, schedule, 'none', 'KNN');

        % save score depending on cross-validation type
        switch cvType
            case 'image'
                scoreKNN = imEffKNN;
            case 'patient'
                scoreKNN = patEffKNN;
            otherwise
                error(['Unknow cross-validation type: ' cvType]);
        end
        
        % if the score is better than previously the best save it as the best
        if (scoreKNN > bestScoreKNN)
            bestScoreKNN = scoreKNN;
            bestSetKNN = comb(i,:);
            disp(['+                 KNN = ' num2str(scoreKNN, '% .2f') '%']);
        else
            disp(['                  KNN = ' num2str(scoreKNN, '% .2f') '%']);
        end
        
        % Naive Bayes
        clNB = classNaiveBayes(training, group, key, schedule);
        [imEffNB, patEffNB] = generateResults(clNB, group, key, schedule, 'none', 'Naive Bayes');

        % save score depending on cross-validation type
        switch cvType
            case 'image'
                scoreNB = imEffNB;
            case 'patient'
                scoreNB = patEffNB;
            otherwise
                error(['Unknow cross-validation type: ' cvType]);
        end
        
        % if the score is better than previously the best save it as the best
        if (scoreNB > bestScoreNB)
            bestScoreNB = scoreNB;
            bestSetNB = comb(i,:);
            disp(['+         Naive Bayes = ' num2str(scoreNB, '% .2f') '%']);
        else
            disp(['          Naive Bayes = ' num2str(scoreNB, '% .2f') '%']);
        end
        
        % Decision trees
        clDT = classDecisionTrees(training, group, key, schedule);
        [imEffDT, patEffDT] = generateResults(clDT, group, key, schedule, 'none', 'Decision trees');

        % save score depending on cross-validation type
        switch cvType
            case 'image'
                scoreDT = imEffDT;
            case 'patient'
                scoreDT = patEffDT;
            otherwise
                error(['Unknow cross-validation type: ' cvType]);
        end
        
        % if the score is better than previously the best save it as the best
        if (scoreDT > bestScoreDT)
            bestScoreDT = scoreDT;
            bestSetDT = comb(i,:);
            disp(['+      Decision trees = ' num2str(scoreDT, '% .2f') '%']);
        else
            disp(['       Decision trees = ' num2str(scoreDT, '% .2f') '%']);
        end
        
        % Enseble classifier
        clEC = classEnsembleClass(clKNN, clNB, clDT);
        [imEffEC, patEffEC] = generateResults(clEC, group, key, schedule, 'none', 'Enseble classifier');

        % save score depending on cross-validation type
        switch cvType
            case 'image'
                scoreEC = imEffEC;
            case 'patient'
                scoreEC = patEffEC;
            otherwise
                error(['Unknow cross-validation type: ' cvType]);
        end
        
        % if the score is better than previously the best save it as the best
        if (scoreEC > bestScoreEC)
            bestScoreEC = scoreEC;
            bestSetEC = comb(i,:);
            disp(['+ Ensemble classifier = ' num2str(scoreEC, '% .2f') '%']);
        else
            disp(['  Ensemble classifier = ' num2str(scoreEC, '% .2f') '%']);
        end
        
    end
end

% display results
disp(' ');
disp(['The best score (KNN) = ' num2str(bestScoreKNN, '% .2f') '% for following features:']);
for i=1:size(bestSetKNN, 2)
    disp(['• ' bestSetKNN{i}]);
end
disp(' ');
disp(['The best score (Naive Bayes) = ' num2str(bestScoreNB, '% .2f') '% for following features:']);
for i=1:size(bestSetNB, 2)
    disp(['• ' bestSetNB{i}]);
end
disp(' ');
disp(['The best score (Decision trees) = ' num2str(bestScoreDT, '% .2f') '% for following features:']);
for i=1:size(bestSetDT, 2)
    disp(['• ' bestSetDT{i}]);
end
disp(' ');
disp(['The best score (Ensemble classifier) = ' num2str(bestScoreEC, '% .2f') '% for following features:']);
for i=1:size(bestSetEC, 2)
    disp(['• ' bestSetEC{i}]);
end

disp(' ');
disp(['Full search (' cvType ') has finished.']);

% return results
bestScore = [bestScoreKNN; bestScoreNB; bestScoreDT; bestScoreEC];
bestSet = {bestSetKNN; bestSetNB; bestSetDT; bestSetEC};

end

