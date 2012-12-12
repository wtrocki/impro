function result = whiteBlackCriteria(segImage)
% W metodzie tej dokonywana jest klasyfikacja na posegmentowanym obrazku. Obrazek ten jest czarno bia³y, gdzie czarne piksele reprezentuj¹ t³o, natomiast bia³e obszar figury.
% Wzór pozwalaj¹cy obliczyæ wykorzystywany wspó³czynnik: iloœæ bia³ych pikseli/iloœæ wszystkich pikseli
% Przynale¿noœæ obiektu do danej klasy sprawdzana jest na podstawie z góry za³o¿onych wartoœci parametru odnalezionego na podstawie œrednich wyników dla danej klasy w zbiorze ucz¹cym
[x,y,~] = size(segImage);
    whitePixels = 0;
    for m=1:x
        for n=1:y
            if(segImage(m,n,1) == 0)
                whitePixels = whitePixels + 1;
            end
        end
    end
    whiteRatio = (whitePixels/(x*y));
    if (whiteRatio > 0.59 && whiteRatio<= 0.65)
        result = 2;
    elseif (whiteRatio > 0.73 && whiteRatio <= 0.79)
        result = 3;
    elseif(whiteRatio > 0.64 && whiteRatio <= 0.7)
        result = 4;
    else
        result = 1;
    end
end