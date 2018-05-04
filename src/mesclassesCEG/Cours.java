/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesclassesCEG;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Nugo
 */
public class Cours {

    /**
     * code du cours
     */
    private String codec;

    /**
     * nombre d'heure du cours
     */
    private int nbrha;
    /**
     * intitule du cours
     */
    private String intitulec;
    /**
     * Liste des enseignants qui dispense le cours
     */
    private List<Enseignant> enseignants = new ArrayList();
    /**
     * Liste des groupes qui participe au cours
     */
    protected List<Groupe> groupe = new ArrayList<>();


    /**
     * Constructeur par défaut
     */
    public Cours() {

    }

    /**
     * Constructeur paramétré
     *
     * @param codec
     * @param nbrha
     * @param intitulec
     */
    public Cours(String codec, int nbrha, String intitulec) {
        this.codec = codec;
        this.nbrha = nbrha;
        this.intitulec = intitulec;
    }

    /**
     * Constructeur avec un seul paramètre
     *
     * @param Codec permet la recherche du cours avec son code
     */
    public Cours(String Codec) {
        this.codec = Codec;
    }

    /**
     * Getter du codec
     *
     * @return le code du cours
     */
    public String getCodec() {
        return codec;
    }

    /**
     * Setter du codec
     *
     * @param codec affecte le codec
     */
    public void setCodec(String codec) {
        this.codec = codec;
    }

    /**
     * Getter du nombre d'heure 'nbrha'
     *
     * @return nbrha du cours
     */
    public int getNbrha() {
        return nbrha;
    }

    /**
     * Setter de nbrha
     *
     * @param nbrha affecte nbrha
     */
    public void setNbrha(int nbrha) {
        this.nbrha = nbrha;
    }

    /**
     * Getter de l'intitulec
     *
     * @return l'intitule du cours
     */
    public String getIntitulec() {    
        return intitulec;
    }

    /**
     * Setter de l'intitule
     *
     * @param intitulec affecte l'intitule
     */
    public void setIntitulec(String intitulec) {
        this.intitulec = intitulec;
    }

    
    /**
     * methode hashCode du cours
     *
     * @return hash
     */
    @Override    
    public int hashCode() {
        int hash = 1;
        hash = 83 * hash + Objects.hashCode(this.codec);
        return hash;
    }

    /**
     * Méthode equals du cours
     *
     * @param obj
     * @return le résultat de la comparaison
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
        final Cours other = (Cours) obj;
        if (!Objects.equals(this.codec, other.codec)) {
            return false;
        }
        return true;
        }

    /**
     *Getter de la liste contenant les groupes du cours
     * @return le groupe
     */
    public List<Groupe> getGroupe() {
        return groupe;
    }

    /**
     *Setter de la liste contenant les groupes du cours 
     * @param groupe affecte le groupe
     */
    public void setGroupe(List<Groupe> groupe) {
        this.groupe = groupe;
    }

    /**
     *Getter de la liste contenant les enseignant du cours
     * @return les enseignant du cours
     */
    public List<Enseignant> getEnseignants() {
        return enseignants;
    }

    /**
     *Setter de la liste contenant les enseignants
     * @param enseignants affecte l'enseignants
     */
    public void setEnseignants(List<Enseignant> enseignants) {
        this.enseignants = enseignants;
    }
    
    /**
     *
     * @param enseignant est l'enseignant qui dispense le cours,enseignant est ajouté dans cours
     * @return un message (String) informant le succes de l'assignation
     */
    public String assignation(Enseignant enseignant) {
        if (enseignant == null) {
            return "Enseignant n'existe pas";
        }
        if (enseignants.contains(enseignant)) {
            return "Enseignant déjà enregistré";
        }
        this.enseignants.add(enseignant);
        return "le cours a été assigner à l'enseignant";
    }
    
    /**
     *
     * @param groupe est le groupe qui appartient au cours,ce groupe est ajouté dans cours
     * @return un message (String) informant le succès de l'attribution
     */
    public String appartient(Groupe groupe) {
        if (groupe == null) {
            return "groupe n'existe pas";
        }
        if (this.groupe.contains(groupe)) {
            return "groupe déjà enregistré";
        }
        this.groupe.add(groupe);
        return "le cours a été attribuer au groupe";
    }
    
    
    /**
     * Méthode toString
     *
     * @return le contenu des variables
     */
    @Override
    public String toString() {
        return "Cours{" + "codec=" + codec + ", nbrha=" + nbrha + ", intitulec=" + intitulec + ", groupe=" + groupe + ", enseignants=" + enseignants + '}';
    }

    


}
