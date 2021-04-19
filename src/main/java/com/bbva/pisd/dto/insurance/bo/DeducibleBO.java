package com.bbva.pisd.dto.insurance.bo;

public class DeducibleBO {

    private Long idDeducible;
    private Long idComponente;
    private String descripcionDeducible;

    public Long getIdDeducible() { return idDeducible; }
    public void setIdDeducible(Long idDeducible) { this.idDeducible = idDeducible; }
    public Long getIdComponente() { return idComponente; }
    public void setIdComponente(Long idComponente) { this.idComponente = idComponente; }
    public String getDescripcionDeducible() { return descripcionDeducible; }
    public void setDescripcionDeducible(String descripcionDeducible) { this.descripcionDeducible = descripcionDeducible; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DeducibleBO{");
        sb.append("idDeducible=").append(idDeducible);
        sb.append(", idComponente=").append(idComponente);
        sb.append(", descripcionDeducible='").append(descripcionDeducible).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
