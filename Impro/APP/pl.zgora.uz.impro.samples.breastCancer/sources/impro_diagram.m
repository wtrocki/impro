% Image Processing Toolbox AutoGenerated Script

%Initializations
diary(strcat('..\logs\Log_', datestr(now, 'yyyy-mm-dd_HH.MM.SS'), '.txt'));
	
%% ------------------------  EXTRACTION FOR FEATURE GROUP NR 1
%% Input arguments
directory='E:\mgr\tests\Benign\';
filter='*.tif';
inputHolder=DirInput(directory,filter);

%% Segmentation stage
segmentation=Segmentation(inputHolder);
segmentation.verboseMode(1);
windowSize=20;
at_threshold=0.01;
useMedian=0;
segmentation.run(SegAT(windowSize,at_threshold,useMedian));

%% Features Extraction stage
featuresExtraction=FeaturesExtraction(inputHolder);
featuresExtraction.verboseMode(1);
classificationGroup='Benign';
features1=featuresExtraction.run(ExtractFeatures(classificationGroup));
	
%% ------------------------  EXTRACTION FOR FEATURE GROUP NR 2
%% Input arguments
directory='E:\mgr\tests\Malignant\';
filter='*.tif';
inputHolder=DirInput(directory,filter);

%% Segmentation stage
segmentation=Segmentation(inputHolder);
segmentation.verboseMode(1);
windowSize=20;
at_threshold=0.01;
useMedian=0;
segmentation.run(SegAT(windowSize,at_threshold,useMedian));

%% Features Extraction stage
featuresExtraction=FeaturesExtraction(inputHolder);
featuresExtraction.verboseMode(1);
classificationGroup='Malignant';
features2=featuresExtraction.run(ExtractFeatures(classificationGroup));

% Collect all features
features=[features1; features2; ];

%% ------------------------ STARTING SELECTION AND CLASSIFICATION

%% Features Selection stage
classes={'DistToCentroid_mean','Eccentricity_var','Perimeter_var','LuminanceVariance_var','MajorAxisLength_var','DistToCentroid_var','Area_var','MinorAxisLength_mean','LuminanceMean_var','MinorAxisLength_var','Perimeter_mean','LuminanceVariance_mean','MajorAxisLength_mean','LuminanceMean_mean','Area_mean','Eccentricity_mean'};
ForwardSelection('Decision trees','image',features,cell(0), 0,classes);
ForwardSelection('Ensemble classifier','image',features,cell(0), 0,classes);
ForwardSelection('Naive Bayes','image',features,cell(0), 0,classes);
ForwardSelection('KNN','image',features,cell(0), 0,classes);


%% Features Classification stage
style='full';
Classification(features,style,'Area_var');
Classification(features,style,'DistToCentroid_var');
Classification(features,style,'MajorAxisLength_var');
Classification(features,style,'LuminanceVariance_var');
Classification(features,style,'DistToCentroid_mean');
Classification(features,style,'LuminanceMean_var');
Classification(features,style,'MinorAxisLength_mean');
Classification(features,style,'MinorAxisLength_var');
Classification(features,style,'LuminanceVariance_mean');
Classification(features,style,'Perimeter_mean');
Classification(features,style,'MajorAxisLength_mean');
Classification(features,style,'Area_mean');
Classification(features,style,'LuminanceMean_mean');
Classification(features,style,'Eccentricity_mean');
Classification(features,style,'Eccentricity_var');
Classification(features,style,'Perimeter_var');


%% ------------------------END OF CLASSIFICATION PROCESS
diary off;