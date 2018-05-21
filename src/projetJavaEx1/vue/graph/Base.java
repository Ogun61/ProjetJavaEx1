
package projetJavaEx1.vue.graph;

import java.awt.CardLayout;
import java.awt.Color;
import projetJavaEx1.modele.*;

/**
 *
 * @author ogun.ark
 */
public class Base extends javax.swing.JFrame {

    public Base() {
        initComponents();
        this.setBackground(Color.RED);
        //Pour cette partie Guillaume m'a expliqué comment faire pour utiliser le modeleJdbc. Par exemple, pour faire l'ajout d'un enseignant dans la BD.
        Modele m = ModeleJdbc.getInstance();
        ajoutEnseignant1.setModele(m);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        accueil = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ajoutEnseignant1 = new projetJavaEx1.vue.graph.ajoutEnseignant();
        ajGroupe1 = new projetJavaEx1.vue.graph.ajGroupe();
        ajtCours1 = new projetJavaEx1.vue.graph.ajtCours();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuAjout = new javax.swing.JMenu();
        ajoutEnseignant = new javax.swing.JMenuItem();
        ajoutCours = new javax.swing.JMenuItem();
        ajoutGroupe = new javax.swing.JMenuItem();
        MenuModif = new javax.swing.JMenu();
        modifEnseignant = new javax.swing.JMenuItem();
        modifCours = new javax.swing.JMenuItem();
        modifGroupe = new javax.swing.JMenuItem();
        affichage = new javax.swing.JMenu();
        affListe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 153, 102));
        getContentPane().setLayout(new java.awt.CardLayout());

        accueil.setLayout(new java.awt.GridLayout(1, 5, 4, 2));

        jPanel2.setBackground(new java.awt.Color(218, 0, 0));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 90));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetJavaEx1/vue/graph/Images/LOGO_HEPH-CONDORCET.png"))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(111, 193, 174));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bienvenu !");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 79, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 235, Short.MAX_VALUE))
        );

        accueil.add(jPanel2);

        getContentPane().add(accueil, "card4");
        getContentPane().add(ajoutEnseignant1, "card3");
        getContentPane().add(ajGroupe1, "card5");
        getContentPane().add(ajtCours1, "card6");

        MenuAjout.setText("Ajout");

        ajoutEnseignant.setText("Enseignant");
        ajoutEnseignant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutEnseignantActionPerformed(evt);
            }
        });
        MenuAjout.add(ajoutEnseignant);

        ajoutCours.setText("Cours");
        ajoutCours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutCoursActionPerformed(evt);
            }
        });
        MenuAjout.add(ajoutCours);

        ajoutGroupe.setText("Groupe");
        ajoutGroupe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajoutGroupeActionPerformed(evt);
            }
        });
        MenuAjout.add(ajoutGroupe);

        jMenuBar1.add(MenuAjout);

        MenuModif.setText("Edition");

        modifEnseignant.setText("Enseignants");
        modifEnseignant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifEnseignantActionPerformed(evt);
            }
        });
        MenuModif.add(modifEnseignant);

        modifCours.setText("Cours");
        modifCours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifCoursActionPerformed(evt);
            }
        });
        MenuModif.add(modifCours);

        modifGroupe.setText("Groupe");
        modifGroupe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifGroupeActionPerformed(evt);
            }
        });
        MenuModif.add(modifGroupe);

        jMenuBar1.add(MenuModif);

        affichage.setText("Affichages");

        affListe.setText("Affichage");
        affListe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                affListeActionPerformed(evt);
            }
        });
        affichage.add(affListe);

        jMenuBar1.add(affichage);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modifEnseignantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifEnseignantActionPerformed

    }//GEN-LAST:event_modifEnseignantActionPerformed

    private void modifCoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifCoursActionPerformed

    }//GEN-LAST:event_modifCoursActionPerformed

    private void affListeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_affListeActionPerformed

    }//GEN-LAST:event_affListeActionPerformed

    private void ajoutEnseignantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutEnseignantActionPerformed
        CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
        cardLayout.show(this.getContentPane(), "card3");
    }//GEN-LAST:event_ajoutEnseignantActionPerformed

    private void ajoutCoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutCoursActionPerformed
        CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
        cardLayout.show(this.getContentPane(), "card6");
    }//GEN-LAST:event_ajoutCoursActionPerformed

    private void ajoutGroupeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajoutGroupeActionPerformed
        CardLayout cardLayout = (CardLayout) getContentPane().getLayout();
        cardLayout.show(this.getContentPane(), "card5");
    }//GEN-LAST:event_ajoutGroupeActionPerformed

    private void modifGroupeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifGroupeActionPerformed

    }//GEN-LAST:event_modifGroupeActionPerformed

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        int xx = evt.getX();
        int xy = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        int xx = 0;
        int xy = 0;
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_jPanel2MouseDragged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Base().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuAjout;
    private javax.swing.JMenu MenuModif;
    private javax.swing.JPanel accueil;
    private javax.swing.JMenuItem affListe;
    private javax.swing.JMenu affichage;
    private projetJavaEx1.vue.graph.ajGroupe ajGroupe1;
    private javax.swing.JMenuItem ajoutCours;
    private javax.swing.JMenuItem ajoutEnseignant;
    private projetJavaEx1.vue.graph.ajoutEnseignant ajoutEnseignant1;
    private javax.swing.JMenuItem ajoutGroupe;
    private projetJavaEx1.vue.graph.ajtCours ajtCours1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem modifCours;
    private javax.swing.JMenuItem modifEnseignant;
    private javax.swing.JMenuItem modifGroupe;
    // End of variables declaration//GEN-END:variables
}
