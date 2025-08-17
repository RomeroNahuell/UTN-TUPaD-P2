package TrabajoPractico2;

/**
 *
 * @author zk
 */
public class Ejercicio12 {

    public static void main(String[] args) {
        double[] preciosProductos = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales:");
        for (int i = 0; i < preciosProductos.length; i++) {
            System.out.println("Precio: $" + preciosProductos[i]);  
        }
        
        // Modificar el precio del producto en índice 2
        preciosProductos[2] = 129.99;
        
        System.out.println("Precios modificados:");
        for (int i = 0; i < preciosProductos.length; i++) {
            System.out.println("Precio: $" + preciosProductos[i]);  
        }
    }
}
       
   

