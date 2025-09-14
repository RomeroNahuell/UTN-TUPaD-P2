/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

/**
 *
 * @author user
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria= new CuentaBancaria("74834993924",2000.00,"2912","29/02/2024");
        Titular titular= new Titular("Mateo", "2839402");
        
        cuentaBancaria.setTitular(titular);
        
        cuentaBancaria.obtenerClaveDeSeguridad();
        cuentaBancaria.obtenerNombreDelTitular();
    }
    
}
