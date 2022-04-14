package atelier5;
import java.util.Scanner;
public class tableau1 {
    public static void main(String[] args) {
        Scanner entier = new Scanner(System.in);
        int n ;
        do {
            System.out.println("Entrer le nombre d'entiers positif a saisir");
             n = entier.nextInt();
        } while (n<0);

        int [] tableau = new int[n];
        for (int i = 0; i < tableau.length; i++) {
            System.out.println("Entrer la valeur "+(i+1));
            tableau[i] = entier.nextInt();
        }
        System.out.println("==============");
        for (int i : tableau) {
            System.out.print(i+" ");
        }
        System.out.println();
        entier.close();
    }
    
}
