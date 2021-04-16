package com.bbva.pisd.dto.insurance.blacklist;

import com.bbva.apx.dto.AbstractDTO;
import com.bbva.pisd.dto.insurance.commons.IdentityDocumentDTO;
import com.bbva.pisd.dto.insurance.commons.InsuranceProductDTO;

import java.util.Date;

public class InsuranceBlackListDTO extends AbstractDTO {

    private String customerId;
    private IdentityDocumentDTO identityDocument;
    private BlackListTypeDTO blackListType;
    private BlockingCompanyDTO blockingCompany;
    private InsuranceProductDTO product;

    private String id;
    private String isBlocked;
    private BlockTypeDTO blockType;
    private String description;
    private Date entryDate;
    
    private String traceId;

	public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }
    public IdentityDocumentDTO getIdentityDocument() { return identityDocument; }
    public void setIdentityDocument(IdentityDocumentDTO identityDocument) { this.identityDocument = identityDocument; }
    public BlackListTypeDTO getBlackListType() { return blackListType; }
    public void setBlackListType(BlackListTypeDTO blackListType) { this.blackListType = blackListType; }
    public BlockingCompanyDTO getBlockingCompany() { return blockingCompany; }
    public void setBlockingCompany(BlockingCompanyDTO blockingCompany) { this.blockingCompany = blockingCompany; }
    public InsuranceProductDTO getProduct() { return product; }
    public void setProduct(InsuranceProductDTO product) { this.product = product; }
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getIsBlocked() { return isBlocked; }
    public void setIsBlocked(String isBlocked) { this.isBlocked = isBlocked; }
    public BlockTypeDTO getBlockType() { return blockType; }
    public void setBlockType(BlockTypeDTO blockType) { this.blockType = blockType; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Date getEntryDate() { return entryDate; }
    public void setEntryDate(Date entryDate) { this.entryDate = entryDate; }
    public String getTraceId() { return traceId; }
    public void setTraceId(String traceId) { this.traceId = traceId; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InsuranceBlackListDTO{");
        sb.append("customerId='").append(customerId).append('\'');
        sb.append(", identityDocument=").append(identityDocument);
        sb.append(", blackListType=").append(blackListType);
        sb.append(", blockingCompany=").append(blockingCompany);
        sb.append(", product=").append(product);
        sb.append(", id='").append(id).append('\'');
        sb.append(", isBlocked='").append(isBlocked).append('\'');
        sb.append(", blockType=").append(blockType);
        sb.append(", description='").append(description).append('\'');
        sb.append(", entryDate=").append(entryDate);
        sb.append(", traceId='").append(traceId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
