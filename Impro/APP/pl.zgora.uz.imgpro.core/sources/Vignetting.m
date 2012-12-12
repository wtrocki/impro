classdef Vignetting < Operation
    %# Vignetting
    %% Removes Vignietting from image.
    %# Operations:
    %#  separate channels RGB
    %#  find maximum value             | max(max(r))
    %#  divide actual value of blank   | r - max(max(r))
    %#  frame by the maximum           |
    %#  subtract result from 1         | 1 - r/max(max(r))
    %#  mask is an image size matrix containing values between 1 and 2,
    %#  it represents how much darker particular pixels are and how much
    %#  they need to be brightened (eg. 1 means there's no vignetting at all,
    %#  1.12 means the pixel is 12% darker than it should be)
    
    % Class Properties
    properties (SetAccess = private)
        % blank frame for vignetting removal
        BlankFrame
    end
    
    %%
    methods
        function VIN = Vignetting()
            VIN@Operation();
            % read blank frame
            VIN.BlankFrame = imread('..\data\Blank_frame.tif');
        end
        
        function image=processOperation(VIN,args)
            if(size(args,2)~=1)
                error('Invalid processing arguments for Vignetting');
            end
            image=args{1};
            image=VIN.performRemoveVignetting(image);
        end
        
        function image = performRemoveVignetting(VIN,image)
            
            if (size(image) == size(VIN.BlankFrame))
                bfIm = double(VIN.BlankFrame);
                
                r = bfIm(:,:,1);
                g = bfIm(:,:,2);
                b = bfIm(:,:,3);
                
                mask = ones(size(image));
                mask(:,:,1) = 2 - r/max(max(r)); % R channel
                mask(:,:,2) = 2 - g/max(max(g)); % G channel
                mask(:,:,3) = 2 - b/max(max(b)); % B channel
                
                % multiply the image by the mask bto brighten pixels according to vignetting
                image = uint8(double(image) .* mask);
            else
                error('Dimmention of the image and the blanck frame mismatch. Use cropping after vignetting removal.');
            end
        end
    end
end
