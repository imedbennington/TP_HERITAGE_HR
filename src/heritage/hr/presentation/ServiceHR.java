package heritage.hr.presentation;

import heritage.hr.enumeration.Contrat;
import heritage.hr.enumeration.Grade;
import heritage.hr.enumeration.Poste;
import heritage.hr.enumeration.TypeContrat;
import heritage.hr.metier.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ServiceHR {
    public List<Personne> personnelList = new ArrayList<>();
    Enseignat enseignat = new Enseignat();
    public static int nbr = 0;
    private Poste poste;

    public ServiceHR() {
    }

    public void createPersonne() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = scanner.nextLine();
        System.out.println("Enter the family name");
        String familyName = scanner.nextLine();
        System.out.println("enter the age ");
        int age = scanner.nextInt();
        Contrat contrat = null;
        while (contrat == null) {
            System.out.println("Enter the contract (CDI, CDD, INTERIM):");
            String contratInput = scanner.nextLine().toUpperCase(); // Convert to uppercase for case-insensitive comparison
            try {
                contrat = Contrat.valueOf(contratInput);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid contract. Please enter a valid contract.");
            }
        }
        //

        Grade grade = null;
        while (grade == null) {
            System.out.println("Enter the grade (MAA, MAB, MCA, MCB, PR):");
            String gradetInput = scanner.nextLine().toUpperCase(); // Convert to uppercase for case-insensitive comparison
            try {
                grade = Grade.valueOf(gradetInput);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid contract. Please enter a valid contract.");
            }
        }
        //
        Poste poste = null;
        while (poste == null){
            System.out.println(" poste ?");
            String posteInput = scanner.nextLine().toUpperCase();
            try{
                poste = Poste.valueOf(posteInput);
            }catch (IllegalArgumentException e){
                System.out.println("Invalid contract. Please enter a valid contract.");
            }
        }

        TypeContrat typeContrat =null;
        while (typeContrat == null){
            System.out.println(" type de contract :");
            String inputType = scanner.nextLine().toUpperCase();
            try{
                typeContrat = TypeContrat.valueOf(inputType);
            }catch (IllegalArgumentException e){
                System.out.println("Invalid contract. Please enter a valid contract.");
            }
        }
        Enseignat ens = new Enseignat(name, familyName, age, contrat, grade);
        Administratif administratif = new Administratif(name,familyName, contrat, poste);
        ContratExt contratExt = new ContratExt(name, familyName, age, typeContrat);
        personnelList.add(ens);
        personnelList.add(administratif);
        ens.afficher();
        administratif.afficher();
        //
    }

    //type de personne
    public void typePersonne(Personne p) {
        System.out.println("Person: " + p.getNom());
        if (p instanceof Enseignat) {
            System.out.println("Type: Enseignant");
        } else if (p instanceof Administratif) {
            System.out.println("Type: Administratif");
        } else {
            System.out.println("Type: Unknown");
        }
        System.out.println();
    }

    //type de personne by name

    public void typePersonneNom(String nom) {
        boolean found = false;
        for (Personne personne : personnelList) {
            if (personne.getNom().equals(nom)) {
                found = true;
                System.out.println("Person: " + personne.getNom());
                if (personne instanceof Enseignat) {
                    System.out.println("Type: Enseignant");
                } else if (personne instanceof Administratif) {
                    System.out.println("Type: Administratif");
                } else {
                    System.out.println("Type: Unknown");
                }
                System.out.println();
            }
        }
        if (!found) {
            System.out.println("Person with name " + nom + " not found.");
        }

    }

    public void deletePersonne(String nom) {
        boolean found = false;
        Iterator<Personne> iterator = personnelList.iterator();
        while (iterator.hasNext()) {
            Personne personne = iterator.next();
            if (personne.getNom().equals(nom)) {
                iterator.remove();
                found = true;
                System.out.println("Person with name " + nom + " deleted successfully.");
                break;
            }
        }
        if (!found) {
            System.out.println("Person with name " + nom + " not found.");
        }
    }

    public void displayPersonnelList() {
        System.out.println("Personnel List:");
        for (Personne personnel : personnelList) {
            personnel.afficher();
        }
    }
}
