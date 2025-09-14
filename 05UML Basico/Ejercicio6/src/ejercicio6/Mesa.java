
package ejercicio6;

/**
 *
 * @author user
 */
public class Mesa {
    private int numero;
    private int capacidad;

    public Mesa(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }
    
    public void obtenerNumeroDeMesa(){
        System.out.println("El numero de la mesa es: "+numero);
    }
}
