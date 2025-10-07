
package casopractico3;

/**
 *
 * @author user
 */
public class EmpleadoTemporal extends Empleado{
    private double sueldoPorHora;
    private int horasTrabajadas;

    public EmpleadoTemporal(double sueldoPorHora, int horasTrabajadas, String nombre) {
        super(nombre);
        this.sueldoPorHora = sueldoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

   

    @Override
   public double calcularSueldo(){
       
       return  sueldoPorHora * horasTrabajadas;
       
   }
    
    
}
