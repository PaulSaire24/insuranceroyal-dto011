package com.bbva.pisd.dto.insurance.bo;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ValorComercialPayloadBO {

    private String idvalcom;
    private Long anhoFab;
    private String valorAct;
    private String valorMaximo;
    private String valorMinimo;
    private String moneda;
    private EtiquetaValorComercialBO modelo;
    private EtiquetaValorComercialBO marca;
    private EtiquetaValorComercialBO clase;
    private EtiquetaValorComercialBO tipo;


    /**
     * @return String return the idvalcom
     */
    public String getIdvalcom() {
        return idvalcom;
    }

    /**
     * @param idvalcom the idvalcom to set
     */
    public void setIdvalcom(String idvalcom) {
        this.idvalcom = idvalcom;
    }

    /**
     * @return Long return the anhoFab
     */
    public Long getAnhoFab() {
        return anhoFab;
    }

    /**
     * @param anhoFab the anhoFab to set
     */
    public void setAnhoFab(Long anhoFab) {
        this.anhoFab = anhoFab;
    }

    /**
     * @return String return the valorAct
     */
    public String getValorAct() {
        return valorAct;
    }

    /**
     * @param valorAct the valorAct to set
     */
    public void setValorAct(String valorAct) {
        this.valorAct = valorAct;
    }

    /**
     * @return String return the valorMaximo
     */
    public String getValorMaximo() {
        return valorMaximo;
    }

    /**
     * @param valorMaximo the valorMaximo to set
     */
    public void setValorMaximo(String valorMaximo) {
        this.valorMaximo = valorMaximo;
    }

    /**
     * @return String return the valorMinimo
     */
    public String getValorMinimo() {
        return valorMinimo;
    }

    /**
     * @param valorMinimo the valorMinimo to set
     */
    public void setValorMinimo(String valorMinimo) {
        this.valorMinimo = valorMinimo;
    }

    /**
     * @return String return the moneda
     */
    public String getMoneda() {
        return moneda;
    }

    /**
     * @param moneda the moneda to set
     */
    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    /**
     * @return EtiquetaValorComercialBO return the modelo
     */
    public EtiquetaValorComercialBO getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(EtiquetaValorComercialBO modelo) {
        this.modelo = modelo;
    }

    /**
     * @return EtiquetaValorComercialBO return the marca
     */
    public EtiquetaValorComercialBO getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(EtiquetaValorComercialBO marca) {
        this.marca = marca;
    }

    /**
     * @return EtiquetaValorComercialBO return the clase
     */
    public EtiquetaValorComercialBO getClase() {
        return clase;
    }

    /**
     * @param clase the clase to set
     */
    public void setClase(EtiquetaValorComercialBO clase) {
        this.clase = clase;
    }

    /**
     * @return EtiquetaValorComercialBO return the tipo
     */
    public EtiquetaValorComercialBO getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(EtiquetaValorComercialBO tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ValorComercialPayloadBO{");
        sb.append("idvalcom='").append(idvalcom).append('\'');
        sb.append(", anhoFab=").append(anhoFab).append('\'');
        sb.append(", valorAct=").append(valorAct).append('\'');
        sb.append(", valorMaximo=").append(valorMaximo).append('\'');
        sb.append(", valorMinimo=").append(valorMinimo).append('\'');
        sb.append(", moneda=").append(moneda).append('\'');
        sb.append(", modelo=").append(modelo).append('\'');
        sb.append(", marca=").append(marca).append('\'');
        sb.append(", clase=").append(clase).append('\'');
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }

}
