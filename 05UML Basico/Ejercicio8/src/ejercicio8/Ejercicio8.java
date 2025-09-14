/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author user
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuario= new Usuario("Nahuel","nahuel@gmail.com");
        Documento documento= new Documento("Trabajo Practico","Ejercicios a realizar","2712377","12/09/2025",usuario);
        
        documento.nombreDelUsuario();
        documento.obtenerFechaDeLaFirma();
    }
    
}
