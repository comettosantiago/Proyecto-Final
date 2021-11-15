/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views.paquete;

import Controls.AlojamientoData;
import Controls.ClienteData;
import Controls.Conexion;
import Controls.DestinoData;
import Controls.ExtraalojamientoData;
import Controls.PaqueteData;
import Controls.TransporteData;
import Models.Alojamiento;
import Models.Cliente;
import Models.Destino;
import Models.Extraalojamiento;
import Models.Paquete;
import Models.Transporte;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;

/**
 *
 * @author Isaias
 */
public class agregarPaquete extends javax.swing.JInternalFrame {

    Conexion con = new Conexion();

    ClienteData cd = new ClienteData(con);

    DestinoData dd = new DestinoData(con);

    TransporteData td = new TransporteData(con);

    AlojamientoData ad = new AlojamientoData(con);

    ExtraalojamientoData ed = new ExtraalojamientoData(con);

    PaqueteData pd = new PaqueteData(con);

    public agregarPaquete() {
        initComponents();
        limpiarCampos();
    }

    public void limpiarCampos() {
        jComboCliente.setSelectedIndex(-1);
        jComboDestino.setSelectedIndex(-1);
        jComboTransporte.setSelectedIndex(-1);
        jComboAlojamiento.setSelectedIndex(-1);
        jComboExtra.setSelectedIndex(-1);
        jFechaInicio.setDate(null);
        jFechaFin.setDate(null);
        jFechaEmision.setDate(null);
        jTextCostoTotal.setText("");
    }

    public void llenarComboCliente() {
        ArrayList<Cliente> listaclientes = (ArrayList<Cliente>) cd.listarTodosLosClientes();

        for (Cliente c : listaclientes) {
            jComboCliente.addItem(c);
        }
        jComboCliente.setSelectedIndex(-1);
    }

    public void llenarComboDestino() {
        ArrayList<Destino> listadestinos = (ArrayList<Destino>) dd.listarDestinosActivos();

        for (Destino d : listadestinos) {
            jComboDestino.addItem(d);
        }
        jComboDestino.setSelectedIndex(-1);
    }

    //metodos para los action perfomed en combos
    public void llenarComboTransporte() {
        //Destino d = (Destino) jComboDestino.getSelectedItem();

        //ArrayList<Transporte> listaTransporte = (ArrayList<Transporte>) td.listarTransportesDeUnDestino(d.getIdDestino());
        //for (Transporte t : listaTransporte) {
        //    jComboTransporte.addItem(t);
        //}
        //jComboDestino.setSelectedIndex(-1);
    }

    public void llenarComboAlojamiento() {
        //Destino d = (Destino) jComboDestino.getSelectedItem();

        //ArrayList<Alojamiento> listaalojamientos = (ArrayList<Alojamiento>) ad.listarAlojamientosDeUnDestino(d.getIdDestino());
        //for (Alojamiento a : listaalojamientos) {
        //    jComboAlojamiento.addItem(a);
        //}
        //jComboAlojamiento.setSelectedIndex(-1);
    }

    public void llenarComboExtra() {
        //Alojamiento a = (Alojamiento) jComboAlojamiento.getSelectedItem();

        //ArrayList<Extraalojamiento> listaExtraalojamiento = (ArrayList<Extraalojamiento>) ed.listarExtrasDeUnAlojamiento(a.getIdAlojamiento());
        //for (Extraalojamiento e : listaExtraalojamiento) {
        //    jComboExtra.addItem(e);
        //}
        //jComboAlojamiento.setSelectedIndex(-1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jComboCliente = new javax.swing.JComboBox<>();
        jComboTransporte = new javax.swing.JComboBox<>();
        jComboExtra = new javax.swing.JComboBox<>();
        jFechaInicio = new com.toedter.calendar.JDateChooser();
        jFechaFin = new com.toedter.calendar.JDateChooser();
        jFechaEmision = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jTextCostoTotal = new javax.swing.JTextField();
        jBtGenerar = new javax.swing.JButton();
        jBtSalir = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jComboDestino = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        jComboAlojamiento = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jCantidad = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jBtCalcular = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Generar Paquete Turistico");
        setPreferredSize(new java.awt.Dimension(600, 540));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Generar Paquete");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Cliente:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Transporte:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Extra:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Fecha inicio:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Fecha fin:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Fecha emision:");

        jComboCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboClienteFocusGained(evt);
            }
        });
        jComboCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboClienteActionPerformed(evt);
            }
        });

        jFechaEmision.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jFechaEmisionFocusGained(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Costo total:");

        jTextCostoTotal.setEditable(false);

        jBtGenerar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jBtGenerar.setText("Generar");
        jBtGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtGenerarActionPerformed(evt);
            }
        });

        jBtSalir.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jBtSalir.setText("Salir");
        jBtSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtSalirActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Destino:");

        jComboDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboDestinoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Alojamiento");

        jComboAlojamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboAlojamientoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Personas:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("$");

        jBtCalcular.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jBtCalcular.setText("Calcular total");
        jBtCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jComboCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(jBtGenerar)
                                        .addGap(130, 130, 130)
                                        .addComponent(jBtSalir)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(133, 133, 133))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel6)
                                                    .addComponent(jLabel7))
                                                .addGap(52, 52, 52))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel8)
                                                .addGap(2, 2, 2)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jFechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(jLabel13)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jTextCostoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jFechaInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(26, 26, 26)
                                                .addComponent(jBtCalcular))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel3))
                                        .addGap(70, 70, 70)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jComboTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel12))
                                        .addGap(71, 71, 71)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addComponent(jCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jComboDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jFechaEmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextCostoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jBtCalcular))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtGenerar)
                    .addComponent(jBtSalir))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBtSalirActionPerformed

    private void jComboClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboClienteActionPerformed

    private void jComboDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboDestinoActionPerformed
        Destino d = (Destino) jComboDestino.getSelectedItem();

        ArrayList<Transporte> listaTransporte = (ArrayList<Transporte>) td.listarTransportesDeUnDestino(d.getIdDestino());

        for (Transporte t : listaTransporte) {
            jComboTransporte.addItem(t);
        }
        jComboDestino.setSelectedIndex(-1);

        ArrayList<Alojamiento> listaalojamientos = (ArrayList<Alojamiento>) ad.listarAlojamientosDeUnDestino(d.getIdDestino());

        for (Alojamiento a : listaalojamientos) {
            jComboAlojamiento.addItem(a);
        }
        jComboAlojamiento.setSelectedIndex(-1);

    }//GEN-LAST:event_jComboDestinoActionPerformed

    private void jComboAlojamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboAlojamientoActionPerformed
        Alojamiento a = (Alojamiento) jComboAlojamiento.getSelectedItem();

        ArrayList<Extraalojamiento> listaExtraalojamiento = (ArrayList<Extraalojamiento>) ed.listarExtrasDeUnAlojamiento(a.getIdAlojamiento());

        for (Extraalojamiento e : listaExtraalojamiento) {
            jComboExtra.addItem(e);
        }
        jComboAlojamiento.setSelectedIndex(-1);
    }//GEN-LAST:event_jComboAlojamientoActionPerformed

    private void jBtGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtGenerarActionPerformed
        Paquete p = new Paquete();
        LocalDate localdateInicio = jFechaInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate localdateFin = jFechaFin.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate localdateEmision = jFechaEmision.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        p.setCliente((Cliente) jComboCliente.getSelectedItem());
        p.setTransporte((Transporte) jComboTransporte.getSelectedItem());
        p.setExtra((Extraalojamiento) jComboExtra.getSelectedItem());

        p.setFechaInicio(localdateInicio);
        p.setFechaFin(localdateFin);
        p.setFechaEmisionPaquete(localdateEmision);

        p.setCostoTotalPaquete(p.getCostoTotalPaquete() * ((Integer) jCantidad.getValue()));

        p.setActivo(true);

        pd.agregarPaquete(p);
        limpiarCampos();
    }//GEN-LAST:event_jBtGenerarActionPerformed

    private void jFechaEmisionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jFechaEmisionFocusGained

    }//GEN-LAST:event_jFechaEmisionFocusGained

    private void jBtCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtCalcularActionPerformed
        Paquete p = new Paquete();
        LocalDate localdateInicio = jFechaInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate localdateFin = jFechaFin.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate localdateEmision = jFechaEmision.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        p.setCliente((Cliente) jComboCliente.getSelectedItem());
        p.setTransporte((Transporte) jComboTransporte.getSelectedItem());
        p.setExtra((Extraalojamiento) jComboExtra.getSelectedItem());

        p.setFechaInicio(localdateInicio);
        p.setFechaFin(localdateFin);
        p.setFechaEmisionPaquete(localdateEmision);

        p.setCostoTotalPaquete(p.getCostoTotalPaquete() * ((Integer) jCantidad.getValue()));

        p.setActivo(true);
    }//GEN-LAST:event_jBtCalcularActionPerformed

    private void jComboClienteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboClienteFocusGained
        llenarComboCliente();
        llenarComboDestino();
    }//GEN-LAST:event_jComboClienteFocusGained


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtCalcular;
    private javax.swing.JButton jBtGenerar;
    private javax.swing.JButton jBtSalir;
    private com.toedter.calendar.JCalendar jCalendar1;
    private javax.swing.JSpinner jCantidad;
    private javax.swing.JComboBox<Alojamiento> jComboAlojamiento;
    private javax.swing.JComboBox<Cliente> jComboCliente;
    private javax.swing.JComboBox<Destino> jComboDestino;
    private javax.swing.JComboBox<Extraalojamiento> jComboExtra;
    private javax.swing.JComboBox<Transporte> jComboTransporte;
    private com.toedter.calendar.JDateChooser jFechaEmision;
    private com.toedter.calendar.JDateChooser jFechaFin;
    private com.toedter.calendar.JDateChooser jFechaInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextCostoTotal;
    // End of variables declaration//GEN-END:variables
}
