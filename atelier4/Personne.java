package atelier4;
import java.util.Scanner;
public class Personne {
    String matricule;
    String nom;
    String prenom;
    String adresse;
    String date;
    String lieu;
    String numero;
    public Personne(String matricule, String nom, String prenom, String adresse, String date, String lieu, String numero){
        this.matricule = matricule;
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.date = date;
        this.lieu = lieu;
        this.numero = numero;
    }
    public void PersonneAfficher(){
        
        System.out.println("Matricule : "+matricule);
        System.out.println("Nom Prenom : "+nom +prenom);
        System.out.println("Adresse : "+adresse);
        System.out.println("Date de naissance : "+date);
        System.out.println("Lieu de naissance : "+lieu);
        System.out.println("Numero de Telephone : "+numero);
    }

    public static void main(String[] args) {
        Scanner perso = new Scanner(System.in);
        System.out.println("Votre Matricule :");
        String mat = perso.nextLine();
        System.out.println("Votre Nom :");
        String nom = perso.nextLine();
        System.out.println("Votre Prenom :");
        String prenom = perso.nextLine();
        System.out.println("Votre Adresse :");
        String adresse = perso.nextLine();
        System.out.println("Votre Date de naissance :");
        String date = perso.nextLine();
        System.out.println("Votre Lieu de naissance :");
        String lieu = perso.nextLine();
        System.out.println("Votre Numero de telephone :");
        String numero  = perso.nextLine();
       Personne personne = new Personne(mat, nom, prenom, adresse, date, lieu, numero);
       personne.PersonneAfficher();
        perso.close();
        
    }
    
}
