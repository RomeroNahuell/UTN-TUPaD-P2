
package trabajopractico2;

/**
 *
 * @author zk
 */
public class Ejercicio13 {
    
    public static void main(String[] args){
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        System.out.println("Precios originales: ");
        mostrarPrecios(precios, 0);
        
        precios[2] = 10;
        
        System.out.println("Precios modificados: ");
        mostrarPrecios(precios, 0);
        
    }
   public static void mostrarPrecios(double[] precios, int indice) {
        if (indice < precios.length) {
            System.out.println("Precio: $" + precios[indice]);
            mostrarPrecios(precios, indice + 1); // llamada recursiva al siguiente elemento
        } 
   }
}