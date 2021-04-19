package com.bbva.pisd.dto.insurance.bo;

import java.util.List;

public class BlackListRiskRimacBO {
	private List<SelectionQuotationPayloadBO> payload;

	public List<SelectionQuotationPayloadBO> getPayload() {
		return payload;
	}

	public void setPayload(List<SelectionQuotationPayloadBO> payload) {
		this.payload = payload;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("BlackListRimacBO{");
		sb.append("payload=").append(payload);
		sb.append('}');
		return sb.toString();
	}
}
