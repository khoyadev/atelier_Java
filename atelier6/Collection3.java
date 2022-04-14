package atelier6;
import java.util.*;
/**
 * Écrire un programme (fichier nommé Collection3.java) java 
 * qui permet de récupérer le livre N°3 et de Supprimer le cinquième livre.
 */

public class Collection3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <String> livresList = new ArrayList<String>();
        livresList.add("une si longue lettre");
        livresList.add("Wolof");
        livresList.add("go for");
        livresList.add("math");
        System.out.println("Entrer 3 nouveaux livres");
        System.out.println("=============");
        for (int i = 0; i < 3; i++) {
            System.out.println("Entrer le livre "+(i+1));
            livresList.add(scanner.nextLine());
        }

        for (String string : livresList) {
            System.out.print(string+" | ");
        }
        System.out.println();  
        String element = livresList.get(2);
        System.out.println("Le livre N°3 "+element); 
        livresList.remove(4);
        System.out.println("Apres la suppression du livre N°5 la liste est");
        for (String string : livresList) {
            System.out.print(string+" | ");
        } 
        System.out.println(); 
    }
}
