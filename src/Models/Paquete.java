/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import javafx.util.converter.LocalDateStringConverter;

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
    private float cant = 1;

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
        int dias = (int) ChronoUnit.DAYS.between(this.getFechaInicio(), this.getFechaFin());

        costoTotalPaquete
                = transporte.getCostoTransporte()
                + (extra.getAlojamiento().getCostoAlojamiento() * dias)
                + (extra.getCosto() * dias);

        if (fechaInicio.getMonthValue() == 1 || fechaInicio.getMonthValue() == 7) {
            return costoTotalPaquete = (float) (costoTotalPaquete * 1.30) * cant;
        } else if (fechaInicio.getMonthValue() == 2 || fechaInicio.getMonthValue() == 6) {
            return costoTotalPaquete = (float) (costoTotalPaquete * 1.15) * cant;
        } else {
            return costoTotalPaquete * cant;
        }
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

    public void setCant(float cant) {
        this.cant = cant;
    }

    @Override
    public String toString() {
        return idPaquete + " - " + cliente.getNombre() + " " + cliente.getApellido();
    }

}
