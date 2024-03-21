package heritage.hr.metier;

public abstract class Personnne {
    //attributes
    private String nom, prenom;
    private int age;
    //constructor

    public Personnne() {
    }

    public Personnne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    //getters and setters


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void afficher(){
        System.out.println("Nom "+nom+ " prenom"+ prenom+ " age"+age);
    }
}
