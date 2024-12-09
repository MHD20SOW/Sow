package entity;




public class Etudiant extends Personne implements IPersonne {
    private String matricule;
    private double moyenne;

    public Etudiant() {}

    public Etudiant(String nom, int age, double moyenne) {
        super(nom, age); // Appel du constructeur de la classe parente
        this.moyenne = moyenne;
        this.matricule = generateMatricule(); // Générer matricule lors de la création de l'étudiant
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    @Override
    public void saisie() {

    }

    @Override
    public void affiche() {
    }
    public String generateMatricule() {

        return "MatriculeGénérée";
    }
}
