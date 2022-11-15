package com.bbva.pisd.dto.insurance.bo;

import java.math.BigDecimal;
import java.util.List;

public class PlanBO extends CommonOutputFieldsBO {

    private Long idPlan;
    private String descripcionPlan;
    private String moneda;
    private BigDecimal primaNeta;
    private BigDecimal primaBruta;
    private String indicadorInspeccion;
    private String indicadorGPS;
    private List<FinanciamientoBO> financiamientos;
    private List<ServicioBO> servicios;
    private List<CoberturaBO> coberturas;
    private List<DeducibleBO> deducibles;

    public Long getIdPlan() { return idPlan; }
    public void setIdPlan(Long idPlan) { this.idPlan = idPlan; }
    public String getDescripcionPlan() { return descripcionPlan; }
    public void setDescripcionPlan(String descripcionPlan) { this.descripcionPlan = descripcionPlan; }
    public String getMoneda() { return moneda; }
    public void setMoneda(String moneda) { this.moneda = moneda; }
    public String getIndicadorGPS() { return indicadorGPS; }
    public void setIndicadorGPS(String indicadorGPS) { this.indicadorGPS = indicadorGPS; }
    public List<FinanciamientoBO> getFinanciamientos() { return financiamientos; }
    public void setFinanciamientos(List<FinanciamientoBO> financiamientos) { this.financiamientos = financiamientos; }
    public List<ServicioBO> getServicios() { return servicios; }
    public void setServicios(List<ServicioBO> servicios) { this.servicios = servicios; }
    public List<CoberturaBO> getCoberturas() { return coberturas; }
    public void setCoberturas(List<CoberturaBO> coberturas) { this.coberturas = coberturas; }
    public List<DeducibleBO> getDeducibles() { return deducibles; }
    public void setDeducibles(List<DeducibleBO> deducibles) { this.deducibles = deducibles; }

    @Override
    public BigDecimal getPrimaNeta() {
        return primaNeta;
    }

    @Override
    public void setPrimaNeta(BigDecimal primaNeta) {
        this.primaNeta = primaNeta;
    }

    @Override
    public BigDecimal getPrimaBruta() {
        return primaBruta;
    }

    @Override
    public void setPrimaBruta(BigDecimal primaBruta) {
        this.primaBruta = primaBruta;
    }

    @Override
    public String getIndicadorInspeccion() {
        return indicadorInspeccion;
    }

    @Override
    public void setIndicadorInspeccion(String indicadorInspeccion) {
        this.indicadorInspeccion = indicadorInspeccion;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlanBO{");
        sb.append("idPlan=").append(idPlan);
        sb.append(", descripcionPlan='").append(descripcionPlan).append('\'');
        sb.append(", moneda='").append(moneda).append('\'');
        sb.append(", primaNeta=").append(primaNeta);
        sb.append(", primaBruta=").append(primaBruta);
        sb.append(", indicadorInspeccion='").append(indicadorInspeccion).append('\'');
        sb.append(", indicadorGPS='").append(indicadorGPS).append('\'');
        sb.append(", financiamientos=").append(financiamientos);
        sb.append(", servicios=").append(servicios);
        sb.append(", coberturas=").append(coberturas);
        sb.append(", deducibles=").append(deducibles);
        sb.append('}');
        return sb.toString();
    }
}
