package com.bbva.pisd.dto.insurance.bo;


import java.util.Date;

public class CotizacionBO {

    private String idCotizacion;
    private String diasVigencia;
    private Date fechaFinVigencia;
    private PlanBO plan;
    private Long indicadorRequiereInspeccion;

    public String getIdCotizacion() { return idCotizacion; }
    public void setIdCotizacion(String idCotizacion) { this.idCotizacion = idCotizacion; }
    public String getDiasVigencia() { return diasVigencia; }
    public void setDiasVigencia(String diasVigencia) { this.diasVigencia = diasVigencia; }
    public Date getFechaFinVigencia() { return fechaFinVigencia; }
    public void setFechaFinVigencia(Date fechaFinVigencia) { this.fechaFinVigencia = fechaFinVigencia; }
    public PlanBO getPlan() { return plan; }
    public void setPlan(PlanBO plan) { this.plan = plan; }
    public Long getIndicadorRequiereInspeccion() { return indicadorRequiereInspeccion; }
    public void setIndicadorRequiereInspeccion(Long indicadorRequiereInspeccion) { this.indicadorRequiereInspeccion = indicadorRequiereInspeccion; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CotizacionBO{");
        sb.append("idCotizacion='").append(idCotizacion).append('\'');
        sb.append(", diasVigencia='").append(diasVigencia).append('\'');
        sb.append(", fechaFinVigencia='").append(fechaFinVigencia).append('\'');
        sb.append(", indicadorRequiereInspeccion='").append(indicadorRequiereInspeccion).append('\'');
        sb.append(", plan=").append(plan);
        sb.append('}');
        return sb.toString();
    }
}
