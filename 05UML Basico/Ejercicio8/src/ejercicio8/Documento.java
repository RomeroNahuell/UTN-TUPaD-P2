/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio8;

/**
 *
 * @author user
 */
public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital;
    private Usuario usuario;

    public Documento(String titulo, String contenido, String codigoHash, String fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(codigoHash, fecha);
        this.usuario = usuario;
    }
    
    
    public void obtenerFechaDeLaFirma(){
        this.firmaDigital.obtenerFecha();
    }
    
    public void nombreDelUsuario(){
        System.out.println("El nombre del usuario es: "+usuario.getNombre());
    }
}
