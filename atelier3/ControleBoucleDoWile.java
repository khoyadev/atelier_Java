package atelier3;
import java.util.Scanner;
public class ControleBoucleDoWile {
    public static void main(String[] args) {
        Scanner nombre = new Scanner(System.in);
        int x;
        do {
            System.out.println("Entrez un nombre");
            x = nombre.nextInt();
           
        } while (x<0);
        nombre.close();
    }
    
}
