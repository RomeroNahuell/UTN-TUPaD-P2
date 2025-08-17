package TrabajoPractico2;

import java.util.Scanner;



/**
 *
 * @author zk
 */
public class Ejercicio1 {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int anio;
        
        System.out.print("Ingrese un año: ");
        anio = Integer.parseInt(scan.nextLine());
        
        System.out.println("el anio " + anio + " " + bisiesto(anio));
        
        
        
                
    }
    //metodo para calcular el año bisiesto;
    static String bisiesto(int anio){
        if ((anio % 4 == 0 && anio % 100 !=0)|| (anio % 400 == 0)){
            return "Es bisiesto";
        } else {
            return "No es bisiesto";
        }
        
    }
    
        
           
    

}
    
    