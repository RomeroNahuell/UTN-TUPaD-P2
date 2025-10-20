
package casopractico2;

import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 *
 * @author user
 */
public class CasoPractico2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       /* 
       //Ejercicio1///
            
            try{
            System.out.println("Ingrese un numero: ");
            int numero = Integer.parseInt(scan.nextLine());
            System.out.println("Ingrese otro numero: ");
            int numero2 = Integer.parseInt(scan.nextLine());
            int resultado = numero / numero2;
            System.out.println("Resultado : " + resultado);
            }
            catch(ArithmeticException excep){
                System.out.println("Error ..No se puede dividir por 0 "+ excep.getMessage());
            }*/
       
       
            
       //Ejercicio2///
       /*try{ 
        System.out.println("Ingresa un texto: ");
        String texto = scan.nextLine();
        
        int numero = Integer.parseInt(texto);
        System.out.println("EL numero convertido es" + numero);
       }catch(NumberFormatException e){
           System.out.println("Error no puede convertir un texto en un numero entero");
       }
        */
       
       
       
       
       
       //Ejercicio3///
       //Para este ejercicio me base en el video del finally, y informacion buscado por internet ya que desconocia el uso de los File.

    /*try {
        System.out.println("Ingrese el nombre del archivo (con extensión): ");
        String nombreArchivo = scan.nextLine();
    
        File archivo = new File(nombreArchivo); //Representa el archivo en el sistema
        FileReader fr = new FileReader(archivo); // Lee el archivo carácter por carácter
        BufferedReader br = new BufferedReader(fr); //Lee el archivo línea por línea (más eficiente)
    
        String linea;
        System.out.println("\n--- Contenido del archivo ---");
        while ((linea = br.readLine()) != null) { //readLine : Lee una línea. Retorna null cuando termina el archivo
            System.out.println(linea);
        }
    
        br.close(); //Cierra el archivo
    
    } catch (FileNotFoundException e) {
        System.out.println("Error: El archivo no existe");
    } catch (IOException e) {
        System.out.println("Error al leer el archivo");
    }*/
            
    
    //Ejercico 4/////
    
       /* try{
        System.out.println("Ingrese una edad: ");
        int edad = Integer.parseInt(scan.nextLine());
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad fuera del rango permitido");
        }else{
            System.out.println("Edad Ingresada: "+edad);
        }
        }catch(EdadInvalidaException e){
            System.out.println("Error... "+ e.getMessage());
        }*/
         
       
       
       
       //Ejercicio 5
      
System.out.println("Ingrese el nombre del archivo: ");
String nombreArchivo = scan.nextLine();

try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
    
    String linea;
    System.out.println("\n--- Contenido del archivo ---");
    while ((linea = br.readLine()) != null) {
        System.out.println(linea);
    }
    
} catch (FileNotFoundException e) {  //  Primero el más específico
    System.out.println("Error: El archivo no existe");
} catch (IOException e) {             // Después el más general
    System.out.println("Error al leer el archivo: " + e.getMessage());
}
    }
    
}
