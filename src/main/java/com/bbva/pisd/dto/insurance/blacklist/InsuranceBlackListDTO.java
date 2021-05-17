package com.bbva.pisd.dto.insurance.blacklist;

import com.bbva.pisd.dto.insurance.commons.CommonOutputFieldsDTO;
import com.bbva.pisd.dto.insurance.commons.IdentityDocumentDTO;

import java.util.Date;

public class InsuranceBlackListDTO extends CommonOutputFieldsDTO {

    private IdentityDocumentDTO identityDocument;
    private BlackListTypeDTO blackListType;
    private BlockingCompanyDTO blockingCompany;

    private String isBlocked;
    private BlockTypeDTO blockType;
    private Date entryDate;

    public IdentityDocumentDTO getIdentityDocument() { return identityDocument; }
    public void setIdentityDocument(IdentityDocumentDTO identityDocument) { this.identityDocument = identityDocument; }
    public BlackListTypeDTO getBlackListType() { return blackListType; }
    public void setBlackListType(BlackListTypeDTO blackListType) { this.blackListType = blackListType; }
    public BlockingCompanyDTO getBlockingCompany() { return blockingCompany; }
    public void setBlockingCompany(BlockingCompanyDTO blockingCompany) { this.blockingCompany = blockingCompany; }
    public String getIsBlocked() { return isBlocked; }
    public void setIsBlocked(String isBlocked) { this.isBlocked = isBlocked; }
    public BlockTypeDTO getBlockType() { return blockType; }
    public void setBlockType(BlockTypeDTO blockType) { this.blockType = blockType; }
    public Date getEntryDate() { return entryDate; }
    public void setEntryDate(Date entryDate) { this.entryDate = entryDate; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuranceBlackListDTO{");
        sb.append("customerId='").append(this.getCustomerId()).append('\'');
        sb.append(", identityDocument=").append(identityDocument);
        sb.append(", blackListType=").append(blackListType);
        sb.append(", blockingCompany=").append(blockingCompany);
        sb.append(", product=").append(this.getProduct());
        sb.append(", id='").append(this.getId()).append('\'');
        sb.append(", isBlocked='").append(isBlocked).append('\'');
        sb.append(", blockType=").append(blockType);
        sb.append(", description='").append(this.getDescription()).append('\'');
        sb.append(", entryDate=").append(entryDate);
        sb.append(", traceId='").append(this.getTraceId()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
