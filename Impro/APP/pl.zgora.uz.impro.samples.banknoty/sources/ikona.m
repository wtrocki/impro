function [wynik] = ikona( segIm )
    %figure(1);
    %funkcja segmentuje wybrany z rog�w w celu okre�lenia figury
    %okreslenie figury odbywa si� poprzez sprawdzenie cech takich jak: obszar, wype�nienie obszaru, stosunek wysoko�ci z czeroko�ci�
    % 1 - kwadrat
    % 2 - trojkat
    % 3 - kolo
    % 4 - deltoid
    % 5 - krzyz
    
    rozmiar=size(segIm);
    x=rozmiar(1)*0.32;
    x=rozmiar(1)-x;
    y=rozmiar(2)*0.20;
    %y=rozmiar(2)-y;

    nowy=segIm(floor(x):rozmiar(1), 1:floor(y));
    nowy=imfill(nowy,'holes');
    %nowy=~nowy;
    %figure(3);
    %imshow(nowy);

    [B,L] = bwboundaries(nowy, 'noholes');
    S3 = bwlabel(nowy);
    %imshow(S3,[]);
    STATS = regionprops(S3, 'all'); % we need 'BoundingBox' and 'Extent'

    %imshow(nowy),
    %title('Results');
    %hold on
    wynik=0;
    for i = 1 : length(STATS)

        if STATS(i).Area>400
        roznica=STATS(i,1).BoundingBox(3)-STATS(i,1).BoundingBox(4);
            if roznica<3
                if STATS(i,1).Extent>0.5

                    kwadrat=STATS(i,1).BoundingBox(3)*STATS(i,1).BoundingBox(4);
                    if STATS(i).Area-kwadrat <100 && STATS(i,1).Extent>0.9
                        wynik=1;
                    end

                    kolo=3.14*(STATS(i,1).BoundingBox(3)/2)^2;
                    if abs(STATS(i).Area-kolo) <100  
                        wynik=3;
                    end

                    trojkat=STATS(i,1).BoundingBox(3)*STATS(i,1).BoundingBox(4)/2;
                    if STATS(i).Area-trojkat <100  
                        wynik=2;
                    end 

                else     
                    wynik=5;
                end

            end
            roznica= STATS(i,1).BoundingBox(3)-(STATS(i,1).BoundingBox(4)/2 +STATS(i,1).BoundingBox(4));
            if abs(roznica) <3 && STATS(i,1).Extent>0.5

                deltoid=STATS(i,1).BoundingBox(3)*STATS(i,1).BoundingBox(4)/2;
                if STATS(i).Area-deltoid <100  STATS(i,1).Extent>0.5;
                     wynik=4;
                end
            end
        end
    end
end
