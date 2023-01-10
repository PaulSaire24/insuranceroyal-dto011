package com.bbva.pisd.dto.insurance.bo;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QuotationDetailDeducibleBO {

    private Long deducible;
    private Long componente;
    private String descripcion;
    private String descripcionComp;

    public Long getDeducible() { return deducible; }
    public void setDeducible(Long deducible) { this.deducible = deducible; }
    public Long getComponente() { return componente; }
    public void setComponente(Long componente) { this.componente = componente; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public String getDescripcionComp() { return descripcionComp; }
    public void setDescripcionComp(String descripcionComp) { this.descripcionComp = descripcionComp; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("QuotationDetailDeducibleBO{");
        sb.append("deducible=").append(deducible);
        sb.append(", componente=").append(componente);
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", descripcionComp='").append(descripcionComp).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
