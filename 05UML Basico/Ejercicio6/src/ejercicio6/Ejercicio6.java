
package ejercicio6;

/**
 *
 * @author user
 */
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mesa mesa= new Mesa(2,4);
        Reserva reserva= new Reserva("12/09/2025", "23:00 PM", mesa);
        Cliente cliente= new Cliente("Nahuel", "382644444");
        
        reserva.setCliente(cliente);
        
        reserva.obtenerNumeroDeMesa();
        reserva.obtenerNombreDeCliente();
    }
        
    
}
