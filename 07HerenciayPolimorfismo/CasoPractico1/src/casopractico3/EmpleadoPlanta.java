
package casopractico3;

/**
 *
 * @author user
 */
public class EmpleadoPlanta extends Empleado{
    private double sueldoBase;
    private double sueldoBono;

    public EmpleadoPlanta(double sueldoBase, double sueldoBono, String nombre) {
        super(nombre);
        this.sueldoBase = sueldoBase;
        this.sueldoBono = sueldoBono;
    }

    @Override
    public double calcularSueldo(){
        
        return sueldoBase + sueldoBono;
    }
   
}
