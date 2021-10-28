/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import Controls.ClienteData;
import Controls.Conexion;
import Models.Cliente;

/**
 *
 * @author Santiago Cometto
 */
public class ProyectoFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion con = new Conexion();
        
        ClienteData cd = new ClienteData(con);
        
        Cliente santi = new Cliente(5, 42278453, "Santiago", "Cometto", "Calle 123", "San Luis", 770031, "santiagustinvm@gmail.com");

        //cd.agregarCliente(santi);
        
        santi.setNombre("Santiaaa");
        
        //cd.editarCliente(santi);
        
        Cliente lean = new Cliente(31125897,"Leando", "Damiani", "Calle 321", "San Luis", 751698, "leandroelfacha@gmail.com");
        
        //cd.agregarCliente(lean);

        System.out.println(cd.buscarCliente(8));
        
        System.out.println(cd.listarClientes());
        
        
        //cd.eliminarCliente(6);
        
    }
    
}
