classdef DirInput < handle
    %# Dir input class
    %#  Used to initialize processing with set of images.
    %#  Images list are retrieved using DirPath and filtered using single extension filter.
    %#  Extension filter allows alows to filter only one file extension, for example bmp.
    %#  DirInput is a special object used to initialize all phases. 
    %#  Phases use dir input to get read and storage data (if phase use image files)
    %#  DirInput is always starting point off all processings. 
    %#  Images from dir should be related with one classification group.
    
    %%
    % Class Properties
    properties (SetAccess = private)
        % input dir
        DirPath
        % filtered file names in this dir
        Files
        % Size of images list
        ImagesLength
        % Dir used to read elements. Usually a name of past processing phase. For example segmentation. Used to create subfolders.
        ReadDir
        % StoreDir used to store elements.Usually a name of current processing phase. For example segmentation. Used to create subfolders.
        StoreDir
    end
    
    %%
    %#
    methods
        function DI = DirInput(dirPath,pattern)
            %# Constructor for DirInput
            %# dirPath - path for image directory
            %# pattern - image extension filter
            if nargin < 2
                error('Invalid input arguments. Please provide dirPath and pattern')
            end
            DI.DirPath  = dirPath;
            DI.Files = dir([dirPath pattern]);
            DI.ImagesLength = numel(DI.Files);
            if(DI.ImagesLength==0)
                error('No images to process');            
            end                 
            DI.ReadDir='';
            DI.StoreDir='';
        end
        
        function init(DI,Container)
            %# Init function used to init subdirs every new phase.
            DI.ReadDir=DI.StoreDir;
            DI.StoreDir=Container;
        end
        
        function imFiles=getImagesToRead(DI)
        processingDir=strcat(DI.DirPath,DI.ReadDir);
            %# Returs list of input images
            imFiles=cell(DI.ImagesLength,1);
            for index=1:DI.ImagesLength
                imFiles(index) = cellstr(strcat(processingDir , DI.Files(index).name));
            end
        end
        
        function imFiles=getImagesToStore(DI)
             %# Returs list of output images
             processingDir=strcat(DI.DirPath,DI.StoreDir);
             [a,b,c] = mkdir(processingDir); 

            imFiles=cell(DI.ImagesLength,1);
            for index=1:DI.ImagesLength
                imFiles(index) = cellstr(strcat(processingDir,DI.Files(index).name));
            end
        end
        
         function imFiles=getOriginalImages(DI)
             %# Returs list of clean images
            imFiles=cell(DI.ImagesLength,1);
            for index=1:DI.ImagesLength
                imFiles(index) = cellstr(strcat(DI.DirPath,DI.Files(index).name));
            end
         end
         function imFiles=getProcesingImages(DI)
             %# Returs list of clean images
            imFiles=cell(DI.ImagesLength,1);
            for index=1:DI.ImagesLength
                imFiles(index) = cellstr(strcat(DI.DirPath,'preprocessing\',DI.Files(index).name));
            end
         end
         
         function name=getFileName(DI,index)
            %# Returs list of clean images
            name=char(DI.Files(index).name);
         end
         
         function dir=getExistingStoreDir(DI)
            %# Returs store dir
            dir=strcat(DI.DirPath,DI.StoreDir);
            [a,b,c] = mkdir(dir);
         end
        
    end
end % classdef