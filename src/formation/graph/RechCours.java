/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formation.graph;

import formation.DAO.CoursDAO;
import formation.metier.Cours;
import javax.swing.JOptionPane;

/**
 *
 * @author donof
 */
public class RechCours extends javax.swing.JPanel {

    /**
     * Creates new form RechCours
     */
    CoursDAO coursDAO = null;
    Cours crs = null;

    public RechCours() {
        initComponents();
    }

    public void setCoursDAO(CoursDAO coursDAO) {
        this.coursDAO = coursDAO;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelIdcours = new javax.swing.JLabel();
        labelMatiere = new javax.swing.JLabel();
        labelHeures = new javax.swing.JLabel();
        txtIdcours = new javax.swing.JTextField();
        txtMatiere = new javax.swing.JTextField();
        txtHeures = new javax.swing.JTextField();
        btnRech = new javax.swing.JButton();
        btnMaj = new javax.swing.JButton();
        btnEff = new javax.swing.JButton();

        labelIdcours.setText("Id du cours");

        labelMatiere.setText("Matière");

        labelHeures.setText("Heures");

        txtIdcours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdcoursActionPerformed(evt);
            }
        });

        txtMatiere.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMatiereActionPerformed(evt);
            }
        });

        btnRech.setText("Rechercher");
        btnRech.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRechActionPerformed(evt);
            }
        });

        btnMaj.setText("Màj");
        btnMaj.setToolTipText("");
        btnMaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMajActionPerformed(evt);
            }
        });

        btnEff.setText("Effacer");
        btnEff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEffActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelIdcours)
                                .addGap(115, 115, 115))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelHeures)
                                    .addComponent(labelMatiere))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtIdcours)
                            .addComponent(txtMatiere, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                            .addComponent(txtHeures))
                        .addGap(117, 117, 117))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRech)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                        .addComponent(btnMaj)
                        .addGap(52, 52, 52)
                        .addComponent(btnEff)
                        .addGap(47, 47, 47))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelIdcours)
                    .addComponent(txtIdcours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMatiere)
                    .addComponent(txtMatiere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHeures)
                    .addComponent(txtHeures, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRech)
                    .addComponent(btnMaj)
                    .addComponent(btnEff))
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdcoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdcoursActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdcoursActionPerformed

    private void txtMatiereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatiereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatiereActionPerformed

    private void btnMajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMajActionPerformed
        try {
            int idCours = Integer.parseInt(txtIdcours.getText());
            String matiere = txtMatiere.getText();
            int heures = Integer.parseInt(txtHeures.getText());
            crs = new Cours(idCours, matiere, heures);
            coursDAO.update(crs);
            JOptionPane.showMessageDialog(this, "cours mis à jour", "succès", JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "ERREUR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnMajActionPerformed

    private void btnRechActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRechActionPerformed
        try {
            int idCours = Integer.parseInt(txtIdcours.getText());
            crs = coursDAO.read(idCours);
            txtMatiere.setText(crs.getMatiere());
            txtHeures.setText("" + crs.getHeures());
            JOptionPane.showMessageDialog(this, "cours trouvé", "succès", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "ERREUR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRechActionPerformed

    private void btnEffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEffActionPerformed
        try {
            int idCours = Integer.parseInt(txtIdcours.getText());
            coursDAO.delete(crs);
            txtMatiere.setText("");
            txtHeures.setText("");
            JOptionPane.showMessageDialog(this, "cours effacé", "succès", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "ERREUR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEffActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEff;
    private javax.swing.JButton btnMaj;
    private javax.swing.JButton btnRech;
    private javax.swing.JLabel labelHeures;
    private javax.swing.JLabel labelIdcours;
    private javax.swing.JLabel labelMatiere;
    private javax.swing.JTextField txtHeures;
    private javax.swing.JTextField txtIdcours;
    private javax.swing.JTextField txtMatiere;
    // End of variables declaration//GEN-END:variables
}