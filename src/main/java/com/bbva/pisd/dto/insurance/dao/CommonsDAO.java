package com.bbva.pisd.dto.insurance.dao;

import java.math.BigDecimal;

public class CommonsDAO {

    private BigDecimal insuranceSimulationId;
    private String policyQuotaInternalId;
    private BigDecimal insuranceProductId;
    private String insuranceProductDescription;
    private String insuranceModalityType;
    private String customerId;
    private String creationUser;
    private String userAudit;
    private String sourceBranchId;
    private String lastChangeBranchId;


    public BigDecimal getInsuranceSimulationId() { return insuranceSimulationId; }
    public void setInsuranceSimulationId(BigDecimal insuranceSimulationId) { this.insuranceSimulationId = insuranceSimulationId; }
    public String getPolicyQuotaInternalId() { return policyQuotaInternalId; }
    public void setPolicyQuotaInternalId(String policyQuotaInternalId) { this.policyQuotaInternalId = policyQuotaInternalId; }
    public BigDecimal getInsuranceProductId() { return insuranceProductId; }
    public void setInsuranceProductId(BigDecimal insuranceProductId) { this.insuranceProductId = insuranceProductId; }
    public String getInsuranceProductDescription() { return insuranceProductDescription; }
    public void setInsuranceProductDescription(String insuranceProductDescription) { this.insuranceProductDescription = insuranceProductDescription; }
    public String getInsuranceModalityType() { return insuranceModalityType; }
    public void setInsuranceModalityType(String insuranceModalityType) { this.insuranceModalityType = insuranceModalityType; }
    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }
    public String getCreationUser() { return creationUser; }
    public void setCreationUser(String creationUser) { this.creationUser = creationUser; }
    public String getUserAudit() { return userAudit; }
    public void setUserAudit(String userAudit) { this.userAudit = userAudit; }
    public String getSourceBranchId() { return sourceBranchId; }
    public void setSourceBranchId(String sourceBranchId) { this.sourceBranchId = sourceBranchId; }
    public String getLastChangeBranchId() { return lastChangeBranchId; }
    public void setLastChangeBranchId(String lastChangeBranchId) { this.lastChangeBranchId = lastChangeBranchId; }

}

