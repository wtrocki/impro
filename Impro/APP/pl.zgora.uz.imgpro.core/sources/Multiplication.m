classdef Multiplication < SegmentationOperation
    %# Multiplication
    %# Multiplication for segmentation operations.
    %# Allows to perform multiplication for two segmentation methods
    
    methods
        function MU = Multiplication(varargin)
            MU@SegmentationOperation();
            MU.Args=varargin;
        end
        
        function image = processOperation(MU,args)
            if(size(args,2)~=1)
                error('Invalid processing arguments for Multiplication');
            end
            
            if(numel(MU.Args)~=2)
                error('Invalid input arguments for Multiplication. Please provide two segmentation methods objects');
            end
            
            image=args{1};
            seg1=MU.Args{1};
            seg2=MU.Args{2};
            img1=seg1.process(image);
            img2=seg2.process(image);
            image=img1.*img2;
        end
    end
end
