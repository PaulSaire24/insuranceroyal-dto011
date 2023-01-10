package com.bbva.pisd.dto.insurance.bo;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TercerosBO extends CommonOutputFieldsBO {

    private String apeMaterno;
    private String apePaterno;
    private String nombre;
    private Long ideRol;

    public String getApeMaterno() { return apeMaterno; }
    public void setApeMaterno(String apeMaterno) { this.apeMaterno = apeMaterno; }
    public String getApePaterno() { return apePaterno; }
    public void setApePaterno(String apePaterno) { this.apePaterno = apePaterno; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Long getIdeRol() { return ideRol; }
    public void setIdeRol(Long ideRol) { this.ideRol = ideRol; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("TercerosBO{");
        sb.append("apeMaterno='").append(apeMaterno).append('\'');
        sb.append(", apePaterno='").append(apePaterno).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", ideRol=").append(ideRol);
        sb.append(", tipoDocumento='").append(this.getTipoDocumento()).append('\'');
        sb.append(", numeroDocumento='").append(this.getNumeroDocumento()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
