
package casopractico1;

/**
 *
 * @author zk
 */
public enum CategoriaProducto {
    
    ALIMENTOS("Productos Comestibles"),
    ELECTRONICA("Dispositivos Electronicos"),
    ROPA("Prendas de Vestir"),
    HOGAR("Articulos para el Hogar");
    
    private final String descripcion;
    
    CategoriaProducto(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    
}
