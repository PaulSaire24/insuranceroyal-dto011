package com.bbva.pisd.dto.insurance.bo;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.math.BigDecimal;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CuotaFinanciamientoBO {

    private Long cuota;
    private BigDecimal monto;
    private BigDecimal montoCuota;
    private Date fechaVencimiento;
    private String moneda;

    public Long getCuota() { return cuota; }
    public void setCuota(Long cuota) { this.cuota = cuota; }
    public BigDecimal getMonto() { return monto; }
    public void setMonto(BigDecimal monto) { this.monto = monto; }
    public Date getFechaVencimiento() { return fechaVencimiento; }
    public void setFechaVencimiento(Date fechaVencimiento) { this.fechaVencimiento = fechaVencimiento; }
    public String getMoneda() { return moneda; }
    public void setMoneda(String moneda) { this.moneda = moneda; }

    public BigDecimal getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(BigDecimal montoCuota) {
        this.montoCuota = montoCuota;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CuotaFinanciamientoBO{");
        sb.append("cuota=").append(cuota);
        sb.append(", monto=").append(monto);
        sb.append(", montoCuota=").append(montoCuota);
        sb.append(", fechaVencimiento=").append(fechaVencimiento);
        sb.append(", moneda='").append(moneda).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
