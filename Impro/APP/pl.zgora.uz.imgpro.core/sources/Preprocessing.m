classdef Preprocessing < Phase
    %# Preprocessing class
    %#  Used to prepare images to semgentation.
    %#  Possible operations:
    %#  Noise - removes noise
    %#  Vignietting - removes vignietting (it must be performed before
    %#                         cropping)
    %#  Crop - crops image to remove black boarder
    %#  histStrech - histogram stretching
    %#  Images list are retrieved using DirPath and filtered using single extension filter.
    %#  Extension filter allows alows to filter only one file extension, for example bmp.
    %#  For more extensions please create new object.
    
    %# PROPERTIES
    %# DirInput - dir input object
    
    %%
    % Class Properties
    properties (SetAccess = private)
        DirInput
    end
    
    %%
    %#
    methods
        function PP = Preprocessing(DirInputObject)
            %# Constructor for Preprocessing
            if nargin < 1
                error('Invalid input arguments. Please provide DirInput object')
            end
            PP@Phase('Preprocessing'); 
            PP.DirInput=DirInputObject;
            DirInputObject.init('preprocessing\');
        end
    end
end % classdef