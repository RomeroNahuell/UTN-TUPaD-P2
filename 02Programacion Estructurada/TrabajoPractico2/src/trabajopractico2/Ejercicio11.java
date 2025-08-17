package TrabajoPractico2;

import java.util.Scanner;

/**
 *
 * @author zk
 */
public class Ejercicio11 {
        static double descuento = 0.10;
   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      
        System.out.println("Ingrese el precio del producto :" );
        double precio = scan.nextDouble();
        
        double montoDescuento = precio * descuento;
        
        System.out.println("El descuento especial aplicado es: " + montoDescuento);
        System.out.println("El precio Final con descuento es: " + calcularDescuentoEspecial(precio));
    }
    static double calcularDescuentoEspecial(double precio){
        double descuentoAplicado = precio - (precio * descuento);
        return descuentoAplicado;
        
    }
}
