
package sistemadegestiondeempleados;

/**
 *
 * @author zk
 */
public class SistemaDegestionDeEmpleados {

    
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(122, "Mateo", "Gerente", 500);
        Empleado empleado2 = new Empleado("Paco", "Operador");
        
        System.out.println(empleado1);
        System.out.println("---------------------");
        System.out.println(empleado2);
        System.out.println("---------------------");
        
        empleado1.actualizarSalario(20.0);
        empleado2.actualizarSalario(250);
        System.out.println("");
        
        System.out.println(empleado1);
        System.out.println("---------------------");
        System.out.println(empleado2);
        System.out.println("---------------------");
        System.out.println("");
        
        Empleado.mostrarTotalEmpleados();
        
        
        
    }
    
}
