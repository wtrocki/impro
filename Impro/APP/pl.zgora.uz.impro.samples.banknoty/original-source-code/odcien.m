function [wynik] = odcien( srcImg )
 wielkosc=size(srcImg);

 piksele=wielkosc(1)*wielkosc(2);
 sumaR=0;
 sumaG=0;
 sumaB=0;
 for k=1:wielkosc(1)

     for l=1:wielkosc(2)
         sumaR=sumaR+double(srcImg(k,l,1));
         sumaG=sumaG+double(srcImg(k,l,2));
         sumaB=sumaB+double(srcImg(k,l,3));

     end
 end
 sumaR=sumaR/piksele;
 sumaG=sumaG/piksele;
 sumaB=sumaB/piksele;
 
 hsv=zeros(1,1,3);
 hsv(1,1,1)=sumaR;
 hsv(1,1,2)=sumaG;
 hsv(1,1,3)=sumaB;
 wynik=rgb2hsv(hsv);
 wynik = round(wynik(1) * 255);
end