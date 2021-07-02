package com.bbva.pisd.dto.insurance.bo.customer;

public class Persona {

    private String tipoDocumento;
    private String nroDocumento;
    private String apePaterno;
    private String apeMaterno;
    private String nombres;
    private String fechaNacimiento;
    private String sexo;
    private String correoElectronico;
    private String telefonoFijo;
    private String celular;
    private String direccion;
    private Integer rol;
    private String distrito;
    private String provincia;
    private String departamento;
    private String tipoVia;
    private String nombreVia;
    private String numeroVia;
    private String ubigeo;
    private String proteccionDatosPersonales;
    private String envioComunicacionesComerciales;

    public String getTipoDocumento() { return tipoDocumento;}
    public void setTipoDocumento(String tipoDocumento) { this.tipoDocumento = tipoDocumento; }
    public String getNroDocumento() { return nroDocumento; }
    public void setNroDocumento(String nroDocumento) { this.nroDocumento = nroDocumento; }
    public String getApePaterno() { return apePaterno; }
    public void setApePaterno(String apePaterno) { this.apePaterno = apePaterno; }
    public String getApeMaterno() { return apeMaterno; }
    public void setApeMaterno(String apeMaterno) { this.apeMaterno = apeMaterno; }
    public String getNombres() { return nombres; }
    public void setNombres(String nombres) { this.nombres = nombres; }
    public String getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }
    public String getCorreoElectronico() { return correoElectronico;}
    public void setCorreoElectronico(String correoElectronico) { this.correoElectronico = correoElectronico; }
    public String getTelefonoFijo() { return telefonoFijo; }
    public void setTelefonoFijo(String telefonoFijo) { this.telefonoFijo = telefonoFijo; }
    public String getCelular() { return celular; }
    public void setCelular(String celular) { this.celular = celular; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
    public Integer getRol() { return rol; }
    public void setRol(Integer rol) { this.rol = rol; }
    public String getDistrito() { return distrito;}
    public void setDistrito(String distrito) { this.distrito = distrito; }
    public String getProvincia() { return provincia; }
    public void setProvincia(String provincia) { this.provincia = provincia; }
    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }
    public String getTipoVia() { return tipoVia; }
    public void setTipoVia(String tipoVia) { this.tipoVia = tipoVia; }
    public String getNombreVia() { return nombreVia; }
    public void setNombreVia(String nombreVia) { this.nombreVia = nombreVia; }
    public String getNumeroVia() { return numeroVia; }
    public void setNumeroVia(String numeroVia) { this.numeroVia = numeroVia; }
    public String getProteccionDatosPersonales() { return proteccionDatosPersonales; }
    public String getUbigeo() { return ubigeo; }
    public void setUbigeo(String ubigeo) { this.ubigeo = ubigeo;}
    public void setProteccionDatosPersonales(String proteccionDatosPersonales) { this.proteccionDatosPersonales = proteccionDatosPersonales; }
    public String getEnvioComunicacionesComerciales() { return envioComunicacionesComerciales; }
    public void setEnvioComunicacionesComerciales(String envioComunicacionesComerciales) { this.envioComunicacionesComerciales = envioComunicacionesComerciales; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persona{");
        sb.append("tipoDocumento='").append(tipoDocumento).append('\'');
        sb.append(", nroDocumento='").append(nroDocumento).append('\'');
        sb.append(", apePaterno='").append(apePaterno).append('\'');
        sb.append(", apeMaterno='").append(apeMaterno).append('\'');
        sb.append(", nombres='").append(nombres).append('\'');
        sb.append(", fechaNacimiento='").append(fechaNacimiento).append('\'');
        sb.append(", sexo='").append(sexo).append('\'');
        sb.append(", correoElectronico='").append(correoElectronico).append('\'');
        sb.append(", telefonoFijo='").append(telefonoFijo).append('\'');
        sb.append(", celular='").append(celular).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", rol=").append(rol);
        sb.append(", distrito='").append(distrito).append('\'');
        sb.append(", provincia='").append(provincia).append('\'');
        sb.append(", departamento='").append(departamento).append('\'');
        sb.append(", tipoVia='").append(tipoVia).append('\'');
        sb.append(", nombreVia='").append(nombreVia).append('\'');
        sb.append(", numeroVia='").append(numeroVia).append('\'');
        sb.append(", ubigeo='").append(ubigeo).append('\'');
        sb.append(", proteccionDatosPersonales='").append(proteccionDatosPersonales).append('\'');
        sb.append(", envioComunicacionesComerciales='").append(envioComunicacionesComerciales).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
