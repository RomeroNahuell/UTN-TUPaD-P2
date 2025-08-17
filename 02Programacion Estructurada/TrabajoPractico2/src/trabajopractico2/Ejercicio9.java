package TrabajoPractico2;

import java.util.Scanner;

/**
 *
 * @author zk
 */
public class Ejercicio9 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
         System.out.println("Ingrese el precio del producto: ");
        int precio = Integer.parseInt(scan.nextLine());
        
        System.out.println("Ingrese el peso del paquete en kg: ");
        double peso = Double.parseDouble(scan.nextLine());
        
        System.out.println("Ingrese la zona de envio nacional o internacional: ");
        String zonaEnvio = scan.nextLine();
        
        double CostoEnvio = calcularCostoEnvio(peso, zonaEnvio);
        
        System.out.println("El costo de envio es: " + calcularCostoEnvio(peso, zonaEnvio));
        System.out.println("el total a pagar es: "+ calcularTotalCompra(precio, CostoEnvio));
        
       
        
        
                  
        
    }
    
    static double calcularCostoEnvio(double peso, String zona){
        double precioKg = 0;
        
        if(zona.equals("Nacional")){
            precioKg = 5.0;
        }else if(zona.equals("Internacional")){
            precioKg = 10.0;
        }
      return precioKg * peso;
    }
    
    static double calcularTotalCompra(double precioProducto, double costoEnvio){
        return precioProducto + costoEnvio;
    }    
            
    }
       
      
