package com.bbva.pisd.dto.insurance.aso.gifole;

import com.bbva.pisd.dto.insurance.aso.CommonFieldsASO;

public class AccountGifoleASO extends CommonFieldsASO {

    public AccountGifoleASO() {
        this.setNumber("99999999");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AccountGifoleASO{");
        sb.append("number='").append(this.getNumber()).append('\'');
        sb.append('}');
        return sb.toString();
    }

}