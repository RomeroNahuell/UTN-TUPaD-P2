
package sistemadegestiondeempleados;

/**
 *
 * @author zk
 */
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados;
    
    
    //constructores
    
    public Empleado(int id, String nombre, String puesto, double salario){
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        Empleado.totalEmpleados ++;
    }
    
    public Empleado(String nombre, String puesto){
        this.id = 1234;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 100;
        Empleado.totalEmpleados ++;
        
        
        
    }
    
    //metodos
    public void actualizarSalario(double porcentajeAumento){
       salario += (salario * porcentajeAumento / 100);
    }
    
    public void actualizarSalario(int aumento){
        salario += aumento;
    }
    
    
    public static int mostrarTotalEmpleados(){
        System.out.println("Total De Empleados: "+totalEmpleados);
        return totalEmpleados;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    
    
    
   
        
    
    
        
    
  
}
