/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author user
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion cancion1= new Cancion("ojala");
        Artista artista= new Artista("Luck Ra", "Cuarteto");
        Reproductor reproducir=  new Reproductor();
        
        cancion1.setArtista(artista); //Asociacion unilateral ,asociamos a la cancion el artista creado
        
        System.out.println(cancion1.obtenerNombreDelArtista()); 
        
        reproducir.reproducir(cancion1); //usamos el metodo creado como dependencia de uso
    }
    
}
