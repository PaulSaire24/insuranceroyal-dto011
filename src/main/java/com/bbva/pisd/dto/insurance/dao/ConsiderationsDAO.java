package com.bbva.pisd.dto.insurance.dao;

public class ConsiderationsDAO {

    private String insuranceModalityType;
    private Long idConsideration;
    private String insuranceConsiderationDescription;
    private String considerationType;
    private String considerationValueType;
    private Double considerationAmount;
    private String considerationCurrency;
    private Double considerationPercentage;
    private Boolean mainConsiderationIndType;

    public String getInsuranceModalityType() { return insuranceModalityType; }
    public void setInsuranceModalityType(String insuranceModalityType) { this.insuranceModalityType = insuranceModalityType; }
    public Long getIdConsideration() { return idConsideration; }
    public void setIdConsideration(Long idConsideration) { this.idConsideration = idConsideration; }
    public String getInsuranceConsiderationDescription() { return insuranceConsiderationDescription; }
    public void setInsuranceConsiderationDescription(String insuranceConsiderationDescription) { this.insuranceConsiderationDescription = insuranceConsiderationDescription; }
    public String getConsiderationType() { return considerationType; }
    public void setConsiderationType(String considerationType) { this.considerationType = considerationType; }
    public String getConsiderationValueType() { return considerationValueType; }
    public void setConsiderationValueType(String considerationValueType) { this.considerationValueType = considerationValueType; }
    public Double getConsiderationAmount() { return considerationAmount; }
    public void setConsiderationAmount(Double considerationAmount) { this.considerationAmount = considerationAmount; }
    public String getConsiderationCurrency() { return considerationCurrency; }
    public void setConsiderationCurrency(String considerationCurrency) { this.considerationCurrency = considerationCurrency; }
    public Double getConsiderationPercentage() { return considerationPercentage; }
    public void setConsiderationPercentage(Double considerationPercentage) { this.considerationPercentage = considerationPercentage; }
    public Boolean getMainConsiderationIndType() { return mainConsiderationIndType; }
    public void setMainConsiderationIndType(Boolean mainConsiderationIndType) { this.mainConsiderationIndType = mainConsiderationIndType; }
}
