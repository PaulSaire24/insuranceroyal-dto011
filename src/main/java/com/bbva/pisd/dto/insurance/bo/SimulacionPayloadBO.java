package com.bbva.pisd.dto.insurance.bo;

import java.util.List;

public class SimulacionPayloadBO {

    private String idCotizacion;
    private int indicadorRequiereInspeccion;
    private String operacion;
    private String diasVigencia;
    private String fechaFinVigencia;

    private String producto;
    private String moneda;
    private List<CotizacionBO> cotizaciones;
    private List<Long> planes;
    private EndosatarioBO endosatario;
    private List<DatoParticularBO> datosParticulares;
    private List<PlanFinanciamientoBO> financiamiento;
    private List<Integer> periodosConDescuentoPrima;
    private AseguradoBO asegurado;
    private List<CoberturaBO> coberturas;


    public String getIdCotizacion() {
        return idCotizacion;
    }

    public void setIdCotizacion(String idCotizacion) {
        this.idCotizacion = idCotizacion;
    }

    public int getIndicadorRequiereInspeccion() {
        return indicadorRequiereInspeccion;
    }

    public void setIndicadorRequiereInspeccion(int indicadorRequiereInspeccion) {
        this.indicadorRequiereInspeccion = indicadorRequiereInspeccion;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getDiasVigencia() {
        return diasVigencia;
    }

    public void setDiasVigencia(String diasVigencia) {
        this.diasVigencia = diasVigencia;
    }

    public String getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    public void setFechaFinVigencia(String fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }

    public String getProducto() { return producto; }
    public void setProducto(String producto) { this.producto = producto; }
    public String getMoneda() { return moneda; }
    public void setMoneda(String moneda) { this.moneda = moneda; }
    public List<CotizacionBO> getCotizaciones() { return cotizaciones; }
    public void setCotizaciones(List<CotizacionBO> cotizaciones) { this.cotizaciones = cotizaciones; }
    public List<Long> getPlanes() { return planes; }
    public void setPlanes(List<Long> planes) { this.planes = planes; }

    public EndosatarioBO getEndosatario() {
        return endosatario;
    }

    public void setEndosatario(EndosatarioBO endosatario) {
        this.endosatario = endosatario;
    }

    public List<DatoParticularBO> getDatosParticulares() { return datosParticulares; }
    public void setDatosParticulares(List<DatoParticularBO> datosParticulares) { this.datosParticulares = datosParticulares; }
    public List<PlanFinanciamientoBO> getFinanciamiento() { return financiamiento; }
    public void setFinanciamiento(List<PlanFinanciamientoBO> financiamiento) { this.financiamiento = financiamiento; }
    public List<Integer> getPeriodosConDescuentoPrima() {return periodosConDescuentoPrima;}
    public void setPeriodosConDescuentoPrima(List<Integer> periodosConDescuentoPrima) {this.periodosConDescuentoPrima = periodosConDescuentoPrima;}
    public AseguradoBO getAsegurado() { return asegurado; }
    public void setAsegurado(AseguradoBO asegurado) { this.asegurado = asegurado; }

    public List<CoberturaBO> getCoberturas() {
        return coberturas;
    }

    public void setCoberturas(List<CoberturaBO> coberturas) {
        this.coberturas = coberturas;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SimulacionPayloadBO{");
        sb.append("idCotizacion='").append(idCotizacion).append('\'');
        sb.append(", indicadorRequiereInspeccion=").append(indicadorRequiereInspeccion);
        sb.append(", operacion='").append(operacion).append('\'');
        sb.append(", diasVigencia='").append(diasVigencia).append('\'');
        sb.append(", fechaFinVigencia='").append(fechaFinVigencia).append('\'');
        sb.append(", producto='").append(producto).append('\'');
        sb.append(", moneda='").append(moneda).append('\'');
        sb.append(", cotizaciones=").append(cotizaciones);
        sb.append(", planes=").append(planes);
        sb.append(", endosatario=").append(endosatario);
        sb.append(", datosParticulares=").append(datosParticulares);
        sb.append(", financiamiento=").append(financiamiento);
        sb.append(", periodosConDescuentoPrima=").append(periodosConDescuentoPrima);
        sb.append(", asegurado=").append(asegurado);
        sb.append(", coberturas=").append(coberturas);
        sb.append('}');
        return sb.toString();
    }
}
