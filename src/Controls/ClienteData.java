/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controls;

import Models.Cliente;
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
public class ClienteData {

    //attributes
    private Connection con;

    //constructor
    public ClienteData(Conexion conexionCliente) {
        this.con = conexionCliente.conectar(); //
    }

    //methods
    public void agregarCliente(Cliente c) {
        try {
            String query = "INSERT INTO cliente (dni, nombre, apellido, direccion, ciudad, telefono, email) VALUES(?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, c.getDni());
            ps.setString(2, c.getNombre());
            ps.setString(3, c.getApellido());
            ps.setString(4, c.getDireccion());
            ps.setString(5, c.getCiudad());
            ps.setString(6, c.getTelefono());
            ps.setString(7, c.getEmail());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                c.setIdCliente(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Cliente agregado");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo agregar al cliente");
        }
    }

    public void eliminarCliente(int idCliente) {
        try {
            String query = "DELETE FROM cliente WHERE idCliente = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, idCliente);

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cliente eliminado");
            } else {
                JOptionPane.showMessageDialog(null, "Error de peticion");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al eliminar cliente");
        }
    }

    public void editarCliente(Cliente c) {
        try {
            String query = "UPDATE cliente SET dni = ?, nombre = ?, apellido = ?, direccion = ?, ciudad = ?, telefono = ?, email = ? WHERE idCliente = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(8, c.getIdCliente());

            ps.setInt(1, c.getDni());
            ps.setString(2, c.getNombre());
            ps.setString(3, c.getApellido());
            ps.setString(4, c.getDireccion());
            ps.setString(5, c.getCiudad());
            ps.setString(6, c.getTelefono());
            ps.setString(7, c.getEmail());

            if (ps.executeUpdate() > 0) {
                JOptionPane.showMessageDialog(null, "Cliente actualizado");
            } else {
                JOptionPane.showMessageDialog(null, "Error de peticion");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al actualizar cliente");
        }
    }

    public Cliente buscarCliente(int idCliente) {
        Cliente c = new Cliente();
        try {
            String query = "SELECT * FROM cliente WHERE idCliente = ?";

            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, idCliente);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                c.setIdCliente(idCliente);
                c.setDni(rs.getInt("dni"));
                c.setNombre(rs.getString("nombre"));
                c.setApellido(rs.getString("apellido"));
                c.setDireccion(rs.getString("direccion"));
                c.setCiudad(rs.getString("ciudad"));
                c.setTelefono(rs.getString("telefono"));
                c.setEmail(rs.getString("email"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar cliente");
        }
        return c;
    }

    public List<Cliente> listarTodosLosClientes() {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        try {
            String query = "SELECT * FROM cliente";

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente();

                c.setIdCliente(rs.getInt("idCliente"));
                c.setDni(rs.getInt("dni"));
                c.setNombre(rs.getString("nombre"));
                c.setApellido(rs.getString("apellido"));
                c.setDireccion(rs.getString("direccion"));
                c.setCiudad(rs.getString("ciudad"));
                c.setTelefono(rs.getString("telefono"));
                c.setEmail(rs.getString("email"));

                listaClientes.add(c);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar cliente");
        }
        return listaClientes;
    }
    
        public List<Cliente> listarClientesActivos() {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        try {
            String query = "SELECT * FROM cliente WHERE activo = true";

            PreparedStatement ps = con.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente();

                c.setIdCliente(rs.getInt("idCliente"));
                c.setDni(rs.getInt("dni"));
                c.setNombre(rs.getString("nombre"));
                c.setApellido(rs.getString("apellido"));
                c.setDireccion(rs.getString("direccion"));
                c.setCiudad(rs.getString("ciudad"));
                c.setTelefono(rs.getString("telefono"));
                c.setEmail(rs.getString("email"));

                listaClientes.add(c);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar cliente");
        }
        return listaClientes;
    }
    
    

}
