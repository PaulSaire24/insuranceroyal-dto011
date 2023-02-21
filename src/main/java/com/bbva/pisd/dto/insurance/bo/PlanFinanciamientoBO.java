package com.bbva.pisd.dto.insurance.bo;

public class PlanFinanciamientoBO {

    private Long financiamiento;
    private String fechaInicio;
    private Long numeroCuotas;

    public Long getFinanciamiento() { return financiamiento; }
    public void setFinanciamiento(Long financiamiento) { this.financiamiento = financiamiento; }
    public String getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(String fechaInicio) { this.fechaInicio = fechaInicio; }
    public Long getNumeroCuotas() { return numeroCuotas; }
    public void setNumeroCuotas(Long numeroCuotas) { this.numeroCuotas = numeroCuotas; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlanFinanciamientoBO{");
        sb.append("financiamiento=").append(financiamiento);
        sb.append(", fechaInicio='").append(fechaInicio).append('\'');
        sb.append(", numeroCuotas=").append(numeroCuotas);
        sb.append('}');
        return sb.toString();
    }

}
