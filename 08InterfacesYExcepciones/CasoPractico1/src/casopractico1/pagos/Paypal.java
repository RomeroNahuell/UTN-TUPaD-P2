
package casopractico1.pagos;

import casopractico1.interfaces.Pago;
import casopractico1.interfaces.PagoConDescuento;

/**
 *
 * @author user
 */
public class Paypal implements Pago, PagoConDescuento {
    
    //Metodo para procesar el pago , usando el metodo aplicarDescuento para determinar el descuento que se le debe aplicar
    //por pagar con el metodo paypal.

    @Override
    public double procesarPago(double monto, double comision) {
        double montoConDescuento = aplicarDescuento(monto,5.0);
        double montoFinal = montoConDescuento +comision;
        System.out.println("Pago realizado con exito: $"+montoFinal);
        return montoFinal;
        
        
        
    }
//Metodo para calcular el descuento que le corresponde.
    @Override
    public double aplicarDescuento(double monto, double porcentajeDescuento) {
        return monto - (monto * porcentajeDescuento / 100);
    }
    
}
