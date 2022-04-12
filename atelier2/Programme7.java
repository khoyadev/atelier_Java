package atelier2;
import java.util.Scanner;
public class Programme7 {
    public static void main(String[] args) {
        Scanner nombre = new Scanner(System.in);
        System.out.println("============ POSITIF, NEGATIFS OU NULS ============");
        System.out.println("Entrez un nombres");
        int x = nombre.nextInt();
        if (x == 0) {
            System.out.println("le nombre est nul");
        }else if (x > 0) {
            System.out.println("le nombre est positif");
        }else{
            System.out.println("le nombre est negatif");
        }
        nombre.close();
    }
}
