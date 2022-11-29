package com.bbva.pisd.dto.insurance.bo;

public class CoberturaBO extends CommonBO{

    private Long codigoCobertura;
    private String porcentaje;

    private Long idCobertura;
    private String principal;
    private String observacionCobertura;
    private String periodoEvento;
    private String condicion;
    private String porcentajeSeleccionado;
    private int codigoAgrupador;
    private String tipoAgrupador;
    private String indSeleccionar;
    private AgrupadorCoberturaBO agrupador;

    public CoberturaBO(){}

    public CoberturaBO(Long codigoCobertura) {
        this.codigoCobertura = codigoCobertura;
    }

    public Long getCodigoCobertura() {
        return codigoCobertura;
    }

    public void setCodigoCobertura(Long codigoCobertura) {
        this.codigoCobertura = codigoCobertura;
    }

    public Long getIdCobertura() { return idCobertura; }
    public void setIdCobertura(Long idCobertura) { this.idCobertura = idCobertura; }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
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
        final StringBuilder sb = new StringBuilder("CoberturaBO{");
        sb.append("codigoCobertura=").append(codigoCobertura);
        sb.append(", porcentaje='").append(porcentaje).append('\'');
        sb.append(", idCobertura=").append(idCobertura);
        sb.append(", principal='").append(principal).append('\'');
        sb.append(", observacionCobertura='").append(observacionCobertura).append('\'');
        sb.append(", periodoEvento='").append(periodoEvento).append('\'');
        sb.append(", condicion='").append(condicion).append('\'');
        sb.append(", porcentajeSeleccionado='").append(porcentajeSeleccionado).append('\'');
        sb.append(", codigoAgrupador=").append(codigoAgrupador);
        sb.append(", tipoAgrupador='").append(tipoAgrupador).append('\'');
        sb.append(", indSeleccionar='").append(indSeleccionar).append('\'');
        sb.append(", agrupador=").append(agrupador);
        sb.append('}');
        return sb.toString();
    }
}
