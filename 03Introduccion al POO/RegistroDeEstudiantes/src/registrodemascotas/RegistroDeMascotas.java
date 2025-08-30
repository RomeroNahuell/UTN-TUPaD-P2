package registrodemascotas;

/**
 *
 * @author zk
 */
public class RegistroDeMascotas {
    
    public static void main(String[] args){
         Mascotas mascota = new Mascotas("lucas", "perro", 2);
         mascota.mostrarInfo();
         System.out.println("");
         
         mascota.cumplirAnios();
         mascota.mostrarInfo();
         System.out.println("");
         
         mascota.cumplirAnios();
         mascota.mostrarInfo();
         
         
    
    }
   
    
}