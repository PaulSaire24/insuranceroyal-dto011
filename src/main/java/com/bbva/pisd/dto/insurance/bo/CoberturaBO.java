package com.bbva.pisd.dto.insurance.bo;

public class CoberturaBO extends CommonBO{

    private Long idCobertura;
    private String descripcionCobertura;

    private String porcentaje;

    public CoberturaBO(){}

    public CoberturaBO(Long idCobertura, String porcentaje) {
        this.idCobertura = idCobertura;
        this.porcentaje = porcentaje;
    }

    public Long getIdCobertura() { return idCobertura; }
    public void setIdCobertura(Long idCobertura) { this.idCobertura = idCobertura; }
    public String getDescripcionCobertura() { return descripcionCobertura; }
    public void setDescripcionCobertura(String descripcionCobertura) { this.descripcionCobertura = descripcionCobertura; }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CoberturaBO{");
        sb.append("idCobertura=").append(idCobertura);
        sb.append(", descripcionCobertura='").append(descripcionCobertura).append('\'');
        sb.append(", porcentaje='").append(porcentaje).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
