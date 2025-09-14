
package ejercicio4;

/**
 *
 * @author user
 */
public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente; //Asociacion Bidireccional 1A1
    private Banco banco; // Agregacion 1A1

    public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }
    
    //Asociacion Bidireccional y sus condiciones para evitar bucles infinitos
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjeta() != this) {
            cliente.setTarjeta(this);
            
        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getNumero() {
        return numero;
    }
    
    //metodo para obtener el nombre del banco
    public void nombreBanco(){
        System.out.println("El nombre del banco es: "+ this.banco.getNombre());
    }
    
    
    
    
}
