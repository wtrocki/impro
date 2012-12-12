classdef NoiseRemove < Operation
    %# NoiseRemove 
    %% Removes noise from images
    
    % Class Properties
    properties (SetAccess = private)
        
    end
    
    %%
    methods
        function NR = NoiseRemove()
            NR@Operation();
        end
        
        function image = processOperation(NR,args)
            if(size(args,2)~=1)
                 error('Invalid processing arguments for NoiseRemove');
            end
            image=args{1};
            image=NR.performRemoveNoise(image);
        end
    end
    
    methods (Static)
        function image = performRemoveNoise(image)
            %# Removes noise from image
            h = [1 2 1; 2 4 2; 1 2 1] / 16; % sets gaussian filter
            image = imfilter(image, h);     % blur image to remove noise
            h = [0 -1 0; -1 5 -1; 0 -1 0];  % sets sharpening filter
            image = imfilter(image, h);     % sharpen image
        end
    end
end
    