
package casopractico1.modelos;

import casopractico1.interfaces.Pagable;

/**
 *
 * @author user
 */
public class Producto implements Pagable{
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
    
    
//Debido a que Pedido se encarga se realizar el calculo en esta clase solo retornamos el precio, podriamos
// simplemente usar un getter pero al estar usarndo interfaces, es obligatorio sobreescriir el metodo.
    @Override
    public double calcularTotal() {
        return precio;
    }
    
    
}
