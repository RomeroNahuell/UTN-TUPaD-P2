package Trabajopractico2;

import java.util.Scanner;

/**
 *
 * @author zk
 */
public class Ejercicio5 {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero (0 para terminar) ");
        int num = scan.nextInt();
        int suma = 0;
        
        
        while (num != 0) {  
            if(num % 2 == 0){
               suma += num;
               
            }
         System.out.println("Ingrese un numero (0 para terminar)");
         num = scan.nextInt();
         
        }
        System.out.println("La suma de los numeros pares es: "+suma);
    }
    
}
