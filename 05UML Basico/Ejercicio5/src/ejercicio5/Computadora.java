
package ejercicio5;

/**
 *
 * @author user
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;

    public Computadora(String marca, String numeroSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modelo, chipset);
    }
    
    //Asociacion bidireccional
    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if (propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }

    public Propietario getPropietario() {
        return propietario;
    }
    
    // obtener propietario mediante un getter
    public void obtenerPropietario(){
        System.out.println("El propietario de la computadora: "+marca+ " Es: "+ propietario.getNombre());
    }
    
    //obtener modelo de la placa madre
    public void obtenerModelo(){
        this.placaMadre.obtenerModelo();
    }
}
