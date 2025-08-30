
package gestiongallinasengranjadigital;

/**
 *
 * @author zk
 */
public class GestionGallinasEnGranjaDigital {
    public static void main(String[] args){
        Gallina gallina1 = new Gallina(123,2,40);
        
        gallina1.mostrarEstado();
        System.out.println("");
        
        gallina1.ponerHuevos(10);
        gallina1.envejecer();
        gallina1.mostrarEstado();
        System.out.println("");
        
        Gallina gallina2 = new Gallina(245,3,55);
        
        gallina1.mostrarEstado();
        System.out.println("");
        
        gallina1.ponerHuevos(5);
        gallina1.envejecer();
        gallina1.mostrarEstado();
        
        
        
        
    }
}
