package com.bbva.pisd.dto.insurance.aso.gifole;

import java.util.List;

import com.bbva.pisd.dto.insurance.aso.CommonFieldsASO;

public class PaymentMethodASO extends CommonFieldsASO {

    private List<RelatedContractASO> relatedContracts;

    public List<RelatedContractASO> getRelatedContracts() {return relatedContracts;}
    public void setRelatedContracts(List<RelatedContractASO> relatedContracts) {this.relatedContracts = relatedContracts;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PaymentMethodASO{");
        sb.append("id=").append(this.getId());
        sb.append(", relatedContracts='").append(relatedContracts).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
