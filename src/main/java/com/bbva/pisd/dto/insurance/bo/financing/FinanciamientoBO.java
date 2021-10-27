package com.bbva.pisd.dto.insurance.bo.financing;

import java.math.BigDecimal;
import org.joda.time.LocalDate;

public class FinanciamientoBO {

    private String financiamiento;
    private Long numeroCuotasTotales;
    private String periodo;
    private String descripcionPeriodo;
    private BigDecimal montoCuota;
    private String moneda;
    private Long nroCuotas;
    private String frecuencia;
    private LocalDate fechaInicio;
    private Long numeroCuotas;
    private String indicadorDescuentoPrima;

    public Long getNroCuotas() { return nroCuotas; }
    public void setNroCuotas(Long nroCuotas) { this.nroCuotas = nroCuotas; }
    public String getFinanciamiento() {
        return financiamiento;
    }
    public void setFinanciamiento(String financiamiento) {
        this.financiamiento = financiamiento;
    }
    public Long getNumeroCuotasTotales() {
        return numeroCuotasTotales;
    }
    public void setNumeroCuotasTotales(Long numeroCuotasTotales) {
        this.numeroCuotasTotales = numeroCuotasTotales;
    }
    public String getPeriodo() {
        return periodo;
    }
    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }
    public String getDescripcionPeriodo() {
        return descripcionPeriodo;
    }
    public void setDescripcionPeriodo(String descripcionPeriodo) {
        this.descripcionPeriodo = descripcionPeriodo;
    }
    public BigDecimal getMontoCuota() {
        return montoCuota;
    }
    public void setMontoCuota(BigDecimal montoCuota) {
        this.montoCuota = montoCuota;
    }
    public String getMoneda() {
        return moneda;
    }
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public LocalDate getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(LocalDate fechaInicio) { this.fechaInicio = fechaInicio; }
    public Long getNumeroCuotas() { return numeroCuotas; }
    public void setNumeroCuotas(Long numeroCuotas) { this.numeroCuotas = numeroCuotas; }
    public String getFrecuencia() { return frecuencia; }
    public void setFrecuencia(String frecuencia) { this.frecuencia = frecuencia; }
    public String getIndicadorDescuentoPrima() {return indicadorDescuentoPrima;}
    public void setIndicadorDescuentoPrima(String indicadorDescuentoPrima) {this.indicadorDescuentoPrima = indicadorDescuentoPrima;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CuotaFinanciamientoBO{");
        sb.append("financiamiento=").append(financiamiento);
        sb.append(", numeroCuotasTotales=").append(numeroCuotasTotales);
        sb.append(", periodo='").append(periodo).append('\'');
        sb.append(", descripcionPeriodo='").append(descripcionPeriodo).append('\'');
        sb.append(", montoCuota='").append(montoCuota).append('\'');
        sb.append(", moneda='").append(moneda).append('\'');
        sb.append(", nroCuotas='").append(nroCuotas).append('\'');
        sb.append("frecuencia=").append(frecuencia).append('\'');
        sb.append(", fechaInicio=").append(fechaInicio).append('\'');
        sb.append(", numeroCuotas='").append(numeroCuotas).append('\'');
        sb.append(", indicadorDescuentoPrima='").append(indicadorDescuentoPrima).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
