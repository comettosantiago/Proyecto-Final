/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

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
import java.time.LocalDate;

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

        
        //conexiones-----------------------------------
        Conexion con = new Conexion();

        ClienteData cd = new ClienteData(con);

        DestinoData dd = new DestinoData(con);
        
        TransporteData td = new TransporteData(con);
        
        AlojamientoData ad = new AlojamientoData(con);
        
        ExtraalojamientoData ed = new ExtraalojamientoData(con);
        
        PaqueteData pd = new PaqueteData(con);

        
        //clientes-------------------------------------
        Cliente santi = new Cliente(11, 42278453, "Santiago", "Cometto", "Calle 123", "San Luis", "2657770031", "santiagustinvm@gmail.com");

        Cliente lean = new Cliente(31125897, "Leando", "Damiani", "Calle 321", "San Luis", "2657751698", "leandroelfacha@gmail.com");
        
        //cd.agregarCliente(santi);
        
        //System.out.println(cd.buscarCliente(8));

        //System.out.println(cd.listarClientes());

        
        //destinos--------------------------------------
        Destino villacp = new Destino(9, "Villa Carlos Paz", "Argentina", true);
        
        //System.out.println(dd.buscarDestino(7));
        
        //dd.editarDestino(villacp);
        
        //dd.eliminarDestino(5);
        
        //System.out.println(dd.listarTodosLosDestinos());
        
        
        //transportes----------------------------------
        Transporte transporte = new Transporte(19, villacp, "Colectivo", 8000, true);
        
        //System.out.println(avionazo.getCostoTransporte());
        
        //td.agregarTransporte(avionazo);            
        
        //System.out.println(td.buscarTransporte(13));
        
        //td.eliminarTransporte(2);
        
        //td.editarTransporte(avionazo);
        
        //System.out.println(td.listarTransportesActivos());
        
        //System.out.println(td.listarTodosLosTransportes());
        
        //System.out.println(td.listarTransportesDeUnDestino(7));
        
        
        //alojamientos----------------------------------
        Alojamiento unalojamiento = new Alojamiento(10, "Departamentos Carlos Paz", villacp, "Departamento", 7500, true);
        
        //ad.agregarAlojamiento(unalojamiento);
        
        //ad.eliminarAlojamiento(10);
        
        //ad.editarAlojamiento(unalojamiento);

        //System.out.println(ad.listarTodosLosAlojamientos());
        
        //System.out.println(ad.listarAlojamientosActivos());
        
        //System.out.println(ad.listarAlojamientosDeUnDestino(0));
        
        
        //extraalojamientos-----------------------------
        Extraalojamiento ea =new Extraalojamiento(20, unalojamiento, "Media pension + desayuno", 900, true);
        
        //ed.agregarExtra(ea);
        
        //ed.eliminarExtra(20);
        
        //ed.editarExtra(ea);
        
        //System.out.println(ed.listarTodosLosExtras());
        
        //System.out.println(ed.listarExtrasActivos());
        
        //System.out.println(ed.listarExtrasDeUnAlojamiento(7));
        
        
        //paquetes----------------------------------------
        Paquete p = new Paquete(santi, transporte, ea, LocalDate.of(2022, 2, 15), LocalDate.of(2022, 3, 19), LocalDate.of(2021, 11, 01), 0, true);
        
        //System.out.println(p.getCostoTotalPaquete());
        
        pd.agregarPaquete(p);             
        
        
            
            
            
            
            
        
        
        
        

    }

}
