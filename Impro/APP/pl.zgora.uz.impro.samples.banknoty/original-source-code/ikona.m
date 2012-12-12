function [wynik] = ikona( srcImg )
    %figure(1);
    %imshow(x);
    % 1 - kwadrat
    % 2 - trojkat
    % 3 - kolo
    % 4 - deltoid
    % 5 - krzyz
    grayI = rgb2gray(srcImg);

    mIM=imfilter(grayI,fspecial('average',40),'replicate');

    sIM = mIM - grayI - 40;
    segIm = im2bw(sIM,0);
    %figure(2);
    %imshow(segIm);

    rozmiar=size(segIm);
    x=rozmiar(1)*0.32;
    x=rozmiar(1)-x;
    y=rozmiar(2)*0.20;
    %y=rozmiar(2)-y;

    nowy=segIm(x:rozmiar(1), 1:y);
    nowy=imfill(nowy,'holes');
    %nowy=~nowy;
    %figure(3);
    %imshow(nowy);

    [B,L] = bwboundaries(nowy, 'noholes');
    S3 = bwlabel(nowy);
    imshow(S3,[]);
    STATS = regionprops(S3, 'all'); % we need 'BoundingBox' and 'Extent'

    imshow(nowy),
    title('Results');
    hold on
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
