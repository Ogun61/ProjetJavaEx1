package projetJavaEx1.vue.graph;

import java.awt.Color;
import javax.swing.JOptionPane;
import projetJavaEx1.modele.*;
import projetJavaEx1.mesclassesCEG.Groupe;

/**
 *
 * @author ogun.ark
 */
public class modifGroupe extends javax.swing.JPanel {

    private ModeleJdbc m;

    public modifGroupe() {
        initComponents();
    }

    public void setModele(ModeleJdbc m) {
        this.m = m;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        janccode = new javax.swing.JLabel();
        tfanccode = new javax.swing.JTextField();
        jnvintitule = new javax.swing.JLabel();
        tfnvintitule = new javax.swing.JTextField();
        jnvniveau = new javax.swing.JLabel();
        tfnvniveau = new javax.swing.JTextField();
        jnvcode = new javax.swing.JLabel();
        tfnvcode = new javax.swing.JTextField();
        btok = new javax.swing.JButton();
        jbtclear = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(218, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetJavaEx1/vue/graph/Images/group_52px_1.png"))); // NOI18N
        jLabel15.setText("Groupe");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel15)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        janccode.setText("Ancien code :");

        tfanccode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfanccodeActionPerformed(evt);
            }
        });

        jnvintitule.setText("Nouveau intitulé :");

        tfnvintitule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnvintituleActionPerformed(evt);
            }
        });

        jnvniveau.setText("Nouveau niveau :");

        tfnvniveau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnvniveauActionPerformed(evt);
            }
        });

        jnvcode.setText("Nouveau code :");

        tfnvcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnvcodeActionPerformed(evt);
            }
        });

        btok.setText("Modifier");
        btok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btokActionPerformed(evt);
            }
        });

        jbtclear.setText("CLEAR");
        jbtclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtclearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbtclear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(25, 25, 25))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jnvcode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfnvcode)
                            .addComponent(btok, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jnvniveau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jnvintitule, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(janccode, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfanccode, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                            .addComponent(tfnvintitule)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 351, Short.MAX_VALUE)
                        .addComponent(tfnvniveau, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(janccode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfanccode, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jnvintitule, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfnvintitule))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jnvniveau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfnvniveau, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jnvcode, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfnvcode, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtclear, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btok, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfanccodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfanccodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfanccodeActionPerformed

    private void tfnvintituleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnvintituleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnvintituleActionPerformed

    private void tfnvniveauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnvniveauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnvniveauActionPerformed

    private void tfnvcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnvcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnvcodeActionPerformed

    private void btokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btokActionPerformed
        tfanccode.setBackground(Color.white);
        tfnvcode.setBackground(Color.white);
        tfnvintitule.setBackground(Color.white);
        tfnvniveau.setBackground(Color.white);

        boolean erreur = false;

        String anccode = tfanccode.getText();
        if (anccode.trim().equals("")) {
            erreur = true;
            tfanccode.setBackground(Color.ORANGE);
        }
        String nvcode = tfnvcode.getText();
        if (nvcode.trim().equals("")) {
            erreur = true;
            tfnvcode.setBackground(Color.ORANGE);
        }
        String nvintitule = tfnvintitule.getText();
        if (nvintitule.trim().equals("")) {
            erreur = true;
            tfnvintitule.setBackground(Color.ORANGE);
        }
        String nvniveau = tfnvniveau.getText();
        if (nvniveau.trim().equals("")) {
            erreur = true;
            tfnvniveau.setBackground(Color.ORANGE);
        }

        if (!erreur) {
            Groupe grpRech = new Groupe(anccode);
            Groupe groupe = m.getGroupe(grpRech);

            Groupe nvgrp = new Groupe(nvcode, nvintitule, nvniveau);

            String msg = m.modifGrp(nvgrp, groupe);
            JOptionPane.showMessageDialog(this, msg, "Résultat", JOptionPane.INFORMATION_MESSAGE);

            if (groupe == null) {

                JOptionPane.showMessageDialog(this, "Groupe introuvable", "Résultat",
                        JOptionPane.ERROR_MESSAGE);

            } else {
                if (erreur) {
                    JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs", "Erreur", JOptionPane.ERROR_MESSAGE);
                }

            }
        }
    }//GEN-LAST:event_btokActionPerformed

    private void jbtclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtclearActionPerformed
        tfanccode.setText("");
        tfnvcode.setText("");
        tfnvintitule.setText("");
        tfnvniveau.setText("");
        tfnvintitule.setBackground(Color.white);
        tfanccode.setBackground(Color.white);
        tfnvniveau.setBackground(Color.white);
        tfnvcode.setBackground(Color.white);
    }//GEN-LAST:event_jbtclearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btok;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel janccode;
    private javax.swing.JButton jbtclear;
    private javax.swing.JLabel jnvcode;
    private javax.swing.JLabel jnvintitule;
    private javax.swing.JLabel jnvniveau;
    private javax.swing.JTextField tfanccode;
    private javax.swing.JTextField tfnvcode;
    private javax.swing.JTextField tfnvintitule;
    private javax.swing.JTextField tfnvniveau;
    // End of variables declaration//GEN-END:variables

}
