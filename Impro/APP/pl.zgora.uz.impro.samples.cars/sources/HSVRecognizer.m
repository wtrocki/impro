function result = HSVRecognizer(originalImage)
% W metodzie tej dokonywana jest klasyfikacja na podstawie œrednich
% wartoœci w wystêpuj¹cych w model HSV
% Przynale¿noœæ obiektu do danej klasy sprawdzana jest na podstawie z góry za³o¿onych wartoœci parametrów
% Wartoœci parametrów zosta³y ustalone na podstawie œrednich wartoœci odczytanych z historgramów na zbiorze ucz¹cym dla danej klasy

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