
package casopractico1.pagos;

import casopractico1.interfaces.Pago;

/**
 *
 * @author user
 */
public class TarjetaDeCredito implements Pago{
    
    //Metodo para procesar el pago con tarjeta, en este caso no se aplica descuento y se calculo el total
    //mediante impuestos que le corresponda a cada tarjeta.

    @Override
    public double procesarPago(double monto, double impuestoTarjeta) {
       double impuesto = monto * impuestoTarjeta / 100;
        double totalAPagar = monto + impuesto;
        System.out.println("Pago realizado con Exito $"+totalAPagar );
        return totalAPagar;
    }
    
}
