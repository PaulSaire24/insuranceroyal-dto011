package com.bbva.pisd.dto.insurance.bo;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EtiquetaValorComercialBO {

    private String codigo;
    private String descripcion;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EtiquetaValorComercialBO{");
        sb.append("codigo='").append(codigo).append('\'');
        sb.append(", descripcion=").append(descripcion);
        sb.append('}');
        return sb.toString();
    }


    /**
     * @return String return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return String return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
