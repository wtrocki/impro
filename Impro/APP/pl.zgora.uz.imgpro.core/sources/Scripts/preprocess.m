function [ ] = preprocess(outputDir, varargin)
%PREPROCESS Adjust images before segmentation. Vararing is a list of
%operations to perform on the images. They will be done in the order given
%in varargin. Removal of vignietting must be done before cropping.
%   outputDir - output images folder path, 
%               inputDir = [outputDir '_original']
%   varargin - a list of operations to perform on the images:
%          noise - removes noise
%          vignetting - removes vignetting (it must be performed before
%                        cropping)
%          crop - crops image to remove black boarder
%          histStrech - histogram stretching
%          none - do nothing

startTime = now;
disp(' ');
disp(['Preprocessing files from ' outputDir ':']);
imFiles = dir([outputDir '_raw/*.tif']);

% read blank frame for vignetting removal
bfIm = imread('../Data/Blank_frame.tif');

% create the destination folder if needed
[~,~,~] = mkdir(outputDir);
skipped = 0; % number of files that has been skipped

nV = size(varargin,2);
n = numel(imFiles);
for i = 1:n % preprocessing for all images
    
    % check if the image has been already preprocessed, if not do it
    if (exist(strcat(outputDir, '/', imFiles(i).name), 'file') == 2)
        skipped = skipped + 1; % it means how many files has been skipped
    else
        preIm = imread([outputDir '_raw/' imFiles(i).name]);

        for j = 1:nV
            switch varargin{j}
                case 'noise' % remove noise
                    h = [1 2 1; 2 4 2; 1 2 1] / 16; % sets gaussian filter
                    preIm = imfilter(preIm, h);     % blur image to remove noise
                    h = [0 -1 0; -1 5 -1; 0 -1 0];  % sets sharpening filter
                    preIm = imfilter(preIm, h);     % sharpen image
                
                case 'vignetting' % remove vignietting
                    if (size(preIm) == size(bfIm))
                        preIm = removeVignetting(preIm, bfIm);
                    else
                        error('Dimmention of the image and the blanck frame mismatch. Use cropping after vignietting removal.');
                    end

                case 'crop' % crop to remove black boarder
                    cropVal = 4;
                    imS = size(preIm);
                    preIm = imcrop(preIm, [cropVal, cropVal, imS(2) - 2*cropVal, imS(1) - 2*cropVal]);

                case 'histStrech' % histogram stretching
                    preIm = imadjust(preIm, stretchlim(preIm));
                    
                case 'none' % do nothing
                    
                otherwise
                    error(['Unknow preprocessing operation: ' varargin{j}]);
            end
        end
        
        imwrite(preIm, strcat(outputDir, '/', imFiles(i).name), 'tiff'); % saves preprocessed image to file
        disp(['Pre: File ' outputDir '/' imFiles(i).name ' has been preprocessed [' num2str(i) '/' num2str(n) ' | ' num2str(100*i/n, '% .1f') '%]']);
    end    
end

% display information if some files has been skipped
if (skipped > 0)
    disp(['Pre: ' num2str(skipped) ' files has been skipped']);
end
disp(['Pre: Preprocessing time - ' datestr(now - startTime, 'HH:MM:SS.FFF')]);

end

