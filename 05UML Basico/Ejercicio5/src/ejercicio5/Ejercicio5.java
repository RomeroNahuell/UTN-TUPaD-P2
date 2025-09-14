
package ejercicio5;

/**
 *
 * @author user
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computadora compu= new Computadora("HP","2223330","2024","Intel i5");
        Propietario propietario= new Propietario("Nahuel","28282929");
        
        compu.setPropietario(propietario);
        
        compu.obtenerPropietario();
        
        compu.obtenerModelo();
    }
    
}
