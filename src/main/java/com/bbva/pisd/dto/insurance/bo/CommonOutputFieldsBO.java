package com.bbva.pisd.dto.insurance.bo;

import java.math.BigDecimal;

public class CommonOutputFieldsBO {

	private ErrorBO error;
	private String tipoDocumento;
	private String numeroDocumento;
	private BigDecimal primaNeta;
	private BigDecimal primaBruta;
	private String indicadorInspeccion;
	private String cotizacion;
	private String status;
	private String mensaje;

	public ErrorBO getError() { return error; }
	public void setError(ErrorBO error) { this.error = error; }
	public String getCotizacion() { return cotizacion; }
	public void setCotizacion(String cotizacion) { this.cotizacion = cotizacion; }
	public String getTipoDocumento() { return tipoDocumento; }
	public void setTipoDocumento(String tipoDocumento) { this.tipoDocumento = tipoDocumento; }
	public String getNumeroDocumento() { return numeroDocumento; }
	public void setNumeroDocumento(String numeroDocumento) { this.numeroDocumento = numeroDocumento; }
	public BigDecimal getPrimaNeta() { return primaNeta; }
	public void setPrimaNeta(BigDecimal primaNeta) { this.primaNeta = primaNeta; }
	public BigDecimal getPrimaBruta() { return primaBruta; }
	public void setPrimaBruta(BigDecimal primaBruta) { this.primaBruta = primaBruta; }
	public String getIndicadorInspeccion() { return indicadorInspeccion; }
	public void setIndicadorInspeccion(String indicadorInspeccion) { this.indicadorInspeccion = indicadorInspeccion; }
	public String getStatus() { return status; }
	public void setStatus(String status) { this.status = status; }
	public String getMensaje() { return mensaje; }
	public void setMensaje(String mensaje) { this.mensaje = mensaje; }
}
