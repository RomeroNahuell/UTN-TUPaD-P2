
package ejercicio13;

/**
 *
 * @author user
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeneradorQR generador= new GeneradorQR();
        Usuario usuario= new Usuario("Nahuel","nahuel@gmail.com");
        
        generador.generar("Https:google.com",usuario);//metodo para generar QR creao en la clase GeneradorQR donde creamos el objeto CodigoQR
        
    }
    
}
