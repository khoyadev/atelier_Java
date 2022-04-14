package atelier4;
import java.util.Scanner;
import java.util.ArrayList;
public class PersonneCondition {
    String matricule;
    String nom;
    String prenom;
    String adresse;
    String date;
    String lieu;
    String numero;
    public PersonneCondition(String matricule, String nom, String prenom, String adresse, String date, String lieu, String numero){
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
    //static PersonneCondition[] personnes;
    public static void main(String[] args) {
        Scanner perso = new Scanner(System.in);
            int reponse;
            
            ArrayList<PersonneCondition> personnes = new ArrayList<PersonneCondition>();
            
        do {
            System.out.println("Votre Matricule :");
            perso.nextLine();
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
            System.out.println("===================================================================");
            PersonneCondition personne = new PersonneCondition(mat, nom, prenom, adresse, date, lieu, numero);
            personnes.add(personne);
            
            System.out.println("voulez-vous encore Saisir un autre Personne Tapez:0(quitter) 1(ajouter)");
            reponse = perso.nextInt();
            
        } while (reponse == 1);
        System.out.println("vous avez enregistrer");
        for (PersonneCondition i : personnes) {
            i.PersonneAfficher();
            System.out.println("===================================================================");
          }
        perso.close();
        
    }
    
}
