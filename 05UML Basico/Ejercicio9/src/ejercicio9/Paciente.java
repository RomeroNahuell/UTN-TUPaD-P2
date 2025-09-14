/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author user
 */
public class Paciente {
    private String nombre;
    private String obreSocial;

    public Paciente(String nombre, String obreSocial) {
        this.nombre = nombre;
        this.obreSocial = obreSocial;
    }
    
    public void nombreDelPaciente(){
        System.out.println("El nombre del Paciente es: "+nombre);
    }
}
