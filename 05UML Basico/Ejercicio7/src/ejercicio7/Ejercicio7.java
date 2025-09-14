/* * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;

/**
 *
 * @author user
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor motor= new Motor("v8","1238940");
        Vehiculo coche= new Vehiculo("ABC 123", 2024, motor);
        Conductor conductor= new Conductor("Nahuel", "Argentina");
        
        conductor.setVehiculo(coche);
        
        conductor.obtenerModeloDeVehiculo();
        
        coche.obtenerTipoDeMotor();
    }
    
}
