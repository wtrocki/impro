classdef SegAT < SegmentationOperation
    %# SegAT
    %% Segmentacja przez metode progowania lokalnego
    methods
        function AT = SegAT(varargin)
            AT@SegmentationOperation();
            AT.Args=varargin;
        end
        
        function image = processOperation(AT,args)
            if(size(args,2)~=1)
                error('Invalid processing arguments for SegAT');
            end
            image=args{1};
            if(numel(AT.Args)~=3)
                error('Invalid input arguments for SegAT');
            end
            image= AT.segAT(image,AT.Args{1},AT.Args{2},AT.Args{3});
            image = AT.removeArtefacts(image, 'small and border', 40);
        end
    end
    
    methods (Static)
        function [segIm] = segAT(im, ws, C, tm)
        
            grayI = rgb2gray(im); 
            mIM=imfilter(grayI,fspecial('average',40),'replicate');
            sIM = mIM - grayI - 40;
            segIm = im2bw(sIM,0);
           
        end
    end
end
