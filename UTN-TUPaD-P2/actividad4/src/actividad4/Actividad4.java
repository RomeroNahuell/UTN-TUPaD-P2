
package actividad4;

import java.util.Scanner;

/**
 *
 * @author zk
 */
public class Actividad4 {

   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        
        System.out.print("Ingrese su nombre: ");
        nombre = input.nextLine();
        
        System.out.print("Ingrese su edad: ");
        edad = input.nextInt();
        
        

        
        System.out.print("Mi nombre es " + nombre + ", tengo " + edad + " anios.");
        
        
    }
    
}
