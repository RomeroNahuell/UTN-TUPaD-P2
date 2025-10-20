
package casopractico1.modelos;

import casopractico1.interfaces.Notificable;

/**
 *
 * @author user
 */
public class Cliente implements Notificable{
    private String nombre;
    private String mail;
    
    public Cliente(String nombre, String mail) {
        this.nombre = nombre;
        this.mail = mail;
    }
    
  
    
//Nuestro cliente Recibe el mensaje y el nuevo estado de su pedido
    @Override
    public void notificar(EstadoPedido nuevoEstado) {
    System.out.println("Notificación para " + nombre +
                       " | Email: " + mail +
                       " -> El estado de su pedido cambió a: " + nuevoEstado);
    }
    
    
}
