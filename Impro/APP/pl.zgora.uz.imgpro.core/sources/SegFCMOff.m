classdef SegFCMOff < SegmentationOperation
    %SEGFCMOFF Fuzzy C-Means Off-Line segmentation.
    %   The Off-Line version does not calculate clusters for every image.
    %   Clustering is done only once for a given set of images and using gained
    %   centers segmentation is performed.
    %
    %   im - input image
    %   center - precalculated centers of clusters
    %   options - it's a matrix [a b c d] where:
    %           a: exponent for the partition matrix U (default: 2.0)
    %           b: maximum number of iterations (default: 100)
    %           c: minimum amount of improvement (default: 1e-5)
    %           d: info display during iteration (default: 1)
    %   threshold - it's used for final thresholding of nuclei cluster
    
    %%
    % Class Properties
    properties (SetAccess = private)
        % precalculated centers of clusters
        Center
    end
    
    methods
        function FCMOff = SegFCMOff(varargin)
            FCMOff@SegmentationOperation();
            FCMOff.Args=varargin;
            
            if(numel(FCMOff.Args)~=3)
                error('Invalid input arguments for SegCLN');
            end
            
            clusters=FCMOff.Args{1};
            options=FCMOff.Args{2};
            FCMOff.Center= FCMOff.segFCMOffInit(clusters,options);
        end
        
        function image = processOperation(FCMOff,args)
            if(size(args,2)~=1)
                error('Invalid processing arguments for SegFCMOff');
            end
            image=args{1};
            
            if(numel(FCMOff.Args)~=3)
                error('Invalid input arguments for SegFCMOff');
            end
            
            image = FCMOff.segFCMOff(image, FCMOff.Center,FCMOff.Args{2},FCMOff.Args{3});
            image = FCMOff.removeArtefacts(image, 'small', 40);
        end
    end
    
    methods (Static)
        function [center] = segFCMOffInit(clusterN, options)
            %SEGFCMOFFINIT Calculates cluster centers for given set of images.
            %   clusterN - number of clusters
            %   options - it's a matrix [a b c d] where:
            %           a: exponent for the partition matrix U (default: 2.0)
            %           b: maximum number of iterations (default: 100)
            %           c: minimum amount of improvement (default: 1e-5)
            %           d: info display during iteration (default: 1)
            
            % check if the file with centers already exists and load it or calculate and save them into file
            fName = '../Data/FCMOff_Centers.mat';
            if (exist(fName, 'file') == 2)
                load(fName);
                disp('FCMOff: Initialized from file');
            else
                disp('FCMOff: Calculating cluster centers');
                
                % load and aggregate images
                imFiles = dir('../Data/FCMOff_LearningImages/*.tif');
                
                imMat = []; % matrix of images
                for i = 1:numel(imFiles)
                    im = imread(['../Data/FCMOff_LearningImages/' imFiles(i).name]);
                    imMat = [imMat im];
                end
                
                % calculate centers
                data = double(reshape(imMat, size(imMat, 1)*size(imMat, 2), 3)); % reshapes image into form accepted by fcm function
                [center, ~, ~] = fcm(data, clusterN, options);
                
                % save centers to file
                save(fName, 'center');
                disp(['FCMOff: Cluster centers has been saved to file ' fName]);
            end
            
        end
        
        function [segIm] = segFCMOff(im, center, options, threshold)
            %SEGFCMOFF Fuzzy C-Means Off-Line segmentation.
            %   The Off-Line version does not calculate clusters for every image.
            %   Clustering is done only once for a given set of images and using gained
            %   centers segmentation is performed.
            %
            %   im - input image
            %   center - precalculated centers of clusters
            %   options - it's a matrix [a b c d] where:
            %           a: exponent for the partition matrix U (default: 2.0)
            %           b: maximum number of iterations (default: 100)
            %           c: minimum amount of improvement (default: 1e-5)
            %           d: info display during iteration (default: 1)
            %   threshold - it's used for final thresholding of nuclei cluster
            
            data = double(reshape(im, size(im, 1)*size(im,2), 3)); % reshapes image into form accepted by fcm function
            cluster_n = size(center, 1); % defines clusters number
            
            % FUZZY C-MEANS STARTS HERE
            if options(1) <= 1,
                error('FCMOff: The exponent should be greater than 1');
            end
            expo = options(1); % exponent for U
            
            dist = distfcm(center, data);  % fill the distance matrix
            tmp = dist.^(-2/(expo-1));     % calculate new U, suppose expo != 1
            U = tmp./(ones(cluster_n, 1)*sum(tmp));
            % mf = U_new.^expo;                  % it's not used in the segmentation
            % obj_fcn = sum(sum((dist.^2).*mf)); % leaved for future development
            % FUZZY C-MEANS STOPS HERE
            
            [~, idx] = sort(mean(center,2));  % finds the darkest cluster,
            segIm = U(idx(1),:);              % which represents nuclei
            segIm = reshape(segIm, size(im, 1), size(im,2)); % reshapes data back into image format
            segIm(segIm<threshold) = 0;    % final
            segIm(segIm>=threshold) = 255; % thresholding
            segIm = uint8(segIm);
            
        end
    end
end
