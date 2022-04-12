package atelier2;
import java.util.Scanner;
public class Programme6 {
    public static void main(String[] args) {
        Scanner nombre = new Scanner(System.in);
        System.out.println("============ MOYENNE ============");
        System.out.println("Entrez 5 nombres");
           int i = 0; 
           int somme = 0;   
        while (i < 5) {
            System.out.println("Entrez le "+ (i+1) +" nombre");
            int x = nombre.nextInt();
            if (x <= 0) {
                i = i-1;
                System.out.println("le nombre doit etre positif");
            }
            somme += x; 
            i++;
        }
        System.out.println("La moyenne est "+(somme/5));
        nombre.close();
    }
}
