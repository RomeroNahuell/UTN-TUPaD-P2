
package ejercicio3;

/**
 *
 * @author user
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Editorial editorialPlaneta= new Editorial("Editorial Planeta", "calle viva 22");
        Libro libro= new Libro("Los ojos del dragon", "22233", editorialPlaneta);
        Autor sthepenKing= new Autor("Stephen King", "EEUU");
        
        libro.setAutor(sthepenKing);
        
        System.out.println("El autor del libro "+libro.getTitulo()+" es: "+ libro.obtenerNombreDelAutor());
        
        libro.obtenerEditorial();
    }
    
}
