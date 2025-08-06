
package actividad8;

import java.util.Scanner;

/**
 *
 * @author zk
 */
public class Actividad8 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, div;
        
        System.out.print("Ingrese el primer numero: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese el segundo numero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        div = num1 / num2;
       
        
        System.out.println("resultado: " + div);
        
      
        
        
    }
    
}
