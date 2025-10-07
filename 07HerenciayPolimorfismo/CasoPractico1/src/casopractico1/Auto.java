
package casopractico1;

/**
 *
 * @author zk
 */
public class Auto extends Vehiculo {
    private int cantidadPuertas;

    public Auto(int cantidadPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    @Override
     public void mostrarInfo(){
        System.out.println("Marca del auto: "+ getMarca()+ "\nModelo: "+getModelo()+
                "\nCantidad De Puertas: "+cantidadPuertas);
        
       
    }
}
