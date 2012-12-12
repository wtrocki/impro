%% Initialization

startTime = now;
diary(strcat('..\Logs\Log_', datestr(startTime, 'yyyy-mm-dd_HH.MM.SS'), '.txt'));
disp('~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~');
disp(' Breast Cancer Diagnostic System (ver. 2011.07.18_01) has started');
disp([' ' datestr(startTime, 'yyyy-mm-dd HH:MM:SS')]);
disp('~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~');
disp(' ');
disp('Experiment description:');
disp('<put your description here>');

% input images paths
benignDir = '../Images/Benign';
%malignantDir = '../Images/Malignant';
%adenomaFibromaDir = '../Images/AdenomaFibroma';

% Segmentation methods:
%   AT - adaptive thresholding
%   FCM - fuzzy c-means based segmentation
%   FCMOff - fuzzy c-means off line based segmentation
%   ATmFCM - multiplication of results images of AT and FCM
%   CLN - competitive lerning networks based segmentation
%   KM - k-means based segmentation
%   ATmKM - multiplication of result images of AT and KM
%   KMOff - k-means off line based segmentation
%   ATmFCMOff - multiplication of result images of AT and FCMOff
%   ATmCLN - multiplication of result images of AT and CLN
%   ATmKMOff - multiplication of result images of AT and KMOff
%   other - it's for testing purposes
segMethod = 'ATmCLN';

%TODO w segmentFiles stworzyl sie katalog mimo, ze nie bylo danej
%segmentacji

% Results presentation styles:
%   basic - efficiency only
%   standard - efficiency, uncertain, incorrect, image efficiency
%   extended - all above plus confusion matrices
%   full - all above plus classification results for each image
style = 'standard';

%% Preprocessing

ppStartTime = now;

% Preprocessing operations (order makes a difference):
%   noise - removes noise
%   vignietting - removes vignietting
%   crop - crops image to remove black boarder
%   histStrech - histogram stretching
%   none - do nothing

% preprocess(benignDir, 'noise', 'vignietting', 'crop');
% preprocess(malignantDir, 'noise', 'vignietting', 'crop');
% preprocess(adenomaFibromaDir, 'noise', 'vignietting', 'crop');

ppStopTime = now;

%% Segmentation

segStartTime = now;

%segmentFiles(benignDir, segMethod);
%segmentFiles(malignantDir, segMethod);
%segmentFiles(adenomaFibromaDir, segMethod);

segStopTime = now;

%% Features extraction

feStartTime = now;

% features = [extractFeatures(benignDir, segMethod);...
%             extractFeatures(malignantDir, segMethod)];
features = [extractFeatures(benignDir, segMethod);...
            extractFeatures(malignantDir, segMethod);...
            extractFeatures(adenomaFibromaDir, segMethod)];

feStopTime = now;

%% Classification

classStartTime = now;

% Available features:
%   Area_mean
%   Area_var
%   Perimeter_mean
%   Perimeter_var
%   Eccentricity_mean
%   Eccentricity_var
%   MajorAxisLength_mean
%   MajorAxisLength_var
%   MinorAxisLength_mean
%   MinorAxisLength_var
%   LuminanceMean_mean
%   LuminanceMean_var
%   LuminanceVariance_mean
%   LuminanceVariance_var
%   DistToCentroid_mean
%   DistToCentroid_var

% Available classifiers:
%   KNN
%   Naive Bayes
%   Decision trees
%   Ensemble classifier

crossVal = 'image';

% forwardSelection('KNN', crossVal, features, cell(0), 0, 'all');
% forwardSelection('Naive Bayes', crossVal, features, cell(0), 0, 'all');
% forwardSelection('Decision trees', crossVal, features, cell(0), 0, 'all');
% forwardSelection('Ensemble classifier', crossVal, features, cell(0), 0, 'all');

[bestScore, bestSet] = fullSearchAllClass(crossVal, features, 2, 3, 'all');

% forwardSelection('KNN', crossVal, features, bestSet{1}, bestScore(1), 'all');
% forwardSelection('Naive Bayes', crossVal, features, bestSet{2}, bestScore(2), 'all');
% forwardSelection('Decision trees', crossVal, features, bestSet{3}, bestScore(3), 'all');
% forwardSelection('Ensemble classifier', crossVal, features, bestSet{4}, bestScore(4), 'all');

% single features
% classify(features, style, 'Area_mean');
% classify(features, style, 'Area_var');
% classify(features, style, 'Perimeter_mean');
% classify(features, style, 'Perimeter_var');
% classify(features, style, 'Eccentricity_mean');
% classify(features, style, 'Eccentricity_var');
% classify(features, style, 'MajorAxisLength_mean');
% classify(features, style, 'MajorAxisLength_var');
% classify(features, style, 'MinorAxisLength_mean');
% classify(features, style, 'MinorAxisLength_var');
% classify(features, style, 'LuminanceMean_mean');
% classify(features, style, 'LuminanceMean_var');
% classify(features, style, 'LuminanceVariance_mean');
% classify(features, style, 'LuminanceVariance_var');
% classify(features, style, 'DistToCentroid_mean');
% classify(features, style, 'DistToCentroid_var');

% custom sets of features
% experimentPortugal;

classStopTime = now;

%% Finishing

disp(' ');
disp('~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~');
disp(['         Preprocessing time - ' datestr(ppStopTime - ppStartTime, 'HH:MM:SS.FFF')]);
disp(['          Segmentation time - ' datestr(segStopTime - segStartTime, 'HH:MM:SS.FFF')]);
disp(['    Feature extraction time - ' datestr(feStopTime - feStartTime, 'HH:MM:SS.FFF')]);
disp(['        Classification time - ' datestr(classStopTime - classStartTime, 'HH:MM:SS.FFF')]);
disp('    --------------------------------------');
disp(['                 Total time - ' datestr(now - startTime, 'HH:MM:SS.FFF')]);

% clear variables
clear benignDir;
clear malignantDir;
clear adenomaFibromaDir;
clear segMethod;
clear style;
clear crossVal;
% clear features;

clear startTime;
clear ppStartTime;
clear ppStopTime;
clear segStartTime;
clear segStopTime;
clear feStartTime;
clear feStopTime;
clear classStartTime;
clear classStopTime;

disp(' ');
disp('Breast Cancer Diagnostic System has successfully finished');
disp(' ');
diary off;