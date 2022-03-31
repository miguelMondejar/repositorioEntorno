import java.util.Scanner;
public class Ejercicio4 {

    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        int i=0,y=1,contadorMayus=0,contadorMinus=0,contadorNum=0,longi,aciertos=0;
        String contrasena,comprobar,mayus,minus;
        char comprobar1;

        System.out.println("Dime la contraseña: ");
        contrasena=sc.next();    
        
        longi=contrasena.length();
               
        do{
                        
            comprobar=contrasena.substring(i,y);
            
            mayus=comprobar.toUpperCase(); // Para poder comprobar que sea mayuscula
            minus=comprobar.toLowerCase(); // Para poder comprobar que sea minuscula
        
            if(comprobar.equals(mayus)){
                contadorMayus++; // si es mayus
            }
            if(comprobar.equals(minus)){
                contadorMinus++; // si es mayus
            }
            if(comprobar.equals("1")||comprobar.equals("2")||comprobar.equals("3")||comprobar.equals("4")||comprobar.equals("5")||comprobar.equals("6")||comprobar.equals("7")||comprobar.equals("8")||comprobar.equals("9")||comprobar.equals("0")){
                contadorNum++; // si es un numero
            }
            
            i++;
            y++;
  
       
        
        if(contadorMayus>=2){
            aciertos++;
        }
        if(contadorMinus>=1){
            aciertos++;
        }
        if(contadorNum>=5){
            aciertos++;
        }
        
         }while(i!=longi);
        
        // Si acierto es 3 significa que la contraseña es fuerte
        if(aciertos==3){ // 
            System.out.println("Verdadero");
        }
        else{
            System.out.println("Falso");
        }
        
        
    }
}
