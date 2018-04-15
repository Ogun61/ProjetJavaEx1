/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavaex1;
import java.util.*;

/**
 *
 * @author Nugo
 */
public class Controleur {
    
    private Modele m;
    private Vue v;
    
    
     public Controleur() {

    }

    public Controleur(Modele m,Vue v) {
        this.m = m;
        this.v = v;
    }
    
    
    public void menu() {
        Scanner sc= new Scanner(System.in);
        int ch;
     
      do {
          System.out.println("1.Ajout enseignant ");
          System.out.println("2.Ajout cours");
          System.out.println("3.Afficher cours ");
          System.out.println("4.");
          System.out.println("5.fin");
          System.out.println("votre choix :");
          ch=sc.nextInt();
         sc.skip("\n");
          switch(ch){
              case 1:ajoutEns();
                     break;
              case 2:ajoutCrs();
                     break;       
              case 3:affCoursEns();
                     break;       
              case 5:System.out.println("fin");
                   break;
              default :System.out.println("choix invalide");         
          }
      }while (ch!=5);
     
    }
   
    public void ajoutEns() {
        String nom = v.lireMsg("nom de l'enseignant ? ");
        String prenom = v.lireMsg("prenom de l'enseignant ? ");
        String matricule = v.lireMsg("matricule ? ");
        Enseignant e = new Enseignant(nom, matricule, prenom);
        String msg = m.ajtEnseignant(e);
        v.affMsg(msg);
    }
    
    
    public void affCoursEns() {
        Enseignant ensRech = rechEns();
        if (ensRech == null) {
            v.affMsg("enseignant introuvable");
        } else {
            List<Cours> listec = m.getEnseignantCours(ensRech);
            if (listec == null) {
                v.affMsg("liste vide");
                return;
            }
            v.affListe(listec);
        }
    }
        public Enseignant rechEns() {
        String matricule = v.lireMsg("matricule de l'enseignant ?");
        return m.getEnseignant(matricule);
    }
        
        public Cours rechCours() {
            String code = v.lireMsg("code du cours ?");
            String nbr = v.lireMsg("nombre d'heure ?");
            int nbrh = Integer.parseInt(nbr);
            String intitule = v.lireMsg("intitule ?");
            return m.getCours(code,nbrh,intitule);
    }
        
        public void ajoutCrs() {
            String code = v.lireMsg("Code du cours ? ");
            String nbr = v.lireMsg("Nombre d'heure ? ");
            int nbrh = Integer.parseInt(nbr);
            String intitule = v.lireMsg("Intitule ? ");
            Cours c = new Cours(code, nbrh, intitule);
            String msg = m.ajtCours(c);
            v.affMsg(msg);
            
            Enseignant ensRech = rechEns();
                if (ensRech == null) {
                v.affMsg("Enseignant introuvable");
                return;
            }
            v.affMsg("l'enseignant trouvé est " + ensRech);
            msg = m.assignation(c,ensRech);
            v.affMsg(msg);
            }
        
        public void Affiche(){
            
        }
    }

