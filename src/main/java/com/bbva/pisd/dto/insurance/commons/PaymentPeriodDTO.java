package com.bbva.pisd.dto.insurance.commons;

public class PaymentPeriodDTO extends CommonDTO {
	@Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PaymentPeriodDTO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", name='").append(this.getName()).append('\'');
        sb.append(", unit=").append(this.getUnit());
        sb.append('}');
        return sb.toString();
    }
}
