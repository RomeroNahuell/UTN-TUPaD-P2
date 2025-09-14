/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio11;

/**
 *
 * @author user
 */
public class Cancion {
    private String titulo;
    private Artista artista;

    public Cancion(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(Artista artista) {
        if (artista != null) {
            this.artista = artista;
        }
    }
    
    
  

    public String getTitulo() {
        return titulo;
    }

   
    
    
    public String obtenerNombreDelArtista(){
        if (this.artista != null) {
            return this.artista.getNombre();
        }
        return "No hay Artista";
    }
    
}
