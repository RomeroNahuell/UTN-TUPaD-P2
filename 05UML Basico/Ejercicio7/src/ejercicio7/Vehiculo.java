/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author user
 */
public class Vehiculo {
    private String patente;
    private int modelo;
    private Motor motor;//Agregacion 1A1
    private Conductor conductor;//Asociacion Bidireccional 1A1

    public Vehiculo(String patente, int modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }
    
    
   public void obtenerModelo(){
       System.out.println("El modelo del motor es: "+modelo);
   }
    
   public void obtenerTipoDeMotor(){
       this.motor.obtenerTipoDeMotor();
   }
}
