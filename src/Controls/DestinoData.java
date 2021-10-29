/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controls;

import Models.Destino;
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
public class DestinoData {

    //methods
    private Connection con;

    //constructor
    public DestinoData(Conexion conexionDestino) {
        this.con = conexionDestino.conectar();
    }

    //methods
    public void agregarDestino(Destino d) {
        try {
            String query = "INSERT INTO destino (nombreDestino, pais, activo) VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, d.getNombreDestino());
            ps.setString(2, d.getPais());
            ps.setBoolean(3, d.isActivo());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                d.setIdDestino(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Destino agregado");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo agregar el destino");
        }
    }

    public void eliminarDestino(int idDestino) {
        try {
            String query = "UPDATE destino SET activo = false WHERE idDestino = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, idDestino);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Destino desactivado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se realizaron cambios");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al desactivar destino");
        }
    }

    public void editarDestino(Destino d) {
        try {
            String query = "UPDATE destino SET nombreDestino = ?, pais = ?, activo = ? WHERE idDestino = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(4, d.getIdDestino());

            ps.setString(1, d.getNombreDestino());
            ps.setString(2, d.getPais());
            ps.setBoolean(3, d.isActivo());

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Destino actualizado");
            } else {
                JOptionPane.showMessageDialog(null, "Error de peticion");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar destino");
        }
    }

    public Destino buscarDestino(int idDestino) {
        Destino d = null;

        try {
            String query = "SELECT * FROM destino WHERE idDestino = ? AND activo = true";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, idDestino);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                d = new Destino();

                d.setIdDestino(rs.getInt("idDestino"));
                d.setNombreDestino(rs.getString("nombreDestino"));
                d.setPais(rs.getString("pais"));
                d.setActivo(rs.getBoolean("activo"));
            }
            ps.close();
        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        return d;
    }

    public List<Destino> listarTodosLosDestinos() {
        ArrayList<Destino> listaDestino = new ArrayList<>();
        try {
            String query = "SELECT * FROM destino";

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Destino d = new Destino();

                d.setIdDestino(rs.getInt("idDestino"));
                d.setNombreDestino(rs.getString("nombreDestino"));
                d.setPais(rs.getString("pais"));
                d.setActivo(rs.getBoolean("activo"));

                listaDestino.add(d);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al listar destino");
        }
        return listaDestino;

    }

    public List<Destino> listarDestinosActivos() {
        ArrayList<Destino> listaDestinos = new ArrayList<>();

        try {
            String query = "SELECT * FROM destino WHERE activo = true";

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Destino d = new Destino();

                d.setIdDestino(rs.getInt("idDestino"));
                d.setNombreDestino(rs.getString("nombreDestino"));
                d.setPais(rs.getString("pais"));
                d.setActivo(rs.getBoolean("activo"));

                listaDestinos.add(d);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al listar destinos");
        }
        return listaDestinos;
    }

}
