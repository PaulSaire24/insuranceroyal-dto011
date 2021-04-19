package com.bbva.pisd.dto.insurance.dao;

public class InsuranceProductModalityDAO {

    public InsuranceProductModalityDAO() {
    }

    public InsuranceProductModalityDAO(String insuranceCompanyModalityId, String insuranceModalityName, String insuranceModalityType, String suggestedModalityIndType) {
        this.insuranceCompanyModalityId = insuranceCompanyModalityId;
        this.insuranceModalityName = insuranceModalityName;
        this.insuranceModalityType = insuranceModalityType;
        this.suggestedModalityIndType = suggestedModalityIndType;
    }

    private String insuranceCompanyModalityId;
    private String insuranceModalityName;
    private String insuranceModalityType;
    private String suggestedModalityIndType;

    public String getInsuranceCompanyModalityId() { return insuranceCompanyModalityId; }
    public void setInsuranceCompanyModalityId(String insuranceCompanyModalityId) { this.insuranceCompanyModalityId = insuranceCompanyModalityId; }
    public String getInsuranceModalityName() { return insuranceModalityName; }
    public void setInsuranceModalityName(String insuranceModalityName) { this.insuranceModalityName = insuranceModalityName; }
    public String getInsuranceModalityType() { return insuranceModalityType; }
    public void setInsuranceModalityType(String insuranceModalityType) { this.insuranceModalityType = insuranceModalityType; }
    public String getSuggestedModalityIndType() { return suggestedModalityIndType; }
    public void setSuggestedModalityIndType(String suggestedModalityIndType) { this.suggestedModalityIndType = suggestedModalityIndType; }

}
