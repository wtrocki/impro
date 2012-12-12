function result = HSVRecognizer(originalImage)
% W metodzie tej dokonywana jest klasyfikacja na podstawie �rednich
% warto�ci w wyst�puj�cych w model HSV
% Przynale�no�� obiektu do danej klasy sprawdzana jest na podstawie z g�ry za�o�onych warto�ci parametr�w
% Warto�ci parametr�w zosta�y ustalone na podstawie �rednich warto�ci odczytanych z historgram�w na zbiorze ucz�cym dla danej klasy

    hsv_image = rgb2hsv(originalImage);

    result = 1;
    meanResult = mean(mean(mean(hsv_image)));
    if meanResult > 0.09 && meanResult < 0.37
        result = 3;
    elseif meanResult > 0.39 && meanResult < 0.47
        result = 4;
    elseif  meanResult > 0.47 && meanResult < 0.55
        result = 2;
    end
end