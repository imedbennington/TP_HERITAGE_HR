package heritage.hr.presentation;

import heritage.hr.enumeration.Contrat;
import heritage.hr.enumeration.Grade;
import heritage.hr.enumeration.Poste;
import heritage.hr.enumeration.TypeContrat;
import heritage.hr.metier.Administratif;
import heritage.hr.metier.Enseignat;
import heritage.hr.metier.Personne;
import heritage.hr.metier.Personnel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceHR {
    private List<Personne> personnelList = new ArrayList<>();

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

        Enseignat ens = new Enseignat(name, familyName, age, contrat, grade);
        personnelList.add(ens);
        ens.afficher();

        //
    }

    public void displayPersonnelList() {
        System.out.println("Personnel List:");
        for (Personne personnel : personnelList) {
            personnel.afficher();
        }
    }
}
