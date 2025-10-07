
package casopractico4;

/**
 *
 * @author zk
 */
public class Animal {
    private String nombre;
    private String raza;
    private String color;

    public Animal(String nombre, String raza, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
    }

    
    
    public void hacerSonido(){
        System.out.println("Animal Haciendo sonido..");
    }
    
    public void describirAnimal(){
        System.out.println("Nombre: "+nombre);
    }
}
