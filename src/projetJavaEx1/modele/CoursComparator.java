/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetJavaEx1.modele;

import java.util.Comparator;
import projetJavaEx1.mesclassesCEG.Cours;

/**
 *
 * @author Nugo
 */
public class CoursComparator implements Comparator<Cours>{
   @Override
    public int compare(Cours c1,Cours c2){
        return c1.getCodec().compareTo(c2.getCodec());
    }
}
