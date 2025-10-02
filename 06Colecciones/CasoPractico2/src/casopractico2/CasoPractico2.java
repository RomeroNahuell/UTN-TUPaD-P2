
package casopractico2;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class CasoPractico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca Nacional");
        
        Autor autor1 = new Autor("abc123","Hector","Argentino");
        Autor autor2 = new Autor("abc111","Mateo","Peruano");
        Autor autor3 = new Autor("abc130","Beatriz","Argentino");
        
        biblioteca.agregarLibro("1011", "La Divina Comedia", 1472, autor1);
        biblioteca.agregarLibro("1013", "El Alquimista", 1988, autor2);
        biblioteca.agregarLibro("1020", "El se;or de los anillos", 1954, autor1);
        biblioteca.agregarLibro("1144", "El nombre del Viento", 2007, autor3);
        biblioteca.agregarLibro("1111", "El Temor de un Hombre Sabio", 2001, autor3);
        
        //Prueba de Metodos//
        
        //biblioteca.listarLibros();
        
        
        /*Libro libroEncontrado = biblioteca.buscarLibroPorIsbn("1011");
        if (libroEncontrado != null) {
            libroEncontrado.mostrarInfo();
        }else{
            System.out.println("Libro no encontrado.");
        }*/
        
       /*ArrayList<Libro> filtrarLibroPorAnio = biblioteca.filtrarLibrosPorAnios(2001);
        if (filtrarLibroPorAnio.isEmpty()) {
            System.out.println("Lista vacia.");
        }else{
            for (Libro libro : filtrarLibroPorAnio) {
                libro.mostrarInfo();
            }
        }*/
       
       //biblioteca.eliminarLibro("1011");
        
       //System.out.println(biblioteca.obtenerCantidadLibros());
       
       //System.out.println("Total de Libros: "+biblioteca.obtenerCantidadLibros2());
       
       //biblioteca.mostrarAutoresDisponibles();
        
    }
    
}
