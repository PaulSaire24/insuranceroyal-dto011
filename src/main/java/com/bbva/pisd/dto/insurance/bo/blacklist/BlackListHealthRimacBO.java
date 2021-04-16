package com.bbva.pisd.dto.insurance.bo.blacklist;

import com.bbva.pisd.dto.insurance.bo.SelectionQuotationPayloadBO;

public class BlackListHealthRimacBO {
	private SelectionQuotationPayloadBO payload;

	public SelectionQuotationPayloadBO getPayload() {
		return payload;
	}

	public void setPayload(SelectionQuotationPayloadBO payload) {
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
