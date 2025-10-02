
package casopractico1;

import java.util.ArrayList;

/**
 *
 * @author zk
 */
public class Inventario {
    private ArrayList<Producto> productos = new ArrayList<>();
    
    public void agregarProducto(Producto producto){
        if (producto != null) {
            productos.add(producto);
        }
    }
    
    public void listarProductos(){
        if (productos.isEmpty()) {
            System.out.println("No hay productos");
            return; //return para salir del metodo si la lista esta vacia.
        }
        System.out.println("\n Lista de Productos");
        for (Producto producto : productos) {
            producto.mostrarInfo();
            System.out.println("");
        }
    }
  
    
    
   public void listarProductos2(){
       for (Producto producto : productos) {
           System.out.println(producto.toString());
       }
   }
   
   //METODOS PARA BUSCAR LOS PRODUCTOR POR ID
   
   //metodo foreach
   public Producto buscarProductoPorId(String id){
       for (Producto producto : productos) {
           if (producto.getId().equals(id)) {
               return producto;
           }
       }
       return null;
   }
   
   //metodo while
   public Producto buscarProductoPorId2(String id){
       int i=0;
       Producto productoEncontrado = null;
       while (i < productos.size() && !this.productos.get(i).getId().equals(id)) {           
           i++;
       }
       if (i<productos.size()) {
           productoEncontrado = this.productos.get(i);
       }
        return productoEncontrado;       
   }
   
   public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria){
       ArrayList<Producto> encontradoPorCategoria = new ArrayList<>();
       for (Producto producto : productos) {
           if (producto.getCategoria().equals(categoria)) {
               encontradoPorCategoria.add(producto);
               
           }
       } return encontradoPorCategoria;
    
   } 
   
   
   public void eliminarProducto(String id){
       Producto productoEliminado = buscarProductoPorId2(id);
       if (productoEliminado != null) {
           this.productos.remove(productoEliminado);
           System.out.println("Producto Eliminado correctamente.");
           listarProductos2();
       }else{
           System.out.println("No se encontro el producto con ID: "+id);
       }
       
       
     }
   
   //METODOS PARA ACTUALIZAR STOCK
   public void actualizarStock(String id, int cantidad){
       Producto productoActualizar = null;
       int i = 0;
       while (i < productos.size() && !productos.get(i).getId().equals(id)) {           
           i++;
       }
       if (i < productos.size()) {
           productoActualizar = this.productos.get(i);
           productoActualizar.setCantidad(cantidad);
           System.out.println("Stock actualizado para el producto: "+ productoActualizar.getNombre());
       }else{
           System.out.println("Producto no encontrado");
       }
   }
       
  public void actualizarStock2(String id, int cantidad){
       for (Producto producto : productos) {
           if (producto.getId().equals(id)) {
               producto.setCantidad(cantidad);
               System.out.println("Stock actualizado para el producto: "+producto.getNombre());
               return;
           }else{
               System.out.println("Producto no encontrado.");
           }
          
      }
   }
  
  public int totalStock(){
      int stockTotal = 0;
      for (Producto producto : productos) {
          stockTotal += producto.getCantidad();
          
      }
          return stockTotal;
  }
  
  
  public Producto obtenerProductoConMayorStock(){
      if (productos.isEmpty()) {
          return null;
      }
      Producto productoStockMasAlto = null;
      int productoMayorStock = 0;                           //variable donde se va a guarda el producto con mayor stock
      for (Producto producto : productos) {
          if (producto.getCantidad() > productoMayorStock) {
              productoMayorStock = producto.getCantidad();
              productoStockMasAlto = producto;
          }
             
          }
        return productoStockMasAlto;
      }
  
  
  public ArrayList<Producto> filtrarProductoPorPrecio(double precio1, double precio2){
      ArrayList<Producto> productosPorPrecio = new ArrayList<>();
      for (Producto producto : productos) {
          if (producto.getPrecio() >= precio1 && producto.getPrecio() <= precio2) {
              productosPorPrecio.add(producto);
          }
      }
      return productosPorPrecio;
  }
  
  public void mostrarCategoriasDisponibles(){
      System.out.println("Categoria de los Productos");
      for (CategoriaProducto categoria : CategoriaProducto.values()) {
          System.out.println("- "+ categoria +": "+ categoria.getDescripcion());
          
      }
  }
}
    
           
            


  
  
  
   
  
   
   

