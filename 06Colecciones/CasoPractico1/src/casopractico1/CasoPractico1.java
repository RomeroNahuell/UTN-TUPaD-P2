
package casopractico1;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class CasoPractico1 {

  
    public static void main(String[] args) {
       Producto remera = new Producto("abc123","Remera",25000.0,4,CategoriaProducto.ROPA);
       Producto computadora = new Producto("xcv111","Computadora",120000.0,5,CategoriaProducto.ELECTRONICA);
       Producto cama = new Producto("cma123","Cama",1000.0,3,CategoriaProducto.HOGAR);
       Producto pizza = new Producto("cod876","Pizza",8000,2,CategoriaProducto.ALIMENTOS);
       Producto pantalon = new Producto("abd111","Pantalon",3000.0,1,CategoriaProducto.ROPA);
       
       Inventario inventario = new Inventario();
      
       inventario.agregarProducto(remera);
       inventario.agregarProducto(computadora);
       inventario.agregarProducto(cama);
       inventario.agregarProducto(pizza);
       inventario.agregarProducto(pantalon);
       
       //inventario.listarProductos();
       
       //inventario.listarProductos2();
       
       /*Producto encontrado = inventario.buscarProductoPorId("abc123");
        if (encontrado != null) {
            encontrado.mostrarInfo();
        }else{
            System.out.println("Producto no encontrado.");
        }*/
       
       
       /*Producto productoEncontrado = inventario.buscarProductoPorId2("abc123");
       if(productoEncontrado != null){
           productoEncontrado.mostrarInfo();
       }else{
           System.out.println("Producto no encontrado.");
       }*/
       
       //Metodo para buscar inventario por categoria.
       /*ArrayList<Producto> filtrarPorCategoria = inventario.filtrarPorCategoria(CategoriaProducto.ROPA);
        for (Producto producto : filtrarPorCategoria) {
            System.out.println(producto);
        }*/
       
       //inventario.eliminarProducto("abc123");
       
       /*inventario.actualizarStock("abc123",1);
       remera.mostrarInfo();*/
       
       //System.out.println("Stock Total de productos: "+inventario.totalStock());
       
       //System.out.println(inventario.obtenerProductoConMayorStock());
       
       /*ArrayList<Producto> filtroPorprecio = inventario.filtrarProductoPorPrecio(1000, 3000);
        for (Producto producto : filtroPorprecio) {
            System.out.println("Productos por el precio recibido: "+producto);
        }*/
       
       //inventario.mostrarCategoriasDisponibles();
       
       
       
    }
    
}
