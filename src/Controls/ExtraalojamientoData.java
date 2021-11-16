/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controls;

import Models.Alojamiento;
import Models.Extraalojamiento;
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
public class ExtraalojamientoData {

    //attributes
    private Connection con;
    private AlojamientoData ad;

    //constructor
    public ExtraalojamientoData(Conexion conexionExtraalojamiento) {
        this.con = conexionExtraalojamiento.conectar();
        ad = new AlojamientoData(conexionExtraalojamiento);
    }

    //methods
    public void agregarExtra(Extraalojamiento ea) {
        try {
            String query = "INSERT INTO extraalojamiento (idAlojamiento, tipoDeMenu, costo, activo) VALUES (?, ?, ?, ?)";
            
            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, ea.getAlojamiento().getIdAlojamiento());
            ps.setString(2, ea.getTipoDeMenu());
            ps.setFloat(3, ea.getCosto());
            ps.setBoolean(4, ea.isActivo());

            ps.executeQuery();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                ea.setIdExtra(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Extra agregado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo agregar el extra");
        }

    }

    public void eliminarExtra(int idExtra) {
        try {
            String query = "UPDATE extraalojamiento SET activo = false WHERE idExtra = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, idExtra);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Extra desactivado exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo desactivar el extra");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al desactivar el extra");
        }
    }

    public void editarExtra(Extraalojamiento ea) {
        try {
            String query = "UPDATE extraalojamiento SET idAlojamiento = ?, tipoDeMenu = ?, costo = ?, activo = ? WHERE idExtra = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(5, ea.getIdExtra());

            ps.setInt(1, ea.getAlojamiento().getIdAlojamiento());
            ps.setString(2, ea.getTipoDeMenu());
            ps.setFloat(3, ea.getCosto());
            ps.setBoolean(4, ea.isActivo());

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Extra actualizado");
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar el extra");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar el extra");
        }
    }

    public Extraalojamiento buscarExtra(int idExtra) {
        Extraalojamiento ea = new Extraalojamiento();
        try {
            String query = "SELECT * FROM extraalojamiento WHERE idExtra = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, idExtra);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ea = new Extraalojamiento();
                Alojamiento a = ad.buscarAlojamiento(rs.getInt("idAlojamiento"));

                ea.setIdExtra(rs.getInt("idExtra"));
                ea.setAlojamiento(a);
                ea.setTipoDeMenu(rs.getString("tipoDeMenu"));
                ea.setCosto(rs.getFloat("costo"));
                ea.setActivo(rs.getBoolean("activo"));
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        return ea;
    }

    public List<Extraalojamiento> listarTodosLosExtras() {
        ArrayList<Extraalojamiento> listaExtras = new ArrayList<>();
        try {
            String query = "SELECT * FROM extraalojamiento";

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Extraalojamiento ea = new Extraalojamiento();
                Alojamiento a = ad.buscarAlojamiento(rs.getInt("idAlojamiento"));

                ea.setIdExtra(rs.getInt("idExtra"));
                ea.setAlojamiento(a);
                ea.setTipoDeMenu(rs.getString("tipoDeMenu"));
                ea.setCosto(rs.getFloat("costo"));
                ea.setActivo(rs.getBoolean("activo"));

                listaExtras.add(ea);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        return listaExtras;
    }

    public List<Extraalojamiento> listarExtrasActivos() {
        ArrayList<Extraalojamiento> listaExtras = new ArrayList<>();
        try {
            String query = "SELECT * FROM extraalojamiento WHERE activo = true";

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Extraalojamiento ea = new Extraalojamiento();
                Alojamiento a = ad.buscarAlojamiento(rs.getInt("idAlojamiento"));

                ea.setIdExtra(rs.getInt("idExtra"));
                ea.setAlojamiento(a);
                ea.setTipoDeMenu(rs.getString("tipoDeMenu"));
                ea.setCosto(rs.getFloat("costo"));
                ea.setActivo(rs.getBoolean("activo"));

                listaExtras.add(ea);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        return listaExtras;
    }

    public List<Extraalojamiento> listarExtrasDeUnAlojamiento(int idAlojamiento) {
        ArrayList<Extraalojamiento> listaExtras = new ArrayList<>();
        try {
            String query = "SELECT * FROM extraalojamiento WHERE idAlojamiento = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, idAlojamiento);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Extraalojamiento ea = new Extraalojamiento();
                Alojamiento a = ad.buscarAlojamiento(rs.getInt("idAlojamiento"));

                ea.setIdExtra(rs.getInt("idExtra"));
                ea.setAlojamiento(a);
                ea.setTipoDeMenu(rs.getString("tipoDeMenu"));
                ea.setCosto(rs.getFloat("costo"));
                ea.setActivo(rs.getBoolean("activo"));

                listaExtras.add(ea);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        return listaExtras;
    }

}
