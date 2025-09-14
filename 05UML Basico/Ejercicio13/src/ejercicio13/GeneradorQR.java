/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author user
 */
public class GeneradorQR {
    
    
    public void generar(String valor , Usuario usuario){//dependencia de uso con la clase Usuario
        CodigoQR codigoQR= new CodigoQR(valor);//dependencia de creacion
        
        codigoQR.setUsuario(usuario);//Asociacion unidireccional dentro del metodo generar donde creamos el codigoQR
        
        System.out.println("=== QR GENERADO ===");
        System.out.println("Código QR creado: " + codigoQR);
        System.out.println("===================");
        
        
        System.out.println("El QR pertenece a: " + codigoQR.obtenerNombreDelUsuario());
        
    }
}