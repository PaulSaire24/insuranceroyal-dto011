package com.bbva.pisd.dto.insurance.aso.gifole;

import com.bbva.pisd.dto.insurance.aso.CommonFieldsASO;

import java.util.Calendar;

public class DataGifoleASO extends CommonFieldsASO {

    private Calendar registerDate;

    public Calendar getRegisterDate() { return registerDate; }
    public void setRegisterDate(Calendar registerDate) { this.registerDate = registerDate; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DataGifoleASO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", registerDate=").append(registerDate);
        sb.append(", customer=").append(this.getCustomer());
        sb.append(", product=").append(this.getProduct());
        sb.append(", contract=").append(this.getContract());
        sb.append(", channel=").append(this.getChannel());
        sb.append('}');
        return sb.toString();
    }

}
