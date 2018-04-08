package projetjavaex1;

/**
 * 
 */
public class Enseignant {
    protected String nom;
    protected String matricule;
    protected String prenom;
    /**
     * Default constructor
     */
    public Enseignant(String nom,String matricule,String prenom) {
        this.nom=nom;
        this.matricule=matricule;
        this.prenom=prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "Enseignant{" + "nom=" + nom + ", matricule=" + matricule + ", prenom=" + prenom + '}';
    }


 


}