/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controls;

import Models.Destino;
import Models.Transporte;
import java.sql.Connection;
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
public class TransporteData {

    //attributes
    private Connection con;
    private DestinoData dd;

    //constructor
    public TransporteData(Conexion conexionTransporte) {
        this.con = conexionTransporte.conectar();
        dd = new DestinoData(conexionTransporte);
    }

    //methods
    public void agregarTransporte(Transporte t) { //
        try {
            String query = "INSERT INTO transporte (idDestino, tipoDeTransporte, costoTransporte, activo) VALUES (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, t.getDestino().getIdDestino());
            ps.setString(2, t.getTipoDeTransporte());
            ps.setFloat(3, t.getCostoTransporte());
            ps.setBoolean(4, t.isActivo());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                t.setIdTransporte(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Transporte agregado");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo agregar el transporte");
        }
    }

    public void eliminarTransporte(int idTransporte) {
        try {
            String query = "UPDATE transporte SET activo = false WHERE idTransporte = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, idTransporte);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Transporte desactivado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se realizaron cambios");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al desactivar transporte");
        }

    }

    public void editarTransporte(Transporte t) {
        try {
            String query = "UPDATE transporte SET idDestino = ?, tipoDeTransporte = ?, costoTransporte = ?, activo= ? WHERE idTransporte = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(5, t.getIdTransporte());

            ps.setInt(1, t.getDestino().getIdDestino());
            ps.setString(2, t.getTipoDeTransporte());
            ps.setFloat(3, t.getCostoTransporte());
            ps.setBoolean(4, t.isActivo());

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Transporte actualizado");
            } else {
                JOptionPane.showMessageDialog(null, "Error de peticion");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar transporte");
        }
    }

    public Transporte buscarTransporte(int idTransporte) {
        Transporte t = new Transporte();

        try {
            String query = "SELECT * FROM transporte WHERE idTransporte = ? AND activo = true";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, idTransporte);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                t = new Transporte();
                Destino d = dd.buscarDestino(rs.getInt("idDestino"));

                t.setIdTransporte(rs.getInt("idTransporte"));
                t.setDestino(d);
                t.setTipoDeTransporte(rs.getString("tipoDeTransporte"));
                t.setCostoTransporte(rs.getFloat("costoTransporte"));
                t.setActivo(rs.getBoolean("activo"));
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }

        return t;
    }

    public List<Transporte> listarTodosLosTransportes() {
        ArrayList<Transporte> listaTransportes = new ArrayList<>();

        try {
            String query = "SELECT * FROM transporte";

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Transporte t = new Transporte();
                Destino d = dd.buscarDestino(rs.getInt("idDestino"));

                t.setIdTransporte(rs.getInt("idTransporte"));
                t.setDestino(d);
                t.setTipoDeTransporte(rs.getString("tipoDeTransporte"));
                t.setCostoTransporte(rs.getFloat("costoTransporte"));
                t.setActivo(rs.getBoolean("activo"));

                listaTransportes.add(t);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        return listaTransportes;
    }

    public List<Transporte> listarTransportesActivos() {
        ArrayList<Transporte> listaTransportes = new ArrayList<>();

        try {
            String query = "SELECT * FROM transporte WHERE activo = true";

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Transporte t = new Transporte();
                Destino d = dd.buscarDestino(rs.getInt("idDestino"));

                t.setIdTransporte(rs.getInt("idTransporte"));
                t.setDestino(d);
                t.setTipoDeTransporte(rs.getString("tipoDeTransporte"));
                t.setCostoTransporte(rs.getFloat("costoTransporte"));
                t.setActivo(rs.getBoolean("activo"));

                listaTransportes.add(t);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        return listaTransportes;
    }

    public List<Transporte> listarTransportesDeUnDestino(int idDestino) {
        ArrayList<Transporte> listaTransportes = new ArrayList<>();

        try {
            String query = "SELECT * FROM transporte WHERE idDestino = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, idDestino);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Transporte t = new Transporte();
                Destino d = dd.buscarDestino(rs.getInt("idDestino"));

                t.setIdTransporte(rs.getInt("idTransporte"));
                t.setDestino(d);
                t.setTipoDeTransporte(rs.getString("tipoDeTransporte"));
                t.setCostoTransporte(rs.getFloat("costoTransporte"));
                t.setActivo(rs.getBoolean("activo"));

                listaTransportes.add(t);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }

        return listaTransportes;
    }

}
