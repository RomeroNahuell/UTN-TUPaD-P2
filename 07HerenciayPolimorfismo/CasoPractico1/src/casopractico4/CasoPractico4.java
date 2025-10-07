
package casopractico4;

import java.util.ArrayList;

/**
 *
 * @author zk
 */
public class CasoPractico4 {
    public static void main(String[] args){
        ArrayList<Animal> animales = new ArrayList<>();
        
        animales.add(new Perro("choco","calle/vereda","negro"));
        animales.add(new Gato("misi","esfinge","blanco"));
        animales.add(new Vaca(8,"Mu","Lechera","blanca/negra"));
        
        for (Animal animal : animales) {
                animal.hacerSonido();
            }
        }
                
        
    }

