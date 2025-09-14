
package ejercicio5;

/**
 *
 * @author user
 */
public class PlacaMadre {
    private String modelo;
    private String chipset;

    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    public void obtenerModelo(){
        System.out.println("El modelo de la placa madre  es: "+modelo);
    }

    public String getChipset() {
        return chipset;
    }
    
    
}
