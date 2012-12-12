function [left, right, top, bottom] = area( srcImg )
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
end

