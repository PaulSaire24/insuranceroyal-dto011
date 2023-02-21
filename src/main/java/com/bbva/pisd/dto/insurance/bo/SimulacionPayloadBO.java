package com.bbva.pisd.dto.insurance.bo;

import java.util.List;

public class SimulacionPayloadBO {

    private String producto;
    private String moneda;
    private List<CotizacionBO> cotizaciones;
    private List<Long> planes;
    private List<DatoParticularBO> datosParticulares;
    private List<PlanFinanciamientoBO> financiamiento;
    private List<Integer> periodosConDescuentoPrima;
    private AseguradoBO asegurado;

    public String getProducto() { return producto; }
    public void setProducto(String producto) { this.producto = producto; }
    public String getMoneda() { return moneda; }
    public void setMoneda(String moneda) { this.moneda = moneda; }
    public List<CotizacionBO> getCotizaciones() { return cotizaciones; }
    public void setCotizaciones(List<CotizacionBO> cotizaciones) { this.cotizaciones = cotizaciones; }
    public List<Long> getPlanes() { return planes; }
    public void setPlanes(List<Long> planes) { this.planes = planes; }
    public List<DatoParticularBO> getDatosParticulares() { return datosParticulares; }
    public void setDatosParticulares(List<DatoParticularBO> datosParticulares) { this.datosParticulares = datosParticulares; }
    public List<PlanFinanciamientoBO> getFinanciamiento() { return financiamiento; }
    public void setFinanciamiento(List<PlanFinanciamientoBO> financiamiento) { this.financiamiento = financiamiento; }
    public List<Integer> getPeriodosConDescuentoPrima() {return periodosConDescuentoPrima;}
    public void setPeriodosConDescuentoPrima(List<Integer> periodosConDescuentoPrima) {this.periodosConDescuentoPrima = periodosConDescuentoPrima;}
    public AseguradoBO getAsegurado() { return asegurado; }
    public void setAsegurado(AseguradoBO asegurado) { this.asegurado = asegurado; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PayloadBO{");
        sb.append("producto='").append(producto).append('\'');
        sb.append(", moneda='").append(moneda).append('\'');
        sb.append(", cotizaciones=").append(cotizaciones);
        sb.append(", planes=").append(planes);
        sb.append(", datosParticulares=").append(datosParticulares);
        sb.append(", financiamiento=").append(financiamiento);
        sb.append(", periodosConDescuentoPrima=").append(periodosConDescuentoPrima);
        sb.append(", asegurado=").append(asegurado);
        sb.append('}');
        return sb.toString();
    }
}
