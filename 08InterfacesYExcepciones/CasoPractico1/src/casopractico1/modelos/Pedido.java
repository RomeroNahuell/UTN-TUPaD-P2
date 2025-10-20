
package casopractico1.modelos;

import casopractico1.interfaces.Pagable;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Pedido implements Pagable {
    private ArrayList<Producto> productos; //lista de productos 
    private Cliente cliente;
    private EstadoPedido estado;

    public Pedido( Cliente cliente) {
        this.productos = new ArrayList<> ();
        this.cliente = cliente;
        this.estado = EstadoPedido.PENDIENTE;
    }
    
//En esta clase calculamos el total. creamos un contador, luego recorremos la lista de productos
// y a cada producto llamamos a su metodo calcularTotal que retona el precio y lo vamos acumulando en el contador.
    @Override
    public double calcularTotal() {
        double calculoFinal= 0;
        for (Producto producto : productos) {
           calculoFinal += producto.calcularTotal();
        }
        return calculoFinal;
    }
    
    //metodo para permitir cambiar el estado del pedido y notificar al cliente.
    public void cambiarEstado(EstadoPedido nuevoEstado){
        this.estado = nuevoEstado;
        cliente.notificar(nuevoEstado);
    }
    
    
    public void agregarProducto(Producto producto){
        if (producto != null) {
            productos.add(producto);
        }
    }
}
