/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetJavaEx1.vue;

import projetJavaEx1.mesclassesCEG.Cours;
import projetJavaEx1.mesclassesCEG.Enseignant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collection;
import java.util.Scanner;
import projetJavaEx1.mesclassesCEG.Groupe;

/**
 *
 * @author Nugo
 */
public class Vue {

    private final Scanner sc = new Scanner(System.in);

    /**
     * Menu principal
     *
     * @return le choix du menu
     */
    public int menu1() {

        List<String> menu = new ArrayList<>(Arrays.asList(
                "Ajout enseignant",
                "Ajout cours",
                "Ajout groupe",
                "Assigner cours à un enseignant",
                "Attribuer cours à un groupe",
                "Modifier enseignants",
                "Supprimer enseignants",
                "Modifier groupe",
                "Supprimer groupe",
                "Modifier cours",
                "Supprimer cours",
                "Supprimer tous les enseignants du cours",
                "Supprimer tous les groupes du cours",
                "Recherche enseignants",
                "Recherche cours",
                "Recherche groupe",
                "Affiche cours Enseignant",
                "Affiche cours groupe",
                "Liste tous enseignant",
                "Liste tous les cours",
                "Liste tous les groupe",
                "Fin"));
        affListe(menu);

        int ch;
        do {
            String ch1 = getMsg("Choix ?");
            ch = Integer.parseInt(ch1);
            if (ch > 0 && ch <= menu.size()) {
                break;
            } else {
                affMsg("ch incorrecte");
            }

        } while (true);
        return ch;
    }


    /**
     * methode getMsg permet à l'utilisateur d'encoder le message
     *
     * @return le message entré
     */
    public String getMsg() {
        String msg = sc.nextLine();
        return msg;
    }

    /**
     * methode affMsg permet d'afficher le message retourner en paramètre
     *
     * @param msg == message à afficher
     */
    public void affMsg(Object msg) {
        System.out.println(msg);
    }

    /**
     * Surcharge de getMsg permet d'afficher un message
     *
     * @param msg le message à afficher
     * @return la méthode getMsg pour l'encodage
     */
    public String getMsg(String msg) {
        affMsg(msg);
        return getMsg();
    }

    /**
     * methode affListe permet d'afficher une liste
     *
     * @param liste la liste à afficher
     */
    public void affListe(Collection liste) {
        int i = 1;
        for (Object o : liste) {
            affMsg((i++) + "." + o);
        }
    }
    
        /**
     * methode ajoutCours créer un nouveau cours 
     *
     * @return c retourne le cours crée a partir des informations rentrée
     */
    public Cours ajoutCours() {
        Cours cb = null;
        //affMsg("Entrez '0' pour le code cours si modification du cours!");
        String codec = getMsg("Code cours ? ");
        String nbr = getMsg("nombre d'heure ? ");
        int nbrh = Integer.parseInt(nbr);
        String intitule = getMsg("intitule du cours ? ");

        Cours.CoursBuilder c = new Cours.CoursBuilder();
        c.setCodec(codec).setNbrha(nbrh).setIntitulec(intitule);
        try{
            cb = c.build();
        } catch (Exception e) {
            System.out.println("Erreur lors de la création du cours" +e);
        }
        return cb;
        
    }
    
    public Groupe ajoutGroupe() {
        String codeg = getMsg("Code groupe ? ");
        String intituleg = getMsg("intitule du groupe ? ");
        String niveau = getMsg("niveau ? ");

        Groupe g = new Groupe(codeg,intituleg,niveau);

        return g;
    }

    /**
     * methode ajtEns créer un nouveau enseignant 
     *
     * @return e retourne l'enseignant crée a partir des informations rentrée
     */
    public Enseignant ajtEns() {

        String nom = getMsg("nom de l'enseignant ? ");
        String prenom = getMsg("prenom de l'enseignant ? ");
        String matricule = getMsg("matricule de l'ens ?");
        Enseignant e = new Enseignant(nom,prenom,matricule);

        return e;
    }

    /**
     * methode affCrs Affiche les informations du cours
     *
     * @param c est le cours à afficher
     */
    public void affCrs(Cours c) {

        affMsg("code : " + c.getCodec());
        affMsg("nombre d'heure : " + c.getNbrha());
        affMsg("intitule : " + c.getIntitulec());
        affMsg("enseignant :" + c.getEnseignants());

    }

    /**
     * methode affEnseignant affiche les informations de l'enseignant 
     *
     * @param e est l'enseignant à afficher
     */
    public void affEnseignant(Enseignant e) {
        affMsg("Matricule  :" + e.getMatricule());
        affMsg("Nom de l'enseignant :" + e.getNom());
        affMsg("Prénom de l'enseignant :" + e.getPrenom());
        
        

    }
    
    /**
     *methode affGroupe affiche les informations du groupe 
     * @param g
     */
    public void affGroupe(Groupe g) {
        affMsg("Code du groupe :" + g.getCodegr());
        affMsg("Intitule du groupe :" + g.getIntitulegr());
        affMsg("Niveau  :" + g.getNiveau());

    }
    
    /**
     * methode rechEns permet de rechercher un enseignant à partir de son matricule
     * matricule
     *
     * @return l'enseignant trouvé "eRech"
     */
    public Enseignant rechEns() {

        String matricule = getMsg("matricule de l'enseignant à rechercher :");
        Enseignant eRech = new Enseignant(matricule);
        return eRech;
    }
    
     /**
     * methode rechEns permet de rechercher un enseignant à partir de tous ses informations
     * @return l'enseignant trouvé "eRech"
     */
    public Enseignant rechEns2() {
        String nom = getMsg("nom de l'enseignant à rechercher ?");
        String prenom = getMsg("prenom de l'enseignant à rechercher ?");
        String matricule = getMsg("Matricule de l'enseignant à rechercher ?");
        Enseignant eRech = new Enseignant(nom,matricule,prenom);
        return eRech;
    }
    

    /**
     * methode rechCours permet de rechercher un cours a partir de son code
     *
     * @return le cours trouvé "cRech"
     */
    public Cours rechCours() {
        Cours cRech = null;
        String codec = getMsg("code du cours à rechercher ? ");
        Cours.CoursBuilder c = new Cours.CoursBuilder();
        c.setCodec(codec);
        try {
            cRech = c.build();
            return cRech;
        } catch (Exception e) {
            System.out.println("Erreur de création du cours" + e);
        }
        return null;

    }
    
    /**
     * methode rechCours permet de rechercher un cours a partir de tous ses informations
     *
     * @return le cours trouvé "cRech"
     */
    /*public Cours rechCours2() {

        String codec = getMsg("code du cours à rechercher ? ");
        String nbrh = getMsg("nombre d'heure du cours a rechercher ? ");
        String intitule = getMsg("intitule du cours a rechercher ? ");
        Cours cRech = new Cours(codec,nbrh,intitule);
        return cRech;

    }*/
    
     public Groupe rechGroupe() {

        String codeg = getMsg("code du groupe à rechercher ? ");
        Groupe gRech = new Groupe(codeg);
        return gRech;

    }
     
     public String supCoursEns() {
        affMsg("** Attention cette action supprimera tous les enseignants du cours. Pour annuler l'opération entrez 'non' ** ");
        String ch = getMsg("Pour supprimer tous les ensignants entrez 'oui'(0 pour annuler) . ");
        //int choix = Integer.parseInt(ch);
        return ch;

    }
     
     public String supCoursGrp() {
        affMsg("** Attention cette action supprimera tous les groupe du cours. Pour annuler l'opération entrez 'non' ** ");
        String ch = getMsg("Pour supprimer touss les groupes entrez 'oui'(0 pour annuler) . ");
        //int choix = Integer.parseInt(ch);
        return ch;

    }

}
