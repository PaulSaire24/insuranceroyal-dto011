package com.bbva.pisd.dto.insurance.bo;

public class ComponenteBO {

    private Long componente;
    private String descipcionComponente;
    private String tipoComponente;
    private Double primaBruta;
    private Double primaNeta;
    private Long sumaAsegurada;
    private String tasa;

    public Long getComponente() { return componente; }
    public void setComponente(Long componente) { this.componente = componente; }
    public String getDescipcionComponente() { return descipcionComponente; }
    public void setDescipcionComponente(String descipcionComponente) { this.descipcionComponente = descipcionComponente; }
    public String getTipoComponente() { return tipoComponente; }
    public void setTipoComponente(String tipoComponente) { this.tipoComponente = tipoComponente; }
    public Double getPrimaBruta() { return primaBruta; }
    public void setPrimaBruta(Double primaBruta) { this.primaBruta = primaBruta; }
    public Double getPrimaNeta() { return primaNeta; }
    public void setPrimaNeta(Double primaNeta) { this.primaNeta = primaNeta; }
    public Long getSumaAsegurada() { return sumaAsegurada; }
    public void setSumaAsegurada(Long sumaAsegurada) { this.sumaAsegurada = sumaAsegurada; }
    public String getTasa() { return tasa; }
    public void setTasa(String tasa) { this.tasa = tasa; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ComponenteBO{");
        sb.append("componente=").append(componente);
        sb.append(", descipcionComponente='").append(descipcionComponente).append('\'');
        sb.append(", tipoComponente='").append(tipoComponente).append('\'');
        sb.append(", primaBruta=").append(primaBruta);
        sb.append(", primaNeta=").append(primaNeta);
        sb.append(", sumaAsegurada=").append(sumaAsegurada);
        sb.append(", tasa='").append(tasa).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
