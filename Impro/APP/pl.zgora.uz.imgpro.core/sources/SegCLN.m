classdef SegCLN < SegmentationOperation
    %# SegCLN
    %%
    
    %%
    % Class Properties
    properties (SetAccess = private)
        % Neural network used in segmentation
        Net
    end
    
    methods
        function CLN = SegCLN(varargin)
            CLN@SegmentationOperation();
            CLN.Args=varargin;
            if(numel(CLN.Args)~=1)
                error('Invalid input arguments for SegCLN');
            end
            numberOfEpochs=CLN.Args{1};
            CLN.Net = CLN.segCLNInit(numberOfEpochs, 'CLNsample1.tif');
        end
        
        function image = processOperation(CLN,args)
            if(size(args,2)~=1)
                error('Invalid processing arguments for SegCLN');
            end
            image=args{1};
            image= CLN.segCLN(image,CLN.Net);
            image = CLN.removeArtefacts(image, 'small', 40);
        end
    end
    
    methods(Static)
        function [segIm] = segCLN(im, net)
            %SEGCLN Competitive Lerning Network based segmentation.
            %   im - source image
            %   net - trained neural network used to segmentation
            
            % prepare neural network input vector from image im
            r = im(:,:,1);
            g = im(:,:,2);
            b = im(:,:,3);
            p = double([r(:)'; g(:)'; b(:)']);
            
            % segment image
            a = sim(net, p);
            segIm = vec2ind(a);
            s = size(im);                         % reshape result vector to the size
            segIm = reshape(segIm, s(1), s(2));   % of the source image
            segIm = uint8(segIm);
            
            % find the neuron describing nuclei
            w = mean(net.IW{1}); % gives mean weight of each neuron
            
            if w(1) == min(w)
                segIm(segIm == 1) = 255;
            else
                segIm(segIm == 1) = 0;
            end
            
            if w(2) == min(w)
                segIm(segIm == 2) = 255;
            else
                segIm(segIm == 2) = 0;
            end
            
            if w(3) == min(w)
                segIm(segIm == 3) = 255;
            else
                segIm(segIm == 3) = 0;
            end
        end
        
        function [net] = segCLNInit(epochs, imTName)
            %SEGCLNINIT Trains neural network using training image.
            %   Trains neural network using training image for given number of epochs.
            %   After training the net is saved into file and next time, for the same
            %   parameters it will be loaded instead of training procedure.
            %
            %   epochs - epochs if training
            %   imTName - name of image file for training
            
            % construct a name of the file where the trained network is or will be saved
            [~, name, ~] = fileparts(imTName);
            fName = ['../Data/CLN_' num2str(epochs) 'epochs_' name '.mat'];
            
            % check if the file with the trained network already exists and load it or
            % train new network and save it into file
            if (exist(fName, 'file') == 2)
                load(fName);
                disp('CLN: Initialized from file');
            else
                disp('CLN: Training network');
                net = newc([0 255; 0 255; 0 255], 3);
                
                % load training image
                if (exist(['../Data/' imTName], 'file') == 2)
                    imT = imread(['../Data/' imTName]);
                else
                    error(['CLN: Training image ../Data/' imTName ' not found']);
                end
                
                % prepare neural network training vector from training image
                r = imT(:,:,1);
                g = imT(:,:,2);
                b = imT(:,:,3);
                pT = double([r(:)'; g(:)'; b(:)']);
                
                % train network
                net.trainParam.epochs = epochs;
                net = train(net, pT);
                
                % save trained network to file
                save(fName, 'net');
                disp(['CLN: Trained network has been saved to file ' fName]);
            end
        end
    end
end
