
package ejercicio2;

/**
 *
 * @author user
 */
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Bateria bateria; // Agregacion 1A1
    private Usuario usuario; // Asociacion Bidireccional 1A1 

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
        
    }
    
    // Asociacion Bidirecional con condiciones para evitar bucles infinitos
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this) {
            usuario.setCelular(this);
        }
    }

    public Usuario getUsuario() {
        return usuario;
    }
    
    // metodo que referencia al metodo creado en la clase usuario para obtener el nombre del usuario
    public void obtenerUsuario(){
        this.usuario.obtenerNombre();
    }
    
    
    
    
    public void mostrarBateria(){
        if (bateria != null) {
            System.out.println("El celular "+ modelo + " Tiene la bateria: " + bateria.getModelo() );
            
        }else{
            System.out.println("El celular" + modelo + " No tiene bateria");
        }
    }
    
    // compruebo la agregacion creando un metodo que llame al metodo delegado a la clase bateria para mostrar la capacidad..
    // respetando el "Tell , dont ask"
    public void verCapacidad(){
        this.bateria.capacidad();
    }
    
    // Compruebo agregacion creando un metodo que llame a un getter dentro de la clase Bateria.
    public void capacidad(){
        System.out.println("La capacidad de la bateria es: "+ bateria.getCapacidad());
    }
    
    //Getter para obtener el modelo del celular
    public String getModelo() {
        return modelo;
    }
  
    
    
    
}


