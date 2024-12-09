package entity;


public class Employe extends Personne implements IPersonne {
    private String fonction;
    private int salaire;


    public Employe() {}

    public Employe(String fonction, int salaire) {
        this.fonction = fonction;
        this.salaire = salaire;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    @Override
    public void saisie() {

    }

    @Override
    public void affiche() {

    }
}
