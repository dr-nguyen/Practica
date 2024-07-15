/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.tosirom.practica.ui.panels;

import com.tosirom.practica.database.Inchirieri;
import com.tosirom.practica.models.InchirieriTableModel;

/**
 *
 * @author Skiuileuf
 */
public class FormInchirieri extends javax.swing.JPanel {

    /**
     * Creates new form FormInchirieri
     */
    public FormInchirieri() {
        initComponents();
        RefreshInchirieriTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnResetClienti1 = new javax.swing.JButton();
        btnDeleteClienti1 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabelInchirieri = new javax.swing.JTable();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        btnResetClienti1.setText("Refresh");
        btnResetClienti1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetClienti1MouseClicked(evt);
            }
        });
        btnResetClienti1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetClienti1ActionPerformed(evt);
            }
        });

        btnDeleteClienti1.setText("Delete selected row");
        btnDeleteClienti1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteClienti1ActionPerformed(evt);
            }
        });

        tabelInchirieri.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nume", "Prenume", "Adresa", "Telefon", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tabelInchirieri);

        jLabel1.setText("ID");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnResetClienti1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDeleteClienti1)
                                .addGap(185, 185, 185)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))))
                        .addGap(0, 80, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnResetClienti1)
                        .addComponent(btnDeleteClienti1))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetClienti1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetClienti1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetClienti1MouseClicked

    private void btnResetClienti1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetClienti1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetClienti1ActionPerformed

    private void btnDeleteClienti1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteClienti1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteClienti1ActionPerformed

        private void RefreshInchirieriTable() {
        InchirieriTableModel model = new InchirieriTableModel();
        tabelInchirieri.setModel(model);
        
          
        var inchirieri = Inchirieri.GetAllInchirieri();
        
        for(int i = 0; i < inchirieri.size(); i++) {
            model.add(inchirieri.get(i));
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteClienti1;
    private javax.swing.JButton btnResetClienti1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tabelInchirieri;
    // End of variables declaration//GEN-END:variables
}
