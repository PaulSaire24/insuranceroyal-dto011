package com.bbva.pisd.dto.insurance.bo;

public class SearchPayloadBO {

    private String fechaCotizacion;
    private String fechaFinVig;
    private String estado;
    private String placa;
    private String anhoFab;
    private String pdfUrl;
    private String indSeleccionado;
    private String cotizacion;
    private String codigoExterno;
    private String moneda;
    private PlanSearchBO plan;
    private CommonDataBO marca;
    private CommonDataBO modelo;

    public String getIndSeleccionado() { return indSeleccionado; }
    public void setIndSeleccionado(String indSeleccionado) { this.indSeleccionado = indSeleccionado; }
    public String getMoneda() { return moneda; }
    public void setMoneda(String moneda) { this.moneda = moneda; }
    public PlanSearchBO getPlan() { return plan; }
    public void setPlan(PlanSearchBO plan) { this.plan = plan; }
    public String getFechaCotizacion() { return fechaCotizacion; }
    public void setFechaCotizacion(String fechaCotizacion) { this.fechaCotizacion = fechaCotizacion; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public String getAnhoFab() { return anhoFab; }
    public void setAnhoFab(String anhoFab) { this.anhoFab = anhoFab; }
    public String getPdfUrl() { return pdfUrl; }
    public void setPdfUrl(String pdfUrl) { this.pdfUrl = pdfUrl; }
    public String getCotizacion() { return cotizacion; }
    public void setCotizacion(String cotizacion) { this.cotizacion = cotizacion; }
    public String getFechaFinVig() { return fechaFinVig; }
    public void setFechaFinVig(String fechaFinVig) { this.fechaFinVig = fechaFinVig; }
    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }
    public String getCodigoExterno() { return codigoExterno; }
    public void setCodigoExterno(String codigoExterno) { this.codigoExterno = codigoExterno; }
    public CommonDataBO getMarca() { return marca; }
    public void setMarca(CommonDataBO marca) { this.marca = marca; }
    public CommonDataBO getModelo() { return modelo; }
    public void setModelo(CommonDataBO modelo) { this.modelo = modelo; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SearchPayloadBO{");
        sb.append("fechaCotizacion='").append(fechaCotizacion).append('\'');
        sb.append(", fechaFinVig='").append(fechaFinVig).append('\'');
        sb.append(", estado='").append(estado).append('\'');
        sb.append(", placa='").append(placa).append('\'');
        sb.append(", anhoFab='").append(anhoFab).append('\'');
        sb.append(", pdfUrl='").append(pdfUrl).append('\'');
        sb.append(", indSeleccionado='").append(indSeleccionado).append('\'');
        sb.append(", cotizacion='").append(cotizacion).append('\'');
        sb.append(", codigoExterno='").append(codigoExterno).append('\'');
        sb.append(", moneda='").append(moneda).append('\'');
        sb.append(", plan=").append(plan);
        sb.append(", marca=").append(marca);
        sb.append(", modelo=").append(modelo);
        sb.append('}');
        return sb.toString();
    }

}
