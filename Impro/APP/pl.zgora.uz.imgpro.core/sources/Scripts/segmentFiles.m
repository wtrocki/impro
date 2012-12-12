function [ ] = segmentFiles(inputDir, segMethod)
%SEGMENTFILES Segments every TIFF image in inputDir folder using
%segmentation method given in segMethod and saves the results to file.
%   inputDir - input images folder path
%   segMethod - segmentation method

startTime = now;
disp(' ');
disp(['Segmenting files from ' inputDir ' using ' segMethod ' method:']);
imFiles = dir([inputDir '/*.tif']);

% initialize if needed
switch segMethod
    case 'FCMOff'
        options = [2 100 0.00001 0];
        center = segFCMOffInit(3, options);
        
    case 'CLN'
        net = segCLNInit(100, 'CLNsample1.tif');  
        
    case 'KMOff'
        center = segKMOffInit(3);
        
    case 'ATmFCMOff'
        options = [2 100 0.00001 0];
        center = segFCMOffInit(3, options);
        
    case 'ATmCLN'
        net = segCLNInit(100, 'CLNsample1.tif');
        
    case 'ATmKMOff'
        center = segKMOffInit(3);
end

% create the destination folder if needed
outputDir = strcat(inputDir, '_seg', segMethod);
[~,~,~] = mkdir(outputDir);
skipped = 0; % number of files that has been skipped

% segmentation
n = numel(imFiles);
for i = 1:n
    
    % check if the image has been already segmented, if not segment
    if (exist(strcat(outputDir, '/', imFiles(i).name), 'file') == 2)
        skipped = skipped + 1; % it means how many files has been skipped
    else
        im = imread([inputDir '/' imFiles(i).name]);

        switch segMethod
            case 'AT'
                segIm = segAT(im, 20, 0.01);
                segIm = removeArtefacts(segIm, 'small and border', 40);
                
            case 'FCM'
                segIm = segFCM(im, 3, [2 100 0.00001 0], 0.8);
                segIm = removeArtefacts(segIm, 'small', 40);
                
            case 'FCMOff'
                segIm = segFCMOff(im, center, options, 0.6);
                segIm = removeArtefacts(segIm, 'small', 40);
                
            case 'CLN'
                segIm = segCLN(im, net);
                segIm = removeArtefacts(segIm, 'small', 40);
                
            case 'KM'
                segIm = segKM(im, 3);
                segIm = removeArtefacts(segIm, 'small', 40);    
                
            case 'ATmKM'
                segImAT = segAT(im, 20, 0.01);
                segImAT = removeArtefacts(segImAT, 'small and border', 40);
                segIm = segKM(im, 3);
                segIm = removeArtefacts(segIm, 'small', 40);
                segIm = segIm.*segImAT;
                
            case 'KMOff'
                segIm = segKMOff(im, center);
                segIm = removeArtefacts(segIm, 'small', 40);
                
            case 'ATmFCM'
                segImAT = segAT(im, 20, 0.01);
                segImAT = removeArtefacts(segImAT, 'small and border', 40);
                segIm = segFCM(im, 3, [2 100 0.00001 0], 0.8);
                segIm = removeArtefacts(segIm, 'small', 40);
                segIm = segIm.*segImAT;
                
            case 'ATmFCMOff'
                segImAT = segAT(im, 20, 0.01);
                segImAT = removeArtefacts(segImAT, 'small and border', 40);
                segIm = segFCMOff(im, center, options, 0.6);
                segIm = removeArtefacts(segIm, 'small', 40);
                segIm = segIm.*segImAT;
                
            case 'ATmCLN'
                segImAT = segAT(im, 20, 0.01);
                segImAT = removeArtefacts(segImAT, 'small and border', 40);
                segIm = segCLN(im, net);
                segIm = removeArtefacts(segIm, 'small', 40);
                segIm = segIm.*segImAT;
                
            case 'ATmKMOff'
                segImAT = segAT(im, 20, 0.01);
                segImAT = removeArtefacts(segImAT, 'small and border', 40);
                segIm = segKMOff(im, center);
                segIm = removeArtefacts(segIm, 'small', 40);
                segIm = segIm.*segImAT;
                
            case 'other'
                % put your experimental segmentation sequence here
                
            otherwise
                error(['Unknow segmentation method: ' segMethod]);
        end

        imwrite(segIm, strcat(outputDir, '/', imFiles(i).name), 'tiff'); % saves segmented image to file
        disp([segMethod ': File ' inputDir '/' imFiles(i).name ' has been segmented [' num2str(i) '/' num2str(n) ' | ' num2str(100*i/n, '% .1f') '%]']);
    end    
end

% display information if some files has been skipped
if (skipped > 0)
    disp([segMethod ': ' num2str(skipped) ' files has been skipped']);
end
disp([segMethod ': Segmentation time - ' datestr(now - startTime, 'HH:MM:SS.FFF')]);

end

