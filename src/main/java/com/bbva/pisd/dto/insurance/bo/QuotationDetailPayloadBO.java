package com.bbva.pisd.dto.insurance.bo;

import java.util.Date;
import java.util.List;

public class QuotationDetailPayloadBO {

    private Date fecCreacion;
    private Date fecExpiracion;
    private Date fecFinVig;
    private Date fecIniVig;
    private String diasVigencia;
    private String vehicular;
    private String codigoExterno;
    private String moneda;
    private String placa;
    private String tipoDocumento;
    private String nroDocumento;
    private String indSeleccionado;
    private List<TercerosBO> terceros;
    private String producto;
    private List<QuotationDetailPlanBO> plan;
    private String indicadorGps;

    public Date getFecCreacion() { return fecCreacion; }
    public void setFecCreacion(Date fecCreacion) { this.fecCreacion = fecCreacion; }
    public Date getFecExpiracion() { return fecExpiracion; }
    public void setFecExpiracion(Date fecExpiracion) { this.fecExpiracion = fecExpiracion; }
    public Date getFecFinVig() { return fecFinVig; }
    public void setFecFinVig(Date fecFinVig) { this.fecFinVig = fecFinVig; }
    public Date getFecIniVig() { return fecIniVig; }
    public void setFecIniVig(Date fecIniVig) { this.fecIniVig = fecIniVig; }
    public String getDiasVigencia() { return diasVigencia; }
    public void setDiasVigencia(String diasVigencia) { this.diasVigencia = diasVigencia; }
    public String getVehicular() { return vehicular; }
    public void setVehicular(String vehicular) { this.vehicular = vehicular; }
    public String getCodigoExterno() { return codigoExterno; }
    public void setCodigoExterno(String codigoExterno) { this.codigoExterno = codigoExterno; }
    public String getMoneda() { return moneda; }
    public void setMoneda(String moneda) { this.moneda = moneda; }
    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }
    public String getTipoDocumento() { return tipoDocumento; }
    public void setTipoDocumento(String tipoDocumento) { this.tipoDocumento = tipoDocumento; }
    public String getNroDocumento() { return nroDocumento; }
    public void setNroDocumento(String nroDocumento) { this.nroDocumento = nroDocumento; }
    public String getIndSeleccionado() { return indSeleccionado; }
    public void setIndSeleccionado(String indSeleccionado) { this.indSeleccionado = indSeleccionado; }
    public List<TercerosBO> getTerceros() { return terceros; }
    public void setTerceros(List<TercerosBO> terceros) { this.terceros = terceros; }
    public String getProducto() { return producto; }
    public void setProducto(String producto) { this.producto = producto; }
    public List<QuotationDetailPlanBO> getPlan() { return plan; }
    public void setPlan(List<QuotationDetailPlanBO> plan) { this.plan = plan; }
    public String getIndicadorGps() { return indicadorGps; }
    public void setIndicadorGps(String indicadorGps) { this.indicadorGps = indicadorGps; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("QuotationDetailPayloadBO{");
        sb.append("fecCreacion='").append(fecCreacion).append('\'');
        sb.append(", fecExpiracion='").append(fecExpiracion).append('\'');
        sb.append(", fecFinVig='").append(fecFinVig).append('\'');
        sb.append(", fecIniVig='").append(fecIniVig).append('\'');
        sb.append(", diasVigencia='").append(diasVigencia).append('\'');
        sb.append(", vehicular='").append(vehicular).append('\'');
        sb.append(", codigoExterno='").append(codigoExterno).append('\'');
        sb.append(", moneda='").append(moneda).append('\'');
        sb.append(", placa='").append(placa).append('\'');
        sb.append(", tipoDocumento='").append(tipoDocumento).append('\'');
        sb.append(", nroDocumento='").append(nroDocumento).append('\'');
        sb.append(", indSeleccionado='").append(indSeleccionado).append('\'');
        sb.append(", terceros=").append(terceros);
        sb.append(", producto='").append(producto).append('\'');
        sb.append(", plan=").append(plan);
        sb.append(", indicadorGps='").append(indicadorGps).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
