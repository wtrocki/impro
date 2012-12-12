function result = checkFeatures(features)
% W metodzie tej dokonywana jest klasyfikacja na podstawie czterech parametrów:
% + œcie¿ki otaczaj¹cej figurê
% + D³u¿szej œrednicy elipsy, w któr¹ wpisana jest figura
% + Krótszej œrednicy elipsy, w któr¹ wpisana jest figura
% + Pola powierzchni figury
% Przynale¿noœæ obiektu do danej klasy sprawdzana jest na podstawie z góry za³o¿onych wartoœci parametrów 
    alfa = 0;
    bmw = 0;
    volk = 0;
    other = 0;
    %œcie¿ka otaczaj¹ca figurê
    perimiter = min(features.Perimeter);
    %D³u¿sza œrednia elipsy, w któr¹ wpisana jest figura    
    majorAxisLength = min(features.MajorAxisLength);
    %Krótsza œrednia elipsy, w któr¹ wpisana jest figura    
    minorAxisLength = min(features.MinorAxisLength);
    % Pole powierzchni figury
    areaMean = features.Area_mean;
    if(perimiter > 16 && perimiter <= 28)
        alfa = alfa + 1;
    elseif(perimiter > 49 && perimiter <= 61)
        bmw = bmw + 1; 
    elseif(perimiter > 212 && perimiter <= 224)
        volk = volk + 1;
    else
        other = other + 1;
    end
    if(majorAxisLength > 5 && majorAxisLength <= 11)
        alfa = alfa + 1;
    elseif(majorAxisLength > 20 && majorAxisLength <= 26)
        bmw = bmw + 1;
    elseif(majorAxisLength > 70 && majorAxisLength <= 77)
        volk = volk + 1;
    else
        other = other + 1;
    end
    if(minorAxisLength > 2 && minorAxisLength <= 4)
        alfa = alfa + 1;
    elseif(minorAxisLength > 8 && minorAxisLength <= 12)
        bmw = bmw + 1;    
    elseif(minorAxisLength > 23 && minorAxisLength <= 27)
        volk = volk + 1;
    else
        other = other + 1;
    end
    if(areaMean > 2500 && areaMean <= 2900)
        alfa = alfa + 1;
    elseif(areaMean > 5200 && areaMean <= 5200)
        volk = volk + 1;
    elseif(areaMean > 4800 && areaMean <= 4800)
        bmw = bmw + 1;
    else
        other = other + 1;
    end
    models = [other,alfa,bmw,volk];
    [~,result] = max(models);
end