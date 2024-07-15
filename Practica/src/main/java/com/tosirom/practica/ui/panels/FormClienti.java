/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.tosirom.practica.ui.panels;

import com.tosirom.practica.database.Client;
import com.tosirom.practica.models.ClientTableModel;

/**
 *
 * @author Skiuileuf
 */
public class FormClienti extends javax.swing.JPanel {

    /**
     * Creates new form FormClienti
     */
    public FormClienti() {
        initComponents();
        RefreshClientsTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDeleteClienti = new javax.swing.JButton();
        btnResetClienti = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelClienti = new javax.swing.JTable();
        clientForm1 = new com.tosirom.practica.ui.ClientForm();

        btnDeleteClienti.setText("Delete selected row");
        btnDeleteClienti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteClientiActionPerformed(evt);
            }
        });

        btnResetClienti.setText("Refresh");
        btnResetClienti.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetClientiMouseClicked(evt);
            }
        });
        btnResetClienti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetClientiActionPerformed(evt);
            }
        });

        tabelClienti.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelClienti);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnResetClienti)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteClienti)
                        .addGap(0, 480, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(clientForm1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(clientForm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResetClienti)
                    .addComponent(btnDeleteClienti))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteClientiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteClientiActionPerformed
        // TODO add your handling code here:

        ClientTableModel model = (ClientTableModel) tabelClienti.getModel();

        int[] selRows = tabelClienti.getSelectedRows();

        for(int i = 0; i < selRows.length; i++) {
            Client.DeleteClient( (Integer)model.getValueAt(selRows[i], 0));
        }

        RefreshClientsTable();
    }//GEN-LAST:event_btnDeleteClientiActionPerformed

    private void btnResetClientiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetClientiMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetClientiMouseClicked

    private void btnResetClientiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetClientiActionPerformed
        RefreshClientsTable();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetClientiActionPerformed
    private void RefreshClientsTable() {
        ClientTableModel model = new ClientTableModel();
        
        tabelClienti.setModel(model);
        
        var clients = Client.GetAllClients();
        
        for(int i = 0; i < clients.size(); i++) {
            model.add(clients.get(i));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteClienti;
    private javax.swing.JButton btnResetClienti;
    private com.tosirom.practica.ui.ClientForm clientForm1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelClienti;
    // End of variables declaration//GEN-END:variables
}
