/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casopractico3;

/**
 *
 * @author user
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public void setProfesor(Profesor profesor) {
        // ¿Ya tengo este profesor? → No hacer nada
        if (this.profesor == profesor) {
            return;
        }
        // ¿Tenía otro profesor antes? → Quitarme de su lista
        if (this.profesor != null) {
            this.profesor.eliminarCurso(this); // "Profe anterior, ya no soy tu curso"
        }
        
        //  Asigno el nuevo profesor
        this.profesor = profesor;
        
        //️ SINCRONIZACIÓN: Me agrego a la lista del profesor
        if (profesor != null && !profesor.getCursos().contains(this)) {  //verificamos que el profesor no tenga ese curso ya aignado
            profesor.agregarCurso(this); // " agregame a tu lista de cursos"
        }
        
        
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    public void mostrarInfo(){
        System.out.println("Informacion Del curso");
       
        System.out.println("Codigo: "+codigo+ "\nnombre: "+nombre);
        
        if (profesor != null) {
            System.out.println("Profesor Designado: "+profesor.getNombre());
        }else{
            System.out.println("No hay profesor Asignado.");
        }
    }
    
    
    
    
    
}
