classdef Operation < handle
    %# Operation class
    %# Base class for all operations
    %# Clients should extend this class to add new processing to phase.
    %%
    % Class Properties
    properties (SetAccess = private)
        %# verbose mode
        verbose
    end
    
    properties (SetAccess = protected)
        % Internal arguments for this operation. Arguments are used to init
        % operation data and it is not required to all operations.
        % Unused by default. Clients should use this value directly in
        % constructor to store operation arguments.
        Args
    end
    
    
    %%
    methods (Abstract)
        %# Call operation processing using input arguments (arguments from previous procesing or phase).
        result = processOperation(OP,args)
    end
    
    %%
    methods
        function OP = Operation()
            %# Verbose mode off.
            OP.verbose=0;
        end
        
        function result=process(OP,varargin)
          %# Internal method called in phase proceesing.
            if(OP.verbose)
                start=now;
                disp(['Staring operation at ' datestr(start, 'yyyy-mm-dd HH:MM:SS')]);
                result=processOperation(OP,varargin);
                display(['Operation preformed. Time: ' datestr(now-start, 'HH:MM:SS') ]);
            else
                result=processOperation(OP,varargin);
            end
        end
        
        
        function verboseMode(OP,isEnabled)
            %#Set verbose mode
            OP.verbose=isEnabled;
        end
    end
    
end % classdef