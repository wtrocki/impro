classdef GroupConventer < handle
    methods(Static)
        function value = performConversion(groupName)
        %% Lists all known features group and performs conversion to order number
           switch groupName % gives a number for each diagnosis, it's for classification purposes
                case 'a'; value = 2;
                case 'b'; value = 3;
                case 'v'; value = 4;
                otherwise; error(['Unknown classification group: ' groupName]);
           end
        end
    end
    methods(Static)
        function value = getGroupName(groupNumber)
        %% Lists all known features group and performs conversion to order number
           switch groupNumber % gives a number for each diagnosis, it's for classification purposes
                case 1; value = 'Unrecognized';
                case 2; value = 'Alfa Romeo';
                case 3; value = 'BMW';
                case 4; value = 'Volkswagen';
                otherwise; error(['Unknown classification group: ' groupNumber]);
           end
        end
    end
end