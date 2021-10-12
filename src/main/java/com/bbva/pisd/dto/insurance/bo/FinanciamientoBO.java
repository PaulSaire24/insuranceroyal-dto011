package com.bbva.pisd.dto.insurance.bo;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class FinanciamientoBO extends CommonOutputFieldsBO {

    private String idFinanciamiento;
    private Long financiamiento;
    private String periodicidad;
    private Long numeroCuotas;
    private String indicadorDescuentoPrima;
    private BigDecimal montoNetoFrac;
    private BigDecimal montoPago;
    private Date fechaInicio;
    private Date fechaFinal;
    private List<CuotaFinanciamientoBO> cuotasFinanciamiento;

    public String getIdFinanciamiento() { return idFinanciamiento; }
    public void setIdFinanciamiento(String idFinanciamiento) { this.idFinanciamiento = idFinanciamiento; }
    public Long getFinanciamiento() { return financiamiento; }
    public void setFinanciamiento(Long financiamiento) { this.financiamiento = financiamiento; }
    public String getPeriodicidad() { return periodicidad; }
    public void setPeriodicidad(String periodicidad) { this.periodicidad = periodicidad; }
    public Long getNumeroCuotas() { return numeroCuotas; }
    public void setNumeroCuotas(Long numeroCuotas) { this.numeroCuotas = numeroCuotas; }
    public String getIndicadorDescuentoPrima() {return indicadorDescuentoPrima;}
    public void setIndicadorDescuentoPrima(String indicadorDescuentoPrima) {this.indicadorDescuentoPrima = indicadorDescuentoPrima;}
    public BigDecimal getMontoNetoFrac() {return montoNetoFrac;}
    public void setMontoNetoFrac(BigDecimal montoNetoFrac) {this.montoNetoFrac = montoNetoFrac;}
    public BigDecimal getMontoPago() {return montoPago;}
    public void setMontoPago(BigDecimal montoPago) {this.montoPago = montoPago;}
    public Date getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(Date fechaInicio) { this.fechaInicio = fechaInicio; }
    public Date getFechaFinal() { return fechaFinal; }
    public void setFechaFinal(Date fechaFinal) { this.fechaFinal = fechaFinal; }
    public List<CuotaFinanciamientoBO> getCuotasFinanciamiento() { return cuotasFinanciamiento; }
    public void setCuotasFinanciamiento(List<CuotaFinanciamientoBO> cuotasFinanciamiento) { this.cuotasFinanciamiento = cuotasFinanciamiento; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FinanciamientoBO{");
        sb.append("idFinanciamiento='").append(idFinanciamiento).append('\'');
        sb.append(", financiamiento=").append(financiamiento).append('\'');
        sb.append(", periodicidad='").append(periodicidad).append('\'');
        sb.append(", numeroCuotas=").append(numeroCuotas).append('\'');
        sb.append(", indicadorDescuentoPrima=").append(indicadorDescuentoPrima).append('\'');
        sb.append(", montoNetoFrac=").append(montoNetoFrac).append('\'');
        sb.append(", montoPago=").append(montoPago).append('\'');
        sb.append(", fechaInicio='").append(fechaInicio).append('\'');
        sb.append(", fechaFinal='").append(fechaFinal).append('\'');
        sb.append(", cuotasFinanciamiento=").append(cuotasFinanciamiento);
        sb.append('}');
        return sb.toString();
    }

}
