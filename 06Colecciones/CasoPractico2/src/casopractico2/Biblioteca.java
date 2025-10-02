/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casopractico2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user
 */
public class Biblioteca {
    private String nombre;
    private List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        libros = new ArrayList<>();
    }
    
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor){
        libros.add(new Libro(isbn, titulo, anioPublicacion, autor));
    }
    
    public void listarLibros(){
        if (libros.isEmpty()) {
            System.out.println("Lista vacia.");
            return;
        }
        for (Libro libro : libros) {
            libro.mostrarInfo();
            System.out.println("");
        }
    }
    
    public Libro buscarLibroPorIsbn(String isbn){
       
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }
    
    public ArrayList<Libro>filtrarLibrosPorAnios(int anio){
        ArrayList<Libro> libroPorAnio = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                libroPorAnio.add(libro);
                
               
            }
        }
        return libroPorAnio;
    }
    
    public void eliminarLibro(String isbn){
       Libro libroEncontrado = buscarLibroPorIsbn(isbn);
        if (libroEncontrado != null) {
            this.libros.remove(libroEncontrado);
            System.out.println("Libro borrado Existosamente.");
            listarLibros();
        }else{
            System.out.println("No se pudo borrar el libro con ISBN: "+isbn);
        }
        
    }
    
    //Metodo para obtener el total de libro usando while , forma manual
    public int obtenerCantidadLibros(){
        int total = 0;
        int i = 0;
        while (i < libros.size()) {            
            total ++;
            i++;
        }
        
          return total;      
        
    }
    //Metodo sencilo con size
    public int obtenerCantidadLibros2(){
        return libros.size();
    }
    
    public void mostrarAutoresDisponibles(){
        System.out.println("Lista de Autores");
        for (Libro libro : libros) {
            libro.getAutor().mostrarInfo();
            
            
            
        }
    }
    
}
 