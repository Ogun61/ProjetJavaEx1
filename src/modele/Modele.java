/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import mesclassesCEG.Enseignant;
import mesclassesCEG.Cours;
import java.util.*;
import mesclassesCEG.Groupe;

/**
 *
 * @author Nugo
 */
public class Modele {
    /**
     * Liste de tous les enseignants
     */
    private final List<Enseignant> ens= new ArrayList();
    
    /**
     * Liste de tous les cours
     */
    private final List<Cours> crs= new ArrayList<>();
    /**
     * Liste de tous les groupes
     */
    private final List<Groupe> groupe = new ArrayList<>();

    /**
     * constructeur par défaut
     */
    public Modele() {
     


    }

    /**
     *methode qui permet l'ajout d'un enseignant dans la liste des enseignants
     * @param e est l'enseignant à ajouter
     * @return le résultat de l'ajout
     */
    public String ajoutEns(Enseignant e) {
        if (e == null) {
            return "Enseignant n'existe pas";
        }
        if (ens.contains(e)) {
            return "Enseignant déjà enregistré";
        }
        ens.add(e);
        return "Ajout de l'enseignant effectué";
    }

    /**
     *methode qui permet l'ajout d'un cours dans la liste des cours
     *
     * @param c le cours à ajouter
     * @return le résultat de l'ajout
     */
    public String ajoutCours(Cours c) {
        if (c == null) {
            return "cours n'existe pas";
        }
        if (crs.contains(c)) {
            return "cours déja enregistré";
        } else {
            crs.add(c);
        }
        return "ajout du cours effectué";
    }

    /**
     *methode qui permet l'ajout d'un groupe dans la liste des groupes
     * @param g
     * @return
     */
    public String ajoutGroupe(Groupe g) {
        if (g == null) {
            return "groupe n'existe pas";
        }
        if (groupe.contains(g)) {
            return "groupe est deja enregistré";
        } else {
            groupe.add(g);
        }
        return "ajout du groupe effectué";
    }

    /**
     * Méthode getCours permet de rechercher le cours
     *
     * @param cRech est le cours rechercher
     * @return le cours trouvée ou null s'il n'est pas trouvé
     */
    public Cours getCours(Cours cRech) {

        int i = crs.indexOf(cRech);
        if (i < 0) {
            return null;
        } else {
            return crs.get(i);
        }
    }

    /**
     * Méthode getGroupe permet de rechercher le groupe
     *
     * @param gRech est le groupe rechercher
     * @return le groupe trouvé ou null s'il n'est pas trouvé
     */
    public Groupe getGroupe(Groupe gRech) {
        int i = groupe.indexOf(gRech);
        if (i < 0) {
            return null;
        } else {
            return groupe.get(i);
        }
    }

    /**
     * methode qui permet de retrouver un enseignant
     *
     * @param eRech est l'enseignant à rechercher
     * @return l'enseignant trouvé ou null au cas contraire
     */
    public Enseignant getEnseignant(Enseignant eRech) {
        int i = ens.indexOf(eRech);
        if (i < 0) {
            return null;
        } else {
            return ens.get(i);
        }
    }
    
    
    /**
     * methode qui permet de modifier un enseignant
     *
     * @param nvEns le nouvel enseignant
     * @param tmp l'enseignant qui sera remplacé par nvEns
     * @return le resultat de la modification
     */
    public String modifEns(Enseignant nvEns, Enseignant tmp) {
        int i = ens.indexOf(tmp);
        if (i < 0) {
            return "enseignant n'existe pas ?";

        } else {
            ens.set(i, nvEns);
        }
        return "l'enseignant a été modifier";

    }

    /**
     * methode qui permet de modifier un cours 
     *
     * @param reCours nouveau cours
     * @param tmp est le cours qui sera remplacée par le nouveau cours 'reCours'
     * @return le resultat de la modification
     */
    public String modifCours(Cours reCours, Cours tmp) {

        int i = crs.indexOf(tmp);
        if (i < 0) {
            return "cours n'existe pas";

        } else {
            crs.set(i, reCours);
        }
        return "le cours a été modifier";

    }

    /**
     * methode qui permet de supprimer un enseignant 
     *
     * @param e l'enseignant à supprimer
     * @return le résultat de la suppression
     */
    public String suppEns(Enseignant e) {
        int i = ens.indexOf(e);
        if (i < 0) {
            return "Enseignant introuvable";

        } else {
            ens.remove(i);
        }
        return "Enseignant a été supprimer";
    }

    /**
     *methode qui permet de supprimer un cours
     *
     * @param c est le cours à supprimer
     * @return le résultat de la suppression
     */
    public String suppCours(Cours c) {
        int i = crs.indexOf(c);
        if (i < 0) {
            return "cours n'existe pas";

        } else {
            crs.remove(i);
        }
        return "le cours a été supprimer";
    }

    /**
     * methode qui affiche tousLesEnseignants
     *
     * @return la liste des enseigannt contenant dans ens
     */
    public List<Enseignant> tousLesEns() {
        return ens;
    }

    /**
     * methode qui affiche tous les cours
     *
     * @return la liste des cours contenant dans crs
     */
    public List<Cours> tousLesCours() {

        return crs;

    }

    /**
     *methode qui affiche tous les groupes
     * @return la liste des groupe contenant dans groupe
     */
    public List<Groupe> tousLesGroupe() {

        return groupe;

    }

    /**
     * Comparator de la liste cours permet le tri par le code du cours
     *
     * @return la liste cours trier
     */
    public List<Cours> tousLesCrs() {
      crs.sort(new CoursComparator());
      return crs;
    }

    /**
     * Comparator de la liste enseignant parmet le tri
     *
     * @return la liste enseignant trier
     */
    public List<Enseignant> tousLesEnseignant() {
      ens.sort(new EnseignantComparator());
      return ens;
   }

    /**
     *
     * @param c est le cours
     * @param e est l'enseignant qui dispense le cours
     * @return
     */
    public String assignation(Cours c, Enseignant e) {
        String msg = c.assignation(e);

        return msg;
    }
    
    /**
     *
     * @param c est le cours
     * @param g est le groupe qui a le cours
     * @return
     */
    public String appartient(Cours c, Groupe g) {
        String msg = c.appartient(g);

        return msg;
    }

    /*public String changeEns(Enseignant e1,String nom, String prenom, String mat){
        e1.setNom(nom);
        e1.setPrenom(prenom);
        e1.setMatricule(mat);
        
        return "Changement enseignant effectué";
    }*/
}
