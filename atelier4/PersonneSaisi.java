package atelier4;
import java.util.Scanner;
public class PersonneSaisi {
    String matricule;
    String nom;
    String prenom;
    String adresse;
    String date;
    String lieu;
    String numero;
    public PersonneSaisi(String matricule, String nom, String prenom, String adresse, String date, String lieu, String numero){
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
        System.out.println("Combien de personne voulez-vous saisi");
        int x = perso.nextInt();

        PersonneSaisi[] personnes = new PersonneSaisi[x];
        perso.nextLine();
        for (int i = 0; i < x; i++) {
        System.out.println("Veillez saisi la personne "+(i+1));
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
        System.out.println("===================================================================");
        PersonneSaisi personne = new PersonneSaisi(mat, nom, prenom, adresse, date, lieu, numero);
            personnes[i]= personne;
        }
        for (int i = 0; i < personnes.length; i++) {
            personnes[i].PersonneAfficher();
        }
        //personne
        perso.close();
        
    }
    
}
