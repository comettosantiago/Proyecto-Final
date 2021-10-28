/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.time.LocalDate;

/**
 *
 * @author Santiago Cometto
 */
public class Paquete {

    //methods
    private int idPaquete;
    private Cliente cliente;
    private Transporte transporte;
    private Extraalojamiento extra;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private LocalDate fechaEmisionPaquete;
    private float costoTotalPaquete;
    private boolean activo;

    //constructor
    public Paquete() {

    }

    public Paquete(Cliente cliente, Transporte transporte, Extraalojamiento extra, LocalDate fechaInicio, LocalDate fechaFin, LocalDate fechaEmisionPaquete, float costoTotalPaquete, boolean activo) {
        this.cliente = cliente;
        this.transporte = transporte;
        this.extra = extra;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.fechaEmisionPaquete = fechaEmisionPaquete;
        this.costoTotalPaquete = costoTotalPaquete;
        this.activo = activo;
    }

    public Paquete(int idPaquete, Cliente cliente, Transporte transporte, Extraalojamiento extra, LocalDate fechaInicio, LocalDate fechaFin, LocalDate fechaEmisionPaquete, float costoTotalPaquete, boolean activo) {
        this.idPaquete = idPaquete;
        this.cliente = cliente;
        this.transporte = transporte;
        this.extra = extra;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.fechaEmisionPaquete = fechaEmisionPaquete;
        this.costoTotalPaquete = costoTotalPaquete;
        this.activo = activo;
    }

    //methods
    public int getIdPaquete() {
        return idPaquete;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public Extraalojamiento getExtra() {
        return extra;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public LocalDate getFechaEmisionPaquete() {
        return fechaEmisionPaquete;
    }

    public float getCostoTotalPaquete() {
        return costoTotalPaquete;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setIdPaquete(int idPaquete) {
        this.idPaquete = idPaquete;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public void setExtra(Extraalojamiento extra) {
        this.extra = extra;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setFechaEmisionPaquete(LocalDate fechaEmisionPaquete) {
        this.fechaEmisionPaquete = fechaEmisionPaquete;
    }

    public void setCostoTotalPaquete(float costoTotalPaquete) {
        this.costoTotalPaquete = costoTotalPaquete;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    @Override
    public String toString() {
        return "Paquete{" + "idPaquete=" + idPaquete + ", cliente=" + cliente + ", transporte=" + transporte + ", extra=" + extra + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", fechaEmisionPaquete=" + fechaEmisionPaquete + ", costoTotalPaquete=" + costoTotalPaquete + ", activo=" + activo + '}';
    }

}
