package heritage.hr.metier;

import heritage.hr.enumeration.Poste;

public class Administratif extends Personnel{
    //attributes
    private Poste poste;

    //constructors

    public Administratif() {
    }

    public Poste getPoste() {
        return poste;
    }

    public void setPoste(Poste poste) {
        this.poste = poste;
    }

    @Override
    void afficher() {
        super.afficher();
        System.out.println("Poste "+poste);
    }
}
