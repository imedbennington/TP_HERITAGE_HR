import heritage.hr.metier.Enseignat;
import heritage.hr.metier.Personne;
import heritage.hr.metier.Personnel;
import heritage.hr.presentation.ServiceHR;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Enseignat enseignat = new Enseignat();
        ServiceHR serviceHR = new ServiceHR();
        //serviceHR.createPersonne();
        for (int i = 0; i < 2; i++) {
            System.out.println("Creating person " + (i + 1));
            serviceHR.createPersonne();
            System.out.println();
        }
        serviceHR.displayPersonnelList();
        if (!serviceHR.personnelList.isEmpty()) {
            serviceHR.typePersonne(serviceHR.personnelList.get(0));
        } else {
            System.out.println("Personnel list is empty.");
        }


        serviceHR.typePersonneNom("imed");
        serviceHR.deletePersonne("imed");
        serviceHR.displayPersonnelList();
    }
    //

}