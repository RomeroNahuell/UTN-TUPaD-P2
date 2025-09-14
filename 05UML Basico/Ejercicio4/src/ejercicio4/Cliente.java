
package ejercicio4;

/**
 *
 * @author user
 */
public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaDeCredito tarjeta;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    //Asociacion bidireccional y sus condiciones para evitar bucles infinitos
    public void setTarjeta(TarjetaDeCredito tarjeta) {
        this.tarjeta = tarjeta;
        if (tarjeta != null && tarjeta.getCliente() != this) {
            tarjeta.setCliente(this);
        }
    }

    public TarjetaDeCredito getTarjeta() {
        return tarjeta;
    }
    
    //metodo para obtener el numero de tarjeta
    public void numeroTarjeta(){
        System.out.println(this.tarjeta.getNumero());
    }
    
}
