package com.bbva.pisd.dto.insurance.bo;

import java.util.List;

public class AgrupadorCoberturaBO {

    private String codigoAgrupador;
    private String nombreAgrupador;
    private String descripcionAgrupador;
    private List<Long> porcentajes;
    private String periodicidad;
    private Double primaBruta;
    private Double primaNeta;

    public String getCodigoAgrupador() {
        return codigoAgrupador;
    }

    public void setCodigoAgrupador(String codigoAgrupador) {
        this.codigoAgrupador = codigoAgrupador;
    }

    public String getNombreAgrupador() {
        return nombreAgrupador;
    }

    public void setNombreAgrupador(String nombreAgrupador) {
        this.nombreAgrupador = nombreAgrupador;
    }

    public String getDescripcionAgrupador() {
        return descripcionAgrupador;
    }

    public void setDescripcionAgrupador(String descripcionAgrupador) {
        this.descripcionAgrupador = descripcionAgrupador;
    }

    public List<Long> getPorcentajes() {
        return porcentajes;
    }

    public void setPorcentajes(List<Long> porcentajes) {
        this.porcentajes = porcentajes;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public void setPeriodicidad(String periodicidad) {
        this.periodicidad = periodicidad;
    }

    public Double getPrimaBruta() {
        return primaBruta;
    }

    public void setPrimaBruta(Double primaBruta) {
        this.primaBruta = primaBruta;
    }

    public Double getPrimaNeta() {
        return primaNeta;
    }

    public void setPrimaNeta(Double primaNeta) {
        this.primaNeta = primaNeta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgrupadorCoberturaBO{");
        sb.append("codigoAgrupador='").append(codigoAgrupador).append('\'');
        sb.append(", nombreAgrupador='").append(nombreAgrupador).append('\'');
        sb.append(", descripcionAgrupador='").append(descripcionAgrupador).append('\'');
        sb.append(", porcentajes=").append(porcentajes);
        sb.append(", periodicidad='").append(periodicidad).append('\'');
        sb.append(", primaBruta=").append(primaBruta);
        sb.append(", primaNeta=").append(primaNeta);
        sb.append('}');
        return sb.toString();
    }
}
