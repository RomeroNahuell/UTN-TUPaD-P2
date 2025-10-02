/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casopractico3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author user
 */
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private ArrayList<Curso> cursos = new ArrayList<>();

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }
    
    public void agregarCurso(Curso c){
        // 1. ¿El curso existe y no lo tengo ya?
        if (c != null && !cursos.contains(c)){
            // 2. Lo agrego a mi lista
            cursos.add(c); // Ahora el curso está en mi lista
            
             //SINCRONIZACIÓN: El curso me debe tener como profesor
            if (c.getProfesor()!= this) {
                c.setProfesor(this);// "curso, tu profesor soy yo"
            }
        }
    }
    
    public void eliminarCurso(Curso c){
        if (c != null && cursos.contains(c)){
            cursos.remove(c);
            if (c.getProfesor()== this) {
                c.setProfesor(null);
            }
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }
    
    
    
    
    
    public List<Curso> getCursos(){
        return Collections.unmodifiableList(cursos);
    }
    
    
    public void listarCursos(){
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos disponibles");
            return;
        }
         
        System.out.println("Cursos Disponibles");
        for (Curso curso : cursos) {
            System.out.println("Codigo: "+curso.getCodigo()+ "\nNombre: "+curso.getNombre());
            
        }
    }
    
    public void mostrarInfo(){
        System.out.println("Informacion Del Profesor");
       
        System.out.println("ID: "+id+ "\nnombre: "+nombre+ "\nespecialidad: "+especialidad+ "\nCursos que dicta: ");
        for (Curso curso : cursos) {
            if (curso.getProfesor() == this) {
                System.out.println("-"+curso.getNombre());
            }
        }
        
    }
    
    
    
}
