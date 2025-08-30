
package simulacionnaveespacial;

/**
 *
 * @author zk
 */
public class NaveEspacial {
    private String nombre;
    private int combustible;
    private int combustibleMaximo = 50;
    
    
    public NaveEspacial(String nombre, int combustible){
        this.nombre = nombre;
        this.combustible = combustible;
    }
    
    public void mostrarEstado(){
        System.out.println("Nombre De la Nave: " + nombre + 
                          "\nCombustible Disponible: " + combustible +" Litros.");
                          
    }
    
    public void despegar(){
        System.out.println("La nave Esta Despegando!!");
    }
    
    
    public void recargarCombustible(int cantidad){
        if (cantidad <= 0) {                       //evitar que se recargue 0 o numero negativo
            System.out.println("Cantidad de combustible invalida.");
            return;                               //salida del metodo
        }
         int nuevoNivel = combustible + cantidad; //sumar la recarga al combustible actual
            
         if (nuevoNivel > combustibleMaximo) {   
             combustible = combustibleMaximo; //fijo maximo  
             System.out.println("Tanque Lleno, "+combustible+"Litros");
            
        }else{
             combustible = nuevoNivel;
             System.out.println("Se recargaron: "+cantidad+"Litros.Total de Combustible: "+combustible);
         }
        
    }
    
    public void avanzar(int distancia){
        if (distancia <= 0) {
            System.out.println("Distancia Invalida");
            return;
            
        }
        if (distancia <= combustible) {
            combustible -= distancia;
            System.out.println("La nave avanzo: "+distancia+" Anios luz. Combustible restante: "+combustible);
            
        }else{
            System.out.println("No hay suficiente combustible. Combustible disponible: "+combustible);
        }
    }
    
        
        
    
}
