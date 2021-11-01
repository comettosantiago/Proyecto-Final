/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controls;

import Models.Alojamiento;
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
public class AlojamientoData {

    //attributes
    private Connection con;
    private DestinoData dd;

    //constructor
    public AlojamientoData(Conexion conexionDestino) {
        this.con = conexionDestino.conectar();
        dd = new DestinoData(conexionDestino);
    }

    //methods 
    public void agregarAlojamiento(Alojamiento a) {
        try {
            String query = "INSERT INTO alojamiento (nombreAlojamiento, idDestino, tipoDeAlojamiento, costoAlojamiento, activo) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, a.getNombreAlojamiento());
            ps.setInt(2, a.getDestino().getIdDestino());
            ps.setString(3, a.getTipoDeAlojamiento());
            ps.setFloat(4, a.getCostoAlojamiento());
            ps.setBoolean(5, a.isActivo());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                a.setIdAlojamiento(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alojamiento agregado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo agregar el alojamiento"+ex);
        }
    }

    public void eliminarAlojamiento(int idAlojamiento) {
        try {
            String query = "UPDATE alojamiento SET activo = false WHERE idAlojamiento = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, idAlojamiento);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Alojamiento desactivado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo desactivar el alojamiento");
            }
            ps.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al desactivar alojamiento");
        }
    }

    public void editarAlojamiento(Alojamiento a) {
        try {
            String query = "UPDATE alojamiento SET nombreAlojamiento = ?, idDestino = ?, tipoDeAlojamiento = ?, costoAlojamiento = ?, activo = ? WHERE idAlojamiento = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(6, a.getIdAlojamiento());

            ps.setString(1, a.getNombreAlojamiento());
            ps.setInt(2, a.getDestino().getIdDestino());
            ps.setString(3, a.getTipoDeAlojamiento());
            ps.setFloat(4, a.getCostoAlojamiento());
            ps.setBoolean(5, a.isActivo());

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Alojamiento actualizado");
            } else {
                JOptionPane.showMessageDialog(null, "Error al actualizar alojamiento");
            }
            ps.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de base de datos");
        }
    }

    public Alojamiento buscarAlojamiento(int idAlojamiento) {
        Alojamiento a = new Alojamiento();
        try {
            String query = "SELECT * FROM alojamiento WHERE idAlojamiento = ? AND activo = true";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, idAlojamiento);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                a = new Alojamiento();
                Destino d = dd.buscarDestino(rs.getInt("idDestino"));

                a.setIdAlojamiento(rs.getInt("idAlojamiento"));
                a.setNombreAlojamiento(rs.getString("nombreAlojamiento"));
                a.setDestino(d);
                a.setTipoDeAlojamiento(rs.getString("tipoDeAlojamiento"));
                a.setCostoAlojamiento(rs.getFloat("costoAlojamiento"));
                a.setActivo(rs.getBoolean("activo"));
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        return a;
    }

    public List<Alojamiento> listarTodosLosAlojamientos() {
        ArrayList<Alojamiento> listaAlojamientos = new ArrayList<>();
        try {
            String query = "SELECT * FROM alojamiento";

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Alojamiento a = new Alojamiento();
                Destino d = dd.buscarDestino(rs.getInt("idDestino"));

                a.setIdAlojamiento(rs.getInt("idAlojamiento"));
                a.setNombreAlojamiento(rs.getString("nombreAlojamiento"));
                a.setDestino(d);
                a.setTipoDeAlojamiento(rs.getString("tipoDeAlojamiento"));
                a.setCostoAlojamiento(rs.getFloat("costoAlojamiento"));
                a.setActivo(rs.getBoolean("activo"));

                listaAlojamientos.add(a);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        return listaAlojamientos;
    }

    public List<Alojamiento> listarAlojamientosActivos() {
        ArrayList<Alojamiento> listaAlojamientos = new ArrayList<>();
        try {
            String query = "SELECT * FROM alojamiento WHERE activo = true";

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Alojamiento a = new Alojamiento();
                Destino d = dd.buscarDestino(rs.getInt("idDestino"));

                a.setIdAlojamiento(rs.getInt("idAlojamiento"));
                a.setNombreAlojamiento(rs.getString("nombreAlojamiento"));
                a.setDestino(d);
                a.setTipoDeAlojamiento(rs.getString("tipoDeAlojamiento"));
                a.setCostoAlojamiento(rs.getFloat("costoAlojamiento"));
                a.setActivo(rs.getBoolean("activo"));

                listaAlojamientos.add(a);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        return listaAlojamientos;
    }

    public List<Alojamiento> listarAlojamientosDeUnDestino(int idDestino) {
        ArrayList<Alojamiento> listaAlojamientos = new ArrayList<>();
        try {
            String query = "SELECT * FROM alojamiento WHERE idDestino = ?";

            PreparedStatement ps = con.prepareStatement(query);
            
            ps.setInt(1, idDestino);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Alojamiento a = new Alojamiento();
                Destino d = dd.buscarDestino(rs.getInt("idDestino"));

                a.setIdAlojamiento(rs.getInt("idAlojamiento"));
                a.setNombreAlojamiento(rs.getString("nombreAlojamiento"));
                a.setDestino(d);
                a.setTipoDeAlojamiento(rs.getString("tipoDeAlojamiento"));
                a.setCostoAlojamiento(rs.getFloat("costoAlojamiento"));
                a.setActivo(rs.getBoolean("activo"));

                listaAlojamientos.add(a);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        return listaAlojamientos;

    }

}
