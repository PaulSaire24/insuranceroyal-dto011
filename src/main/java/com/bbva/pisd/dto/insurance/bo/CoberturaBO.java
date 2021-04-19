package com.bbva.pisd.dto.insurance.bo;

public class CoberturaBO extends CommonBO{

    private Long idCobertura;
    private String descripcionCobertura;

    public Long getIdCobertura() { return idCobertura; }
    public void setIdCobertura(Long idCobertura) { this.idCobertura = idCobertura; }
    public String getDescripcionCobertura() { return descripcionCobertura; }
    public void setDescripcionCobertura(String descripcionCobertura) { this.descripcionCobertura = descripcionCobertura; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CoberturaBO{");
        sb.append("idCobertura=").append(idCobertura);
        sb.append(", descripcionCobertura='").append(descripcionCobertura).append('\'');
        sb.append(", ").append(super.toString()).append('}');
        return sb.toString();
    }

}
