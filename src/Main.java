import heritage.hr.metier.Enseignat;
import heritage.hr.presentation.ServiceHR;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ServiceHR serviceHR = new ServiceHR();
        serviceHR.createPersonne();
        serviceHR.displayPersonnelList();
    }
}