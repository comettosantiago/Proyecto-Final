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
public class Extraalojamiento {

    //attributes
    private int idExtra;
    private Alojamiento alojamiento;
    private String tipoDeMenu;
    private float costo;
    private boolean activo;

    //constructor
    public Extraalojamiento() {

    }

    public Extraalojamiento(Alojamiento alojamiento, String tipoDeMenu, float costo, boolean activo) {
        this.alojamiento = alojamiento;
        this.tipoDeMenu = tipoDeMenu;
        this.costo = costo;
        this.activo = activo;
    }

    public Extraalojamiento(int idExtra, Alojamiento alojamiento, String tipoDeMenu, float costo, boolean activo) {
        this.idExtra = idExtra;
        this.alojamiento = alojamiento;
        this.tipoDeMenu = tipoDeMenu;
        this.costo = costo;
        this.activo = activo;
    }

    //methods
    public int getIdExtra() {
        return idExtra;
    }

    public Alojamiento getAlojamiento() {
        return alojamiento;
    }

    public String getTipoDeMenu() {
        return tipoDeMenu;
    }

    public float getCosto() {
        return costo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setIdExtra(int idExtra) {
        this.idExtra = idExtra;
    }

    public void setAlojamiento(Alojamiento alojamiento) {
        this.alojamiento = alojamiento;
    }

    public void setTipoDeMenu(String tipoDeMenu) {
        this.tipoDeMenu = tipoDeMenu;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return alojamiento.getNombreAlojamiento() + " " + tipoDeMenu;
    }

}
