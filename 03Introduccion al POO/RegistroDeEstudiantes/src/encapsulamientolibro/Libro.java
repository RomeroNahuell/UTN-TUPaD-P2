package encapsulamientolibro;
/**
 *
 * @author zk
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public void mostrarInfo(){
         System.out.println("Nombre: " + titulo + 
                          "\nautor: " + autor + 
                          "\nanio De Publicacion: " + anioPublicacion);
    }

    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion > 0 ) {

            this.anioPublicacion = anioPublicacion;
        }else{
            System.out.println("No es posible Ingresar un valor menor a 0.");
        }

    }

}