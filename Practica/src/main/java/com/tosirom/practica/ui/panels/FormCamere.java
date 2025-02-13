/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.tosirom.practica.ui.panels;

import com.tosirom.practica.database.Camere;
import com.tosirom.practica.database.Client;
import com.tosirom.practica.models.CamereTableModel;
import com.tosirom.practica.models.ClientTableModel;
import javax.swing.RowSorter;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Skiuileuf
 */
public class FormCamere extends javax.swing.JPanel {

    /**
     * Creates new form FormCamere
     */
    public FormCamere() {
        initComponents();
        RefreshCamereTable();

        TableRowSorter<TableModel> sorter = new TableRowSorter<>(tabelCamere.getModel());
        tabelCamere.setRowSorter(sorter);
    }
    
    private void RefreshCamereTable() {
        CamereTableModel model = new CamereTableModel();

        tabelCamere.setModel(model);

        var clients = Camere.GetAllCamere();

        RowSorter<?> sorter = tabelCamere.getRowSorter();
        tabelCamere.setAutoCreateRowSorter(false);
        tabelCamere.setRowSorter(null);

        for (int i = 0; i < clients.size(); i++) {
            model.add(clients.get(i));
        }

        tabelCamere.setRowSorter((RowSorter<? extends TableModel>) sorter);
        tabelCamere.setAutoCreateRowSorter(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelCamere = new javax.swing.JTable();

        tabelCamere.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabelCamere);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelCamere;
    // End of variables declaration//GEN-END:variables
}
