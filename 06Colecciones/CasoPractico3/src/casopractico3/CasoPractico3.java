
package casopractico3;

/**
 *
 * @author user
 */
public class CasoPractico3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Universidad universidad = new Universidad("UTN");
        
        Profesor profesor1 = new Profesor("abc123","Nahuel","Matematica");
        Profesor profesor2 = new Profesor("abc234","Leo","Fisica");
        Profesor profesor3 = new Profesor("abc312","Lucas","Geometria");
        
        Curso curso1 = new Curso("xx12","Curso de Matematica");
        Curso curso2 = new Curso("das762","Curso de Fisica");
        Curso curso3 = new Curso("dmsms8","Curso de Geometria");
        Curso curso4 = new Curso("axz12","Curso de Ciencias Tecnologicas");
        Curso curso5 = new Curso("smam82","Curso de Historia");
        
        universidad.agregarProfesor(profesor1);
        universidad.agregarProfesor(profesor2);
        universidad.agregarProfesor(profesor3);
        universidad.agregarCurso(curso1);
        universidad.agregarCurso(curso2);
        universidad.agregarCurso(curso3);
        universidad.agregarCurso(curso4);
        universidad.agregarCurso(curso5);
        //PRUEBA DE METODOS
        
        universidad.asignarProfesorACurso("xx12", "abc123");
        
        //Metodos para listar los cursos y profesores//
        
        //universidad.listarProfesor();
        //universidad.listarCursos();
        
        //Metodos de busqueda//
        
        /*Profesor encontradoProfesor = universidad.buscarProfesorPorId("abc123");
        if (encontradoProfesor != null) {
            encontradoProfesor.mostrarInfo();
        }else{
            System.out.println("Profesor no encontradp.");
        }*/
        
        
        /*Curso encontradoCurso = universidad.buscarCursoPorCodigo("das762");
        if (encontradoCurso != null) {
            encontradoCurso.mostrarInfo();
        }else{
            System.out.println("Curso no encontrado");
        }*/
        
        //Metodos Eliminar//
        
       // universidad.eliminarCurso("xx12");
       // universidad.listarCursos(); // se borro el curso de la lista
       // universidad.listarProfesor();// verificamos que el profesor Nahuel ya no tiene asignado el curso borrado
       
       //universidad.listarCursos();//verificamos que el curso tengo un profesor asignado , en este ejemplo nahuel al curso matematica
       //universidad.listarProfesor();// listamos los profesores para luego ver si se elimino correctamente
       //universidad.eliminarProfesor("abc123");
       //universidad.listarCursos();//el profesor ya no existe por lo tanto no esta asignado al curso
       //universidad.listarProfesor();//profesor eliminado correctamente.
        
        
    }
    
}
