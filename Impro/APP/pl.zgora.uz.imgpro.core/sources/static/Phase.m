classdef Phase < handle
    %# Phase class
    %#  Phase is a base for images proceesing. Phase should be used to group operations from one group (Preprocessing operations, Segmentation operations)
    %#  Phase is responsible for reading and storing images and other processing results.
    %%
    % Class Properties
    properties (SetAccess = protected)
        %# verbose mode
        verbose
        %# Name of phase used in verbose mode.
        name
    end
    
    %%
    methods
        function PH = Phase(phaseName)
            PH.verbose=0;
            PH.name=phaseName;
        end
        
        function results=run(PH,varargin)
            %# Main method to phase used to run processing.
            %# varargin - operation objects used in this phase. 
            %# Order of processings makes difference.
            
            if(PH.verbose)
                start=now;
                disp(['Staring ' PH.name ' at ' datestr(start, 'yyyy-mm-dd HH:MM:SS')]);
                results = runPhase(PH,varargin);
                display([PH.name ' preformed. Time: ' datestr(now-start, 'HH:MM:SS') ]);
            else
                results =  runPhase(PH,varargin);
            end
        end
        
        function results = runPhase(PH,args)
            %# Responsibility:
            %# Run all Proceesings
            %# Read and store data using DirInput object
            processings = size(args,2);
            input=PH.DirInput.getImagesToRead();
            output=PH.DirInput.getImagesToStore();
            
            for index=1:PH.DirInput.ImagesLength
                % Read Image
                imgLocation=char(input(index));
                if(PH.verbose)
                    disp(['Processing ' imgLocation]);
                end
                img=imread(imgLocation);
                % Apply preprocessing for current image
                for j = 1:processings
                    % call function
                    if isa(args{j}, 'Operation')
                        operation=args{j};
                        % inherits verbose
                        operation.verboseMode(PH.verbose);
                        img=operation.process(img);
                    else
                        error('Processing objects must inherits from Operation class')
                    end
                end
                % Write Image
                outputLocation=char(output(index));
                imwrite(img,outputLocation);
            end
            % No Results
            results=0;
        end
        
        function verboseMode(PH,isEnabled)
            %# Set verbose mode.
            PH.verbose=isEnabled;
        end
    end
    
end % classdef