/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author user
 */
public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular;

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    //Asociacion Bidireccional con condiciones para evitar bucles infinitos
    public void setCelular(Celular celular) {
        this.celular = celular;
        if (celular != null && celular.getUsuario() != this) {
            celular.setUsuario(this);
        }
    }

    public Celular getCelular() {
        return celular;
    }
    
    // metodo para obtener el nombre del usuario del celular
    public void obtenerNombre(){
        System.out.println("El celular "+ celular.getModelo()+ "Pertenece al usuario: "+nombre);
    }

    public String getDni() {
        return dni;
    }
    
    
    
    
    
    
}


