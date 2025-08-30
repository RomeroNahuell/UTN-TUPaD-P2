
package simulacionnaveespacial;

/**
 *
 * @author zk
 */
public class SimulacionDeNaveEspacial {
    
    public static void main(String[] args){
       // Crear nave con 50 unidades de combustible
        NaveEspacial nave = new NaveEspacial("Apollo X", 50);
        
        nave.mostrarEstado();
        System.out.println("----------------");
        
        nave.avanzar(40);
        System.out.println("---------------");
        nave.avanzar(20);
        System.out.println("---------------");
        
        nave.recargarCombustible(30);
        System.out.println("---------------");
        
        nave.avanzar(20);
        System.out.println("---------------");
        
        nave.mostrarEstado();
    }
}
    
    
    
    
    
    
    

