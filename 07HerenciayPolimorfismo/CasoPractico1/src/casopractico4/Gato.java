
package casopractico4;

/**
 *
 * @author zk
 */
public class Gato extends Animal{

    public Gato(String nombre, String raza, String color) {
        super(nombre, raza, color);
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("MIAU MIAU.....");
    }
    
}
