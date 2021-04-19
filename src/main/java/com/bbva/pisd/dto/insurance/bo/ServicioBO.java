package com.bbva.pisd.dto.insurance.bo;

public class ServicioBO extends CommonBO {

    private Long idServicio;
    private String descripcionServicio;

    public Long getIdServicio() { return idServicio; }
    public void setIdServicio(Long idServicio) { this.idServicio = idServicio; }
    public String getDescripcionServicio() { return descripcionServicio; }
    public void setDescripcionServicio(String descripcionServicio) { this.descripcionServicio = descripcionServicio; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ServicioBO{");
        sb.append("idServicio=").append(idServicio);
        sb.append(", descripcionServicio='").append(descripcionServicio).append('\'');
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

}
