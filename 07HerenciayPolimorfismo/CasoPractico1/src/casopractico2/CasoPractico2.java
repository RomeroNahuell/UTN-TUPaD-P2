
package casopractico2;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class CasoPractico2 {

    public static void main(String[] args){
        ArrayList<Figura> figuras = new ArrayList<>();
        
        figuras.add(new Circulo(2,"circulo1"));
        figuras.add(new Rectangulo(2,4,"Rectanculo1"));
        figuras.add(new Circulo(5,"circulo2"));
        figuras.add(new Rectangulo(7,3,"Rectangulo2"));
        
        for (Figura figura : figuras) {
            System.out.println("Area: "+figura.calcularArea());
            
        }
        
    }
    
   
}
