
package casopractico1;

import casopractico1.modelos.Cliente;
import casopractico1.modelos.EstadoPedido;
import casopractico1.modelos.Pedido;
import casopractico1.modelos.Producto;
import casopractico1.pagos.Paypal;
import casopractico1.pagos.TarjetaDeCredito;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class CasoPractico1 {

    
    public static void main(String[] args) {
        //Medio de pagos
        Paypal pagoPaypal = new Paypal();
        TarjetaDeCredito pagoTarjeta = new TarjetaDeCredito();
        
        //Clientes
        Cliente cliente1 = new Cliente("Pedro","pedro@gmail.com");
        Cliente cliente2 = new Cliente("Caro","caro@gmail.com");
        
        //Pedidos
        Pedido pedido1 = new Pedido(cliente1);
        Pedido pedido2 = new Pedido(cliente2);
        
        //Productos
        Producto producto1 = new Producto("Cama",200);
        Producto producto2 = new Producto("Silla",70);
        Producto producto3 = new Producto("Ropero",170);
        Producto producto4 = new Producto("Mesa",250);
        
        //Agregamos los productos a los pedidos
        pedido1.agregarProducto(producto1);
        pedido1.agregarProducto(producto2);
        pedido1.agregarProducto(producto3);
        pedido2.agregarProducto(producto4);
        
        //metodos para calcular el total del pedido (Pruebas)
        System.out.println("Total del pedido: "+pedido1.calcularTotal());
        System.out.println("Total del pedido: "+pedido2.calcularTotal());
        
        //Prueba realizar pagos
        double totalpedido1 = pedido1.calcularTotal();
        pagoPaypal.procesarPago(totalpedido1, 5.0); //Aunque no esta aclarado el descuento se realiza automaticamente si el pago es mediante paypal.
        double totalpedido2 = pedido2.calcularTotal();
        pagoTarjeta.procesarPago(totalpedido2, 12.0); //el pago aplica una tasa de impuesto por pago mediante tarjeta, no se aplica descuento en este caso.
        
        // Metodos para notifcar el estado del pedido del cliente.
        pedido1.cambiarEstado(EstadoPedido.EN_PREPARACION);
        pedido1.cambiarEstado(EstadoPedido.EN_CAMINO);
        pedido2.cambiarEstado(EstadoPedido.PENDIENTE);
        
        
        
        
    }
    
}
