package com.bbva.pisd.dto.insurance.aso.gifole;

import com.bbva.pisd.dto.insurance.aso.tier.TierASO;

import java.util.List;

public class HolderASO {

    private Boolean isBankCustomer;
    private Boolean isDataTreatment;
    private IdentityDocumentASO identityDocument;
    private String firstName;
    private String lastName;
    private List<ContactDetailASO> contactDetails;
    private TierASO tier;
    private Boolean hasBankAccount;
    private Boolean hasCreditCard;

    public Boolean getIsBankCustomer() {return isBankCustomer;}
    public void setIsBankCustomer(Boolean bankCustomer) {isBankCustomer = bankCustomer;}
    public Boolean getIsDataTreatment() {return isDataTreatment;}
    public void setIsDataTreatment(Boolean dataTreatment) {isDataTreatment = dataTreatment;}
    public IdentityDocumentASO getIdentityDocument() {return identityDocument;}
    public void setIdentityDocument(IdentityDocumentASO identityDocument) {this.identityDocument = identityDocument;}
    public String getFirstName() {return firstName;}
    public void setFirstName(String firstName) {this.firstName = firstName;}
    public String getLastName() {return lastName;}
    public void setLastName(String lastName) {this.lastName = lastName;}
    public List<ContactDetailASO> getContactDetails() {return contactDetails;}
    public void setContactDetails(List<ContactDetailASO> contactDetails) {this.contactDetails = contactDetails;}
    public TierASO getTier() {return tier;}
    public void setTier(TierASO tier) {this.tier = tier;}
    public Boolean getHasBankAccount() {return hasBankAccount;}
    public void setHasBankAccount(Boolean hasBankAccount) {this.hasBankAccount = hasBankAccount;}
    public Boolean getHasCreditCard() {return hasCreditCard;}
    public void setHasCreditCard(Boolean hasCreditCard) {this.hasCreditCard = hasCreditCard;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HolderASO{");
        sb.append("isBankCustomer=").append(isBankCustomer);
        sb.append(", isDataTreatment=").append(isDataTreatment);
        sb.append(", identityDocument=").append(identityDocument);
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", contactDetails=").append(contactDetails);
        sb.append(", tier=").append(tier);
        sb.append(", hasBankAccount=").append(hasBankAccount);
        sb.append(", hasCreditCard=").append(hasCreditCard);
        sb.append('}');
        return sb.toString();
    }

}
