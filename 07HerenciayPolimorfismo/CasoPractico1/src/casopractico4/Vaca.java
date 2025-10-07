
package casopractico4;

/**
 *
 * @author zk
 */
public class Vaca extends Animal{
    private double peso;

    public Vaca(double peso, String nombre, String raza, String color) {
        super(nombre, raza, color);
        this.peso = peso;
    }
    
    @Override
    public void hacerSonido(){
        System.out.println("MUUUU.......");
    }
    
    
}
