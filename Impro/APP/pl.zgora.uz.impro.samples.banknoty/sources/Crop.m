classdef Crop < Operation
%#  Wyszukuje banknot na obrazie wejsciowym, poprzez segmentacje metoda progowania globalnego, wydziela obiekt (banknot) od t³a
%%  Dodatkowo obliczane s¹ wymiary znalezionego banknotu i obliczany stosunek wysokoœæ/szerokoœæ
%   BW_RATIO próg segmentacji;
%   SIZE_RATIO_TOLERANCE tolerancja b³êdu przy obliczaniu stosunku wys/szer
%   BANKNOTE_RATIO przyjêty stosunek wys/szer
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
        
        function image = performCrop(CRP,srcImg)
		    BW_RATIO = 230/255;
		    SIZE_RATIO_TOLERANCE = 0.05;
		    BANKNOTE_RATIO = 2;
            PIX_PERCENT = 0.75;  
		
		    bwImg = im2bw(srcImg, BW_RATIO);
		    [bwiHeight bwiWidth] = size(bwImg);
		    
		    % wykrywanie obszaru banknotu %
		    left = -1;
		    right = -1;
		    top = -1;
		    bottom = -1;
		    
		    rows = sum(bwImg, 1);
		    columns = sum(bwImg, 2);
		    
		    for i = 1:bwiWidth  
		        if rows(i) <= (bwiHeight * PIX_PERCENT)
		            if left == -1
		                left = i;
		            end
		            
		            right = i;
		        end
		    end
		    
		    for i = 1:bwiHeight
		        if columns(i) <= (bwiWidth * PIX_PERCENT)
		            if top == -1
		                top = i;
		            end
		            
		            bottom = i;
		        end
		    end
		    
		    ratio = (right - left) / (bottom - top);
		    ratioError = 1 - (ratio / BANKNOTE_RATIO);
		    
		    if ratioError >  SIZE_RATIO_TOLERANCE
		        error('Banknot nierozpoznany - z³y stosunek wymiarów');
		    end
		    
		    if left == -1 || right == -1 || top == -1 || bottom == -1
		        error('Nie uda³o siê zlokalizowaæ banknotu');
		    end
            
            width = right - left;
            height = bottom - top;
            %figure(1);
            %imshow(srcImg); 
            % obcinanie ramki %
            image = imcrop(srcImg, [left top width height]);
        end
        
    end

end
    