/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavaex1;
import java.util.Comparator;

/**
 *
 * @author ogun.ark
 */
public class EnseignantComparator implements Comparator<Enseignant>{
   @Override
    public int compare(Enseignant e1,Enseignant e2){
        return e1.getMatricule().compareTo(e2.getMatricule());
    }
}