function [bestScore, bestSet] = forwardSelection(classifier, cvType, features, set, startScore, varargin)
%FORWARDSELECTION Finds quasi-optimal set of features for given classifier.
%   classifier - defines which classifier will be used
%   cvType - cross-validation type ('image' or 'patient')
%   features - features extracted from objects on pictures
%   set - starting set of features (in case of empty set use cell(0))
%   startScore - starting score for given staring set (it should be 0 for empty starting set)
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
disp(['Forward selection for ' classifier ' (' cvType '):']);

% run forward selection
[bestScore, bestSet] = forwardSelectionRecursive(classifier, cvType, features, set, startScore, varargin{:});

% display results
disp(' ');
disp(['The best score = ' num2str(bestScore, '% .2f') '% for following features:']);
for i=1:size(bestSet, 2)
    disp(['• ' bestSet{i}]);
end
disp(' ');
disp(['Forward selection for ' classifier ' (' cvType ') has finished.']);

end

