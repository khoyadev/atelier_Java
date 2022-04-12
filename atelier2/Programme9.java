package atelier2;
import java.util.Scanner;
public class Programme9 {
    public static void main(String[] args) {
        Scanner nombre = new Scanner(System.in);
        System.out.println("Entrez une chaine de caractere");
        String n = nombre.nextLine();

        System.out.println("Entrez un entier");
        int x = nombre.nextInt();

        System.out.println("Entrez un reel");
        float y = nombre.nextFloat();

        System.out.println("l'entier saisi est "+ x +" le reel saisi est "+ y +" la chaine de caractere saisi est "+n);
        nombre.close();
    }
}
