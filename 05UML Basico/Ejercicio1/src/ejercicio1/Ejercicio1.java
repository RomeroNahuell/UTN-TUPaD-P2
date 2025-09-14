/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author user
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pasaporte nahuel = new Pasaporte("1234","24/02/2024","Rostro","JPG");
        Titular titular = new Titular("Nahuel", "2828234");
        
        titular.setPasaporte(nahuel);
        
        System.out.println("Titular del pasaporte: "+ nahuel.getTitular().getNombre());
        System.out.println("Pasaporte del titular: "+ titular.getPasaporte().getNumero());
        
        System.out.println("Formato de la foto: "+ nahuel.getFoto().getFormato());
        
    }
    
}
