package atelier2;
import java.util.Scanner;
public class Programme5 {
    public static void main(String[] args) {
        Scanner nombre = new Scanner(System.in);
        System.out.println("============ DIVISION ============");
        System.out.println("Entrez un nombre");
        int x = nombre.nextInt();
        System.out.println("Entrez un autre nombre");
        int y = nombre.nextInt();
        if (y == 0) {
            System.out.println("Le diviseur doit pas etre nul, entrer un nombre different de zero");
            y = nombre.nextInt();
        } 
            System.out.println("La somme de "+ x +" / "+ y +" = "+ (x/y));  
            nombre.close();
    }
}
