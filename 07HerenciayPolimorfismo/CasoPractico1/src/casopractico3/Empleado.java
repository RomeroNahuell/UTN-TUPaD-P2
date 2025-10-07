
package casopractico3;

/**
 *
 * @author zk
 */
public abstract class Empleado {
    private String nombre;

    public Empleado(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract double calcularSueldo();
}
