package TrabajoPractico2;

import java.util.Scanner;

/**
 *
 * @author zk
 */
public class Ejercicio4 {

   
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         System.out.print("Ingrese el precio del producto: ");
         double precio = scan.nextDouble();
         System.out.print("Ingrese la categoria del producto: A, B o C: ");
         char categoria = scan.next().charAt(0);
         
        switch(categoria){
            
            case 'A':
                System.out.println("Precio original: $"+precio);
                System.out.println("Descuento aplicado del 10%");
                System.out.println("Precio final: $" + (precio - (precio * 10.0 / 100)));
                break;
            case 'B':
                System.out.println("Precio original: $"+precio);
                System.out.println("Descuento aplicado del 15%");
                System.out.println("Precio final: $" + (precio - (precio * 15.0 / 100)));
                break;
            case 'C':
                System.out.println("Precio original: $"+precio);
                System.out.println("Descuento aplicado del 20%");
                System.out.println("Precio final: $" + (precio - (precio * 20.0 / 100)));
                break;
            default:
                System.out.println("Operacion Invalida.");
                
        }
         
    }
    
    
    
    
}
