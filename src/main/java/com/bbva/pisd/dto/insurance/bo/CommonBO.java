package com.bbva.pisd.dto.insurance.bo;

public class CommonBO {

    private String id;
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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Campos Adicionales{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", primaBruta=").append(primaBruta);
        sb.append(", primaNeta=").append(primaNeta);
        sb.append(", moneda='").append(moneda).append('\'');
        sb.append(", sumaAsegurada=").append(sumaAsegurada);
        sb.append(", producto=").append(producto);
        sb.append('}');
        return sb.toString();
    }

}
