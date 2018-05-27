package projetJavaEx1.vue.graph;

import java.awt.Color;
import javax.swing.JOptionPane;
import projetJavaEx1.mesclassesCEG.Cours;
import projetJavaEx1.mesclassesCEG.Enseignant;
import projetJavaEx1.modele.*;

/**
 *
 * @author ogun.ark
 */
public class asgnCours extends javax.swing.JPanel {

    private ModeleJdbc m;

    public asgnCours() {
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

        jmat = new javax.swing.JLabel();
        tfmat = new javax.swing.JTextField();
        btclear = new javax.swing.JButton();
        javax.swing.JButton btok = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jcodec = new javax.swing.JLabel();
        tfcodec = new javax.swing.JTextField();

        setBackground(new java.awt.Color(102, 102, 102));

        jmat.setText("Matricule enseignant :");

        tfmat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfmatActionPerformed(evt);
            }
        });

        btclear.setText("CLEAR");
        btclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btclearActionPerformed(evt);
            }
        });

        btok.setText("Assigner");
        btok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btokActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(218, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel15.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/projetJavaEx1/vue/graph/Images/group_52px_1.png"))); // NOI18N
        jLabel15.setText("Cours");

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
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jcodec.setText("Code cours :");

        tfcodec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfcodecActionPerformed(evt);
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
                        .addComponent(jmat, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                        .addGap(48, 48, 48)
                        .addComponent(tfmat, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jcodec, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                        .addGap(48, 48, 48)
                        .addComponent(tfcodec, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btclear, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                        .addGap(48, 48, 48)
                        .addComponent(btok, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcodec, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfcodec, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jmat, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfmat, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btclear, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btok, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btokActionPerformed
        tfcodec.setBackground(Color.white);
        tfmat.setBackground(Color.white);

        boolean erreur = false;

        String code = tfcodec.getText();
        if (code.trim().equals("")) {
            erreur = true;
            tfcodec.setBackground(Color.ORANGE);
        }

        String matricule = tfmat.getText();
        if (matricule.trim().equals("")) {
            erreur = true;
            tfmat.setBackground(Color.ORANGE);
        }

        if (!erreur) {
            Cours crsRech = null;
            Cours.CoursBuilder c = new Cours.CoursBuilder();
            c.setCodec(code);
            try {
                crsRech = c.build();

            } catch (Exception e) {
                System.out.println("Erreur de création du cours" + e);
            }

            Cours cours = m.getCours(crsRech);

            Enseignant ensRech = new Enseignant(matricule);
            Enseignant enseignant = m.getEnseignant(ensRech);

            if (cours != null || enseignant != null) {
                String msg = m.assignation(cours, enseignant);
                JOptionPane.showMessageDialog(this, msg, "Résultat", JOptionPane.INFORMATION_MESSAGE);
            } else if (cours == null || enseignant == null) {

                JOptionPane.showMessageDialog(this, "Cours ou enseignant introuvable", "Résultat",
                        JOptionPane.ERROR_MESSAGE);

            } else {
                if (erreur) {
                    JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs", "Erreur", JOptionPane.ERROR_MESSAGE);
                }

            }
        }


    }//GEN-LAST:event_btokActionPerformed

    private void btclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btclearActionPerformed
        tfmat.setText("");
        tfmat.setBackground(Color.white);
        tfcodec.setText("");
        tfcodec.setBackground(Color.white);

    }//GEN-LAST:event_btclearActionPerformed

    private void tfmatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfmatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfmatActionPerformed

    private void tfcodecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfcodecActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfcodecActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btclear;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jcodec;
    private javax.swing.JLabel jmat;
    private javax.swing.JTextField tfcodec;
    private javax.swing.JTextField tfmat;
    // End of variables declaration//GEN-END:variables

}
