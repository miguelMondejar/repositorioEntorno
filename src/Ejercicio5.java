import java.util.Scanner;
import java.lang.*;

public class Ejercicio5 {

    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        int i,y,a,b,c,ii,yy; // a,b,c se usan para los length // Los i,y para los substrings
        String capicua1,capicua2,comprobar,comprobar2,palabra = null,finalPalabra,capicuaSiONo=null,capicuaSioNo2;
        
        try{
            
            System.out.println("Dime una palabra: ");
            capicua1=sc.next();

            capicua2=capicua1.toLowerCase();  // Convertir a minuscula para que ignore las mayus

            a=capicua2.length();

            i=a-1;
            y=a;

            do{
                comprobar=capicua2.substring(i,y);

                palabra=palabra+comprobar;

                i--;
                y--;

            }while(i!=-1);

            b=palabra.length(); 
            System.out.println("Al inverso es " + palabra.substring(4,b)); // Si no empezaría por "null" al principio

            
            // Vamos a ver si es capicua o no

            finalPalabra=palabra.substring(4,b);

            c=finalPalabra.length();

            ii=c-1; 
            yy=c;

            do{
                comprobar2=finalPalabra.substring(ii,yy);

                capicuaSiONo=capicuaSiONo+comprobar2;

                ii--;
                yy--;
            }while(ii!=-1);

            capicuaSioNo2=capicuaSiONo.substring(4,b);

            // Comprobamos
            if(capicuaSioNo2.equals(finalPalabra)){
                System.out.println("Es capicua");
            }else{
                System.out.println("No es capicua");
            }
            
        }catch(Exception e){
            System.out.println("Error");
        }
    
    }
}
