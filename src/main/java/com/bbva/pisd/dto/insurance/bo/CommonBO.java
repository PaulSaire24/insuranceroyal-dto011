package com.bbva.pisd.dto.insurance.bo;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CommonBO {

    private String id;
    private String descripcionCobertura;
    private String name;
    private Double primaBruta;
    private Double primaNeta;
    private String moneda;
    private Double sumaAsegurada;

    private String producto;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Double getPrimaBruta() { return primaBruta; }
    public void setPrimaBruta(Double primaBruta) { this.primaBruta = primaBruta; }
    public Double getPrimaNeta() { return primaNeta; }
    public void setPrimaNeta(Double primaNeta) { this.primaNeta = primaNeta; }
    public String getMoneda() { return moneda; }
    public void setMoneda(String moneda) { this.moneda = moneda; }
    public Double getSumaAsegurada() { return sumaAsegurada; }
    public void setSumaAsegurada(Double sumaAsegurada) { this.sumaAsegurada = sumaAsegurada; }
    public String getProducto() { return producto; }
    public void setProducto(String producto) { this.producto = producto; }

    public String getDescripcionCobertura() {
        return descripcionCobertura;
    }

    public void setDescripcionCobertura(String descripcionCobertura) {
        this.descripcionCobertura = descripcionCobertura;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CommonBO{");
        sb.append("id='").append(id).append('\'');
        sb.append(", descripcionCobertura='").append(descripcionCobertura).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", primaBruta=").append(primaBruta);
        sb.append(", primaNeta=").append(primaNeta);
        sb.append(", moneda='").append(moneda).append('\'');
        sb.append(", sumaAsegurada=").append(sumaAsegurada);
        sb.append(", producto='").append(producto).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
