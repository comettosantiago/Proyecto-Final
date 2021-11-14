/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.destino;

import Controls.Conexion;
import Controls.DestinoData;
import Models.Destino;
import java.util.ArrayList;

/**
 *
 * @author Isaias
 */
public class editarEliminarDestino extends javax.swing.JInternalFrame {

    Conexion con = new Conexion();

    DestinoData dd = new DestinoData(con);

    public editarEliminarDestino() {
        initComponents();
        llenarComboDestino();
        limpiarCampos();
    }

    public void limpiarCampos() {
        jTextNombre.setText("");
        jTextPais.setText("");
        jComboDestino.setSelectedIndex(-1);
        buttonGroup1.clearSelection();
    }

    public void llenarComboDestino() {
        ArrayList<Destino> listadestinos = (ArrayList<Destino>) dd.listarTodosLosDestinos();

        for (Destino d : listadestinos) {
            jComboDestino.addItem(d);
        }
        jComboDestino.setSelectedIndex(-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioSi = new javax.swing.JRadioButton();
        jRadioNo = new javax.swing.JRadioButton();
        jComboDestino = new javax.swing.JComboBox<>();
        jTextNombre = new javax.swing.JTextField();
        jTextPais = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Editar Destino");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Editar Destino");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Destino:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Pais:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Activo:");

        buttonGroup1.add(jRadioSi);
        jRadioSi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioSi.setText("Si");

        buttonGroup1.add(jRadioNo);
        jRadioNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioNo.setText("No");

        jComboDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboDestinoActionPerformed(evt);
            }
        });

        jButtonGuardar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonSalir.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSalir))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioSi)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioNo))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextPais, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                                .addComponent(jTextNombre, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addGap(0, 48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jRadioSi)
                    .addComponent(jRadioNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalir)
                    .addComponent(jButtonGuardar))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboDestinoActionPerformed
        Destino d = (Destino) jComboDestino.getSelectedItem();

        if (jComboDestino.getSelectedIndex() != -1 || jComboDestino.getSelectedItem() != null) {
            jTextNombre.setText(d.getNombreDestino());
            jTextPais.setText(d.getPais());
            if (d.isActivo()) {
                jRadioSi.setSelected(true);
            } else {
                jRadioNo.setSelected(true);
            }
        }

    }//GEN-LAST:event_jComboDestinoActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        Destino d = (Destino) jComboDestino.getSelectedItem();

        d.setNombreDestino(jTextNombre.getText());
        d.setPais(jTextPais.getText());
        if (jRadioSi.isSelected()) {
            d.setActivo(true);
        } else {
            d.setActivo(false);
        }

        dd.editarDestino(d);

        limpiarCampos();
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<Destino> jComboDestino;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioNo;
    private javax.swing.JRadioButton jRadioSi;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextPais;
    // End of variables declaration//GEN-END:variables
}
