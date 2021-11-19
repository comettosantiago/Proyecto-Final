/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Views.alojamiento.agregarAlojamiento;
import Views.alojamiento.editarEliminarAlojamiento;
import Views.cliente.agregarCliente;
import Views.cliente.editarEliminarCliente;
import Views.destino.agregarDestino;
import Views.destino.editarEliminarDestino;
import Views.extraalojamiento.agregarExtraalojamiento;
import Views.extraalojamiento.editarEliminarExtra;
import Views.paquete.agregarPaquete;
import Views.paquete.editarEliminarPaquete;
import Views.transporte.agregarTransporte;
import Views.transporte.editarEliminarTransporte;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

/**
 *
 * @author Isaias
 */
public class VistaPrincipal extends javax.swing.JFrame {

    public VistaPrincipal() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.png")).getImage());
        this.setLocationRelativeTo(null);
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
        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/fondo.jpg"));
        Image miImagen = icono.getImage();
        panelPrincipal = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(miImagen, 0, 0, getWidth(), getHeight(), this);
            }
        }
        ;
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
        setTitle("Gestión de Paquetes");

        panelPrincipal.setPreferredSize(new java.awt.Dimension(1000, 700));

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        jMenuBar1.add(jMenu5);

        jMenu7.setText("Transporte");

        jMenuItem2.setText("Agregar");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem2);

        jMenuItem1.setText("Editar ");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem1);

        jMenuBar1.add(jMenu7);

        jMenu8.setText("Alojamiento");

        jMenuItem3.setText("Agregar");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
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
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem11);

        jMenuItem12.setText("Editar");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem12);

        jMenuBar1.add(jMenu1);

        jMenu12.setText("Crear Paquete");

        jMenuItem9.setText("Generar Paquete");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu12.add(jMenuItem9);

        jMenuItem10.setText("Editar Paquete");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
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
        panelPrincipal.removeAll();
        panelPrincipal.repaint();
        editarEliminarAlojamiento vent = new editarEliminarAlojamiento();
        vent.setVisible(true);
        panelPrincipal.add(vent);
        centrarVentanaInterna(vent);
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

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        panelPrincipal.removeAll();
        panelPrincipal.repaint();
        agregarTransporte vent = new agregarTransporte();
        vent.setVisible(true);
        panelPrincipal.add(vent);
        centrarVentanaInterna(vent);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        panelPrincipal.removeAll();
        panelPrincipal.repaint();
        editarEliminarTransporte vent = new editarEliminarTransporte();
        vent.setVisible(true);
        panelPrincipal.add(vent);
        centrarVentanaInterna(vent);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        panelPrincipal.removeAll();
        panelPrincipal.repaint();
        agregarAlojamiento vent = new agregarAlojamiento();
        vent.setVisible(true);
        panelPrincipal.add(vent);
        centrarVentanaInterna(vent);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        panelPrincipal.removeAll();
        panelPrincipal.repaint();
        agregarExtraalojamiento vent = new agregarExtraalojamiento();
        vent.setVisible(true);
        panelPrincipal.add(vent);
        centrarVentanaInterna(vent);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        panelPrincipal.removeAll();
        panelPrincipal.repaint();
        editarEliminarExtra vent = new editarEliminarExtra();
        vent.setVisible(true);
        panelPrincipal.add(vent);
        centrarVentanaInterna(vent);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        panelPrincipal.removeAll();
        panelPrincipal.repaint();
        agregarPaquete vent = new agregarPaquete();
        vent.setVisible(true);
        panelPrincipal.add(vent);
        centrarVentanaInterna(vent);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        panelPrincipal.removeAll();
        panelPrincipal.repaint();
        editarEliminarPaquete vent = new editarEliminarPaquete();
        vent.setVisible(true);
        panelPrincipal.add(vent);
        centrarVentanaInterna(vent);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

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
