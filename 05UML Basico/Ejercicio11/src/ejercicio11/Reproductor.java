/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author user
 */
public class Reproductor {
    
    //Dependencia de uso, usamos la clase Cancion como parametro del metodo reproducir dentro de la clase Reproductor
    public void reproducir(Cancion cancion){
        System.out.println("Reproduciendo: " + cancion.getTitulo() + " de " + cancion.obtenerNombreDelArtista());
    }
}
