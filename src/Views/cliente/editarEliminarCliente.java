/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.cliente;

import Controls.ClienteData;
import Controls.Conexion;
import Models.Cliente;
import java.util.ArrayList;

/**
 *
 * @author Isaias
 */
public class editarEliminarCliente extends javax.swing.JInternalFrame {

    Conexion con = new Conexion();

    ClienteData cd = new ClienteData(con);

    public editarEliminarCliente() {
        initComponents();
        llenarCombo();
        limpiarCampos();
    }

    public void limpiarCampos() {
        jTextNombre.setText("");
        jTextApellido.setText("");
        jTextDni.setText("");
        jTextDireccion.setText("");
        jTextCiudad.setText("");
        jTextTelefono.setText("");
        jTextEmail.setText("");
        jComboCliente.setSelectedIndex(-1);
    }

    public void llenarCombo() {
        ArrayList<Cliente> listadestinos = (ArrayList<Cliente>) cd.listarTodosLosClientes();

        for (Cliente c : listadestinos) {
            jComboCliente.addItem(c);
        }
        jComboCliente.setSelectedIndex(-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboCliente = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jTextApellido = new javax.swing.JTextField();
        jTextDni = new javax.swing.JTextField();
        jTextDireccion = new javax.swing.JTextField();
        jTextCiudad = new javax.swing.JTextField();
        jTextTelefono = new javax.swing.JTextField();
        jTextEmail = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Editar Cliente");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Editar Cliente");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Cliente:");

        jComboCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboClienteActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Apellido:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Dni:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Direccion:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Ciudad:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Telefono:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Email:");

        jTextNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNombreActionPerformed(evt);
            }
        });

        jTextDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDireccionActionPerformed(evt);
            }
        });

        jTextCiudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCiudadActionPerformed(evt);
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
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(jTextApellido)
                            .addComponent(jTextDni)
                            .addComponent(jTextDireccion)
                            .addComponent(jTextCiudad)
                            .addComponent(jTextTelefono)
                            .addComponent(jTextEmail)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(49, 49, 49)
                        .addComponent(jComboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonGuardar)
                .addGap(35, 35, 35)
                .addComponent(jButtonSalir)
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextCiudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonSalir))
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNombreActionPerformed

    private void jTextDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextDireccionActionPerformed

    private void jTextCiudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCiudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCiudadActionPerformed

    private void jComboClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboClienteActionPerformed
        Cliente c = (Cliente) jComboCliente.getSelectedItem();

        if (jComboCliente.getSelectedIndex() != -1 || jComboCliente.getSelectedItem() != null) {
            
            jTextDni.setText(Integer.toString(c.getDni()));
            jTextNombre.setText(c.getNombre());
            jTextApellido.setText(c.getApellido());
            jTextDireccion.setText(c.getDireccion());
            jTextCiudad.setText(c.getCiudad());
            jTextTelefono.setText(c.getTelefono());
            jTextEmail.setText(c.getEmail());
        }

    }//GEN-LAST:event_jComboClienteActionPerformed

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        Cliente c = (Cliente) jComboCliente.getSelectedItem();
        
        c.setDni(Integer.parseInt(jTextDni.getText()));
        c.setNombre(jTextNombre.getText());
        c.setApellido(jTextApellido.getText());
        c.setDireccion(jTextDireccion.getText());
        c.setCiudad(jTextCiudad.getText());
        c.setTelefono(jTextTelefono.getText());
        c.setEmail(jTextEmail.getText());
        
        cd.editarCliente(c);

        limpiarCampos();
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JComboBox<Cliente> jComboCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextApellido;
    private javax.swing.JTextField jTextCiudad;
    private javax.swing.JTextField jTextDireccion;
    private javax.swing.JTextField jTextDni;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextTelefono;
    // End of variables declaration//GEN-END:variables
}
