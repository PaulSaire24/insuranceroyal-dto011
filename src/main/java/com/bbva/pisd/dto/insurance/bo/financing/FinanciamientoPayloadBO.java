package com.bbva.pisd.dto.insurance.bo.financing;

import org.joda.time.LocalDate;
import java.util.List;

public class FinanciamientoPayloadBO {

    private String cotizacion;
    private LocalDate fechaInicioFinanciamiento;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private List<FinanciamientoBO> financiamiento;

    public void setCotizacion(String cotizacion) {
        this.cotizacion = cotizacion;
    }

    public void setFechaInicioFinanciamiento(LocalDate fechaInicioFinanciamiento) {
        this.fechaInicioFinanciamiento = fechaInicioFinanciamiento;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<FinanciamientoBO> getFinanciamiento() {
        return financiamiento;
    }

    public void setFinanciamiento(List<FinanciamientoBO> financiamiento) {
        this.financiamiento = financiamiento;
    }

    public String getCotizacion() {
        return cotizacion;
    }

    public LocalDate getFechaInicioFinanciamiento() {
        return fechaInicioFinanciamiento;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FinanciamientoBO{");
        sb.append("cotizacion='").append(cotizacion).append('\'');
        sb.append(", fechaInicioFinanciamiento=").append(fechaInicioFinanciamiento).append('\'');;
        sb.append(", fechaInicio=").append(fechaInicio).append('\'');
        sb.append(", fechaFin=").append(fechaFin).append('\'');
        sb.append(", finacimiento=").append(financiamiento).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
