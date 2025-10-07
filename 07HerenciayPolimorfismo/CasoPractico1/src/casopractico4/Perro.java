
package casopractico4;

/**
 *
 * @author zk
 */
public class Perro extends Animal{

    public Perro(String nombre, String raza, String color) {
        super(nombre, raza, color);
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("GUA GUA.....");
    }
    
    
    
}
