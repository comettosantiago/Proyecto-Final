/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controls;

import Models.Cliente;
import Models.Extraalojamiento;
import Models.Paquete;
import Models.Transporte;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago Cometto
 */
public class PaqueteData {

    //attributes
    private Connection con;
    private ClienteData cd;
    private TransporteData td;
    private ExtraalojamientoData ed;

    //constructor
    public PaqueteData(Conexion conexionPaqueteData) {
        this.con = conexionPaqueteData.conectar();
        cd = new ClienteData(conexionPaqueteData);
        td = new TransporteData(conexionPaqueteData);
        ed = new ExtraalojamientoData(conexionPaqueteData);
    }

    //methods
    public void agregarPaquete(Paquete p) {
        try {
            String query = "INSERT INTO paquete (idCliente, idTransporte, idExtra, fechaInicio, fechaFin, fechaEmisionPaquete, costoTotalPaquete, activo) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, p.getCliente().getIdCliente());
            ps.setInt(2, p.getTransporte().getIdTransporte());
            ps.setInt(3, p.getExtra().getIdExtra());
            ps.setDate(4, Date.valueOf(p.getFechaInicio()));
            ps.setDate(5, Date.valueOf(p.getFechaFin()));
            ps.setDate(6, Date.valueOf(p.getFechaEmisionPaquete()));
            ps.setFloat(7, p.getCostoTotalPaquete());
            ps.setBoolean(8, p.isActivo());

            ps.executeQuery();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                p.setIdPaquete(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Paquete cargado exitosamente");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar paquete");
        }
    }

    public void eliminarPaquete(int idPaquete) {
        try {
            String query = "UPDATE paquete SET activo = false WHERE idPaquete = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, idPaquete);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Paquete desactivado");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo desactivar el paquete");
            }
            ps.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al desactivar paquete");
        }
    }

    public void editarPaquete(Paquete p) {
        try {
            String query = "UPDATE paquete SET idCliente = ?, idTransporte = ?, idExtra = ?, fechaInicio = ?, fechaFin = ?, fechaEmisionPaquete = ?, costoTotalPaquete = ?, activo = ? WHERE idPaquete = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(9, p.getIdPaquete());

            ps.setInt(1, p.getCliente().getIdCliente());
            ps.setInt(2, p.getTransporte().getIdTransporte());
            ps.setInt(3, p.getExtra().getIdExtra());
            ps.setDate(4, Date.valueOf(p.getFechaInicio()));
            ps.setDate(5, Date.valueOf(p.getFechaFin()));
            ps.setDate(6, Date.valueOf(p.getFechaEmisionPaquete()));
            ps.setFloat(7, p.getCostoTotalPaquete());
            ps.setBoolean(8, p.isActivo());

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Paquete actualizado");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el paquete");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar paquete");
        }
    }

    public Paquete buscarPaquete(int idPaquete) {
        Paquete p = new Paquete();
        try {
            String query = "SELECT * FROM paquete WHERE idPaquete = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, idPaquete);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                p = new Paquete();
                Cliente c = cd.buscarCliente(p.getCliente().getIdCliente());
                Transporte t = td.buscarTransporte(p.getTransporte().getIdTransporte());
                Extraalojamiento e = ed.buscarExtra(p.getExtra().getIdExtra());

                p.setIdPaquete(rs.getInt("idPaquete"));
                p.setCliente(c);
                p.setTransporte(t);
                p.setExtra(e);
                p.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                p.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                p.setFechaEmisionPaquete(rs.getDate("fechaEmisionPaquete").toLocalDate());
                p.setCostoTotalPaquete(rs.getFloat("costoTotalPaquete"));
                p.setActivo(rs.getBoolean("activo"));
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        return p;
    }

    public List<Paquete> listarTodosLosPaquetes() {
        ArrayList<Paquete> listaPaquetes = new ArrayList<>();
        try {
            String query = "SELECT * FROM paquete";

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Paquete p = new Paquete();
                Cliente c = cd.buscarCliente(p.getCliente().getIdCliente());
                Transporte t = td.buscarTransporte(p.getTransporte().getIdTransporte());
                Extraalojamiento e = ed.buscarExtra(p.getExtra().getIdExtra());

                p.setIdPaquete(rs.getInt("idPaquete"));
                p.setCliente(c);
                p.setTransporte(t);
                p.setExtra(e);
                p.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                p.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                p.setFechaEmisionPaquete(rs.getDate("fechaEmisionPaquete").toLocalDate());
                p.setCostoTotalPaquete(rs.getFloat("costoTotalPaquete"));
                p.setActivo(rs.getBoolean("activo"));

                listaPaquetes.add(p);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        return listaPaquetes;
    }

    public List<Paquete> listarPaquetesActivos() {
        ArrayList<Paquete> listaPaquetes = new ArrayList<>();
        try {
            String query = "SELECT * FROM paquete WHERE activo = true";

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Paquete p = new Paquete();
                Cliente c = cd.buscarCliente(p.getCliente().getIdCliente());
                Transporte t = td.buscarTransporte(p.getTransporte().getIdTransporte());
                Extraalojamiento e = ed.buscarExtra(p.getExtra().getIdExtra());

                p.setIdPaquete(rs.getInt("idPaquete"));
                p.setCliente(c);
                p.setTransporte(t);
                p.setExtra(e);
                p.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                p.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                p.setFechaEmisionPaquete(rs.getDate("fechaEmisionPaquete").toLocalDate());
                p.setCostoTotalPaquete(rs.getFloat("costoTotalPaquete"));
                p.setActivo(rs.getBoolean("activo"));

                listaPaquetes.add(p);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        return listaPaquetes;
    }

    public List<Paquete> listarPaquetesDeUnCliente(int idCliente) {
        ArrayList<Paquete> listaPaquetes = new ArrayList<>();
        try {
            String query = "SELECT * FROM paquete WHERE idCliente = ?";

            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setInt(1, idCliente);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Paquete p = new Paquete();
                Cliente c = cd.buscarCliente(p.getCliente().getIdCliente());
                Transporte t = td.buscarTransporte(p.getTransporte().getIdTransporte());
                Extraalojamiento e = ed.buscarExtra(p.getExtra().getIdExtra());

                p.setIdPaquete(rs.getInt("idPaquete"));
                p.setCliente(c);
                p.setTransporte(t);
                p.setExtra(e);
                p.setFechaInicio(rs.getDate("fechaInicio").toLocalDate());
                p.setFechaFin(rs.getDate("fechaFin").toLocalDate());
                p.setFechaEmisionPaquete(rs.getDate("fechaEmisionPaquete").toLocalDate());
                p.setCostoTotalPaquete(rs.getFloat("costoTotalPaquete"));
                p.setActivo(rs.getBoolean("activo"));

                listaPaquetes.add(p);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        return listaPaquetes;
    }

}
