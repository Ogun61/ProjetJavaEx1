package projetjavaex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 
 */
public class Enseignant {
    protected String nom;
    protected String matricule;
    protected String prenom;
    protected List<Cours> cours = new ArrayList();
    /**
     * Default constructor
     */
    public Enseignant(String nom,String matricule,String prenom) {
        this.nom=nom;
        this.matricule=matricule;
        this.prenom=prenom;
       
    }
    
     public Enseignant(String matricule) {
        this.matricule=matricule;
        
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

    public List<Cours> getCours() {
        return cours;
    }




 


}