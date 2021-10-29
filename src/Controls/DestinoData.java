/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controls;

import Models.Destino;
import java.sql.Connection;
import java.util.List;

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
    public void agregarDestino(Destino d){
        
    }
    
    public void eliminarDestino (int idDestino){
        
    }
    
    public void editarDestino (Destino d){
        
    }
    
    public Destino buscarDestino(int idDestino){
        
        return null;
    }
    
    public List<Destino> listarDestinos(){
        
        return null;
    }
    
    
    
    
    
}
