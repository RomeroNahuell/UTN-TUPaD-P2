package TrabajoPractico2;

import java.util.Scanner;

/**
 *
 * @author zk
 */
public class Ejercicio10 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingresa el Stock actual del producto: ");
        int stock = scan.nextInt();
        
        System.out.println("Ingresa la cantidad vendida: ");
        int stockVendido = scan.nextInt();
        
        System.out.println("Ingresa la cantidad recibida: ");
        int stockRecibido = scan.nextInt();
        
        System.out.println("El nuevo stock del producto es: " + actualizarStock(stock, stockVendido, stockRecibido));
        
        
    }
    
    static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        int nuevoStock = stockActual - cantidadVendida + cantidadRecibida;
        return nuevoStock;
    }
}
