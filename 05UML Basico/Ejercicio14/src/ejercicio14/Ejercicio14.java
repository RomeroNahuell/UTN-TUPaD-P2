
package ejercicio14;

/**
 *
 * @author user
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EditorDeVideo editorDeVideo= new EditorDeVideo();
        Proyecto proyecto= new Proyecto("TrabajoPractico",2);
        
        editorDeVideo.exportar("MP4", proyecto);
    }
    
}
