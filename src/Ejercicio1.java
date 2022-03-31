import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        double dinero,sumaDinero=0;
        int personas=0;
        boolean parar=true;
        
        try{
                        
            do{
                System.out.println("¿Cuánto dinero le das al mendigo? (si no quieres darle nada pon un 0): ");
                dinero=sc.nextDouble();
                sumaDinero=sumaDinero+dinero;
                
                if(dinero>0){ // Ya sea 0 o más va a contar personas
                    personas++;                    
                }else{
                    personas++;
                } 
                
                if(personas==5 && sumaDinero>200){ // Si el dinero es mas de 200 y se lo han dado 5 personas
                    System.out.println("Al mendigo le han dado "+ sumaDinero+" €, "+personas+" personas");
                    parar=false;
                }
                if(personas==10){ // Si personas llegan a 10
                    System.out.println("Al mendigo le han dado "+ sumaDinero+" €, "+personas+" personas");
                    parar=false;
                } 
            }while(parar!=false);  
            
        }catch (Exception e){
            System.out.println("Error. Pon los decimal con ','");
        }
    }
}
