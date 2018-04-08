/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavaex1;

//import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Nugo
 */
public class Modele {
  protected   Set<Enseignant> ens = new HashSet<>();
 
          
  public Modele(){
    
  }

   public String ajouterEnseignant(Enseignant e){
     if(e==null)return "enseignant nul";
     if(!ens.add(e))return "client deja enregistre";
     return "ajout client effectue";
  }
    
}
