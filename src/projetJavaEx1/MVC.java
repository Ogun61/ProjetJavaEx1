package projetjavaex1;

import projetJavaEx1.controleur.Controleur;
import java.util.Scanner;
import projetJavaEx1.modele.Modele;
import projetJavaEx1.modele.ModeleJdbc;
import projetJavaEx1.vue.Vue;

public class MVC {

    private final Controleur c;
    private Vue v;
    private Modele m;

    public MVC(int ch) {

        v = new Vue();
        m = new Modele();
        switch (ch) {
            case 1:
                m = new Modele();
                break;
            case 2:
                m = new ModeleJdbc();
                break;
            default:
                System.out.println("mode incorrect");
                System.exit(1);
        }

        c = new Controleur(m, v);
        c.menu();
        if (m instanceof ModeleJdbc) {
            ((ModeleJdbc) m).close();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1: Modele\n2: ModeleJdbc ");
        int ch = sc.nextInt();
        MVC mvc = new MVC(ch);
    }

}
