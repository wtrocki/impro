function result = whiteBlackCriteria(segImage)
% W metodzie tej dokonywana jest klasyfikacja na posegmentowanym obrazku. Obrazek ten jest czarno bia�y, gdzie czarne piksele reprezentuj� t�o, natomiast bia�e obszar figury.
% Wz�r pozwalaj�cy obliczy� wykorzystywany wsp�czynnik: ilo�� bia�ych pikseli/ilo�� wszystkich pikseli
% Przynale�no�� obiektu do danej klasy sprawdzana jest na podstawie z g�ry za�o�onych warto�ci parametru odnalezionego na podstawie �rednich wynik�w dla danej klasy w zbiorze ucz�cym
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