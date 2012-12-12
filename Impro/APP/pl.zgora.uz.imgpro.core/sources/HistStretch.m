classdef HistStretch < Operation
    %# HistStretch
    %% Performs Histogram Stretching for image
    % Class Properties
    properties (SetAccess = private)
        %Empty
    end
    
    %%
    methods
        function HS = HistStretch()
            HS@Operation();
        end
        
        function image = processOperation(HS,args)
            if(size(args,2)~=1)
                 error('Invalid processing arguments for HistStretch');
            end
            image=args{1};
            image=HS.performImgStretch(image);
        end
    end
    
    methods (Static)
        function image = performImgStretch(image)
            %# histogram stretching for image
            image = imadjust(image, stretchlim(image));
        end
    end
end
    