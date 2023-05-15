package com.bbva.pisd.dto.insurance.commons;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.joda.time.LocalDate;
@JsonIgnoreProperties(ignoreUnknown = true)
public class IdentityDataDTO {
	private String tipoLista;
	private String tipoDocumento;
	private String nroDocumento;
	private String producto;
	private LocalDate fechaNacimiento;

	public String getTipoLista() {
		return tipoLista;
	}

	public void setTipoLista(String tipoLista) {
		this.tipoLista = tipoLista;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public IdentityDataDTO(String tipoLista, String tipoDocumento, String nroDocumento) {
		this.tipoLista = tipoLista;
		this.tipoDocumento = tipoDocumento;
		this.nroDocumento = nroDocumento;
	}

	public IdentityDataDTO() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nroDocumento == null) ? 0 : nroDocumento.hashCode());
		result = prime * result + ((tipoDocumento == null) ? 0 : tipoDocumento.hashCode());
		result = prime * result + ((tipoLista == null) ? 0 : tipoLista.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IdentityDataDTO other = (IdentityDataDTO) obj;
		if (nroDocumento == null) {
			if (other.nroDocumento != null)
				return false;
		} else if (!nroDocumento.equals(other.nroDocumento)) {
			return false;
		}
		if (tipoDocumento == null) {
			if (other.tipoDocumento != null)
				return false;
		} else if (!tipoDocumento.equals(other.tipoDocumento)) {
			return false;
		}
		if (tipoLista == null) {
			if (other.tipoLista != null)
				return false;
		} else if (!tipoLista.equals(other.tipoLista)) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("IdentityDataDTO{");
		sb.append("tipoLista='").append(tipoLista).append('\'');
		sb.append(", tipoDocumento='").append(tipoDocumento).append('\'');
		sb.append(", nroDocumento='").append(nroDocumento).append('\'');
		sb.append(", fechaNacimiento='").append(fechaNacimiento).append('\'');
		sb.append(", producto='").append(producto).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
