package com.bbva.pisd.dto.insurance.bo;

public class BlackListIndicatorBO {
	private String indicatorId;
	private String name;
	private Boolean isActive;

	public String getIndicatorId() {
		return indicatorId;
	}

	public void setIndicatorId(String indicatorId) {
		this.indicatorId = indicatorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("BlackListIndicatorBO:{");
		sb.append("indicatorId='").append(indicatorId).append('\'');
		sb.append(", name='").append(name).append('\'');
		sb.append(", isActive=").append(isActive);
		sb.append('}');
		return sb.toString();
	}
}
