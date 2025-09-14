/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

/**
 *
 * @author user
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Impuesto impuesto= new Impuesto(200);
        Contribuyente contribuyente=  new Contribuyente("Nahuel","202828281");
        Calculadora calculadora= new Calculadora();
        
        impuesto.setContribuyente(contribuyente);//Asociacion unidireccional
        impuesto.obtenerInformacionDelContribuyente();
        calculadora.calcular(impuesto);//Dependencia de uso
    }
    
}
