
package registrodeestudiantes;

/**
 *
 * @author zk
 */
public class RegistroDeEstudiantes {

   
    public static void main(String[] args) {
        Estudiantes estudiante = new Estudiantes("Nahuel", "Romero", 2, 8); //definimos el estudiante y sus atributos
        estudiante.mostrarInfo();
        System.out.println("");
        
        estudiante.subirCalificacion(2);
        estudiante.mostrarInfo();
        System.out.println("");
        
        estudiante.subirCalificacion(20);
        estudiante.mostrarInfo();
        System.out.println("");
        
        System.out.println("");
        estudiante.bajarCalificacion(1);
        estudiante.mostrarInfo();
        
        System.out.println("");
        estudiante.bajarCalificacion(8);
        estudiante.mostrarInfo();
        System.out.println("");
        
        estudiante.bajarCalificacion(-2);
        estudiante.mostrarInfo();
        
                                
    }
    
}
