package heritage.hr.metier;

import heritage.hr.enumeration.TypeContrat;

public class ContratExt extends Personne {

    //attributes

    private TypeContrat type;

    //constructor

    public ContratExt() {
    }

    public ContratExt(TypeContrat type) {
        this.type = type;
    }

    public ContratExt(String nom, String prenom, int age, TypeContrat type) {
        super(nom, prenom, age);
        this.type = type;
    }
}
