import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        int pedir;
        String pedirFigura;
        
        System.out.println("Pon 'salir' para salir del programa");
        
        try{
            
            do{
                System.out.println("Dime un número: ");
                pedir=sc.nextInt();
                System.out.println("Elige cuadrado / rombo / triangulo (o pon salir): ");
                pedirFigura=sc.next();

                if(pedirFigura.equals("cuadrado")){

                    for(int asterisco=1;asterisco<=pedir;asterisco++){  // Con esto se formará lineas de * dependiendo de lo que sea pedir
                        for (int i=0;i<pedir;i++){
                            System.out.print("*"); //Asteriscos
                        }
                        //Salto de línea
                        System.out.println("");
                    }
                }
                if(pedirFigura.equals("triangulo")){ 

                    for(int asterisco=1;asterisco<=pedir;asterisco++){
                        for(int i=0;i<asterisco;i++){
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                }
                if(pedirFigura.equals("rombo")){ // Más o menos Juanpe, portate bien jaja
                    System.out.println("  *");
                    for(int asterisco=2;asterisco<=pedir;asterisco++){                        
                        for (int i=0;i<asterisco;i++){
                            System.out.print("**");
                        }
                        System.out.println(""); 
                    }   
                } 
            }while(!pedirFigura.equals("salir")); // Si pones "salir" para el bucle
            
            System.out.println("¡Adiós!");

        }catch(Exception e){
            System.out.println("Error.");
                
        } 
    }
}

