package com.bbva.pisd.dto.insurance.dao;

import java.sql.Timestamp;

public class InsuranceQuotationDAO extends CommonsDAO {

    private String insuranceCompanyQuotaId;
    private String quoteDate;
    private Timestamp policyQuotaEndValidityDate;
    private String mail;
    private String phone;
    private String participantPersonalId;

    public String getInsuranceCompanyQuotaId() { return insuranceCompanyQuotaId; }
    public void setInsuranceCompanyQuotaId(String insuranceCompanyQuotaId) { this.insuranceCompanyQuotaId = insuranceCompanyQuotaId; }
    public String getQuoteDate() { return quoteDate; }
    public void setQuoteDate(String quoteDate) { this.quoteDate = quoteDate; }
    public Timestamp getPolicyQuotaEndValidityDate() { return policyQuotaEndValidityDate; }
    public void setPolicyQuotaEndValidityDate(Timestamp policyQuotaEndValidityDate) { this.policyQuotaEndValidityDate = policyQuotaEndValidityDate; }
    public String getMail() { return mail; }
    public void setMail(String mail) { this.mail = mail; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getParticipantPersonalId() { return participantPersonalId; }
    public void setParticipantPersonalId(String participantPersonalId) { this.participantPersonalId = participantPersonalId; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuranceQuotationDAO{");
        sb.append("policyQuotaInternalId='").append(this.getPolicyQuotaInternalId()).append('\'');
        sb.append(", insuranceSimulationId=").append(this.getInsuranceSimulationId());
        sb.append(", insuranceCompanyQuotaId='").append(insuranceCompanyQuotaId).append('\'');
        sb.append(", quoteDate='").append(quoteDate).append('\'');
        sb.append(", policyQuotaEndValidityDate=").append(policyQuotaEndValidityDate);
        sb.append(", customerId='").append(this.getCustomerId()).append('\'');
        sb.append(", creationUser='").append(this.getCreationUser()).append('\'');
        sb.append(", userAudit='").append(this.getUserAudit()).append('\'');
        sb.append(", mail='").append(mail).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", participantPersonalId='").append(participantPersonalId).append('\'');
        sb.append('}');
        return sb.toString();
    }

}