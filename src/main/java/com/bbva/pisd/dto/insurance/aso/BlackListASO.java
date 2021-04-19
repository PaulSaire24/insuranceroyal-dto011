package com.bbva.pisd.dto.insurance.aso;

import com.bbva.pisd.dto.insurance.bo.BlackListIndicatorBO;

import java.util.List;

public class BlackListASO {
	private List<BlackListIndicatorBO> data;

	public List<BlackListIndicatorBO> getData() {
		return data;
	}

	public void setData(List<BlackListIndicatorBO> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("BlackListASO:{");
		sb.append("Data=").append(data);
		sb.append('}');
		return sb.toString();
	}
}
