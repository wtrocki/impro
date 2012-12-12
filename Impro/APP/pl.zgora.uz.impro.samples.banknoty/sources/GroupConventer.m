classdef GroupConventer < handle
    methods(Static)
        function value = performConversion(groupName)
        %% Lists all known features group and performs conversion to order number
           switch groupName % gives a number for each diagnosis, it's for classification purposes
                case 'banknoty'; value = 0;
                otherwise; error(['Unknown classification group: ' groupName]);
           end
        end
    end
end