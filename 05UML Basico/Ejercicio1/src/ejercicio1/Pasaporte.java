/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author user
 */
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto; //relacion 1A1(composicion)
    private Titular titular; // relacion 1A1(Asociacion Bidireccional)

    public Pasaporte(String numero, String fechaEmision,String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        //// COMPOSICIÓN: Creamos la foto como parte integral del pasaporte
        // La foto no puede existir sin el pasaporte
        this.foto = new Foto(imagen,formato); //Composicion 
    }

    public void setTitular(Titular titular) {
        // //Asignar el titular a este pasaporte
        this.titular = titular;
        // Solo llamamos setPasaporte si el titular no tiene ya este pasaporte
        // Esto evita recursión infinita: setTitular() -> setPasaporte() -> setTitular()...
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }

    public Titular getTitular() {
        return titular;
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    
    
    
    
  
}
    
    
    
    
    
    
    
    
    
    
           

