classdef Crop < Operation
    %# Crop
    %% Performs Crop operation on image (Used to remove black border in image) 
    % Class Properties
    properties (SetAccess = private)
        cropValue
    end
    
    %%
    methods
        function CRP = Crop(cropValue)
            CRP@Operation();
            CRP.cropValue=cropValue;
        end
        
        function image=processOperation(CRP,args)
            if(size(args,2)~=1)
                 error('Invalid processing arguments for NoiseRemove');
            end
            image=args{1};
            image=CRP.performCrop(image);
        end
        
        function image = performCrop(CRP,image)
            %# crop image to remove black border
            imS = size(image);
            image = imresize(image, [300 300]);
        end
    end
end
    