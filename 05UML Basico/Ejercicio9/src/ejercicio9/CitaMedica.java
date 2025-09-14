/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author user
 */
public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;
    private Profesional profesional;

    public CitaMedica(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public void setPaciente(Paciente paciente) {
        if (paciente != null) {
            this.paciente = paciente;
        }
    }

    public void setProfesional(Profesional profesional) {
        if (profesional != null) {
            this.profesional = profesional;
        }
    }
    
    public void obtenerNombreDelPaciente(){
        this.paciente.nombreDelPaciente();
    }
    
    public void obtenerEspecialidadDelMecido(){
        this.profesional.especialidadDelMedico();
    }
}
