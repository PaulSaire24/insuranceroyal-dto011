package com.bbva.pisd.dto.insurance.dao;

import java.math.BigDecimal;

public class InsuranceProductModalityDAO extends CommonsDAO {

    public InsuranceProductModalityDAO() {
    }

    public InsuranceProductModalityDAO(String insuranceCompanyModalityId, String insuranceModalityName, String suggestedModalityIndType, BigDecimal insuranceProductId, String insuranceProductDescription) {
        this.insuranceCompanyModalityId = insuranceCompanyModalityId;
        this.insuranceModalityName = insuranceModalityName;
        this.suggestedModalityIndType = suggestedModalityIndType;
        this.setInsuranceProductId(insuranceProductId);
        this.setInsuranceProductDescription(insuranceProductDescription);
    }

    public InsuranceProductModalityDAO(String insuranceCompanyModalityId, String insuranceModalityName, String insuranceModalityType, String suggestedModalityIndType, BigDecimal publicationOrderNumber) {
        this.insuranceCompanyModalityId = insuranceCompanyModalityId;
        this.insuranceModalityName = insuranceModalityName;
        this.suggestedModalityIndType = suggestedModalityIndType;
        this.publicationOrderNumber = publicationOrderNumber;
        this.setInsuranceModalityType(insuranceModalityType);
    }

    private String insuranceCompanyModalityId;
    private String insuranceModalityName;
    private String suggestedModalityIndType;
    private BigDecimal publicationOrderNumber;

    public String getInsuranceCompanyModalityId() { return insuranceCompanyModalityId; }
    public void setInsuranceCompanyModalityId(String insuranceCompanyModalityId) { this.insuranceCompanyModalityId = insuranceCompanyModalityId; }
    public String getInsuranceModalityName() { return insuranceModalityName; }
    public void setInsuranceModalityName(String insuranceModalityName) { this.insuranceModalityName = insuranceModalityName; }
    public String getSuggestedModalityIndType() { return suggestedModalityIndType; }
    public void setSuggestedModalityIndType(String suggestedModalityIndType) { this.suggestedModalityIndType = suggestedModalityIndType; }
    public BigDecimal getPublicationOrderNumber() {return publicationOrderNumber;}
    public void setPublicationOrderNumber(BigDecimal publicationOrderNumber) {this.publicationOrderNumber = publicationOrderNumber;}

}
