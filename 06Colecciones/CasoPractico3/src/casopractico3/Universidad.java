/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casopractico3;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class Universidad {
    private String nombre;
    private ArrayList<Profesor> profesores = new ArrayList<>();
    private ArrayList<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre) {
        this.nombre = nombre;
    }
    
    
    public void agregarProfesor(Profesor p){
        if (p != null) {
            profesores.add(p);
        }
    }
    
    public void agregarCurso(Curso c){
        if (c != null) {
            cursos.add(c);
        }
    }
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor){
        Curso cursoAsignado = null;
        Profesor profesorAniadir = null;
        
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigoCurso)) {
                cursoAsignado = curso;
            }
        }
        
        for (Profesor profesor : profesores) {
            if (profesor.getId().equals(idProfesor)) {
                profesorAniadir = profesor;
            }
        }
        
        
        if (cursoAsignado != null && profesorAniadir != null) {
            cursoAsignado.setProfesor(profesorAniadir);
        }else{
            System.out.println("No se encontro el profesor o curso.");
        }
            
    }
    
    
    public void listarProfesor(){
        for (Profesor profesor : profesores) {
            System.out.println("Profesor "+profesor.getNombre()+ " id: "+profesor.getId());
            profesor.listarCursos();
            System.out.println("");
        }
        
    }
    
    public void listarCursos(){
        System.out.println("Lista de cursos");
        for (Curso curso : cursos) {
            System.out.println("Codigo: "+curso.getCodigo()+"\nNombre: "+curso.getNombre());
            if (curso.getProfesor() != null) {
                System.out.println("Profesor: "+curso.getProfesor().getNombre());
                System.out.println("");
            }else{
                System.out.println("Profesor no Asignado");
                System.out.println("");
            }
            
        }
    }
    
    
    public Profesor buscarProfesorPorId(String id){
        for (Profesor profesor : profesores) {
            if (profesor.getId().equals(id)) {
                return profesor;
            }
        }
       return null;
    }
    
    
    public Curso buscarCursoPorCodigo(String codigo){
        for (Curso curso : cursos) {
            if (curso.getCodigo().equals(codigo)) {
                return curso;
            }
        }
        return null;
    }
    
    
    public void eliminarCurso(String codigo){
        Curso cursoAEliminar = buscarCursoPorCodigo(codigo);
        if (cursoAEliminar != null) {
            if (cursoAEliminar.getProfesor() != null) {
                cursoAEliminar.getProfesor().eliminarCurso(cursoAEliminar);//usamos el metodo de la clase profesor y rompemos la relacion
            }
            cursos.remove(cursoAEliminar);//eliminamos el curso de la lista que tiene la universidad
        }
    }
    
    public void eliminarProfesor(String id){
        Profesor profesorAEliminar = buscarProfesorPorId(id);
        if (profesorAEliminar != null) {
            for (Curso c : new ArrayList<>(profesorAEliminar.getCursos())) { //usamos un array debido a que usamos Collections.unmodifiableList(cursos), que devuelve una lista solo de lectura , asi que creamos una copia de la lista.
                c.setProfesor(null);
            }
            profesores.remove(profesorAEliminar);
        }
    }
    
    
}
