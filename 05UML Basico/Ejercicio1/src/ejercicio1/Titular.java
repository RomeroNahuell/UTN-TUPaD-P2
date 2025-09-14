/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author user
 */
public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; //Asociacion 1A1 Bidireccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        //  Asignar el pasaporte a este titular
        this.pasaporte = pasaporte;
        // Solo llamamos setTitular si el pasaporte no tiene ya este titular
        // Esto evita recursión infinita: setPasaporte() -> setTitular() -> setPasaporte()..
        if (pasaporte != null && pasaporte.getTitular() != this ) {
            pasaporte.setTitular(this);
        }
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

   
    
    
}
