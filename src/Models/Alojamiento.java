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
public class Alojamiento {

    //attributes
    private int idAlojamiento;
    private String nombreAlojamiento;
    private Destino destino;
    private String tipoDeAlojamiento;
    private float costoAlojamiento;
    private boolean activo;

    //constructor
    public Alojamiento() {

    }

    public Alojamiento(String nombreAlojamiento, Destino destino, String tipoDeAlojamiento, float costoAlojamiento, boolean activo) {
        this.nombreAlojamiento = nombreAlojamiento;
        this.destino = destino;
        this.tipoDeAlojamiento = tipoDeAlojamiento;
        this.costoAlojamiento = costoAlojamiento;
        this.activo = activo;
    }

    public Alojamiento(int idAlojamiento, String nombreAlojamiento, Destino destino, String tipoDeAlojamiento, float costoAlojamiento, boolean activo) {
        this.idAlojamiento = idAlojamiento;
        this.nombreAlojamiento = nombreAlojamiento;
        this.destino = destino;
        this.tipoDeAlojamiento = tipoDeAlojamiento;
        this.costoAlojamiento = costoAlojamiento;
        this.activo = activo;
    }

    //methods
    public int getIdAlojamiento() {
        return idAlojamiento;
    }

    public String getNombreAlojamiento() {
        return nombreAlojamiento;
    }

    public Destino getDestino() {
        return destino;
    }

    public String getTipoDeAlojamiento() {
        return tipoDeAlojamiento;
    }

    public float getCostoAlojamiento() {
        return costoAlojamiento;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setIdAlojamiento(int idAlojamiento) {
        this.idAlojamiento = idAlojamiento;
    }

    public void setNombreAlojamiento(String nombreAlojamiento) {
        this.nombreAlojamiento = nombreAlojamiento;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public void setTipoDeAlojamiento(String tipoDeAlojamiento) {
        this.tipoDeAlojamiento = tipoDeAlojamiento;
    }

    public void setCostoAlojamiento(float costoAlojamiento) {
        this.costoAlojamiento = costoAlojamiento;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return nombreAlojamiento + " - " + destino.getNombreDestino();
    }

}
