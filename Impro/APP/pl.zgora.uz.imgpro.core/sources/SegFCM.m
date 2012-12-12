classdef SegFCM < SegmentationOperation
    %SEGFCM Fuzzy C-Means segmentation.
            %   im - input image
            %   clusterN - number of clusters
            %   options - it's a matrix [a b c d] where:
            %           a: exponent for the partition matrix U (default: 2.0)
            %           b: maximum number of iterations (default: 100)
            %           c: minimum amount of improvement (default: 1e-5)
            %           d: info display during iteration (default: 1)
            %   threshold - it's used for final thresholding of nuclei cluster
    methods
        function FCM = SegFCM(varargin)
            FCM@SegmentationOperation();
            FCM.Args=varargin;
        end
        
        function image = processOperation(FCM,args)
            if(size(args,2)~=1)
                error('Invalid processing arguments for SegFCM');
            end
            image=args{1};
            if(numel(FCM.Args)~=3)
                error('Invalid input arguments for SegFCM');
            end
            image= FCM.segFCM(image,FCM.Args{1},FCM.Args{2},FCM.Args{3});
            image = FCM.removeArtefacts(image, 'small', 40);
        end
    end
    
    methods (Static)
        function [segIm] = segFCM(im, clusterN, options, threshold)
            %SEGFCM Fuzzy C-Means segmentation.
            %   im - input image
            %   clusterN - number of clusters
            %   options - it's a matrix [a b c d] where:
            %           a: exponent for the partition matrix U (default: 2.0)
            %           b: maximum number of iterations (default: 100)
            %           c: minimum amount of improvement (default: 1e-5)
            %           d: info display during iteration (default: 1)
            %   threshold - it's used for final thresholding of nuclei cluster
            
            data = double(reshape(im, size(im, 1)*size(im, 2), 3)); % reshapes image into form accepted by fcm function
            [cluster, U, ~] = fcm(data, clusterN, options);
            
            [~, idx] = sort(mean(cluster,2)); % finds the darkest cluster,
            segIm = U(idx(1),:);              % which represents nuclei
            segIm = reshape(segIm, size(im, 1), size(im,2)); % reshapes data back into image format
            segIm(segIm<threshold) = 0;    % final
            segIm(segIm>=threshold) = 255; % thresholding
            segIm = uint8(segIm);
            
        end 
    end
end
