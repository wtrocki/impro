classdef FeaturesExtraction < Phase
    %# FeaturesExtraction
    %# Extracts features from segmented images
    %%
    % Class Properties
    properties (SetAccess = private)
        DirInput
    end
    
    %%
    %#
    methods
        function FE = FeaturesExtraction(DirInputObject)
            if nargin < 1
                error('Invalid input arguments. Please provide DirInput object')
            end
            FE@Phase('Features extraction');
            FE.DirInput=DirInputObject;
            DirInputObject.init('extraction\');
        end
        
        function features = runPhase(FE,args)
            if(FE.verbose)
                disp('Extracting features from segmented images ');
            end
            
            % Extract features
            if(numel(args)~=1)
                error('No extractions operations');
            end
            extractionOperation=args{1};
            
            fName = [FE.DirInput.getExistingStoreDir() 'features-' extractionOperation.ClassificationName '.mat'];
            % Load properties form file
            if (exist(fName, 'file') == 2)
                if(FE.verbose)
                    disp('FE: Loading features from file');
                end
                load(fName);
                if(FE.verbose)
                    disp('FE: Features has been loaded from file');
                end
            else
                features=FE.runGathering(extractionOperation,fName);
            end
        end
        
        function features = runGathering(FE,extraction,storeName)
            input=FE.DirInput.getImagesToRead();
            cleanImages=FE.DirInput.getOriginalImages();
            for index=1:FE.DirInput.ImagesLength
                % Read Images
                segDir=char(input(index));
                orgDir=char(cleanImages(index));
                segImage=imread(segDir);
                originalImage=imread(orgDir);
                feature  = extraction.process(FE,segImage,originalImage,index);
                if isstruct(feature)
                    features(index, 1)= feature;
                end
            end
            % save extracted features to file
            save(storeName, 'features');
            if(FE.verbose)
                disp(['FE: Extracted features has been saved to file ' storeName]);
            end
            
        end
    end
end