function result = recognizer(orginalImage)
% W metodzie tej dokonywana jest klasyfikacja na podstawie barw obrazka zapisanych w modelu RGB:
% Przynale¿noœæ obiektu do danej klasy sprawdzana jest na podstawie z góry za³o¿onych wartoœci parametrów
% Wartoœci parametrów zosta³y ustalone na podstawie œrednich wartoœci odczytanych z historgramów na zbiorze ucz¹cym dla danej klasy
 [x,y,~]=size(orginalImage);
 Rpixels=zeros(256);
 Gpixels=zeros(256);
 Bpixels=zeros(256);
 
 for k=1:x
     for l=1:y
         Rpixels(orginalImage(k,l,1)+1) = Rpixels(orginalImage(k,l,1)+1)+1;
         Gpixels(orginalImage(k,l,2)+1) = Gpixels(orginalImage(k,l,2)+1)+1;
         Bpixels(orginalImage(k,l,3)+1) = Bpixels(orginalImage(k,l,3)+1)+1;
     end
     
 end
 %figure();
 %hold on;
 %title(name);
 %plot(Rpixels(2:256),'r');
 %plot(Gpixels(2:256),'g');
 %plot(Bpixels(2:256),'b');
 %hold off;
 
 result = whatWeHave(Rpixels,Gpixels,Bpixels);
 
end

function result = whatWeHave(Rpixels,Gpixels,Bpixels)
    range0To50=0;
    range80To85=0;
    range245To255=0;

    
    for pixel=2:256
       
        if pixel>=1 && pixel<=50
                range0To50=Rpixels(pixel)+Gpixels(pixel)+Bpixels(pixel)+range0To50;
        elseif pixel>=80 && pixel<=85
                range80To85=Rpixels(pixel)+Gpixels(pixel)+Bpixels(pixel)+range80To85;
        elseif pixel>=245
                range245To255=Rpixels(pixel)+Gpixels(pixel)+Bpixels(pixel)+range245To255;
        end
    end
 
    %Przypisanie obiektu do klasy Alfa Romeo   
  if range0To50 > 70000 && range80To85>20000 && range245To255>95000
      result = 2;
      return;
      %Przypisanie obiektu do klasy BMW
  elseif (range0To50 > 20000 && range0To50 < 30000) && range80To85>3000 && range245To255>17000
      result = 3;
      return;
      %Przypisanie obiektu do klasy Volkswagen
  elseif (range0To50 > 30000 && range0To50 <70000) && range80To85>3500 && range245To255>40000
      result = 4;
      return;
  else
      %Nierozpoznanie obiektu
      result = 1;
      return;
  end
    
end