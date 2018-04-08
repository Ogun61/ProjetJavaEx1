/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetjavaex1;
import java.util.Collection;
import java.util.Scanner;

/**
 *
 * @author Nugo
 */


public class Vue {
    private Scanner sc=new Scanner(System.in);
    
    public void affMsg(Object msg){
        System.out.println(msg);
    }
       
    public String lireMsg(){
        String msg=sc.nextLine();
        return msg;
    }
    
    //surcharge
    public String lireMsg(String invite){
        affMsg(invite);
        return lireMsg();
    }
    
    public void affListe(Collection liste){
      int i=1;
        for(Object o : liste){
          affMsg((i++)+"." + o);
      }  
    }
    
 }

