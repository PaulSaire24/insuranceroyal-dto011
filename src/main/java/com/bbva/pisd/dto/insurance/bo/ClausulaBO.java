package com.bbva.pisd.dto.insurance.bo;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClausulaBO {

    private String definicion;
    private Long clausula;
    private Long componente;

    public String getDefinicion() { return definicion; }
    public void setDefinicion(String definicion) { this.definicion = definicion; }
    public Long getClausula() { return clausula; }
    public void setClausula(Long clausula) { this.clausula = clausula; }
    public Long getComponente() { return componente; }
    public void setComponente(Long componente) { this.componente = componente; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ClausulaBO{");
        sb.append("definicion='").append(definicion).append('\'');
        sb.append(", clausula=").append(clausula);
        sb.append(", componente=").append(componente);
        sb.append('}');
        return sb.toString();
    }

}
