/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.tosirom.practica.ui.panels;

import com.tosirom.practica.database.Client;
import com.tosirom.practica.models.ClientTableModel;
import javax.swing.RowSorter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *

 */
public class FormClienti extends javax.swing.JPanel {

    /**
     * Creates new form FormClienti
     */
    public FormClienti() {
        initComponents();
        RefreshClientsTable();

        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tabelClienti.getModel());
        tabelClienti.setRowSorter(sorter);
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
        jLabel1 = new javax.swing.JLabel();
        txtNume = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrenume = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAdresa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTelefon = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnAdaugaClient = new javax.swing.JButton();

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

        jLabel1.setText("Nume");

        txtNume.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeActionPerformed(evt);
            }
        });

        jLabel4.setText("Prenume");

        jLabel5.setText("Adresa");

        jLabel6.setText("Telefon");

        jLabel7.setText("Email");

        btnClear.setText("Reset");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnAdaugaClient.setText("Adauga client");
        btnAdaugaClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdaugaClientActionPerformed(evt);
            }
        });

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
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
                                    .addComponent(txtTelefon)
                                    .addComponent(txtAdresa)
                                    .addComponent(txtPrenume)
                                    .addComponent(txtNume)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnClear)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAdaugaClient)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrenume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAdresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdaugaClient)
                    .addComponent(btnClear))
                .addGap(18, 18, 18)
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

        for (int i = 0; i < selRows.length; i++) {
            Client.DeleteClient((Integer) model.getValueAt(selRows[i], 0));
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

    private void txtNumeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeActionPerformed

        private void ClearFields() {
        txtNume.setText("");
        txtPrenume.setText("");
        txtAdresa.setText("");
        txtTelefon.setText("");
        txtEmail.setText("");
    }
    
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        ClearFields();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAdaugaClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdaugaClientActionPerformed
        // TODO add your handling code here:
        Client n = new Client();

        n.Nume = txtNume.getText();
        n.Prenume = txtPrenume.getText();
        n.Adresa = txtAdresa.getText();
        n.Telefon = txtTelefon.getText();
        n.Email = txtTelefon.getText();

        boolean result = Client.CreateClient(n);

        if(result) {
            ClearFields();
        }
        RefreshClientsTable();
    }//GEN-LAST:event_btnAdaugaClientActionPerformed
    private void RefreshClientsTable() {
        ClientTableModel model = new ClientTableModel();

        tabelClienti.setModel(model);

        var clients = Client.GetAllClients();

        RowSorter<?> sorter = tabelClienti.getRowSorter();
        tabelClienti.setAutoCreateRowSorter(false);
        tabelClienti.setRowSorter(null);

        for (int i = 0; i < clients.size(); i++) {
            model.add(clients.get(i));
        }

        tabelClienti.setRowSorter((RowSorter<? extends TableModel>) sorter);
        tabelClienti.setAutoCreateRowSorter(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdaugaClient;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDeleteClienti;
    private javax.swing.JButton btnResetClienti;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelClienti;
    private javax.swing.JTextField txtAdresa;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNume;
    private javax.swing.JTextField txtPrenume;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
