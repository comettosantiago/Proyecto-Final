/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.transporte;

import Models.Transporte;
import Controls.Conexion;
import Controls.DestinoData;
import Controls.TransporteData;
import Models.Destino;
import Models.Transporte;
import java.util.ArrayList;

/**
 *
 * @author Isaias
 */
public class editarEliminarTransporte extends javax.swing.JInternalFrame {

    Conexion con = new Conexion();

    TransporteData td = new TransporteData(con);
    DestinoData dd = new DestinoData(con);

    /**
     * Creates new form editarEliminarTransporte
     */
    public editarEliminarTransporte() {
        initComponents();
        llenarComboTransporte();
        llenarComboDestino();
        limpiarCampos();
    }

    public void limpiarCampos() {
        jComboDestino.setSelectedIndex(-1);
        jComboTransporte.setSelectedIndex(-1);
        jComboTipo.setSelectedIndex(-1);
        jTextCosto.setText("");
        buttonGroup1.clearSelection();
    }

    public void llenarComboDestino() {
        ArrayList<Destino> listaDestinos = (ArrayList<Destino>) dd.listarDestinosActivos();

        for (Destino d : listaDestinos) {
            jComboDestino.addItem(d);
        }
        jComboDestino.setSelectedIndex(-1);
    }

    public void llenarComboTransporte() {
        ArrayList<Transporte> listaTransporte = (ArrayList<Transporte>) td.listarTodosLosTransportes();

        for (Transporte t : listaTransporte) {
            jComboTransporte.addItem(t);
        }
        jComboDestino.setSelectedIndex(-1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioSi = new javax.swing.JRadioButton();
        jRadioNo = new javax.swing.JRadioButton();
        jTextCosto = new javax.swing.JTextField();
        jBtGuardar = new javax.swing.JButton();
        jBtSalir = new javax.swing.JButton();
        jComboTransporte = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboDestino = new javax.swing.JComboBox<>();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jRadioSi1 = new javax.swing.JRadioButton();
        jRadioNo1 = new javax.swing.JRadioButton();
        jTextCosto1 = new javax.swing.JTextField();
        jBtGuardar1 = new javax.swing.JButton();
        jBtSalir1 = new javax.swing.JButton();
        jComboTransporte1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboDestino1 = new javax.swing.JComboBox<>();
        jComboTipo = new javax.swing.JComboBox<>();

        jCheckBox1.setText("jCheckBox1");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Editar Transporte");

        jLabel2.setText("Tipo de Transporte:");

        jLabel3.setText("Costo:");

        jLabel4.setText("Activo:");

        buttonGroup1.add(jRadioSi);
        jRadioSi.setText("Si");

        buttonGroup1.add(jRadioNo);
        jRadioNo.setText("No");

        jTextCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCostoActionPerformed(evt);
            }
        });

        jBtGuardar.setText("Guardar");
        jBtGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtGuardarActionPerformed(evt);
            }
        });

        jBtSalir.setText("Salir");
        jBtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtSalirActionPerformed(evt);
            }
        });

        jComboTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTransporteActionPerformed(evt);
            }
        });

        jLabel5.setText("Transporte:");

        jLabel6.setText("Destino");

        jComboDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboDestinoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Editar Transporte");

        jLabel8.setText("Tipo de Transporte:");

        jLabel9.setText("Costo:");

        jLabel10.setText("Activo:");

        buttonGroup1.add(jRadioSi1);
        jRadioSi1.setText("Si");

        buttonGroup1.add(jRadioNo1);
        jRadioNo1.setText("No");

        jTextCosto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCosto1ActionPerformed(evt);
            }
        });

        jBtGuardar1.setText("Guardar");
        jBtGuardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtGuardar1ActionPerformed(evt);
            }
        });

        jBtSalir1.setText("Salir");
        jBtSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtSalir1ActionPerformed(evt);
            }
        });

        jComboTransporte1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTransporte1ActionPerformed(evt);
            }
        });

        jLabel11.setText("Transporte:");

        jLabel12.setText("Destino");

        jComboDestino1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboDestino1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jInternalFrame1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBtSalir1)
                .addGap(62, 62, 62))
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBtGuardar1)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel8))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jInternalFrame1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel10)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextCosto1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                        .addComponent(jRadioSi1)
                                        .addGap(29, 29, 29)
                                        .addComponent(jRadioNo1))
                                    .addComponent(jLabel7))
                                .addGap(68, 68, 68))))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addGap(81, 81, 81)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboDestino1, 0, 245, Short.MAX_VALUE)
                            .addComponent(jComboTransporte1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(37, 37, 37)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboTransporte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(28, 28, 28)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jComboDestino1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(30, 30, 30)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextCosto1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioSi1)
                    .addComponent(jLabel10)
                    .addComponent(jRadioNo1))
                .addGap(17, 17, 17)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtSalir1)
                    .addComponent(jBtGuardar1))
                .addGap(37, 37, 37))
        );

        jComboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vehiculo", "Automovil", "Avion" }));
        jComboTipo.setSelectedIndex(-1);
        jComboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboTipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBtGuardar)
                .addGap(27, 27, 27)
                .addComponent(jBtSalir)
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextCosto)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioSi)
                                .addGap(29, 29, 29)
                                .addComponent(jRadioNo))
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboDestino, 0, 245, Short.MAX_VALUE)
                            .addComponent(jComboTransporte, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioSi)
                    .addComponent(jLabel4)
                    .addComponent(jRadioNo))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtSalir)
                    .addComponent(jBtGuardar))
                .addGap(37, 37, 37))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCostoActionPerformed

    private void jComboTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTransporteActionPerformed
        Transporte t = (Transporte) jComboTransporte.getSelectedItem();

        if (jComboTransporte.getSelectedIndex() != -1 || jComboTransporte.getSelectedItem() != null) {
            jComboDestino.setSelectedItem(t.getDestino());
            jComboTipo.setSelectedItem(t.getTipoDeTransporte());
            jTextCosto.setText(Float.toString(t.getCostoTransporte()));
            if (t.isActivo()) {
                jRadioSi.setSelected(true);
            } else {
                jRadioNo.setSelected(true);
            }
        }
    }//GEN-LAST:event_jComboTransporteActionPerformed

    private void jBtGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtGuardarActionPerformed
        Transporte t = (Transporte) jComboTransporte.getSelectedItem();

        t.setTipoDeTransporte(jComboTipo.getSelectedItem().toString());
        t.setCostoTransporte(Float.parseFloat(jTextCosto.getText()));
        t.setDestino((Destino) jComboDestino.getSelectedItem());
        if (jRadioSi.isSelected()) {
            t.setActivo(true);
        } else {
            t.setActivo(false);
        }

        td.editarTransporte(t);

        limpiarCampos();
    }//GEN-LAST:event_jBtGuardarActionPerformed

    private void jBtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBtSalirActionPerformed

    private void jComboDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboDestinoActionPerformed

    private void jTextCosto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCosto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCosto1ActionPerformed

    private void jBtGuardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtGuardar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtGuardar1ActionPerformed

    private void jBtSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtSalir1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtSalir1ActionPerformed

    private void jComboTransporte1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTransporte1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboTransporte1ActionPerformed

    private void jComboDestino1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboDestino1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboDestino1ActionPerformed

    private void jComboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboTipoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBtGuardar;
    private javax.swing.JButton jBtGuardar1;
    private javax.swing.JButton jBtSalir;
    private javax.swing.JButton jBtSalir1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<Destino> jComboDestino;
    private javax.swing.JComboBox<Destino> jComboDestino1;
    private javax.swing.JComboBox<String> jComboTipo;
    private javax.swing.JComboBox<Transporte> jComboTransporte;
    private javax.swing.JComboBox<Transporte> jComboTransporte1;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioNo;
    private javax.swing.JRadioButton jRadioNo1;
    private javax.swing.JRadioButton jRadioSi;
    private javax.swing.JRadioButton jRadioSi1;
    private javax.swing.JTextField jTextCosto;
    private javax.swing.JTextField jTextCosto1;
    // End of variables declaration//GEN-END:variables
}
