/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavaex1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Nugo
 */
public class Modele {
  protected   Map<String,Enseignant> ens = new HashMap<>();
  protected   Set<Cours> crs = new HashSet<>();
 
          
  public Modele(){
    
  }

   public String ajtEnseignant(Enseignant e){
      if(e==null)return "Enseignant nul";
     Enseignant erech=ens.get(e.getMatricule());
     if(erech!=null)return "Enseignant déja enregistré";
     ens.put(e.getMatricule(),e);
     return "ajout enseignant effectué";
  }
   
    public String ajtCours(Cours c){
     if(c==null)return "cours nul";
     if(!crs.add(c))return "cours déja enregistré";
     return "ajout cours effectué";
  }
  
    public Enseignant getEnseignant(String matRech) {
     return ens.get(matRech);
    }
    
    public Cours getCours(String codeRech,int nbrhRech,String intituleRech) {
        Cours  cRech= new Cours(codeRech,nbrhRech,intituleRech);
        for(Cours cl: crs){
         if(cl.equals(cRech)) return cl;
        }
        return null;
    }
    
    public List<Enseignant> ToutEns(Comparator<Enseignant> cmp) {
      Collection<Enseignant> ce= ens.values();
      List<Enseignant> le = new ArrayList<>();
      for(Enseignant e : ce){
          le.add(e);
      }
      le.sort(cmp);
      return le;
   }
    
    public List<Cours> getEnseignantCours(Enseignant e){
      if(e==null)return null;
      return e.getCours();
     
  }
    public String assignation(Cours c,Enseignant e){
       String msg = c.assignation(e);
       if(msg.equals("le cours a été assigner à l'enseignant")) e.getCours().add(c);
       return msg;
   }
    
   
}
