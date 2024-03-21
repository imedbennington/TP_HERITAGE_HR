package heritage.hr.metier;

import heritage.hr.enumeration.Contrat;
import heritage.hr.enumeration.Grade;

public class Enseignat extends Personnel{
    //attributes
    private Grade grade;

    //constructor

    public Enseignat() {
    }

    public Enseignat(String nom, String prenom, int age, Contrat contrat, Grade grade) {
        super(nom, prenom, age, contrat);
        this.grade = grade;
    }
    //getters and setters


    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println(" Grade"+grade);
    }
}
