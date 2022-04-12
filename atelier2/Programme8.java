package atelier2;
import java.util.Scanner;
public class Programme8 {
    public static void main(String[] args) {
        Scanner nombre = new Scanner(System.in);
        System.out.println("Entrez un nombre");
        int n = nombre.nextInt();
        System.out.println("Les nombres comprennent entre 1 et " + n + " sont");
        for (int i = 1; i < (n+1); i++) {
            System.out.print(i +" ");
           
        }
        System.out.println();
        nombre.close();
    }
}
