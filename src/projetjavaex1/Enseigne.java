package projetjavaex1;
import java.util.*;

/**
 * 
 */
public class Enseigne {
    //HashMap<Enseignant,Cours> hmapEnseigne =new HashMap<>();

/*private Enseigne(Enseignant matricule_e,Cours code_cours) {
hmapEnseigne.put(matricule_e,code_cours);
}*/
private Enseignant matricule_e;
private Cours code_cours;
    
public Enseigne(Enseignant matricule_e,Cours code_cours){
    this.matricule_e=matricule_e;
    this.code_cours=code_cours;
}

    public Enseignant getMatricule_e() {
        return matricule_e;
    }

    public void setMatricule_e(Enseignant matricule_e) {
        this.matricule_e = matricule_e;
    }

    public Cours getCode_cours() {
        return code_cours;
    }

    public void setCode_cours(Cours code_cours) {
        this.code_cours = code_cours;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.matricule_e);
        hash = 61 * hash + Objects.hashCode(this.code_cours);
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
        final Enseigne other = (Enseigne) obj;
        if (!Objects.equals(this.matricule_e, other.matricule_e)) {
            return false;
        }
        if (!Objects.equals(this.code_cours, other.code_cours)) {
            return false;
        }
        return true;
    }


   
}