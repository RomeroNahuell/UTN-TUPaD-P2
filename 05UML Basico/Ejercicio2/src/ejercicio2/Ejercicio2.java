
package ejercicio2;

/**
 *
 * @author user
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bateria powerBank = new Bateria("Ng2", 4000);
        Celular a54 = new Celular("1111","Samsung","A54 5G",powerBank);  //Agregacion ingresando como parametro el objeto Bateria
        Usuario user = new Usuario("Nahuel","2828343");
        
                                                                                                
        
        a54.mostrarBateria();
        a54.verCapacidad();
        a54.verCapacidad();
        
        // Realizo la Asociacion 
        // Usuario conoce a celular
        // Celular se asocio automaticamente debido a la logica en los set
        user.setCelular(a54);
        
        a54.obtenerUsuario();
        
        
        
    }
    
    
    
   
    
}
