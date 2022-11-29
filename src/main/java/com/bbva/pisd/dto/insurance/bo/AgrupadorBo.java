package com.bbva.pisd.dto.insurance.bo;

public class AgrupadorBo {
  
  private Long codigoAgrupador;
  private String nombreAgrupador;
  private String descripcionAgrupador;

  public Long getCodigoAgrupador() { return codigoAgrupador; }
  public void setCodigoAgrupador(Long codigoAgrupador) { this.codigoAgrupador = codigoAgrupador; }

  public String getNombreAgrupador() { return nombreAgrupador; }
  public void setNombreAgrupador(String nombreAgrupador) { this.nombreAgrupador = nombreAgrupador; }

  public String getDescripcionAgrupador() { return descripcionAgrupador; }
  public void setDescripcionAgrupador(String descripcionAgrupador) { this.descripcionAgrupador = descripcionAgrupador; }

  @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AgrupadorBo{");
        sb.append("codigoAgrupador=").append(codigoAgrupador);
        sb.append(", nombreAgrupador='").append(nombreAgrupador).append('\'');
        sb.append(", descripcionAgrupador='").append(descripcionAgrupador).append('\'');
        sb.append('}');
        return sb.toString();
    }
}