/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author user
 */
public class FirmaDigital {
    private String codigoHash;
    private String Fecha;

    public FirmaDigital(String codigoHash, String Fecha) {
        this.codigoHash = codigoHash;
        this.Fecha = Fecha;
    }
    
    public void obtenerFecha(){
        System.out.println("La Fecha de la firma digital es de: "+Fecha);
    }
}
