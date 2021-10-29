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
public class Destino {

    //attributes
    private int idDestino;
    private String nombreDestino;
    private String pais;
    private boolean activo;

    //constructor
    public Destino() {

    }

    public Destino(String nombreDestino, String pais, boolean activo) {
        this.nombreDestino = nombreDestino;
        this.pais = pais;
        this.activo = activo;
    }

    public Destino(int idDestino, String nombreDestino, String pais, boolean activo) {
        this.idDestino = idDestino;
        this.nombreDestino = nombreDestino;
        this.pais = pais;
        this.activo = activo;
    }

    //methods
    public int getIdDestino() {
        return idDestino;
    }

    public String getNombreDestino() {
        return nombreDestino;
    }

    public String getPais() {
        return pais;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setIdDestino(int idDestino) {
        this.idDestino = idDestino;
    }

    public void setNombreDestino(String nombreDestino) {
        this.nombreDestino = nombreDestino;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return nombreDestino + ", " + pais;
    }

}
