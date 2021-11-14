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
        limpiarCampos();
    }
    public void limpiarCampos() {
        jComboDestino.setSelectedIndex(-1);
        jTextTransporte.setText("");
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
        jTextTransporte = new javax.swing.JTextField();
        jTextCosto = new javax.swing.JTextField();
        jBtGuardar = new javax.swing.JButton();
        jBtSalir = new javax.swing.JButton();
        jComboTransporte = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboDestino = new javax.swing.JComboBox<>();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jBtSalir)
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jBtGuardar)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel4)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioSi)
                                        .addGap(29, 29, 29)
                                        .addComponent(jRadioNo))
                                    .addComponent(jTextTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addGap(68, 68, 68))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(125, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
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
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCostoActionPerformed

    private void jComboTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboTransporteActionPerformed
        Transporte t = (Transporte) jComboTransporte.getSelectedItem();
        
        if (jComboTransporte.getSelectedIndex() != -1 || jComboTransporte.getSelectedItem() != null) {
            llenarComboDestino();
            jComboDestino.setSelectedItem(t.getDestino());
            jTextTransporte.setText(t.getTipoDeTransporte());
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
        
        t.setTipoDeTransporte(jTextTransporte.getText());
        t.setCostoTransporte(Float.parseFloat(jTextCosto.getText()));
        t.setDestino((Destino)jComboDestino.getSelectedItem());
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBtGuardar;
    private javax.swing.JButton jBtSalir;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<Destino> jComboDestino;
    private javax.swing.JComboBox<Transporte> jComboTransporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioNo;
    private javax.swing.JRadioButton jRadioSi;
    private javax.swing.JTextField jTextCosto;
    private javax.swing.JTextField jTextTransporte;
    // End of variables declaration//GEN-END:variables
}
