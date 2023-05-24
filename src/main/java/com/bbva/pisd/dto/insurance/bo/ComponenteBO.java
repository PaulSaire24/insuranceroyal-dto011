package com.bbva.pisd.dto.insurance.bo;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public class ComponenteBO {

    private Long componente;
    private String descipcionComponente;
    private String tipoComponente;
    private Double primaBruta;
    private Double primaNeta;
    private String moneda;
    private Long sumaAsegurada;
    private String tasa;
    private String indSeleccionar;
    private Long codigoAgrupador;
    private String tipoAgrupador;
    private String observacionCobertura;
    private String condicion;
    private String porcentajeSeleccionado;
    private AgrupadorBo agrupador;

    public Long getComponente() { return componente; }
    public void setComponente(Long componente) { this.componente = componente; }
    public String getDescipcionComponente() { return descipcionComponente; }
    public void setDescipcionComponente(String descipcionComponente) { this.descipcionComponente = descipcionComponente; }
    public String getTipoComponente() { return tipoComponente; }
    public void setTipoComponente(String tipoComponente) { this.tipoComponente = tipoComponente; }
    public Double getPrimaBruta() { return primaBruta; }
    public void setPrimaBruta(Double primaBruta) { this.primaBruta = primaBruta; }
    public Double getPrimaNeta() { return primaNeta; }
    public void setPrimaNeta(Double primaNeta) { this.primaNeta = primaNeta; }
    public Long getSumaAsegurada() { return sumaAsegurada; }
    public void setSumaAsegurada(Long sumaAsegurada) { this.sumaAsegurada = sumaAsegurada; }
    public String getTasa() { return tasa; }
    public void setTasa(String tasa) { this.tasa = tasa; }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getIndSeleccionar() {
        return indSeleccionar;
    }

    public void setIndSeleccionar(String indSeleccionar) {
        this.indSeleccionar = indSeleccionar;
    }

    public Long getCodigoAgrupador() {
        return codigoAgrupador;
    }

    public void setCodigoAgrupador(Long codigoAgrupador) {
        this.codigoAgrupador = codigoAgrupador;
    }

    public String getTipoAgrupador() {
        return tipoAgrupador;
    }

    public void setTipoAgrupador(String tipoAgrupador) {
        this.tipoAgrupador = tipoAgrupador;
    }

    public String getObservacionCobertura() {
        return observacionCobertura;
    }

    public void setObservacionCobertura(String observacionCobertura) {
        this.observacionCobertura = observacionCobertura;
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

    public AgrupadorBo getAgrupador() {
        return agrupador;
    }

    public void setAgrupador(AgrupadorBo agrupador) {
        this.agrupador = agrupador;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ComponenteBO{");
        sb.append("componente=").append(componente);
        sb.append(", descipcionComponente='").append(descipcionComponente).append('\'');
        sb.append(", tipoComponente='").append(tipoComponente).append('\'');
        sb.append(", primaBruta=").append(primaBruta);
        sb.append(", primaNeta=").append(primaNeta);
        sb.append(", moneda=").append(moneda);
        sb.append(", sumaAsegurada=").append(sumaAsegurada);
        sb.append(", tasa='").append(tasa).append('\'');
        sb.append(", indSeleccionar=").append(indSeleccionar);
        sb.append(", codigoAgrupador=").append(codigoAgrupador);
        sb.append(", tipoAgrupador=").append(tipoAgrupador);
        sb.append(", observacionCobertura=").append(observacionCobertura);
        sb.append(", condicion=").append(condicion);
        sb.append(", porcentajeSeleccionado=").append(porcentajeSeleccionado);
        sb.append(", agrupador=").append(agrupador);
        sb.append('}');
        return sb.toString();
    }

}
