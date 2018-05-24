/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetJavaEx1.modele;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import projetJavaEx1.mesclassesCEG.Cours;
import projetJavaEx1.mesclassesCEG.Enseignant;
import projetJavaEx1.mesclassesCEG.Groupe;
import myconnections.DBConnection;

/**
 *
 * @author Nugo
 */
public class ModeleJdbc extends Modele {
     private static ModeleJdbc instance = null;
        public static ModeleJdbc getInstance() {
        if (instance == null) {
            return instance = new ModeleJdbc();
        } else {
            return instance;
        }
}

    Connection dbconnect;

    public ModeleJdbc() {
        dbconnect = DBConnection.getConnection();
        if (dbconnect == null) {
            System.err.println("erreur de connexion => arrêt du pgm");
            System.exit(1);
        }
    }

    public void close() {
        try {
            dbconnect.close();
        } catch (Exception e) {
            System.err.println("erreur lors de la fermeture de la connexion " + e);
        }
    }

    @Override
    public List<Enseignant> tousLesEnseignant() {
        String critere = "ORDER BY MATRICULE,NOM,PRENOM";

        String query = "select * from ENSEIGNANT " + critere;
        List<Enseignant> le = new ArrayList<>();
        ResultSet rs = null;
        try(Statement stm = dbconnect.createStatement();) {
            
            rs = stm.executeQuery(query);
            while (rs.next()) {
                String mat = rs.getString(1);
                String nom = rs.getString(2);
                String prenom = rs.getString(3);

                Enseignant e = new Enseignant(mat, nom, prenom);

                le.add(e);
            }
        } catch (SQLException e) {
            System.err.println("erreur lors de la recherche des enseignants " + e);
        }
        return le;
    }

    @Override
    public List<Groupe> tousLesGroupe() {
        String query = "select * from groupe order by codegr ";
        List<Groupe> lg = new ArrayList<>();
        
        ResultSet rs = null;
        try(Statement stm = dbconnect.createStatement();) {
            
            rs = stm.executeQuery(query);
            while (rs.next()) {
                String codegr = rs.getString(1);
                String intitule = rs.getString(2);
                String niveau = rs.getString(3);

                Groupe g = new Groupe(codegr, intitule, niveau);

                lg.add(g);
            }
        } catch (SQLException e) {
            System.err.println("erreur lors de la recherche des groupes " + e);
        } 
        return lg;
    }

    @Override
    public List<Cours> tousLesCrs() {

        String query = "select * from cours order by codec";
        List<Cours> lc = new ArrayList<>();
        
        ResultSet rs = null;
        try(Statement stm = dbconnect.createStatement();) {
           
            rs = stm.executeQuery(query);
            while (rs.next()) {
                String codec = rs.getString(1);
                int nbrha = rs.getInt(2);
                String intitule = rs.getString(3);
                Cours cours = null;

                Cours.CoursBuilder c = new Cours.CoursBuilder();
                c.setCodec(codec).setNbrha(nbrha).setIntitulec(intitule);
                try {
                    cours = c.build();

                } catch (Exception e) {
                    System.out.println("Erreur de création" + e);
                }

                lc.add(cours);
            }
        } catch (SQLException e) {
            System.err.println("erreur lors de la recherche du cours " + e);
        }
        return lc;
    }

    @Override
    public List<Cours> getEnseignantCours(Enseignant e1) {

        String query = "select C.CODEC,C.NBRHA,C.INTITULEC from COURS C "
                + "inner join ENSEIGNE E ON C.CODEC = E.CODE_COURS " + " inner join ENSEIGNANT ENS on E.MATRICULE_E = ENS.MATRICULE where ENS.MATRICULE= ? ";

        ResultSet rs = null;
        List<Cours> lc = new ArrayList<>();
        String matricule = e1.getMatricule();
        try (PreparedStatement pstm = dbconnect.prepareStatement(query);) {

            pstm.setString(1, matricule);
            rs = pstm.executeQuery();
            while (rs.next()) {
                String codec = rs.getString(1);
                int nbr = rs.getInt(2);
                String intitulec = rs.getString(3);
                Cours cours = null;
                Cours.CoursBuilder c = new Cours.CoursBuilder();
                c.setCodec(codec).setNbrha(nbr).setIntitulec(intitulec);
                try {
                    cours = c.build();
                } catch (Exception e) {
                    System.out.println("Erreur de création" + e);
                }
                /*System.out.println("code du cours : " + codec);
                System.out.println("nombre d'heure : " + nbr);
                System.out.println("intitule :" + intitulec);
                */
                cours.assignation(e1);
                lc.add(cours);
            }
        } catch (SQLException e) {
            System.err.println("erreur lors de la recherche du cours " + e);
            return null;
        }
        return lc;

    }

    @Override
    public List<Cours> getGroupeCours(Groupe g) {
        Cours cb = null;
        String query = "select C.CODEC,C.NBRHA,C.INTITULEC from COURS  C "
                + "inner join groupe g ON c.code_groupe = g.codegr where g.codegr = ? ";

        ResultSet rs = null;
        List<Cours> lc = new ArrayList<>();
        try (PreparedStatement pstm = dbconnect.prepareStatement(query);) {

            pstm.setString(1, g.getCodegr());
            rs = pstm.executeQuery();
            while (rs.next()) {
                String codec = rs.getString(1);
                int nbr = rs.getInt(2);
                String intitulec = rs.getString(3);
                Cours.CoursBuilder c = new Cours.CoursBuilder();
                c.setCodec(codec).setNbrha(nbr).setIntitulec(intitulec);
                try {
                    cb = c.build();
                } catch (Exception e) {
                    System.out.println("Erreur de création" + e);
                }
                cb.appartient(g);
                lc.add(cb);
            }
            return lc;
        } catch (SQLException e) {
            System.err.println("erreur de recherche de cours " + e);
            return null;
        }

    }

    @Override
    public Enseignant getEnseignant(Enseignant eRech) {

        String query = "select * from Enseignant where MATRICULE= ? ";

        ResultSet rs = null;
        Enseignant el = null;
        try (PreparedStatement pstm = dbconnect.prepareStatement(query);) {

            pstm.setString(1, eRech.getMatricule());
            rs = pstm.executeQuery();
            if (rs.next()) {
                String mat = rs.getString(1);
                String nom = rs.getString(2);
                String prenom = rs.getString(3);

                el = new Enseignant(nom, prenom, mat);

            }
        } catch (SQLException e) {
            System.err.println("erreur lors de la recherche de l'enseignant " + e);
        }

        return el;
    }

    @Override
    public Groupe getGroupe(Groupe gRech) {

        String query = "select * from groupe where codegr= ? ";

        ResultSet rs = null;
        Groupe g = null;
        try (PreparedStatement pstm = dbconnect.prepareStatement(query);) {

            pstm.setString(1, gRech.getCodegr());
            rs = pstm.executeQuery();
            if (rs.next()) {
                String codegr = rs.getString(1);
                String intitule = rs.getString(2);
                String niveau = rs.getString(3);
                g = new Groupe(codegr, intitule, niveau);

            }
        } catch (SQLException e) {
            System.err.println("erreur lors de la recherche du groupe " + e);
        }

        return g;
    }

    @Override
    public Cours getCours(Cours xRech) {
        Cours cb = null;
        String query = "select * from cours where codec = ?";

        ResultSet rs = null;
        try (PreparedStatement pstm = dbconnect.prepareStatement(query);) {

            pstm.setString(1, xRech.getCodec());
            rs = pstm.executeQuery();
            if (rs.next()) {
                String codec = rs.getString(1);
                int nbrh = rs.getInt(2);
                String intitulec = rs.getString(3);
                Cours.CoursBuilder c = new Cours.CoursBuilder();
                c.setCodec(codec).setNbrha(nbrh).setIntitulec(intitulec);
                try {
                    cb = c.build();
                } catch (Exception e) {
                    System.out.println("Erreur de création" + e);
                }
                return cb;
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.err.println("erreur lors de la recherche du cours " + e);
            return null;
        }
    }

    @Override
    public String ajoutEns(Enseignant e1) {
        String msg;
        String query = "insert into Enseignant(MATRICULE,NOM,PRENOM) values(?,?,?)";

        try (PreparedStatement pstm = dbconnect.prepareStatement(query);) {

            String mat= e1.getMatricule();
            String nom= e1.getNom();
            String prenom= e1.getPrenom();
            pstm.setString(1, mat);
            pstm.setString(2, nom);
            pstm.setString(3, prenom);

            int n = pstm.executeUpdate();
            if (n == 1) {
                msg = "ajout enseignant effectué";
            } else {
                msg = "ajout enseignant non effectué";
            }
        } catch (SQLException e) {
            msg = "erreur lors de l'ajout de l'enseignant " + e;
        }
        return msg;
    }

    @Override
    public String ajoutCours(Cours c) {
        String msg;
        String query = "insert into Cours(codec,nbrha,intitulec) values(?,?,?)";

        try (PreparedStatement pstm = dbconnect.prepareStatement(query);) {

            pstm.setString(1, c.getCodec());
            pstm.setInt(2, c.getNbrha());
            pstm.setString(3, c.getIntitulec());
            int n = pstm.executeUpdate();
            if (n == 1) {
                msg = "Ajout du cours effectué";
            } else {
                msg = "Ajout cours non effectué ";
            }
        } catch (SQLException e) {
            msg = "erreur lors de l'ajout du cours" + e;
        }
        return msg;
    }

    @Override
    public String ajoutGroupe(Groupe g) {
        String msg;
        String query = "insert into Groupe(codegr,intitulegr,niveau) values(?,?,?)";

        try (PreparedStatement pstm = dbconnect.prepareStatement(query);) {

            pstm.setString(1, g.getCodegr());
            pstm.setString(2, g.getIntitulegr());
            pstm.setString(3, g.getNiveau());

            int n = pstm.executeUpdate();
            if (n == 1) {
                msg = "ajout groupe effectué";
            } else {
                msg = "ajout groupe non effectué";
            }
        } catch (SQLException e) {
            msg = "erreur lors de l'ajout du groupe " + e;
        }
        return msg;
    }

    @Override
    public String suppGrp(Groupe g) {
        String query = "DELETE FROM GROUPE WHERE CODEGR = ? ";

        String msg;
        try (PreparedStatement pstm = dbconnect.prepareStatement(query);) {

            pstm.setString(1, g.getCodegr());
            int n = pstm.executeUpdate();
            if (n == 1) {
                msg = "Suppression effectuée ";
            } else {
                msg = "Suppression non effectuée";
            }

        } catch (SQLException e) {
            msg = "erreur lors de la suppression " + e;
        }
        return msg;
    }

    @Override
    public String modifGrp(Groupe nvGrp, Groupe tmp) {

        String query = "update groupe set codegr = ?, intitulegr = ? , niveau = ? where codegr = ?";

        ResultSet rs = null;
        String msg;
        String codegr = nvGrp.getCodegr();
        String intitulegr = nvGrp.getIntitulegr();
        String niveau = nvGrp.getNiveau();

        try (PreparedStatement pstm = dbconnect.prepareStatement(query);) {

            pstm.setString(1, codegr);
            pstm.setString(2, intitulegr);
            pstm.setString(3, niveau);
            pstm.setString(5, tmp.getCodegr());
            int nl = pstm.executeUpdate();
            if (nl == 1) {
                msg = "changement groupe effectué";
            } else {
                msg = "changement groupe non effectué";
            }

        } catch (SQLIntegrityConstraintViolationException pk) {
            return "Erreur de clé primaire" + pk;
        } catch (SQLException e) {
            msg = "erreur lors de la modification du groupe " + e;
        }
        return msg;
    }

    @Override
    public String suppEns(Enseignant e1) {
        String query = "DELETE FROM ENSEIGNANT WHERE MATRICULE = ? ";

        String msg;
        try (PreparedStatement pstm = dbconnect.prepareStatement(query);) {

            pstm.setString(1, e1.getMatricule());
            int n = pstm.executeUpdate();
            if (n == 1) {
                msg = "Suppression effectuée ";
            } else {
                msg = "Suppression non effectuée";
            }

        } catch (SQLException e) {
            msg = "erreur lors de la suppression " + e;
        }
        return msg;
    }

    @Override
    public String suppCours(Cours c) {
        String query = "delete from cours where codec = ? ";

        String msg;
        try (PreparedStatement pstm = dbconnect.prepareStatement(query);) {

            pstm.setString(1, c.getCodec());
            int n = pstm.executeUpdate();
            if (n == 1) {
                msg = "Suppression effectuée ";
            } else {
                msg = "Suppression non effectuée";
            }

        } catch (SQLException e) {
            msg = "erreur lors de la suppression " + e;
        }
        return msg;
    }

    @Override
    public String modifCours(Cours nvCours, Cours tmp) {
        boolean flag;

        String query = "update cours set codec= ?, nbrha = ? , intitulec = ? where codec = ?";
        ResultSet rs = null;
        String msg;
        String codec = nvCours.getCodec();
        int nbrha = nvCours.getNbrha();
        String intitulec = nvCours.getIntitulec();
        do {
            try (PreparedStatement pstm = dbconnect.prepareStatement(query);) {
                pstm.setString(1, codec);
                pstm.setInt(2, nbrha);
                pstm.setString(3, intitulec);
                pstm.setString(4, tmp.getCodec());
                int n = pstm.executeUpdate();
                if (n == 1) {
                    msg = "changement du cours effectué";
                    flag = false;
                } else {
                    flag = true;
                    msg = "changement du cours non effectué";
                }

            } catch (SQLIntegrityConstraintViolationException pk) {
                return "Erreur de PK (" + pk + ")";
            } catch (SQLException e) {
                msg = "erreur lors du changement du cours " + e;
            }
            return msg;
        } while (flag);
    }

    @Override
    public String suppCoursEns(Cours c) {
        String query = "delete from enseigne where code_cours = ? ";
        String msg;
        try (PreparedStatement pstm = dbconnect.prepareStatement(query);) {

            pstm.setString(1, c.getCodec());
            int n = pstm.executeUpdate();
            if (n == 1) {
                msg = "Suppression effectuée ";
            } else {
                msg = "Suppression non effectuée";
            }

        } catch (SQLException e) {
            msg = "erreur lors de la suppression " + e;
        }
        return msg;
    }

    @Override
    public String suppCoursGrp(Cours c) {
        String query = "update cours set code_groupe=null where codec = ? ";
        String msg;
        try (PreparedStatement pstm = dbconnect.prepareStatement(query);) {

            pstm.setString(1, c.getCodec());
            int n = pstm.executeUpdate();
            if (n == 1) {
                msg = "Suppression effectuée ";
            } else {
                msg = "Suppression non effectuée";
            }

        } catch (SQLException e) {
            msg = "erreur lors de la suppression " + e;
        }
        return msg;
    }

    @Override
    public String modifEns(Enseignant nvEns, Enseignant tmp) {

        String query = "update enseignant set matricule = ?, nom = ? , prenom = ? where matricule = ?";

        ResultSet rs = null;
        String msg;
        String matricule = nvEns.getMatricule();
        String nom = nvEns.getNom();
        String prenom = nvEns.getPrenom();

        try (PreparedStatement pstm = dbconnect.prepareStatement(query);) {

            pstm.setString(1, matricule);
            pstm.setString(2, nom);
            pstm.setString(3, prenom);
            pstm.setString(4, tmp.getMatricule());
            int nl = pstm.executeUpdate();
            if (nl == 1) {
                msg = "changement de l'enseignant effectué";
            } else {
                msg = "changement de l'enseignant non effectué";
            }

        } catch (SQLIntegrityConstraintViolationException pk) {
            return "Erreur de clé primaire, cette enseignant possède au moins. " + pk;
        } catch (SQLException e) {
            msg = "erreur lors de la modification de l'enseignant  " + e;
        }
        return msg;
    }

    @Override
    public String assignation(Cours c, Enseignant e1) {
        super.assignation(c, e1);
        String msg;
        String query = "insert into enseigne(matricule_e,code_cours) values(?,?)";

        try (PreparedStatement pstm = dbconnect.prepareStatement(query);) {

            pstm.setString(1, e1.getMatricule());
            pstm.setString(2, c.getCodec());

            int nl = pstm.executeUpdate();
            if (nl == 1) {
                msg = "assignation de l'enseignant effectué";
            } else {
                msg = "assignation de l'enseignant non effectué";
            }
        } catch (SQLException e) {
            msg = "erreur lors de l'assignation du cours " + e;
        }
        return msg;
    }

    @Override
    public String appartient(Cours c, Groupe g) {
        super.appartient(c, g);
        String msg;
        String query = "update cours set code_groupe= ? where codec= ?";

        try (PreparedStatement pstm = dbconnect.prepareStatement(query);) {

            pstm.setString(1, g.getCodegr());
            pstm.setString(2, c.getCodec());
            int nl = pstm.executeUpdate();
            if (nl == 1) {
                msg = "assignation du groupe effectué";
            } else {
                msg = "assignation du groupe non effectué";
            }
        } catch (SQLException e) {
            msg = "erreur lors de l'assignation du cours " + e;
        }
        return msg;
    }

}
