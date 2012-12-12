classdef GroupConventer < handle
    methods(Static)
        function  result=performConversion(name)
           switch name % gives a number for each diagnosis, it's for classification purposes
                case 'Benign'; result= 1;
                case 'Malignant'; result = 2;
                case 'AdenomaFibroma'; result = 3;
                otherwise; error(['Unknow classification group: ' name]);
           end
        end
    end
end
