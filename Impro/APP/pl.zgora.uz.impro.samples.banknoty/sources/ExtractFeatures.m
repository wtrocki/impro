classdef ExtractFeatures < Operation
    %# ExtractFeatures
    %% Wyszukiwane cechy: barwa, figura
    %% Barwa rownoznaczna jest z wartoœci¹ HUE z modelu HSL
    %% Figura okreœlana jest po segmentowaniu okreœlonego z rogów banknotu
    %% Class Properties
    properties (SetAccess = public)
        ClassificationName
    end
    
    methods
        function EF = ExtractFeatures(classificationName)
            EF@Operation();
            if nargin < 1
                error('Invalid input arguments. Please provide DirInput object')
            end
            EF.ClassificationName=classificationName;
        end
        
        function features = processOperation(EF,args)
            if(size(args,2)~=4)
                error('Invalid processing arguments for ExtractFeatures');
            end
            features= EF.extractFeatures(args{1},args{2},args{3},args{4});
        end

        function [feature] = extractFeatures(EF,FE,segImage,originalImage,index)
                
                f = [];
                f.ikona=ikona(segImage);
                f.odcien=odcien(originalImage);
                            
                f.wynik=sprawdz(f.ikona,f.odcien);

                if f.wynik==-1
                    segImage = imrotate(segImage, 180);
                    originalImage = imrotate(originalImage, 180);
                    f.ikona=ikona(segImage);
                    f.odcien=odcien(originalImage);
                    f.wynik=sprawdz(f.ikona, f.odcien);
                end
                
                if (f.wynik == -1)
                    f.wynik = 0;
                    f.odcien = 0;
                    f.ikona = 0; 
                end                    
                
                feature=f;
                function wynik = sprawdz(ikon , odcie)
            
                        MAX_ROZNICA = 3;
                        wynik = -1;
                        if((ikon==1) && ((26 - odcie) <= MAX_ROZNICA))
                            wynik = 10;
                            %disp('kwadrat');
                        end

                        if((ikon==2) && ((20 - odcie) <= MAX_ROZNICA))
                            wynik = 200;
                            %disp('trojkat');
                        end

                        if((ikon==3) && ((242 - odcie) <= MAX_ROZNICA))
                            wynik = 20;
                            %disp('kolo');
                        end

                        if((ikon==4) && ((143 - odcie) <= MAX_ROZNICA))
                            wynik = 50;
                            %disp('deltoid');
                        end

                        if((ikon==5) && ((72 - odcie) <= MAX_ROZNICA))
                            wynik = 100;
                            %disp('krzyz');
                end
               
        end
        end

    end
end
