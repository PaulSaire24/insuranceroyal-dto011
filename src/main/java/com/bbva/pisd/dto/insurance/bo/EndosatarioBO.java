package com.bbva.pisd.dto.insurance.bo;

public class EndosatarioBO {

    private String ruc;
    private String porcentaje;

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(String porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EndosatarioBO{");
        sb.append("ruc='").append(ruc).append('\'');
        sb.append(", porcentaje='").append(porcentaje).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
