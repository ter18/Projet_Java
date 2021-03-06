/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formation.graph;

import formation.DAO.CoursDAO;
import formation.DAO.SessionCoursDAO;
import formation.metier.Cours;
import formation.metier.SessionCours;
import java.sql.SQLException;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author donof
 */
public class RechCours extends javax.swing.JPanel {

    /**
     * Creates new form RechCours
     */
    CoursDAO coursDAO = null;
    SessionCoursDAO sessioncoursDAO = null;
    Cours crs = null;
    int idCours = 0;
    DefaultTableModel dft1 = new DefaultTableModel();

    public RechCours() {
        initComponents();
        dft1.addColumn("Id de la session");
        dft1.addColumn("Date de debut");
        dft1.addColumn("Date de fin");
        dft1.addColumn("Nbre d'inscrits");
        dft1.addColumn("Id du cours");
        dft1.addColumn("Id du local");
        jTable1.setModel(dft1);
        
    }
    

    public void setCoursDAO(CoursDAO coursDAO) {
        this.coursDAO = coursDAO;
    }
    public void setSessioncoursDAO(SessionCoursDAO sessioncoursDAO) {
        this.sessioncoursDAO = sessioncoursDAO;
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
        txtIdcours1 = new javax.swing.JTextField();
        txtMatiere = new javax.swing.JTextField();
        txtHeures = new javax.swing.JTextField();
        btnRech = new javax.swing.JButton();
        btnMaj = new javax.swing.JButton();
        btnEff = new javax.swing.JButton();
        btnAffsession = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        labelIdcours.setText("Id du cours");

        labelMatiere.setText("Matière");

        labelHeures.setText("Heures");

        txtIdcours1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdcours1ActionPerformed(evt);
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

        btnAffsession.setText("Affichage de la session correspondante au cours");
        btnAffsession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAffsessionActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5 ", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

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
                            .addComponent(txtIdcours1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(txtMatiere)
                            .addComponent(txtHeures))
                        .addGap(84, 84, 84))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRech)
                        .addGap(48, 48, 48)
                        .addComponent(btnMaj)
                        .addGap(53, 53, 53)
                        .addComponent(btnEff)
                        .addContainerGap(59, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btnAffsession)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdcours1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelIdcours))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMatiere)
                    .addComponent(txtMatiere, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelHeures)
                    .addComponent(txtHeures, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRech)
                    .addComponent(btnMaj)
                    .addComponent(btnEff))
                .addGap(34, 34, 34)
                .addComponent(btnAffsession)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdcours1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdcours1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdcours1ActionPerformed

    private void txtMatiereActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMatiereActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMatiereActionPerformed

    private void btnMajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMajActionPerformed
        try {
            int idCours = Integer.parseInt(txtIdcours1.getText());
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
            idCours = Integer.parseInt(txtIdcours1.getText());
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
            
            coursDAO.delete(crs);
            txtIdcours1.setText("");
            txtMatiere.setText("");
            txtHeures.setText("");
            JOptionPane.showMessageDialog(this, "cours effacé", "succès", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "ERREUR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEffActionPerformed

    private void btnAffsessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAffsessionActionPerformed

        try{ 
        
        List<SessionCours> alc = coursDAO.affSessioncours(crs.getIdcours());
        int nr = dft1.getRowCount();
        for(int i=nr-1;i>=0;i--)dft1.removeRow(i);
        for(SessionCours sc:alc){
            Vector v = new Vector();
            v.add(sc.getIdsessioncours());
            v.add(sc.getDatedebut());
            v.add(sc.getDatefin());
            v.add(sc.getNbreinscrits());
            v.add(sc.getIdcours());
            v.add(sc.getIdlocal());
            dft1.addRow(v);
           
        }
       }
       catch(Exception e){
           JOptionPane.showMessageDialog(this,e.getMessage(),"ERREUR",JOptionPane.ERROR_MESSAGE);
       }
    }//GEN-LAST:event_btnAffsessionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAffsession;
    private javax.swing.JButton btnEff;
    private javax.swing.JButton btnMaj;
    private javax.swing.JButton btnRech;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel labelHeures;
    private javax.swing.JLabel labelIdcours;
    private javax.swing.JLabel labelMatiere;
    private javax.swing.JTextField txtHeures;
    private javax.swing.JTextField txtIdcours1;
    private javax.swing.JTextField txtMatiere;
    // End of variables declaration//GEN-END:variables
}
