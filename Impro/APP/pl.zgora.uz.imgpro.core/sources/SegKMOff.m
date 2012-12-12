classdef SegKMOff < SegmentationOperation
    % SEGKMOFF K-Means Off-Line segmentation.
    %   The Off-Line version does not calculate clusters for every image.
    %   Clustering is done only once for a given set of images and using gained
    %   centers segmentation is performed.
    
    %%
    % Class Properties
    properties (SetAccess = private)
        % precalculated centers of clusters
        Center
    end
    
    methods
        function KMOff = SegKMOff(varargin)
            KMOff@SegmentationOperation();
            KMOff.Args=varargin;
            
            if(numel(KMOff.Args)~=1)
                error('Invalid input arguments for SegCLN');
            end
            
            clusters=KMOff.Args{1};
            KMOff.Center= KMOff.segKMOffInit(clusters);
        end
        
        function image = processOperation(KMOff,args)
            if(size(args,2)~=1)
                error('Invalid processing arguments for SegKMOff');
            end
            image=args{1};
            
            image= KMOff.segKMOff(image, KMOff.Center);
            image = KMOff.removeArtefacts(image, 'small', 40);
        end
    end
    
    methods (Static)
        function [center] = segKMOffInit(clusterN)
            %SEGKMOFFINIT Calculates cluster centers for given set of images.
            %   clusterN - number of clusters
            
            % check if the file with centers already exists and load it or calculate and save them into file
            fName = '../Data/KMOff_Centers.mat';
            if (exist(fName, 'file') == 2)
                load(fName);
                disp('KMOff: Initialized from file');
            else
                disp('KMOff: Calculating cluster centers');
                
                % load and aggregate images
                imFiles = dir('../Data/KMOff_LearningImages/*.tif');
                
                imMat = []; % matrix of images
                for i = 1:numel(imFiles)
                    im = imread(['../Data/KMOff_LearningImages/' imFiles(i).name]);
                    imMat = [imMat im];
                end
                
                % calculate centers
                data = double(reshape(imMat, size(imMat, 1)*size(imMat,2), 3)); % reshapes image into form accepted by fcm function
                [~, center] = kmeans(data, clusterN);
                
                % save centers to file
                save(fName, 'center');
                disp(['KMOff: Cluster centers has been saved to file ' fName]);
            end
        end
        
        function [segIm] = segKMOff(im, center)
            %SEGKMOFF K-Means Off-Line segmentation.
            %   The Off-Line version does not calculate clusters for every image.
            %   Clustering is done only once for a given set of images and using gained
            %   centers segmentation is performed.
            %
            %   im - input image
            %   center - precalculated centers of clusters
            
            data = double(reshape(im, size(im, 1)*size(im,2), 3)); % reshapes image into form accepted by fcm function
            cluster_n = size(center, 1); % defines clusters number
            
            % K-MEANS STARTS HERE
            nData = size(data, 1);
            dist = [];
            U = ones(nData, 1);
            
            for i=1:cluster_n,
                c = center(i, :);
                c = c(ones(nData, 1), :);
                D = data - c;
                D = D.*D;
                D = sqrt(sum(D,2));
                if (i == 1)
                    dist = D;
                    U = ones(nData, 1);
                else
                    idx = find(D<dist);
                    U(idx) = U(idx)+1;
                end;
            end;
            % K-MEANS STOPS HERE
            
            [~, idx] = sort(mean(center,2));  % finds the darkest cluster, which represents nuclei
            U(U ~= idx(1)) = 0;
            U(U == idx(1)) = 255;
            segIm = reshape(U, size(im, 1), size(im,2)); % reshapes data back into image format
            segIm = uint8(segIm);
            
        end
    end
end
