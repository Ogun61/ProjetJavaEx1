package projetjavaex1;
import java.util.*;

public class Cours {
 
    private String codec;

  
    private int nbrha;

    private String intitulec;

    private List<Groupe> code_groupe = new ArrayList<>();

    /**
     * @param codec
     * @param nbrha
     * @param intitulec
     */
    public Cours(String codec, int nbrha, String intitulec) {
        this.codec=codec;
        this.nbrha=nbrha;
        this.intitulec=intitulec;
        
        
    }

    public String getCodec() {
        return codec;
    }

    public void setCodec(String codec) {
        this.codec = codec;
    }

    public int getNbrha() {
        return nbrha;
    }

    public void setNbrha(int nbrha) {
        this.nbrha = nbrha;
    }

    public String getIntitulec() {
        return intitulec;
    }

    public void setIntitulec(String intitulec) {
        this.intitulec = intitulec;
    }

    public List<Groupe> getCode_groupe() {
        return code_groupe;
    }

    public void setCode_groupe(List<Groupe> code_groupe) {
        this.code_groupe = code_groupe;
    }

  
}