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
    
    
    public void gestion() {
        Scanner sc= new Scanner(System.in);
        int ch;
     
      do {
          System.out.println("1.Ajout enseignant ");
          System.out.println("2.");
          System.out.println("3.");
          System.out.println("4.");
          System.out.println("5.fin");
          System.out.println("votre choix :");
          ch=sc.nextInt();
         sc.skip("\n");
          switch(ch){
              case 1:ajoutEnseignant();
                     break;
              case 5:System.out.println("fin");
                   break;
              default :System.out.println("choix invalide");         
          }
      }while (ch!=5);
     
    }
   
    public void ajoutEnseignant() {
        String nom = v.lireMsg("nom de l'enseignant : ");
        String prenom = v.lireMsg("prenom de l'enseignant ");
        String matricule = v.lireMsg("matricule ? :");
        Enseignant e1 = new Enseignant(nom, matricule, prenom);
        String msg = m.ajouterEnseignant(e1);
        v.affMsg(msg);
    }

}
