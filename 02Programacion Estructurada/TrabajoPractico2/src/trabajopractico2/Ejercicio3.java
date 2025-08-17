package TrabajoPractico2;

import java.util.Scanner;

/**
 *
 * @author zk
 */
public class Ejercicio3 {

   
    public static void main(String[] args) {
        //Escribe un programa en Java que solicite al usuario su edad y clasifique su etapa de vida según la siguiente tabla:
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = scan.nextInt();
        
        System.out.println(ClasificacionEdad(edad));
      
        
    }
    
    static String ClasificacionEdad(int edad){
        if (edad < 0) {
            return "Edad no valida";
            
        }
        else if (edad < 12) {
            return "Niño";
            
        } else if (edad <= 17){
            return "Adolescente";
        } else if (edad <= 59){
            return "Adulto";
        } else {
            return "Adulto mayor";
        }
       
    } 
    
    
    
}
