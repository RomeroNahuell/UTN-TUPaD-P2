/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author user
 */
public class Conductor {
    private String nombre;
    private String Licencia;
    private Vehiculo vehiculo;

    public Conductor(String nombre, String Licencia) {
        this.nombre = nombre;
        this.Licencia = Licencia;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        if (vehiculo != null && vehiculo.getConductor() != this) {
            vehiculo.setConductor(this);
        }
    }
    
    public void obtenerModeloDeVehiculo(){
        this.vehiculo.obtenerModelo();
}
            
    
    
    
    
    
}
