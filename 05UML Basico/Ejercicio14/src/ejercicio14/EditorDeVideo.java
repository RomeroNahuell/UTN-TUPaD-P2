/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio14;

/**
 *
 * @author user
 */
public class EditorDeVideo {
    
    
    
    public void exportar(String formato, Proyecto proyecto){
        
        Render render= new Render(formato);
        render.setProyecto(proyecto);
        
        
        System.out.println("El video en formato "+render.getFormato()+
                "\n con una duracion de "+proyecto.getDuracionMin()+" minutos.."
                + "\n*******esta siendo exportado*******\n"
                        + "Proyecto "+proyecto.getNombre()+" ha sido correctamente Exportado.");
    }
}
