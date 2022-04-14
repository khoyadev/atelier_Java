package atelier6;
import java.util.*;
/**
 * Écrire un programme (fichier nommé Collection2.java) 
 * java qui permet à l’utilisateur d’ajouter  03 nouveaux livres dans la collection de la tâche N°1.
 */

public class Collection2 {
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
        livresList.remove(5);
        System.out.println(element); 
        for (String string : livresList) {
            System.out.print(string+" | ");
        } 
        System.out.println(); 
    }
}
