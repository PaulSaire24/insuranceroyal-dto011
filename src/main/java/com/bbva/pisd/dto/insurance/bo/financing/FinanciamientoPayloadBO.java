package com.bbva.pisd.dto.insurance.bo.financing;

import java.util.Date;
import java.util.List;

public class FinanciamientoPayloadBO {
    private String cotizacion;
    private Date fechaInicioFinanciamiento;
    private Date fechaInicio;
    private Date fechaFin;
    private List<CuotaFinanciamientoBO> financiamiento;

    public void setCotizacion(String cotizacion) {
        this.cotizacion = cotizacion;
    }

    public void setFechaInicioFinanciamiento(Date fechaInicioFinanciamiento) {
        this.fechaInicioFinanciamiento = fechaInicioFinanciamiento;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public List<CuotaFinanciamientoBO> getFinanciamiento() {
        return financiamiento;
    }

    public void setFinanciamiento(List<CuotaFinanciamientoBO> financiamiento) {
        this.financiamiento = financiamiento;
    }

    public String getCotizacion() {
        return cotizacion;
    }

    public Date getFechaInicioFinanciamiento() {
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
