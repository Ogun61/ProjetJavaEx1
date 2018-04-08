package projetjavaex1;
import java.util.*;

/**
 * 
 */
public class Groupe {

    /**
     * Default constructor
     */
    public Groupe() {
        codegr="";
        intitulegr="";
        niveau="";
    }
    public Groupe(String codegr, String intitulegr, String niveau){
        this.codegr=codegr;
        this.intitulegr=intitulegr;
        this.niveau=niveau;
        
    }

    /**
     * 
     */
    private String codegr;

    /**
     * 
     */
    private String intitulegr;

    /**
     * 
     */
    private String niveau;

    public String getCodegr() {
        return codegr;
    }

    public void setCodegr(String codegr) {
        this.codegr = codegr;
    }

    public String getIntitulegr() {
        return intitulegr;
    }

    public void setIntitulegr(String intitulegr) {
        this.intitulegr = intitulegr;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.codegr);
        hash = 83 * hash + Objects.hashCode(this.intitulegr);
        hash = 83 * hash + Objects.hashCode(this.niveau);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Groupe other = (Groupe) obj;
        if (!Objects.equals(this.codegr, other.codegr)) {
            return false;
        }
        if (!Objects.equals(this.intitulegr, other.intitulegr)) {
            return false;
        }
        if (!Objects.equals(this.niveau, other.niveau)) {
            return false;
        }
        return true;
    }


  

}