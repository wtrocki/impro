function [ wynik ] = bank( tifImageName )
    srcImg = imread(tifImageName, 'tif');
    %imshow(srcImg);
    
    [left, right, top, bottom] = area(srcImg);
    width = right - left;
    height = bottom - top;
    
    %figure(1);
    %imshow(srcImg); 
    % obcinanie ramki %
    cropImg = imcrop(srcImg, [left top width height]);
    %figure(2);
    %imshow(cropImg);
    
    % okreœlenie ikony na banknocie %
    % 1 - kwadrat
    % 2 - trojkat
    % 3 - kolo
    % 4 - deltoid
    % 5 - krzyz
    cechaIkona = ikona(cropImg);
    
    % okreœlenie barwy banknotu (HUE 0-255) %
    cechaOdcien = odcien(cropImg);
    
end

