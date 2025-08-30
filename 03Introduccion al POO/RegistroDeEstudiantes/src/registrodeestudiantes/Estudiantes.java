
package registrodeestudiantes;

/**
 *
 * @author zk
 */
public class Estudiantes {
    //atributos de la clase Estudiantes en private para que no se pueda acceder directamente a ellos.
    private String nombre;
    private String apellido;
    private int curso;
    private double calificacion;
    
    
    //constructor para inicializar los atributos y evitar uso de getters y setters para inicializar atributos.
    public Estudiantes(String nombre,String apellido,int curso, double calificacion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;    
    }
    
    //Mostramos la informacion de los atributos
    public void mostrarInfo(){
        System.out.println("Nombre: "+nombre+" \nApellido: "+apellido+" \nCurso: "+curso+" anio" +" \nCalifiacion: "+calificacion);
        
    }
    // metodo para subir una califiacion con sus condiciones
    public void subirCalificacion(double puntos){                
        if (puntos > 0 && (calificacion + puntos )<= 10) {       //condicion que verifique que el numero ingresado sea mayor a 0 y no pase la calificacion de 10.
            calificacion += puntos;
        }else if (puntos == 0) {
            System.out.println("Ingrese un numero mayor a 0");
        }
        else{
            System.out.println("No se puede subir, la calificacion excederia a 10.");
        }
        
    }
    // metodo para bajar calificaciones con sus condiciones.
    public void bajarCalificacion(double puntos){
        if (puntos > 0 && calificacion >= puntos) {          //condicion que verifique si los puntos a restar son positivos y que permite restar como maximo el valor de la calificacion
            calificacion -= puntos;
        }else if(puntos <= 0){
            System.out.println("Ingrese un numero mayor a 0.");
        }else{
            System.out.println("No es posible restar mas puntos.");
        }
        
    }
    
         
}
