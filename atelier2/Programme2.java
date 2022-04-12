package atelier2;
import java.util.Scanner;
public class Programme2 {
    public static void main(String[] args) {
        Scanner nombre = new Scanner(System.in);
        System.out.println("Entrez un nombre");
        int x = nombre.nextInt();
        System.out.println("Entrez un autre nombre");
        int y = nombre.nextInt();
        System.out.println("La somme de "+ x +" * "+ y +" = "+ (x*y));
        nombre.close();
    }
}
