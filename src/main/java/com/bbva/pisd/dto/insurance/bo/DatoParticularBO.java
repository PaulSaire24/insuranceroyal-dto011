package com.bbva.pisd.dto.insurance.bo;

public class DatoParticularBO {

    private String etiqueta;
    private String valor;
    private String codigo;

    public String getEtiqueta() { return etiqueta; }
    public void setEtiqueta(String etiqueta) { this.etiqueta = etiqueta; }
    public String getValor() { return valor; }
    public void setValor(String valor) { this.valor = valor; }
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DatoParticularBO{");
        sb.append("etiqueta='").append(etiqueta).append('\'');
        sb.append(", valor='").append(valor).append('\'');
        sb.append(", codigo='").append(codigo).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public DatoParticularBO(String etiqueta, String valor, String codigo) {
        this.etiqueta = etiqueta;
        this.valor = valor;
        this.codigo = codigo;
    }

    public DatoParticularBO() { }

}
