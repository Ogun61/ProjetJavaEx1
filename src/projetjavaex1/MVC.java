package projetjavaex1;


public class MVC {
    private Controleur c;
    private Vue v;
    private Modele m;
    
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
