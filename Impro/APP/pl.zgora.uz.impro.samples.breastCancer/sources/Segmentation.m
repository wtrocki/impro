classdef Segmentation < Phase
    %# Segmentation class
    %#  Used to prepare images to semgentation.
    
    %%
    % Class Properties
    properties (SetAccess = private)
         %# DirInput - dir input object
        DirInput
    end

    methods
        function SEG = Segmentation(DirInputObject)
            %# Constructor for Preprocessing
            if nargin < 1
                error('Invalid input arguments. Please provide DirInput object')
            end
            SEG@Phase('Segmentation');
            SEG.DirInput=DirInputObject;
            DirInputObject.init('segmentation\');
        end
    end
end % classdef