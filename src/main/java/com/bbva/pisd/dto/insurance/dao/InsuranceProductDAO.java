package com.bbva.pisd.dto.insurance.dao;

public class InsuranceProductDAO {

    private Long insuranceProductId;
    private Long insuranceRiskBusinessId;
    private String insuranceProductDescription;

    public Long getInsuranceProductId() { return insuranceProductId; }
    public void setInsuranceProductId(Long insuranceProductId) { this.insuranceProductId = insuranceProductId; }
    public Long getInsuranceRiskBusinessId() { return insuranceRiskBusinessId; }
    public void setInsuranceRiskBusinessId(Long insuranceRiskBusinessId) { this.insuranceRiskBusinessId = insuranceRiskBusinessId; }
    public String getInsuranceProductDescription() { return insuranceProductDescription; }
    public void setInsuranceProductDescription(String insuranceProductDescription) { this.insuranceProductDescription = insuranceProductDescription; }

}
