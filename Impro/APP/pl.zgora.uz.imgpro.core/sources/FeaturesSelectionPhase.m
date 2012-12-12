classdef FeaturesSelectionPhase < Phase
    %# FeaturesSelection class
    
    %# PROPERTIES
    %# Features - dir input object
    properties (SetAccess = private)
        Features
    end
    
    %%
    %#
    methods
        function FS = FeaturesSelectionPhase(Features)
            if nargin < 1
                error('Invalid input arguments. Please provide features structure')
            end
            FS@Phase('Features Selection');
            FS.Features=Features;
        end
        
        function output = runPhase(FE,args)
            if (size(args,2) ~= 1)
                error('Invalid input arguments');
            end
            
            selection=args{1};
            selection.verboseMode(FE.verbose)
            output=selection.process(FE.Features);
        end
    end
end