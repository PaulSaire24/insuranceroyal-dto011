package com.bbva.pisd.dto.insurance.aso.gifole;

import com.bbva.pisd.dto.insurance.aso.CommonFieldsASO;

public class UnitASO extends CommonFieldsASO{

    private String unitType;

    public String getUnitType() {return unitType;}
    public void setUnitType(String unitType) {this.unitType = unitType;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UnitASO{");
        sb.append("unitType=").append(unitType).append('\'');
        sb.append(", amount=").append(this.getAmount()).append('\'');
        sb.append(", currency=").append(this.getCurrency()).append('\'');
        sb.append(", text=").append(this.getText()).append('\'');
        sb.append('}');
        return sb.toString();
    }
    
}
