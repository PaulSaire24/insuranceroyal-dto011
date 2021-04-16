package com.bbva.pisd.dto.insurance.blacklist;

import com.bbva.pisd.dto.insurance.commons.IdentityDataDTO;

public class BlackListRequestRimacDTO {
	private IdentityDataDTO payload;

	public IdentityDataDTO getPayload() {
		return payload;
	}

	public void setPayload(IdentityDataDTO payload) {
		this.payload = payload;
	}
	
	public BlackListRequestRimacDTO(IdentityDataDTO payload) {
		this.payload = payload;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("BlackListRequestRimacDTO{");
		sb.append("payload='").append(payload).append('\'');
		sb.append('}');
		return sb.toString();
	}
}
