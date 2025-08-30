package registrodemascotas;

/**
 *
 * @author zk
 */
public class Mascotas {
    //atributos de la clase Mascotas en private para que no se pueda acceder directamente a ellos.
    private String nombre;
    private String especie;
    private int edad;
    
  //constructor para inicializar los atributos y evitar uso de getters y setters para inicializar atributos.
   public Mascotas(String nombre, String especie, int edad){
       this.nombre = nombre;
       this.especie = especie;
       this.edad = edad;
   }
   
   public void mostrarInfo(){
       System.out.println("Nombre :"+nombre+ " \nespecie: "+especie+ " \nedad: "+edad+" anios");
   }
   
   
   //metodo para simular el paso del tiempo del perro, sumandole 1 anio cada que se ejecute el metodo
   public void cumplirAnios(){
       edad ++;
       System.out.println(nombre+" ha cumplido anios! Ahora tiene "+edad+ " anios." );
   }
}
