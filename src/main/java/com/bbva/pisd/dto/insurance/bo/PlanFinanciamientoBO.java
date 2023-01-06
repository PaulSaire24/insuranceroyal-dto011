package com.bbva.pisd.dto.insurance.bo;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlanFinanciamientoBO {

    private Long financiamiento;
    private String fechaInicio;
    private String fechaFin;
    private Long numeroCuotas;

    public Long getFinanciamiento() { return financiamiento; }
    public void setFinanciamiento(Long financiamiento) { this.financiamiento = financiamiento; }
    public String getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(String fechaInicio) { this.fechaInicio = fechaInicio; }
    public Long getNumeroCuotas() { return numeroCuotas; }
    public void setNumeroCuotas(Long numeroCuotas) { this.numeroCuotas = numeroCuotas; }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlanFinanciamientoBO{");
        sb.append("financiamiento=").append(financiamiento);
        sb.append(", fechaInicio='").append(fechaInicio).append('\'');
        sb.append(", fechaFin='").append(fechaFin).append('\'');
        sb.append(", numeroCuotas=").append(numeroCuotas);
        sb.append('}');
        return sb.toString();
    }
}
