
package ejercicio4;

/**
 *
 * @author user
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco banco= new Banco("Galicia","2829292932");
        TarjetaDeCredito tarjeta= new TarjetaDeCredito("282823883", "28/02/2025",banco);
        Cliente cliente= new Cliente("Mateo","292929");
        
        // Asocio cliente con la tarjeta y automaticamente tarjeta se asocia con cliente
        cliente.setTarjeta(tarjeta);
        
        cliente.numeroTarjeta();
        
        tarjeta.nombreBanco();
        
    }
    
}
