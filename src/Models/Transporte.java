/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Santiago Cometto
 */
public class Transporte {

    //attributes
    private int idTransporte;
    private Destino destino;
    private String tipoDeTransporte;
    private float costoTransporte;
    private boolean activo;

    //constructor
    public Transporte() {

    }

    public Transporte(Destino destino, String tipoDeTransporte, float costoTransporte, boolean activo) {
        this.destino = destino;
        this.tipoDeTransporte = tipoDeTransporte;
        this.costoTransporte = costoTransporte;
        this.activo = activo;
    }

    public Transporte(int idTransporte, Destino destino, String tipoDeTransporte, float costoTransporte, boolean activo) {
        this.idTransporte = idTransporte;
        this.destino = destino;
        this.tipoDeTransporte = tipoDeTransporte;
        this.costoTransporte = costoTransporte;
        this.activo = activo;
    }

    //methods
    public int getIdTransporte() {
        return idTransporte;
    }

    public Destino getDestino() {
        return destino;
    }

    public String getTipoDeTransporte() {
        return tipoDeTransporte;
    }

    public float getCostoTransporte() {                          //CONSULTAR SI ESTA BIEN ASI O SI HAY QUE CARGAR EL PRECIO QUE SE QUIERA 
        //   if ("Colectivo".equals(this.tipoDeTransporte)) {
        //       return costoTransporte = (float) (costoTransporte * 0.80);   //el precio a cargar en la base de datos siempre es el precio base (el del automovil)
        //  }                                                                //en las vistas siempre se debe cargar el precio base, el programa se encarga de calcular segun el tipo
        //  if ("Avion".equals(this.tipoDeTransporte)) {
        //      return costoTransporte = (float) (costoTransporte * 1.40);
        //  } else {
        return costoTransporte;
        //  }
    }

    public boolean isActivo() {
        return activo;
    }

    public void setIdTransporte(int idTransporte) {
        this.idTransporte = idTransporte;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public void setTipoDeTransporte(String tipoDeTransporte) {
        this.tipoDeTransporte = tipoDeTransporte;
    }

    public void setCostoTransporte(float costoTransporte) {
        this.costoTransporte = costoTransporte;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Transporte{" + "idTransporte=" + idTransporte + ", destino=" + destino + ", tipoDeTransporte=" + tipoDeTransporte + ", costoTransporte=" + costoTransporte + ", activo=" + activo + '}';
    }

}
