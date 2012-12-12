classdef CustomElement < Operation
    %# CustomElement 
    %%
    methods
    function CE = CustomElement(varargin)
            CE@Operation();
            CE.Args=varargin;
        end
        
        function image = processOperation(CE,args)
            if(size(args,2)~=1)
                error('Invalid processing arguments for SegCE');
            end
            % Depending on phase arg may differ. 
            %image=args{1};
        
        end
    end
    
end
