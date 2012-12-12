classdef Crop < Operation
    %# Crop
    %% Performs Crop operation on image (Used to remove black border in image) 
    % Class Properties
    properties (SetAccess = private)
        cropX
        cropY
    end
    
    %%
    methods
        function CRP = Crop(cropY,cropX)
            CRP@Operation();
            CRP.cropX=cropX;
            CRP.cropY=cropY;
        end
        
        function image=processOperation(CRP,args)
            if(size(args,2)~=1)
                 error('Invalid processing arguments for Crop');
            end
            image=args{1};
            image=CRP.performCrop(image);
        end
        
        function image = performCrop(CRP,image)
            %# crop image to remove black border
            imS = size(image);
            image = imcrop(image, [CRP.cropX, CRP.cropY, imS(2) - *CRP.cropX, imS(1) - CRP.cropY]);
        end
    end
end
    