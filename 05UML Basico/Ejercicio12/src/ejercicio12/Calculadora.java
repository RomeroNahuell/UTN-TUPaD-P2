/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author user
 */
public class Calculadora {
    
    
     public void calcular(Impuesto impuesto) { // Dependencia de uso
        if (impuesto != null) {
            int montoOriginal = impuesto.getMonto();
            int impuestoCalculado = montoOriginal * 2; // El doble como en tu lógica original
            
            System.out.println("=== CÁLCULO DE IMPUESTO ===");
            System.out.println("Monto original: $" + montoOriginal);
            System.out.println("Aplicando impuesto (doble del monto)...");
            System.out.println("Total con impuesto: $" + impuestoCalculado);
            
           
        }
    }
}