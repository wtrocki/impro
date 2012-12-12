classdef ClassificationPhase < Phase
    %# Classification class
    
    %# PROPERTIES
    %# Features - selected features
    properties (SetAccess = private)
        Features
    end
    
    %%
    %#
    methods
        function CP = ClassificationPhase(Features)
            if nargin < 1
                error('Invalid input arguments. Please provide DirInput object')
            end
            CP@Phase('Classification of features');
            CP.Features=Features;
        end
        
        function output = runPhase(FE,args)
           %TODO
        end
        
      
    end
end