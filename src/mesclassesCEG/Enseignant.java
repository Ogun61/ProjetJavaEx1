/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesclassesCEG;

import java.util.*;

/**
 *
 * @author Nugo
 */
public class Enseignant {

    /**
     *Constructeur par default
     */
    public Enseignant() {

    }

    /**
     * Matricule de l'enseignant
     */
    private String matricule;
    /**
     * Nom de l'enseignant
     */
    private String nom;
    /**
     * Prénom de l'enseignant
     */
    private String prenom;
    /**
     * Liste des cours que l'enseignant dispense
     */
    //protected List<Cours> cours = new ArrayList();

    /**
     * Constructeur paramétré de tous les informations
     *
     * @param nom sera affecter a this.nom
     * @param prenom sera affecter a this.prenom
     * @param matricule sera affecter a this.matricule
     */
    public Enseignant(String nom,String prenom,String matricule) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;

    }

    /**
     * Constructeur avec un seul paramètre
     *
     * @param Matricule recherchera l'enseignant avec son matricule
     */
    public Enseignant(String Matricule) {
        matricule = Matricule;
    }

    /**
     * Getter du matricule
     *
     * @return le matricule
     */
    public String getMatricule() {
        return matricule;
    }

    /**
     * Setter du matricule
     *
     * @param matricule affecte le matricule de l'ens
     */
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    /**
     * Getter du nom
     *
     * @return le nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * Setter du nom
     *
     * @param nom affecte le nom de l'ens
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Getter du prénom
     *
     * @return le prénom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Setter du prénom
     *
     * @param prenom affecte le prénom de l'ens
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    
    /**
     * Getter de la list Cours
     *
     * @return renvoi le cours
     */
    
    /*public List<Cours> getCours() {
        return cours;
    }*/

    /**
     * Setter du prénom
     *
     * @param cours affecte le cours
     */
    /*public void setCours(List<Cours> cours) {
        this.cours = cours;
    }*/



    /**
     * Méthode hashCode
     *
     * @return hash
     */
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.matricule);
        return hash;
    }

    /**
     * Méthode equals
     *
     * @param obj
     * @return résultat de la comparaison
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Enseignant other = (Enseignant) obj;
        if (!Objects.equals(this.matricule, other.matricule)) {
            return false;
        }
        return true;
    }
    
     /**
     * Méthode toString
     *
     * @return les informations détaillées
     */
    @Override
    public String toString() {
        return "Enseignant{" + "matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + '}';
    }
    
    

}
