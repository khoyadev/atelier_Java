package atelier6;
import java.util.*;

/**
 * Ecrire un programme (fichier nommé Collection1.java) 
 * java qui crée un ArrayList des livres Africains et Affichez la collection 
 */
public class Collection1 {
    public static void main(String[] args) {
        List <String> livresList = new ArrayList<String>();
        livresList.add("une si longue lettre");
        livresList.add("Wolof");
        livresList.add("go for");
        livresList.add("math");
        for (String string : livresList) {
            System.out.print(string+" ");
        } 
        System.out.println();   
    }
}
