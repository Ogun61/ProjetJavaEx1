package projetJavaEx1.vue.graph;

import java.awt.Color;
import javax.swing.JOptionPane;
import projetJavaEx1.modele.*;
import projetJavaEx1.mesclassesCEG.Enseignant;

/**
 *
 * @author ogun.ark
 */
public class modifEnseignant extends javax.swing.JPanel {

    private ModeleJdbc m;

    public modifEnseignant() {
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
        jancmat = new javax.swing.JLabel();
        tfancmat = new javax.swing.JTextField();
        jnvnom = new javax.swing.JLabel();
        tfnvnom = new javax.swing.JTextField();
        jnvprenom = new javax.swing.JLabel();
        tfnvprenom = new javax.swing.JTextField();
        jnvmat = new javax.swing.JLabel();
        tfnvmat = new javax.swing.JTextField();
        btok = new javax.swing.JButton();
        jbtclear = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(218, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetJavaEx1/vue/graph/Images/group_52px_1.png"))); // NOI18N
        jLabel15.setText("Enseignant");

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

        jancmat.setText("Ancien matricule :");

        tfancmat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfancmatActionPerformed(evt);
            }
        });

        jnvnom.setText("Nouveau nom :");

        tfnvnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnvnomActionPerformed(evt);
            }
        });

        jnvprenom.setText("Nouveau prénom");

        tfnvprenom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnvprenomActionPerformed(evt);
            }
        });

        jnvmat.setText("Nouveau matricule");

        tfnvmat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnvmatActionPerformed(evt);
            }
        });

        btok.setText("OK");
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
                                .addComponent(jnvmat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(12, 12, 12)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfnvmat)
                            .addComponent(btok, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jnvprenom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jnvnom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jancmat, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfancmat, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                            .addComponent(tfnvnom)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 351, Short.MAX_VALUE)
                        .addComponent(tfnvprenom, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jancmat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfancmat, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jnvnom, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfnvnom))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jnvprenom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfnvprenom, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jnvmat, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfnvmat, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtclear, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btok, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tfancmatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfancmatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfancmatActionPerformed

    private void tfnvnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnvnomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnvnomActionPerformed

    private void tfnvprenomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnvprenomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnvprenomActionPerformed

    private void tfnvmatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnvmatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnvmatActionPerformed

    private void btokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btokActionPerformed
        tfancmat.setBackground(Color.white);
        tfnvmat.setBackground(Color.white);
        tfnvnom.setBackground(Color.white);
        tfnvprenom.setBackground(Color.white);

        boolean erreur = false;

        String ancmatricule = tfancmat.getText();
        if (ancmatricule.trim().equals("")) {
            erreur = true;
            tfancmat.setBackground(Color.ORANGE);
        }
        String nvmat = tfnvmat.getText();
        if (nvmat.trim().equals("")) {
            erreur = true;
            tfnvmat.setBackground(Color.ORANGE);
        }
        String nvnom = tfnvnom.getText();
        if (nvnom.trim().equals("")) {
            erreur = true;
            tfnvnom.setBackground(Color.ORANGE);
        }
        String nvprenom = tfnvprenom.getText();
        if (nvprenom.trim().equals("")) {
            erreur = true;
            tfnvprenom.setBackground(Color.ORANGE);
        }

        if (!erreur) {
            Enseignant ensRech = new Enseignant(ancmatricule);
            Enseignant enseignant = m.getEnseignant(ensRech);

            Enseignant nvens = new Enseignant(nvnom, nvprenom, nvmat);

            String msg = m.modifEns(nvens, enseignant);
            JOptionPane.showMessageDialog(this, msg, "Résultat", JOptionPane.INFORMATION_MESSAGE);

            if (enseignant == null) {

                JOptionPane.showMessageDialog(this, "Enseignant introuvable", "Résultat",
                        JOptionPane.ERROR_MESSAGE);

            } else {
                if (erreur) {
                    JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs", "Erreur", JOptionPane.ERROR_MESSAGE);
                }

            }
        }
    }//GEN-LAST:event_btokActionPerformed

    private void jbtclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtclearActionPerformed
        tfancmat.setText("");
        tfnvmat.setText("");
        tfnvnom.setText("");
        tfnvprenom.setText("");
        tfnvnom.setBackground(Color.white);
        tfancmat.setBackground(Color.white);
        tfnvprenom.setBackground(Color.white);
        tfnvmat.setBackground(Color.white);
    }//GEN-LAST:event_jbtclearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btok;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jancmat;
    private javax.swing.JButton jbtclear;
    private javax.swing.JLabel jnvmat;
    private javax.swing.JLabel jnvnom;
    private javax.swing.JLabel jnvprenom;
    private javax.swing.JTextField tfancmat;
    private javax.swing.JTextField tfnvmat;
    private javax.swing.JTextField tfnvnom;
    private javax.swing.JTextField tfnvprenom;
    // End of variables declaration//GEN-END:variables

}