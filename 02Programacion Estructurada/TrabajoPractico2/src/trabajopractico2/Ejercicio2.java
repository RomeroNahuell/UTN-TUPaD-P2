package TrabajoPractico2;



import java.util.Scanner;


/**
 *
 * @author zk
 */
public class Ejercicio2 {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[3];
        
        for (int i = 0; i < 3; i ++){
            System.out.print("Ingrese sus numeros: ");
            numeros[i] = scan.nextInt();
        }
        
        int mayor = numeros[0];
        for (int i = 1; i < 3; i++){
            if(numeros[i] > mayor){
                mayor = numeros[i];
            }
        }
        System.out.println("el mayor es " + mayor);
    }
     
  
                
            
        
    
}
