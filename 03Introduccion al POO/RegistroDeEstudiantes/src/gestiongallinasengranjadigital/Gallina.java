
package gestiongallinasengranjadigital;

/**
 *
 * @author zk
 */
public class Gallina {
    int idGallina;
    int edad;
    int huevosPuestos;
    
    public Gallina(int idGallina, int edad, int huevosPuestos){
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }
    
    public void ponerHuevos(int huevos){
        if (huevos > 0) {
            huevosPuestos += huevos;
            
        }
        
    }
    
    public void envejecer(){
        edad ++;
    }
    
    public void mostrarEstado(){
        System.out.println("Gallina: " + idGallina + 
                          "\nedad: " + edad +" anios"+ 
                          "\nHuevos Colocados: " + huevosPuestos);
    }
    
    

    
}
