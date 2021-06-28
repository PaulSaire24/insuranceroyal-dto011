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

	public ErrorBO getError() { return error; }
	public void setError(ErrorBO error) { this.error = error; }
	public String geCotizacion() { return cotizacion; }
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

}
