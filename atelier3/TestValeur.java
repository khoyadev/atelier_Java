package atelier3;
import java.util.Scanner;
public class TestValeur {
    public static void main(String[] args) {
        Scanner nombre = new Scanner(System.in);
        System.out.println("Entrez un nombre");
        int x = nombre.nextInt();
        System.out.println("Entrez un autre nombre");
        int y = nombre.nextInt();
        int c = x+y;
        System.out.println("La somme est "+ c);
        if (x>y) {
            System.out.println(x+" est plus grand que "+ y);
        }
        if (x<y) {
            System.out.println(y+" est plus grand que "+ x);
        }
        nombre.close();
    }
}
