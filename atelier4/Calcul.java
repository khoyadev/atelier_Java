package atelier4;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Calcul {
    public static void main(String[] args) {
		while (true) {
			try {
                Scanner nombre = new Scanner(System.in);
                int x;
                System.out.println("Entrez un nombre");
                x = nombre.nextInt();
                System.out.println("Entrez un autre nombre");
                int y = nombre.nextInt();
                somme(x, y);
                difference(x, y);
                if (y>0) {
                    division(x, y);
                }else{
                    System.out.println("La division : le diviseur ne doit pas etre nul ni negatif");
                }
                
                produit(x, y);
				break;
		
			} catch (InputMismatchException e) {
				System.out.println("Erreur de saisi");
			} 
            
		}
    }
    public static void somme(int a, int b){
        System.out.println("La somme est "+(a+b));
    }
    public static void difference(int a, int b){
        System.out.println("La difference est "+(a-b));
    }
    public static void division(int a, int b){
        System.out.println("Le quotient est "+(a/b));
    }
    public static void produit(int a, int b){
        System.out.println("Le produit est "+(a*b));
    }
}
