package heritage.hr.metier;

import heritage.hr.enumeration.Contrat;
import heritage.hr.enumeration.Poste;

public class Administratif extends Personnel{
    //attributes
    private Poste poste;

    //constructors

    public Administratif() {
    }

    public Administratif(String name, String familyName, Contrat contrat, Poste poste) {
        super();
        this.poste=poste;
    }

    public Poste getPoste() {
        return poste;
    }

    public void setPoste(Poste poste) {
        this.poste = poste;
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Poste "+poste);
    }
}
