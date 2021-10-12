package com.bbva.pisd.dto.insurance.dao;

import java.math.BigDecimal;
import java.util.Date;

public class ContractDAO extends CommonsDAO {

    private String insuranceContractEntityId;
    private String insuranceContractBranchId;
    private String insrncContractIntAccountId;
    private String contractFirstVerfnDigitId;
    private String contractSecondVerfnDigitId;
    private BigDecimal insuranceCompanyId;
    private String policyId;
    private String insuranceManagerId;
    private String insurancePromoterId;
    private String contractManagerBranchId;
    private Date contractInceptionDate;
    private Date insuranceContractStartDate;
    private Date insuranceContractEndDate;
    private BigDecimal insrncValidityMonthsNumber;
    private Date insurancePolicyEndDate;
    private Date policyAnnulationDate;
    private BigDecimal aftrReprgPendingInstNumber;
    private BigDecimal contractRegisCstAgeNumber;
    private String domicileContractId;
    private String cardIssuingMarkType;
    private BigDecimal issuedReceiptNumber;
    private BigDecimal paymentFrequencyId;
    private BigDecimal premiumAmount;
    private BigDecimal netPremPlcyOrigCurrAmount;
    private BigDecimal settlePendingPremiumAmount;
    private BigDecimal policyFeeAmount;
    private String currencyId;
    private Date lastInstallmentDate;
    private Date installmentPeriodFinalDate;
    private BigDecimal insuredAmount;
    private String beneficiaryType;
    private BigDecimal renewalNumber;
    private Date nextRenewalStartDate;
    private String policyPymtPendDueDebtType;
    private String ctrctDisputeStatusType;
    private String contractPreviousBranchId;
    private Date periodNextPaymentDate;
    private String contPreviousSituationType;
    private String endorsementPolicyIndType;
    private String insrncCoContractStatusType;
    private String contractStatusId;

    public String getInsuranceContractEntityId() { return insuranceContractEntityId; }
    public void setInsuranceContractEntityId(String insuranceContractEntityId) { this.insuranceContractEntityId = insuranceContractEntityId; }
    public String getInsuranceContractBranchId() { return insuranceContractBranchId; }
    public void setInsuranceContractBranchId(String insuranceContractBranchId) { this.insuranceContractBranchId = insuranceContractBranchId; }
    public String getInsrncContractIntAccountId() { return insrncContractIntAccountId; }
    public void setInsrncContractIntAccountId(String insrncContractIntAccountId) { this.insrncContractIntAccountId = insrncContractIntAccountId; }
    public String getContractFirstVerfnDigitId() { return contractFirstVerfnDigitId; }
    public void setContractFirstVerfnDigitId(String contractFirstVerfnDigitId) { this.contractFirstVerfnDigitId = contractFirstVerfnDigitId; }
    public String getContractSecondVerfnDigitId() { return contractSecondVerfnDigitId; }
    public void setContractSecondVerfnDigitId(String contractSecondVerfnDigitId) { this.contractSecondVerfnDigitId = contractSecondVerfnDigitId; }
    public BigDecimal getInsuranceCompanyId() { return insuranceCompanyId; }
    public void setInsuranceCompanyId(BigDecimal insuranceCompanyId) { this.insuranceCompanyId = insuranceCompanyId; }
    public String getPolicyId() { return policyId; }
    public void setPolicyId(String policyId) { this.policyId = policyId; }
    public String getInsuranceManagerId() { return insuranceManagerId; }
    public void setInsuranceManagerId(String insuranceManagerId) { this.insuranceManagerId = insuranceManagerId; }
    public String getInsurancePromoterId() { return insurancePromoterId; }
    public void setInsurancePromoterId(String insurancePromoterId) { this.insurancePromoterId = insurancePromoterId; }
    public String getContractManagerBranchId() { return contractManagerBranchId; }
    public void setContractManagerBranchId(String contractManagerBranchId) { this.contractManagerBranchId = contractManagerBranchId; }
    public Date getContractInceptionDate() { return contractInceptionDate; }
    public void setContractInceptionDate(Date contractInceptionDate) { this.contractInceptionDate = contractInceptionDate; }
    public Date getInsuranceContractStartDate() { return insuranceContractStartDate; }
    public void setInsuranceContractStartDate(Date insuranceContractStartDate) { this.insuranceContractStartDate = insuranceContractStartDate; }
    public Date getInsuranceContractEndDate() { return insuranceContractEndDate; }
    public void setInsuranceContractEndDate(Date insuranceContractEndDate) { this.insuranceContractEndDate = insuranceContractEndDate; }
    public BigDecimal getInsrncValidityMonthsNumber() { return insrncValidityMonthsNumber; }
    public void setInsrncValidityMonthsNumber(BigDecimal insrncValidityMonthsNumber) { this.insrncValidityMonthsNumber = insrncValidityMonthsNumber; }
    public Date getInsurancePolicyEndDate() { return insurancePolicyEndDate; }
    public void setInsurancePolicyEndDate(Date insurancePolicyEndDate) { this.insurancePolicyEndDate = insurancePolicyEndDate; }
    public Date getPolicyAnnulationDate() { return policyAnnulationDate; }
    public void setPolicyAnnulationDate(Date policyAnnulationDate) { this.policyAnnulationDate = policyAnnulationDate; }
    public BigDecimal getAftrReprgPendingInstNumber() { return aftrReprgPendingInstNumber; }
    public void setAftrReprgPendingInstNumber(BigDecimal aftrReprgPendingInstNumber) { this.aftrReprgPendingInstNumber = aftrReprgPendingInstNumber; }
    public BigDecimal getContractRegisCstAgeNumber() { return contractRegisCstAgeNumber; }
    public void setContractRegisCstAgeNumber(BigDecimal contractRegisCstAgeNumber) { this.contractRegisCstAgeNumber = contractRegisCstAgeNumber; }
    public String getDomicileContractId() { return domicileContractId; }
    public void setDomicileContractId(String domicileContractId) { this.domicileContractId = domicileContractId; }
    public String getCardIssuingMarkType() { return cardIssuingMarkType; }
    public void setCardIssuingMarkType(String cardIssuingMarkType) { this.cardIssuingMarkType = cardIssuingMarkType; }
    public BigDecimal getIssuedReceiptNumber() { return issuedReceiptNumber; }
    public void setIssuedReceiptNumber(BigDecimal issuedReceiptNumber) { this.issuedReceiptNumber = issuedReceiptNumber; }
    public BigDecimal getPaymentFrequencyId() { return paymentFrequencyId; }
    public void setPaymentFrequencyId(BigDecimal paymentFrequencyId) { this.paymentFrequencyId = paymentFrequencyId; }
    public BigDecimal getPremiumAmount() { return premiumAmount; }
    public void setPremiumAmount(BigDecimal premiumAmount) { this.premiumAmount = premiumAmount; }
    public BigDecimal getNetPremPlcyOrigCurrAmount() { return netPremPlcyOrigCurrAmount; }
    public void setNetPremPlcyOrigCurrAmount(BigDecimal netPremPlcyOrigCurrAmount) { this.netPremPlcyOrigCurrAmount = netPremPlcyOrigCurrAmount; }
    public BigDecimal getSettlePendingPremiumAmount() { return settlePendingPremiumAmount; }
    public void setSettlePendingPremiumAmount(BigDecimal settlePendingPremiumAmount) { this.settlePendingPremiumAmount = settlePendingPremiumAmount; }
    public BigDecimal getPolicyFeeAmount() { return policyFeeAmount; }
    public void setPolicyFeeAmount(BigDecimal policyFeeAmount) { this.policyFeeAmount = policyFeeAmount; }
    public String getCurrencyId() { return currencyId; }
    public void setCurrencyId(String currencyId) { this.currencyId = currencyId; }
    public Date getLastInstallmentDate() { return lastInstallmentDate; }
    public void setLastInstallmentDate(Date lastInstallmentDate) { this.lastInstallmentDate = lastInstallmentDate; }
    public Date getInstallmentPeriodFinalDate() { return installmentPeriodFinalDate; }
    public void setInstallmentPeriodFinalDate(Date installmentPeriodFinalDate) { this.installmentPeriodFinalDate = installmentPeriodFinalDate; }
    public BigDecimal getInsuredAmount() { return insuredAmount; }
    public void setInsuredAmount(BigDecimal insuredAmount) { this.insuredAmount = insuredAmount; }
    public String getBeneficiaryType() { return beneficiaryType; }
    public void setBeneficiaryType(String beneficiaryType) { this.beneficiaryType = beneficiaryType; }
    public BigDecimal getRenewalNumber() { return renewalNumber; }
    public void setRenewalNumber(BigDecimal renewalNumber) { this.renewalNumber = renewalNumber; }
    public Date getNextRenewalStartDate() { return nextRenewalStartDate; }
    public void setNextRenewalStartDate(Date nextRenewalStartDate) { this.nextRenewalStartDate = nextRenewalStartDate; }
    public String getPolicyPymtPendDueDebtType() { return policyPymtPendDueDebtType; }
    public void setPolicyPymtPendDueDebtType(String policyPymtPendDueDebtType) { this.policyPymtPendDueDebtType = policyPymtPendDueDebtType; }
    public String getCtrctDisputeStatusType() { return ctrctDisputeStatusType; }
    public void setCtrctDisputeStatusType(String ctrctDisputeStatusType) { this.ctrctDisputeStatusType = ctrctDisputeStatusType; }
    public String getContractPreviousBranchId() { return contractPreviousBranchId; }
    public void setContractPreviousBranchId(String contractPreviousBranchId) { this.contractPreviousBranchId = contractPreviousBranchId; }
    public Date getPeriodNextPaymentDate() { return periodNextPaymentDate; }
    public void setPeriodNextPaymentDate(Date periodNextPaymentDate) { this.periodNextPaymentDate = periodNextPaymentDate; }
    public String getContPreviousSituationType() { return contPreviousSituationType; }
    public void setContPreviousSituationType(String contPreviousSituationType) { this.contPreviousSituationType = contPreviousSituationType; }
    public String getEndorsementPolicyIndType() { return endorsementPolicyIndType; }
    public void setEndorsementPolicyIndType(String endorsementPolicyIndType) { this.endorsementPolicyIndType = endorsementPolicyIndType; }
    public String getInsrncCoContractStatusType() { return insrncCoContractStatusType; }
    public void setInsrncCoContractStatusType(String insrncCoContractStatusType) { this.insrncCoContractStatusType = insrncCoContractStatusType; }
    public String getContractStatusId() { return contractStatusId; }
    public void setContractStatusId(String contractStatusId) { this.contractStatusId = contractStatusId; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ContractDAO{");
        sb.append("insuranceContractEntityId='").append(insuranceContractEntityId).append('\'');
        sb.append(", insuranceContractBranchId='").append(insuranceContractBranchId).append('\'');
        sb.append(", insrncContractIntAccountId='").append(insrncContractIntAccountId).append('\'');
        sb.append(", contractFirstVerfnDigitId='").append(contractFirstVerfnDigitId).append('\'');
        sb.append(", contractSecondVerfnDigitId='").append(contractSecondVerfnDigitId).append('\'');
        sb.append(", policyQuotaInternalId='").append(this.getPolicyQuotaInternalId()).append('\'');
        sb.append(", insuranceProductId=").append(this.getInsuranceProductId());
        sb.append(", insuranceModalityType='").append(this.getInsuranceModalityType()).append('\'');
        sb.append(", insuranceCompanyId=").append(insuranceCompanyId);
        sb.append(", policyId='").append(policyId).append('\'');
        sb.append(", insuranceManagerId='").append(insuranceManagerId).append('\'');
        sb.append(", insurancePromoterId='").append(insurancePromoterId).append('\'');
        sb.append(", contractManagerBranchId='").append(contractManagerBranchId).append('\'');
        sb.append(", contractInceptionDate=").append(contractInceptionDate);
        sb.append(", insuranceContractStartDate=").append(insuranceContractStartDate);
        sb.append(", insuranceContractEndDate=").append(insuranceContractEndDate);
        sb.append(", insrncValidityMonthsNumber=").append(insrncValidityMonthsNumber);
        sb.append(", insurancePolicyEndDate=").append(insurancePolicyEndDate);
        sb.append(", policyAnnulationDate=").append(policyAnnulationDate);
        sb.append(", aftrReprgPendingInstNumber=").append(aftrReprgPendingInstNumber);
        sb.append(", contractRegisCstAgeNumber=").append(contractRegisCstAgeNumber);
        sb.append(", customerId='").append(this.getCustomerId()).append('\'');
        sb.append(", domicileContractId='").append(domicileContractId).append('\'');
        sb.append(", cardIssuingMarkType='").append(cardIssuingMarkType).append('\'');
        sb.append(", issuedReceiptNumber=").append(issuedReceiptNumber);
        sb.append(", paymentFrequencyId=").append(paymentFrequencyId);
        sb.append(", premiumAmount=").append(premiumAmount);
        sb.append(", netPremPlcyOrigCurrAmount=").append(netPremPlcyOrigCurrAmount);
        sb.append(", settlePendingPremiumAmount=").append(settlePendingPremiumAmount);
        sb.append(", policyFeeAmount=").append(policyFeeAmount);
        sb.append(", currencyId='").append(currencyId).append('\'');
        sb.append(", lastInstallmentDate=").append(lastInstallmentDate);
        sb.append(", installmentPeriodFinalDate=").append(installmentPeriodFinalDate);
        sb.append(", insuredAmount=").append(insuredAmount);
        sb.append(", beneficiaryType='").append(beneficiaryType).append('\'');
        sb.append(", renewalNumber=").append(renewalNumber);
        sb.append(", nextRenewalStartDate=").append(nextRenewalStartDate);
        sb.append(", policyPymtPendDueDebtType='").append(policyPymtPendDueDebtType).append('\'');
        sb.append(", ctrctDisputeStatusType='").append(ctrctDisputeStatusType).append('\'');
        sb.append(", contractPreviousBranchId='").append(contractPreviousBranchId).append('\'');
        sb.append(", periodNextPaymentDate=").append(periodNextPaymentDate);
        sb.append(", contPreviousSituationType='").append(contPreviousSituationType).append('\'');
        sb.append(", endorsementPolicyIndType='").append(endorsementPolicyIndType).append('\'');
        sb.append(", insrncCoContractStatusType='").append(insrncCoContractStatusType).append('\'');
        sb.append(", contractStatusId='").append(contractStatusId).append('\'');
        sb.append(", creationUserId='").append(this.getCreationUser()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
