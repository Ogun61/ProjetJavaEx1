/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;
import java.util.List;
import mesclassesCEG.Cours;
import mesclassesCEG.Enseignant;
import mesclassesCEG.Groupe;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nugo
 */
public class ModeleTest {
    
    public ModeleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of ajoutEns method, of class Modele.
     */
    @Test
    public void testAjoutEns() {
        System.out.println("ajoutEns");
        Enseignant e = new Enseignant("ark","ogun","61");
        Modele instance = new Modele();
        String expResult = "Ajout de l'enseignant effectué";
        String result = instance.ajoutEns(e);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of ajoutCours method, of class Modele.
     */
    @Test
    public void testAjoutCours() {
        System.out.println("ajoutCours");
        Cours c = new Cours("123",43,"math");
        Modele instance = new Modele();
        String expResult = "ajout du cours effectué";
        String result = instance.ajoutCours(c);
        assertEquals(expResult, result);
     
    }

    /**
     * Test of ajoutGroupe method, of class Modele.
     */
    @Test
    public void testAjoutGroupe() {
        System.out.println("ajoutGroupe");
        Groupe g = new Groupe("12","info","1");
        Modele instance = new Modele();
        String expResult = "ajout du groupe effectué";
        String result = instance.ajoutGroupe(g);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getCours method, of class Modele.
     */
    @Test
    public void testGetCours() {
        System.out.println("getCours");
        Cours cRech = new Cours("123",43,"math");
        Modele instance = new Modele();
        instance.ajoutCours(cRech);
        Cours expResult = cRech;
        Cours result = instance.getCours(cRech);
        assertEquals(expResult, result);
      
       
    }

    /**
     * Test of getGroupe method, of class Modele.
     */
    @Test
    public void testGetGroupe() {
        System.out.println("getGroupe");
        Groupe gRech = new Groupe("123","II","1");
        Modele instance = new Modele();
        instance.ajoutGroupe(gRech);
        Groupe expResult = gRech;
        Groupe result = instance.getGroupe(gRech);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getEnseignant method, of class Modele.
     */
    @Test
    public void testGetEnseignant() {
        System.out.println("getEnseignant");
        Enseignant eRech = null;
        Modele instance = new Modele();
        Enseignant expResult = null;
        Enseignant result = instance.getEnseignant(eRech);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of modifCours method, of class Modele.
     */
    @Test
    public void testModifCours() {
        System.out.println("modifCours");
        Cours nvCours = new Cours("123",43,"math");
        Cours tmp = new Cours("1234,41,geo");
        Modele instance = new Modele();
        instance.ajoutCours(tmp);
        String expResult = "le cours a été modifier";
        String result = instance.modifCours(nvCours, tmp);
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of modifEns method, of class Modele.
     */
    @Test
    public void testModifEns() {
        System.out.println("modifEns");
        Enseignant nvEns = new Enseignant("ark","ogun","61");
        Enseignant tmp = new Enseignant("ark","ogn","611");
        Modele instance = new Modele();
        instance.ajoutEns(tmp);
        String expResult = "l'enseignant a été modifier";
        String result = instance.modifEns(nvEns, tmp);
        assertEquals(expResult, result);

    }

    /**
     * Test of suppEns method, of class Modele.
     */
    @Test
    public void testSuppEns() {
        System.out.println("suppEns");
        Enseignant e =new Enseignant("ark","ogun","61");
        Modele instance = new Modele();
        instance.ajoutEns(e);
        String result = instance.suppEns(e);
        String expResult = "Enseignant a été supprimer";
        assertEquals(expResult, result);
       
        
    }

    /**
     * Test of suppCours method, of class Modele.
     */
    @Test
    public void testSuppCours() {
        System.out.println("suppCours");
        Cours c = new Cours("123",43,"math");
        Modele instance = new Modele();
        instance.ajoutCours(c);
        String result = instance.suppCours(c);
        String expResult = "le cours a été supprimer";
        assertEquals(expResult, result);
        
    }

    /**
     * Test of tousLesEns method, of class Modele.
     */
    @Test
    public void testTousLesEns() {
        System.out.println("tousLesEns");
        List<Enseignant> expResult = new ArrayList<>();
        Modele instance = new Modele();
        Enseignant e = new Enseignant("ark", "ogun", "61");
        instance.ajoutEns(e);
        expResult.add(e);
        Enseignant e2 = new Enseignant("ark", "ogn", "611");
        instance.ajoutEns(e2);
        expResult.add(e2);
        List<Enseignant> result = instance.tousLesEns();
        for (Enseignant eRech : expResult) {
            if (!result.contains(eRech)) {
                fail("Enseignant n'existe pas dans la liste ? " + eRech);
            }

        }
}
        
        
    }
