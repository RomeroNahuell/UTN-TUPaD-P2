package encapsulamientolibro;
/**
 *
 * @author zk
 */
public class EncapsulamientoClaseLibro {

    public static void main(String[] args) {
        Libro libro = new Libro("Ojos de Dragon", "Stephen King", 2005);
       
        libro.mostrarInfo();
        System.out.println("");

        libro.setAnioPublicacion(-5);
        libro.mostrarInfo();
        System.out.println("");

        libro.setAnioPublicacion(2014);
        libro.mostrarInfo();

    }

}