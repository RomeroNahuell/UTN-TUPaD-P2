
package ejercicio3;

/**
 *
 * @author user
 */
public class Libro {
    private String titulo;
    private String isbn;
    private Editorial editorial; //Agregacion 1A1
    private Autor autor; //Asociacion unidireccional 1A1

    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }
    
    // setter para confirmar la asociacion unidireccional
    public void setAutor(Autor autor) {
        if(autor != null) {
            this.autor = autor;
        }

    }

    public String getTitulo() {
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }
    
    //metodo para obtener el nombre del autor atravez del getter creado en la clase Autor.
    public String obtenerNombreDelAutor(){
        if (autor != null) {
            return this.autor.getNombre();
        }
        return "sin autor";
    }
    
    public void obtenerEditorial(){
        if (editorial != null) {
            System.out.println("El libro "+titulo+" Pertenece a la editorial: "+editorial.getNombre());
        }
    }
    
}
