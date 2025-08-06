
package actividad5;

import java.util.Scanner;

/**
 *
 * @author zk
 */
public class Actividad5 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, suma, resta, multp, div;
        
        System.out.print("Ingrese un numero: ");
        num1 = input.nextInt();
        
        System.out.print("Ingrese un segundo numero: ");
        num2 = input.nextInt();
        
        suma = num1 + num2;
        resta = num1 - num2;
        multp = num1 * num2;
        div = num1 / num2;
        
        System.out.println("\n suma: " + suma +  "\n resta: " + resta + "\n multiplicacion: " + multp + " \n division: " + div);
         
        
     
        
        
       
    }
    
}
