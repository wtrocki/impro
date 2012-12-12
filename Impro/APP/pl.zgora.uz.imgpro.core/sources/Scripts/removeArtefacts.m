function [im] = removeArtefacts(im, type, options)
%REMOVEARTEFACTS Removes objects smaller than minSize as well as ones
%laying on the boarder of the image
%   im - input image
%   type - describes what type of artefacts will be removed:
%          'small' - removes objects smaller than options
%          'border' - removes objects on the border of image
%          'small and border' - removes objects smaller than options and
%                               laying on the border of image
%   options - additional information, eg. min size for removing small
%             objects

switch type
    case 'small'
        % check if options are set
        if (nargin < 3)
            error('Unknow segmentation method: ');
        end
        im = bwareaopen(im, options, 4);
   
    case 'border'
        im = imclearborder(im, 4);
        
    case 'small and border'
        % check if options are set
        if (nargin < 3)
            error('Unknow segmentation method: ');
        end
        im = bwareaopen(im, options, 4);
        im = imclearborder(im, 4);
end

end