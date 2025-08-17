package TrabajoPractico2;

import java.util.Scanner;

/**
 *
 * @author zk
 */
public class Ejercicio7 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;
        
        do{
            System.out.print("Ingrese una nota entre el 0 y 10: ");
            nota = scan.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Error.nota invalida.");
                
            }
        }while(nota < 0 || nota >10);
        System.out.println("Nota guardada correctamente.");   
    }
    
}

