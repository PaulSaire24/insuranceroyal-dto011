package com.bbva.pisd.dto.insurance.commons;

import com.bbva.apx.dto.AbstractDTO;
import com.bbva.pisd.dto.insurance.policy.BusinessAgentDTO;
import com.bbva.pisd.dto.insurance.policy.PaymentAmountDTO;

import java.util.Date;
import java.util.List;

public class CommonOutputFieldsDTO extends AbstractDTO {

    private HolderDTO holder;
    private InsuranceProductDTO product;
    private QuotationCompanyDTO quotationCompany;
    private VehicleModelDTO model;
    private VehiclePriceDTO price;
    private VehicleCirculationDTO vehicleCirculation;
    private String hasPowerSupplyConvertion;
    private VehicleUsageTypeDTO usageType;
    private String hasSteeringWheelChanged;
    private TierDTO tier;
    private QuotationStatusDTO status;
    private Double bankingFactor;
    private Double campaignFactor;
    private String isGpsRequired;
    private String isInspectionRequired;
    private Long validityDays;
    private Date startDate;

    private Date endDate;

    private Date maturityDate;
    private Date operationDate;
    private String id;
    private String licensePlate;

    private List<ContactDetailDTO> contactDetails;
    private ScheduleContactDTO scheduleContact;
    private InsuranceCompanyDTO insuranceCompany;
    private String offerId;
    private String engineNumber;
    private String vehicleIdentificationNumber;
    private Long seats;
    private String markedAsSaved;

    private String customerId;
    private String productId;
    private ValidityPeriodDTO validityPeriod;
    private String externalPolicyNumber;

    private String quotationId;
    private PaymentAmountDTO paymentAmount;
    private String description;
    private List<LinkDTO> links;

    private PaymentPeriodDTO period;
    private PolicyInspectionDTO inspection;
    private BusinessAgentDTO businessAgent;

    private String creationUser;
    private String userAudit;
    private String saleChannelId;
    private String traceId;
    private String aap;
    private String clientDocument;
    private BankDTO bank;

    private Long totalNumberInstallments;

    public HolderDTO getHolder() { return holder; }
    public void setHolder(HolderDTO holder) { this.holder = holder; }
    public InsuranceProductDTO getProduct() { return product; }
    public void setProduct(InsuranceProductDTO product) { this.product = product; }
    public QuotationCompanyDTO getQuotationCompany() { return quotationCompany; }
    public void setQuotationCompany(QuotationCompanyDTO quotationCompany) { this.quotationCompany = quotationCompany; }
    public VehicleModelDTO getModel() { return model; }
    public void setModel(VehicleModelDTO model) { this.model = model; }
    public VehiclePriceDTO getPrice() { return price; }
    public void setPrice(VehiclePriceDTO price) { this.price = price; }
    public VehicleCirculationDTO getVehicleCirculation() { return vehicleCirculation; }
    public void setVehicleCirculation(VehicleCirculationDTO vehicleCirculation) { this.vehicleCirculation = vehicleCirculation; }
    public String getHasPowerSupplyConvertion() { return hasPowerSupplyConvertion; }
    public void setHasPowerSupplyConvertion(String hasPowerSupplyConvertion) { this.hasPowerSupplyConvertion = hasPowerSupplyConvertion; }
    public VehicleUsageTypeDTO getUsageType() { return usageType; }
    public void setUsageType(VehicleUsageTypeDTO usageType) { this.usageType = usageType; }
    public String getHasSteeringWheelChanged() { return hasSteeringWheelChanged; }
    public void setHasSteeringWheelChanged(String hasSteeringWheelChanged) { this.hasSteeringWheelChanged = hasSteeringWheelChanged; }
    public TierDTO getTier() { return tier; }
    public void setTier(TierDTO tier) { this.tier = tier; }
    public QuotationStatusDTO getStatus() { return status; }
    public void setStatus(QuotationStatusDTO status) { this.status = status; }
    public Double getBankingFactor() { return bankingFactor; }
    public void setBankingFactor(Double bankingFactor) { this.bankingFactor = bankingFactor; }
    public Double getCampaignFactor() { return campaignFactor; }
    public void setCampaignFactor(Double campaignFactor) { this.campaignFactor = campaignFactor; }
    public String getIsGpsRequired() { return isGpsRequired; }
    public void setIsGpsRequired(String isGpsRequired) { this.isGpsRequired = isGpsRequired; }
    public String getIsInspectionRequired() { return isInspectionRequired; }
    public void setIsInspectionRequired(String isInspectionRequired) { this.isInspectionRequired = isInspectionRequired; }
    public Long getValidityDays() { return validityDays; }
    public void setValidityDays(Long validityDays) { this.validityDays = validityDays; }
    public Date getStartDate() { return startDate; }
    public void setStartDate(Date startDate) { this.startDate = startDate; }

    public Date getEndDate() { return endDate; }
    public void setEndDate(Date endDate) { this.endDate = endDate; }

    public Date getMaturityDate() { return maturityDate; }
    public void setMaturityDate(Date maturityDate) { this.maturityDate = maturityDate; }
    public Date getOperationDate() { return operationDate; }
    public void setOperationDate(Date operationDate) { this.operationDate = operationDate; }
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getLicensePlate() { return licensePlate; }
    public void setLicensePlate(String licensePlate) { this.licensePlate = licensePlate; }
    public List<ContactDetailDTO> getContactDetails() { return contactDetails; }
    public void setContactDetails(List<ContactDetailDTO> contactDetails) { this.contactDetails = contactDetails; }
    public ScheduleContactDTO getScheduleContact() { return scheduleContact; }
    public void setScheduleContact(ScheduleContactDTO scheduleContact) { this.scheduleContact = scheduleContact; }
    public InsuranceCompanyDTO getInsuranceCompany() { return insuranceCompany; }
    public void setInsuranceCompany(InsuranceCompanyDTO insuranceCompany) { this.insuranceCompany = insuranceCompany; }
    public String getOfferId() { return offerId; }
    public void setOfferId(String offerId) { this.offerId = offerId; }
    public String getEngineNumber() { return engineNumber; }
    public void setEngineNumber(String engineNumber) { this.engineNumber = engineNumber; }
    public String getVehicleIdentificationNumber() { return vehicleIdentificationNumber; }
    public void setVehicleIdentificationNumber(String vehicleIdentificationNumber) { this.vehicleIdentificationNumber = vehicleIdentificationNumber; }
    public Long getSeats() { return seats; }
    public void setSeats(Long seats) { this.seats = seats; }
    public String getMarkedAsSaved() { return markedAsSaved; }
    public void setMarkedAsSaved(String markedAsSaved) { this.markedAsSaved = markedAsSaved; }

    public String getCustomerId() { return customerId; }
    public void setCustomerId(String customerId) { this.customerId = customerId; }
    public String getProductId() { return productId; }
    public void setProductId(String productId) { this.productId = productId; }
    public ValidityPeriodDTO getValidityPeriod() { return validityPeriod; }
    public void setValidityPeriod(ValidityPeriodDTO validityPeriod) { this.validityPeriod = validityPeriod; }
    public String getExternalPolicyNumber() { return externalPolicyNumber; }
    public void setExternalPolicyNumber(String externalPolicyNumber) { this.externalPolicyNumber = externalPolicyNumber; }

    public String getQuotationId() { return quotationId; }
    public void setQuotationId(String quotationId) { this.quotationId = quotationId; }
    public PaymentAmountDTO getPaymentAmount() { return paymentAmount; }
    public void setPaymentAmount(PaymentAmountDTO paymentAmount) { this.paymentAmount = paymentAmount; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public List<LinkDTO> getLinks() { return links; }
    public void setLinks(List<LinkDTO> links) { this.links = links; }

    public PaymentPeriodDTO getPeriod() { return period; }
    public void setPeriod(PaymentPeriodDTO period) { this.period = period; }
    public PolicyInspectionDTO getInspection() { return inspection; }
    public void setInspection(PolicyInspectionDTO inspection) { this.inspection = inspection; }

    public BusinessAgentDTO getBusinessAgent() { return businessAgent; }
    public void setBusinessAgent(BusinessAgentDTO businessAgent) { this.businessAgent = businessAgent; }

    public String getCreationUser() { return creationUser; }
    public void setCreationUser(String creationUser) { this.creationUser = creationUser; }
    public String getUserAudit() { return userAudit; }
    public void setUserAudit(String userAudit) { this.userAudit = userAudit; }
    public String getSaleChannelId() { return saleChannelId; }
    public void setSaleChannelId(String saleChannelId) { this.saleChannelId = saleChannelId; }
    public String getTraceId() { return traceId; }
    public void setTraceId(String traceId) { this.traceId = traceId; }
    public String getAap() { return aap; }
    public void setAap(String aap) { this.aap = aap; }
    public BankDTO getBank() { return bank; }
    public void setBank(BankDTO bank) { this.bank = bank; }

    public Long getTotalNumberInstallments() { return totalNumberInstallments; }
    public void setTotalNumberInstallments(Long totalNumberInstallments) { this.totalNumberInstallments = totalNumberInstallments; }

    public String getClientDocument() { return clientDocument; }
    public void setClientDocument(String clientDocument) { this.clientDocument = clientDocument; }
}