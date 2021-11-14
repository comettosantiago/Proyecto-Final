/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Views.cliente.agregarCliente;
import Views.cliente.editarEliminarCliente;
import Views.destino.agregarDestino;
import Views.destino.editarEliminarDestino;
import javax.swing.JInternalFrame;

/**
 *
 * @author Isaias
 */
public class VistaPrincipal extends javax.swing.JFrame {

    public VistaPrincipal() {
        initComponents();
    }

    public void centrarVentanaInterna(JInternalFrame internalFrame) {
        int x = (panelPrincipal.getWidth() / 2) - internalFrame.getWidth() / 2;
        int y = (panelPrincipal.getHeight() / 2) - internalFrame.getHeight() / 2;
        if (internalFrame.isShowing()) {
            internalFrame.setLocation(x, y);
        } else {
            panelPrincipal.add(internalFrame);
            internalFrame.setLocation(x, y);
            internalFrame.show();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu10 = new javax.swing.JMenu();
        panelPrincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jmiAgregarCliente = new javax.swing.JMenuItem();
        jmiEditarCliente = new javax.swing.JMenuItem();
        jMenu11 = new javax.swing.JMenu();
        jmiAgregarDestino = new javax.swing.JMenuItem();
        jmiEditarDestino = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();

        jMenu10.setText("jMenu10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 603, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 475, Short.MAX_VALUE)
        );

        jMenuBar1.add(jMenu5);

        jMenu7.setText("Transporte");

        jMenuItem2.setText("Agregar");
        jMenu7.add(jMenuItem2);

        jMenuItem1.setText("Editar ");
        jMenu7.add(jMenuItem1);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("Alojamiento");

        jMenuItem3.setText("Agregar");
        jMenu8.add(jMenuItem3);

        jMenuItem4.setText("Editar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem4);

        jMenuBar1.add(jMenu8);

        jMenu9.setText("Cliente");

        jmiAgregarCliente.setText("Agregar");
        jmiAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAgregarClienteActionPerformed(evt);
            }
        });
        jMenu9.add(jmiAgregarCliente);

        jmiEditarCliente.setText("Editar");
        jmiEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEditarClienteActionPerformed(evt);
            }
        });
        jMenu9.add(jmiEditarCliente);

        jMenuBar1.add(jMenu9);

        jMenu11.setText("Destino");

        jmiAgregarDestino.setText("Agregar");
        jmiAgregarDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAgregarDestinoActionPerformed(evt);
            }
        });
        jMenu11.add(jmiAgregarDestino);

        jmiEditarDestino.setText("Editar");
        jmiEditarDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEditarDestinoActionPerformed(evt);
            }
        });
        jMenu11.add(jmiEditarDestino);

        jMenuBar1.add(jMenu11);

        jMenu1.setText("Extra");

        jMenuItem11.setText("Agregar");
        jMenu1.add(jMenuItem11);

        jMenuItem12.setText("Editar");
        jMenu1.add(jMenuItem12);

        jMenuBar1.add(jMenu1);

        jMenu12.setText("Crear Paquete");

        jMenuItem9.setText("Generar Paquete");
        jMenu12.add(jMenuItem9);

        jMenuItem10.setText("Editar Paquete");
        jMenu12.add(jMenuItem10);

        jMenuBar1.add(jMenu12);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jmiAgregarDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAgregarDestinoActionPerformed

        panelPrincipal.removeAll();
        panelPrincipal.repaint();
        agregarDestino vent = new agregarDestino();
        vent.setVisible(true);
        panelPrincipal.add(vent);
        centrarVentanaInterna(vent);
    }//GEN-LAST:event_jmiAgregarDestinoActionPerformed

    private void jmiEditarDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEditarDestinoActionPerformed
        panelPrincipal.removeAll();
        panelPrincipal.repaint();
        editarEliminarDestino vent = new editarEliminarDestino();
        vent.setVisible(true);
        panelPrincipal.add(vent);
        centrarVentanaInterna(vent);
    }//GEN-LAST:event_jmiEditarDestinoActionPerformed

    private void jmiAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAgregarClienteActionPerformed
        panelPrincipal.removeAll();
        panelPrincipal.repaint();
        agregarCliente vent = new agregarCliente();
        vent.setVisible(true);
        panelPrincipal.add(vent);
        centrarVentanaInterna(vent);
    }//GEN-LAST:event_jmiAgregarClienteActionPerformed

    private void jmiEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEditarClienteActionPerformed
        panelPrincipal.removeAll();
        panelPrincipal.repaint();
        editarEliminarCliente vent = new editarEliminarCliente();
        vent.setVisible(true);
        panelPrincipal.add(vent);
        centrarVentanaInterna(vent);
    }//GEN-LAST:event_jmiEditarClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jmiAgregarCliente;
    private javax.swing.JMenuItem jmiAgregarDestino;
    private javax.swing.JMenuItem jmiEditarCliente;
    private javax.swing.JMenuItem jmiEditarDestino;
    private javax.swing.JDesktopPane panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
