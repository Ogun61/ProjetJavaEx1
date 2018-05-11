/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mesclassesCEG.Cours;
import mesclassesCEG.Enseignant;
import myconnections.DBConnection;

/**
 *
 * @author Nugo
 */
public class ModeleJdbc extends Modele {

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
        Statement stm = null;
        ResultSet rs = null;
        try {
            stm = dbconnect.createStatement();
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
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                System.err.println("erreur de fermeture de resultset " + e);
            }
            try {
                if (stm != null) {
                    stm.close();
                }
            } catch (SQLException e) {
                System.err.println("erreur de fermeture de statement " + e);
            }
        }
        return le;
    }

    @Override
    public List<Cours> getEnseignantCours(Enseignant e1) {
        String query = "select C.CODEC,E.NBRHA,C.INTITULEC,V.CODE_GROUPE from COURS  C "
                + "inner join ENSEIGNE E ON C.CODEC = E.CODE_COURS " + " inner join ENSEIGNANT ENS on E.MATRICULE_E = ENS.MATRICULE where ENS.MATRICULE= ? ";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        List<Cours> lc = new ArrayList<>();
        try {
            pstm = dbconnect.prepareStatement(query);
            pstm.setString(1, e1.getMatricule());
            rs = pstm.executeQuery();
            while (rs.next()) {
                String codec = rs.getString(1);
                int nbr = rs.getInt(2);
                String intitulec = rs.getString(3);
                Cours c = new Cours(codec, nbr, intitulec);
                c.assignation(e1);
                lc.add(c);
            }
            return lc;
        } catch (SQLException e) {
            System.err.println("erreur de recherche de cours " + e);
            return null;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                System.err.println("erreur de fermeture de resultset " + e);
            }
            try {
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException e) {
                System.err.println("erreur de fermeture de preparedstatement " + e);
            }
        }

    }

    @Override
    public Enseignant getEnseignant(Enseignant eRech) {

        String query = "select * from Enseignant where MATRICULE= ? ";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        Enseignant el = null;
        try {
            pstm = dbconnect.prepareStatement(query);
            pstm.setString(1, eRech.getMatricule());
            rs = pstm.executeQuery();
            if (rs.next()) {
                String mat = rs.getString(1);
                String nom = rs.getString(2);
                String prenom = rs.getString(3);

                el = new Enseignant(mat, nom, prenom);

            }
        } catch (SQLException e) {
            System.err.println("erreur lors de la recherche de l'enseignant " + e);
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                System.err.println("erreur de fermeture de resultset " + e);
            }
            try {
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException e) {
                System.err.println("erreur de fermeture de preparedstatement " + e);
            }
        }

        return el;
    }

    @Override
    public Cours getCours(Cours xRech) {
        Cours cb = null;
        String query = "semect * from cours where codec = ?";
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            pstm = dbconnect.prepareStatement(query);
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
            System.err.println("erreur de recherche de la classe " + e);
            return null;
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                System.err.println("erreur de fermeture de resultset " + e);
            }
            try {
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException e) {
                System.err.println("erreur de fermeture de preparedstatement " + e);
            }
        }
    }

    @Override
    public String ajoutEns(Enseignant e1) {
        String msg;
        String query = "insert into Enseignant(MATRICULE,NOM,PRENOM) values(?,?,?)";
        PreparedStatement pstm = null;
        try {
            pstm = dbconnect.prepareStatement(query);
            pstm.setString(1, e1.getMatricule());
            pstm.setString(2, e1.getNom());
            pstm.setString(3, e1.getPrenom());

            int n = pstm.executeUpdate();
            if (n == 1) {
                msg = "ajout enseignant effectué";
            } else {
                msg = "ajout enseignant non effectué";
            }
        } catch (SQLException e) {
            msg = "erreur lors de l'ajout du client " + e;
        } finally {

            try {
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException e) {
                System.err.println("erreur de fermeture de preparedstatement " + e);
            }
        }
        return msg;
    }

    @Override
    public String ajoutCours(Cours c) {
        String msg;
        String query = "insert into Cours(codec,nbrha,intitulex) values(?,?,?)";
        PreparedStatement pstm = null;
        try {
            pstm = dbconnect.prepareStatement(query);
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
        } finally {

            try {
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException e) {
                System.err.println("erreur de fermeture de preparedstatement " + e);
            }
        }
        return msg;
    }

    @Override
    public String suppEns(Enseignant e1) {
        String query = "DELETE FROM ENSEIGNANT WHERE MATRICULE = ? ";
        PreparedStatement pstm = null;
        String msg;
        try {
            pstm = dbconnect.prepareStatement(query);
            pstm.setString(1, e1.getMatricule());
            int n = pstm.executeUpdate();
            if (n == 1) {
                msg = "Suppression effectuée ";
            } else {
                msg = "Suppression non effectuée";
            }

        } catch (SQLException e) {
            msg = "erreur lors de la suppression " + e;
        } finally {

            try {
                if (pstm != null) {
                    pstm.close();
                }
            } catch (SQLException e) {
                msg = "erreur de fermeture de preparedstatement " + e;
            }

        }
        return msg;
    }

}
