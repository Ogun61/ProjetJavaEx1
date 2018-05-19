/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projetJavaEx1.modele;

import java.util.Comparator;
import projetJavaEx1.mesclassesCEG.Enseignant;

/**
 *
 * @author Nugo
 */
public class EnseignantComparator implements Comparator<Enseignant>{
    @Override
    public int compare(Enseignant e1,Enseignant e2){
        if(!e1.getNom().equals(e2.getNom())) return e1.getNom().compareTo(e2.getNom());
        if(!e1.getPrenom().equals(e2.getPrenom())) return e1.getPrenom().compareTo(e2.getPrenom());
        return e1.getMatricule().compareTo(e2.getMatricule());
    }
}
