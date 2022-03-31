import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        int numero,numero2=0,perfecto,sumar=0;
        
        try{
            
            System.out.println("Dime un número y digo si es perfecto: ");
            numero=sc.nextInt();

            numero2=numero; // Para poder usar la variable numero despues

            for(int i=1;i<numero2;i++){  // Va a ir dividiendo los numeros, si el resto es 0 entonces es divisible y sumará esos numeros.
                perfecto=numero2%i;
                if(perfecto==0){
                    sumar=sumar+i;                    
                }  
            }

            sumar=sumar/2; // Para que no cuente el propio numero

            if(sumar==numero){
                System.out.println("Es perfecto");
            }
            else{
                System.out.println("No es perfecto");
            }

        }catch(Exception e){
            System.out.println("Error");
        }
        
        
    }
}
