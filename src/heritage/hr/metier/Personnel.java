package heritage.hr.metier;

import heritage.hr.enumeration.Contrat;

public abstract class Personnel extends Personnne{
    //attributes

    private Contrat contrat;

    //constructor


    public Personnel() {
    }

    public Personnel(String nom, String prenom, int age, Contrat contrat) {
        super(nom, prenom, age);
        this.contrat = contrat;
    }

    //getters and setters

    public Contrat getContrat() {
        return contrat;
    }

    public void setContrat(Contrat contrat) {
        this.contrat = contrat;
    }

    @Override
    void afficher() {
        super.afficher();
        System.out.println("Contat "+contrat);
    }
}
