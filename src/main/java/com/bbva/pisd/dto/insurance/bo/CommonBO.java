package com.bbva.pisd.dto.insurance.bo;

public class CommonBO {



    private String id;

    private String descripcionCobertura;
    private String name;
    private Double primaBruta;
    private Double primaNeta;
    private String moneda;
    private Double sumaAsegurada;
    private String principal;
    private String observacionCobertura;
    private String periodoEvento;
    private String condicion;
    private String porcentajeSeleccionado;
    private int codigoAgrupador;
    private String tipoAgrupador;
    private String indSeleccionar;
    private AgrupadorCoberturaBO agrupador;
    private String producto;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Double getPrimaBruta() { return primaBruta; }
    public void setPrimaBruta(Double primaBruta) { this.primaBruta = primaBruta; }
    public Double getPrimaNeta() { return primaNeta; }
    public void setPrimaNeta(Double primaNeta) { this.primaNeta = primaNeta; }
    public String getMoneda() { return moneda; }
    public void setMoneda(String moneda) { this.moneda = moneda; }
    public Double getSumaAsegurada() { return sumaAsegurada; }
    public void setSumaAsegurada(Double sumaAsegurada) { this.sumaAsegurada = sumaAsegurada; }
    public String getProducto() { return producto; }
    public void setProducto(String producto) { this.producto = producto; }

    public String getDescripcionCobertura() {
        return descripcionCobertura;
    }

    public void setDescripcionCobertura(String descripcionCobertura) {
        this.descripcionCobertura = descripcionCobertura;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getObservacionCobertura() {
        return observacionCobertura;
    }

    public void setObservacionCobertura(String observacionCobertura) {
        this.observacionCobertura = observacionCobertura;
    }

    public String getPeriodoEvento() {
        return periodoEvento;
    }

    public void setPeriodoEvento(String periodoEvento) {
        this.periodoEvento = periodoEvento;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getPorcentajeSeleccionado() {
        return porcentajeSeleccionado;
    }

    public void setPorcentajeSeleccionado(String porcentajeSeleccionado) {
        this.porcentajeSeleccionado = porcentajeSeleccionado;
    }

    public int getCodigoAgrupador() {
        return codigoAgrupador;
    }

    public void setCodigoAgrupador(int codigoAgrupador) {
        this.codigoAgrupador = codigoAgrupador;
    }

    public String getTipoAgrupador() {
        return tipoAgrupador;
    }

    public void setTipoAgrupador(String tipoAgrupador) {
        this.tipoAgrupador = tipoAgrupador;
    }

    public String getIndSeleccionar() {
        return indSeleccionar;
    }

    public void setIndSeleccionar(String indSeleccionar) {
        this.indSeleccionar = indSeleccionar;
    }

    public AgrupadorCoberturaBO getAgrupador() {
        return agrupador;
    }

    public void setAgrupador(AgrupadorCoberturaBO agrupador) {
        this.agrupador = agrupador;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CommonBO{");
        sb.append("id='").append(id).append('\'');
        sb.append(", descripcionCobertura='").append(descripcionCobertura).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", primaBruta=").append(primaBruta);
        sb.append(", primaNeta=").append(primaNeta);
        sb.append(", moneda='").append(moneda).append('\'');
        sb.append(", sumaAsegurada=").append(sumaAsegurada);
        sb.append(", principal='").append(principal).append('\'');
        sb.append(", observacionCobertura='").append(observacionCobertura).append('\'');
        sb.append(", periodoEvento='").append(periodoEvento).append('\'');
        sb.append(", condicion='").append(condicion).append('\'');
        sb.append(", porcentajeSeleccionado='").append(porcentajeSeleccionado).append('\'');
        sb.append(", codigoAgrupador=").append(codigoAgrupador);
        sb.append(", tipoAgrupador='").append(tipoAgrupador).append('\'');
        sb.append(", indSeleccionar='").append(indSeleccionar).append('\'');
        sb.append(", agrupador=").append(agrupador);
        sb.append(", producto='").append(producto).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
