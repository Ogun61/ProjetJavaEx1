package projetjavaex1;

import controleur.Controleur;
import modele.Modele;
import vue.Vue;


public class MVC {
    private final Controleur c;
    private final Vue v;
    private final Modele m;
    
    public MVC(){
        
        v=new Vue();
        m=new Modele();
        c=new Controleur(m,v);
        c.menu();
    }
   
    public static void main(String[] args) {
        MVC mvc=new MVC();
    }
    
}
