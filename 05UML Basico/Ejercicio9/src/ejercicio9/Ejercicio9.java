/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author user
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CitaMedica citaMedica= new CitaMedica("28/02/2025", "10:00 AM");
        Paciente paciente= new Paciente("Nahuel", "SancorSalud");
        Profesional medico= new Profesional("Mateo","pediatra");
        
        citaMedica.setPaciente(paciente);
        citaMedica.setProfesional(medico);
        
        citaMedica.obtenerEspecialidadDelMecido();
        citaMedica.obtenerNombreDelPaciente();
    }
    
}
