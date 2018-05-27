/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetJavaEx1.controleur;

import projetJavaEx1.mesclassesCEG.Cours;
import projetJavaEx1.mesclassesCEG.Enseignant;
import projetJavaEx1.modele.Modele;
import projetJavaEx1.vue.Vue;
import java.util.List;
import projetJavaEx1.mesclassesCEG.Groupe;

/**
 *
 * @author Nugo
 */
public class Controleur {

    /**
     * Variable m de type Modele
     */
    private Modele m;

    /**
     * Variable v de type Vue
     */
    private Vue v;

    /**
     * Constructeur par défaut
     */
    public Controleur() {

    }

    /**
     * Constructeur paramétré
     *
     * @param m le modèle
     * @param v la vue
     */
    public Controleur(Modele m, Vue v) {

        this.m = m;
        this.v = v;
    }

    /**
     * Méthode gestion
     *
     */
    public void menu() {

        int ch;
        do {
            ch = v.menu1();

            switch (ch) {
                case 1:
                    ajtEns();
                    break;
                case 2:
                    ajtCours();
                    break;
                case 3:
                    ajtGroupe();
                    break;
                case 4:
                    assignCrs();
                    break;
                case 5:
                    assignGroupe();
                    break;
                case 6:
                    modifEns();
                    break;
                case 7:
                    supprimerEns();
                    break;
                case 8:
                    modifGrp();
                    break;
                case 9:
                    supprimerGrp();
                    break;
                case 10:
                    modifCrs();
                    break;
                case 11:
                    supprimerCrs();
                    break;
                case 12:
                    supprimerCrsEns();
                    break;
                case 13:
                    supprimerCrsGrp();
                    break;
                case 14:
                    rechEns();
                    break;
                case 15:
                    rechCours();
                    break;
                case 16:
                    rechGroupe();
                    break;
                case 17:
                    List<Cours> lc = affCrsEns();
                    v.affListe(lc);
                    break;
                case 18:
                    List<Cours> lg = affCrsGrp();
                    v.affListe(lg);
                    break;
                case 19:
                    listeEns();
                    break;
                case 20:
                    listeCrs();
                    break;
                case 21:
                    listeGrp();
                    break;
                case 22:
                    v.affMsg("Fin");
                    break;
                default:
                    v.affMsg("Choix invalide");
            }
        } while (ch != 22);

    }

    /**
     * methode ajtEns permet l'ajout d'un enseignant en appellant ajoutEns dans
     * la vue, recupert les informations et appelle la methode ajoutEns dans le
     * modele ensuite verifie et decide d'ajouter ou pas.
     *
     */
    public void ajtEns() {
        Enseignant e = v.ajtEns();
        String msg = m.ajoutEns(e);
        v.affMsg(msg);

    }

    /**
     * methode ajtCours permet l'ajout d'un cours en appellant ajoutCours dans
     * la vue, recupert les informations et appelle la methode ajoutCours dans
     * le modele ensuite verifie et decide d'ajouter ou pas.
     *
     */
    public void ajtCours() {
        Cours c = v.ajoutCours();
        String msg = m.ajoutCours(c);
        v.affMsg(msg);

    }

    /**
     * methode ajtGroupe permet l'ajout d'un groupe en appellant ajoutGroupe
     * dans la vue, recupert les informations et appelle la methode ajoutGroupe
     * dans le modele ensuite verifie et decide d'ajouter ou pas.
     *
     */
    public void ajtGroupe() {
        Groupe g = v.ajoutGroupe();
        String msg = m.ajoutGroupe(g);
        v.affMsg(msg);

    }

    /**
     * Méthode rechCours appelle la methode rechCours pour faire une recherche
     * du cours Enseuite affiche le résultat de la recherche
     */
    private void rechCours() {
        Cours c1 = v.rechCours();
        v.affMsg(m.getCours(c1));
    }

    /**
     * Méthode de type Cours permettant de faire une recherche et retourner le
     * cours au type Cours
     *
     */
    private Cours rechCrs() {
        Cours cRech = v.rechCours();
        return m.getCours(cRech);
    }

    /**
     * methode qui affiche les cours de l'enseignant
     */
    private List<Cours> affCrsEns() {
        Enseignant eRech = v.rechEns();
        Enseignant tmp = m.getEnseignant(eRech);
        return m.getEnseignantCours(tmp);

    }

    /**
     * methode qui affiche les cours du groupe
     */
    private List<Cours> affCrsGrp() {
        Groupe gRech = v.rechGroupe();
        Groupe tmp = m.getGroupe(gRech);
        return m.getGroupeCours(tmp);

    }

    /**
     * methode qui recherche le groupe
     */
    private void rechGroupe() {
        Groupe g = v.rechGroupe();
        v.affMsg(m.getGroupe(g));
    }

    /**
     * methode rechEns appelle la methode dans la vue pour faire une recherche
     * de l'enseignant ensuite affiche le résultat de la recherche
     */
    private void rechEns() {
        Enseignant e = v.rechEns();
        v.affMsg(m.getEnseignant(e));
    }

    /**
     * methode de type Enseignant permettant de retourner l'enseignant
     * rechercher
     *
     */
    private Enseignant rechEnse() {
        Enseignant eRech = v.rechEns();
        return m.getEnseignant(eRech);
    }

    /**
     * methode de type Groupe permettant de retourner le groupe rechercher
     *
     */
    private Groupe rechGrp() {
        Groupe gRech = v.rechGroupe();
        return m.getGroupe(gRech);
    }

    /**
     * methode qui modifie le cours
     */
    private void modifCrs() {
        Cours cRech = v.rechCours();
        Cours tmp = m.getCours(cRech);

        v.affMsg("Modification du cours");

        v.affMsg(tmp);
        Cours recours = v.ajoutCours();
        v.affMsg(m.modifCours(recours, tmp));

    }

    /**
     * methode qui permet d'assigner un cours a un enseignant
     */
    public void assignCrs() {
        v.affMsg("-assignation du cours-");
        Cours crsRech = rechCrs();

        if (crsRech != null) {
            v.affMsg("le cours trouvée est :");
            v.affCrs(crsRech);
        } else {
            v.affMsg("cours introuvable");
            return;
        }

        Enseignant ensRech = rechEnse();
        if (ensRech == null) {
            v.affMsg("enseignant introuvable");
            return;
        }
        v.affMsg("l'enseigannt trouvé est :");
        v.affEnseignant(ensRech);
        String msg = m.assignation(crsRech, ensRech);
        //ensRech.getCours().add(crsRech);
        v.affMsg(msg);

    }

    /**
     * methode qui assigne un groupe a un cours
     */
    public void assignGroupe() {
        v.affMsg("-assignation du groupe-");
        Cours crsRech = rechCrs();

        if (crsRech != null) {
            v.affMsg("le cours trouvée est :");
            v.affCrs(crsRech);
        } else {
            v.affMsg("cours introuvable");
            return;
        }

        Groupe grpRech = rechGrp();
        if (grpRech == null) {
            v.affMsg("groupe introuvable");
            return;
        }
        v.affMsg("l'enseigannt trouvé est :");
        v.affGroupe(grpRech);
        String msg = m.appartient(crsRech, grpRech);

        v.affMsg(msg);

    }

    /**
     * Méthode qui modifie l'enseignant
     *
     */
    private void modifEns() {
        Enseignant eRech = v.rechEns();
        Enseignant tmp = m.getEnseignant(eRech);
        v.affMsg("***Modification de l'enseignant***");

        v.affMsg(tmp);
        Enseignant nvEns = v.ajtEns();
        v.affMsg(m.modifEns(nvEns, tmp));

    }

    /**
     * methode qui modifie le groupe
     */
    private void modifGrp() {
        Groupe gRech = v.rechGroupe();
        Groupe tmp = m.getGroupe(gRech);
        v.affMsg("***Modification du groupe***");

        v.affMsg(tmp);
        Groupe nvGrp = v.ajoutGroupe();
        v.affMsg(m.modifGrp(nvGrp, tmp));

    }

    /**
     * methode qui supprime le groupe
     */
    private void supprimerGrp() {
        Groupe gRech = v.rechGroupe();
        Groupe tmp = m.getGroupe(gRech);
        v.affMsg("** Suppression du groupe***");
        v.affMsg(tmp);
        v.affMsg(m.suppGrp(tmp));

    }

    /**
     * methode qui supprimme l'enseignant rechercher par son matricule
     */
    private void supprimerEns() {
        Enseignant eRech = v.rechEns();
        Enseignant tmp = m.getEnseignant(eRech);
        v.affMsg("** Suppression de l'enseignant***");
        v.affMsg(tmp);
        v.affMsg(m.suppEns(tmp));

    }

    /**
     * methode qui supprimme le cours rechercher par son code
     */
    private void supprimerCrs() {

        Cours cRech = v.rechCours();
        Cours tmp = m.getCours(cRech);

        v.affMsg("** Suppression du cours ** ");
        v.affMsg(tmp);
        v.affMsg(m.suppCours(tmp));

    }

    /**
     * methode qui supprime les cours de l'enseignant
     */
    private void supprimerCrsEns() {
        Cours cRech = v.rechCours();
        Cours tmp = m.getCours(cRech);
        if (tmp == null) {
            v.affMsg("Cours n'existe pas ");
        } else {
            String ch = v.supCoursEns();
            if ("non".equals(ch)) {
                v.affMsg("La suppression a été annuler");
            } else {
                v.affMsg("** Suppression de tous les cours de l'enseignants ** ");
                v.affMsg(tmp);
                v.affMsg(m.suppCoursEns(tmp));
            }
        }
    }

    /**
     * methode qui supprime les cours du groupe
     */
    private void supprimerCrsGrp() {
        Cours cRech = v.rechCours();
        Cours tmp = m.getCours(cRech);
        if (tmp == null) {
            v.affMsg("Cours n'existe pas ");
        } else {
            String ch = v.supCoursGrp();
            if ("non".equals(ch)) {
                v.affMsg("La suppression a été annuler");
            } else {
                v.affMsg("** Suppression de tous les groupe ** ");
                v.affMsg(tmp);
                v.affMsg(m.suppCoursGrp(tmp));
            }
        }
    }

    /**
     * methode qui affiche toute la liste des enseignants
     */
    public void listeEns() {
        List<Enseignant> le = m.tousLesEnseignant();
        v.affListe(le);
    }

    /**
     * methode qui affiche toute la liste des cours
     */
    public void listeCrs() {
        List<Cours> lc = m.tousLesCrs();
        v.affListe(lc);
    }

    /**
     * methode qui affiche toute la liste des groupes
     */
    public void listeGrp() {
        List<Groupe> lg = m.tousLesGroupe();
        v.affListe(lg);
    }
}
