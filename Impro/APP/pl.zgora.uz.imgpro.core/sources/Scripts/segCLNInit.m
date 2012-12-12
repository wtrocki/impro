function [net] = segCLNInit(epochs, imTName)
%SEGCLNINIT Trains neural network using training image.
%   Trains neural network using training image for given number of epochs.
%   After training the net is saved into file and next time, for the same
%   parameters it will be loaded instead of training procedure.
%   
%   epochs - epochs if training
%   imTName - name of image file for training

% construct a name of the file where the trained network is or will be saved
[~, name, ~] = fileparts(imTName);
fName = ['../Data/CLN_' num2str(epochs) 'epochs_' name '.mat'];

% check if the file with the trained network already exists and load it or
% train new network and save it into file
if (exist(fName, 'file') == 2)
    load(fName);
    disp('CLN: Initialized from file');
else
    disp('CLN: Training network');
    net = newc([0 255; 0 255; 0 255], 3);
        
    % load training image
    if (exist(['../Data/' imTName], 'file') == 2)
        imT = imread(['../Data/' imTName]);
    else
        error(['CLN: Training image ../Data/' imTName ' not found']);
    end
    
    % prepare neural network training vector from training image
    r = imT(:,:,1);
    g = imT(:,:,2);
    b = imT(:,:,3);
    pT = double([r(:)'; g(:)'; b(:)']);

    % train network
    net.trainParam.epochs = epochs;
    net = train(net, pT);

    % save trained network to file
    save(fName, 'net');
    disp(['CLN: Trained network has been saved to file ' fName]);
end

end
