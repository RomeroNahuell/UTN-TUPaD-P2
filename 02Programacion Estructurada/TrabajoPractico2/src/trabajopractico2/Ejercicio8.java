
package TrabajoPractico2;

import java.util.Scanner;

/**
 *
 * @author zk
 */
public class Ejercicio8 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese el precio del producto: ");
        double precio = scan.nextDouble();
        
        System.out.println("Ingrese el porcentaje de impuesto");
        double impuesto = scan.nextDouble();
        
        System.out.println("Ingrese el porcentaje de descuento: ");
        double descuento = scan.nextDouble();
        
        System.out.println("El precio final es : " + calcularPrecioFinal(impuesto, descuento, precio));
        
    }
   
    static double calcularPrecioFinal(double impuesto, double descuento, double precio){
        double preciofinal = precio + (precio * impuesto / 100.0) - (precio * descuento / 100.0);
        return preciofinal;
   
    }
    
    
    
}
