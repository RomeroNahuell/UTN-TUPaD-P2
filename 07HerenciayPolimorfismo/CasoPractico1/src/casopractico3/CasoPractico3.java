
package casopractico3;

import java.util.ArrayList;

/**
 *
 * @author zk
 */
public class CasoPractico3 {
    public static void main(String[] args){
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        empleados.add(new EmpleadoPlanta(200,100,"Nahuel"));
        empleados.add(new EmpleadoPlanta(400,150,"Leo"));
        empleados.add(new EmpleadoTemporal(40,7,"Lucas"));
        empleados.add(new EmpleadoTemporal(60,9,"Alexia"));
        
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoPlanta) {
                System.out.println("Sueldo de EmpleadoPlanta: "+empleado.calcularSueldo());
            }else if(empleado instanceof EmpleadoTemporal){
                System.out.println("Sueldo EmpleadoTemporal: "+empleado.calcularSueldo());
        }
        }
        
        
    }
}
