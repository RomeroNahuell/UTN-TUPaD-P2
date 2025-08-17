package TrabajoPractico2;

import java.util.Scanner;

/**
 *
 * @author zk
 */
public class Ejercicio6 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        
        int negativos = 0;
        int positivos = 0;
        int ceros = 0;
        
             
        int num;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero: ");
            num = scan.nextInt();
            if (num < 0){
                negativos ++;
                
            }else if(num > 0){
                positivos ++;
            } else {
                ceros ++;
            }
            
            
        }
        System.out.println("Resultados: ");
        System.out.println("Positivos :"+ positivos);
        System.out.println("Negativos: "+negativos);
        System.out.println("Ceros: "+ceros);
    }
    
}
