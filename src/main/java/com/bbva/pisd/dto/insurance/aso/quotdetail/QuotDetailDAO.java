package com.bbva.pisd.dto.insurance.aso.quotdetail;

import java.math.BigDecimal;

public class QuotDetailDAO {

    private String rimacId;
    private String holderId;
    private BigDecimal productId;
    private String requiredInspection;
    private String gpsRequired;
    private String brandId;
    private String brandName;
    private String modelId;
    private String modelName;
    private String modelYear;
    private BigDecimal priceAmount;
    private String priceCurrency;
    private String vehicleCirculationId;
    private String hasPowerSupplyConversion;
    private String licenseNumber;
    private String productType;
    private String productDescription;

    public String getRimacId() { return rimacId; }
    public void setRimacId(String rimacId) { this.rimacId = rimacId; }
    public String getHolderId() { return holderId; }
    public void setHolderId(String holderId) { this.holderId = holderId; }
    public BigDecimal getProductId() { return productId; }
    public void setProductId(BigDecimal productId) { this.productId = productId; }
    public String getRequiredInspection() { return requiredInspection; }
    public void setRequiredInspection(String requiredInspection) { this.requiredInspection = requiredInspection; }
    public String getGpsRequired() { return gpsRequired; }
    public void setGpsRequired(String gpsRequired) { this.gpsRequired = gpsRequired; }
    public String getBrandId() { return brandId; }
    public void setBrandId(String brandId) { this.brandId = brandId; }
    public String getBrandName() { return brandName; }
    public void setBrandName(String brandName) { this.brandName = brandName; }
    public String getModelId() { return modelId; }
    public void setModelId(String modelId) { this.modelId = modelId; }
    public String getModelName() { return modelName; }
    public void setModelName(String modelName) { this.modelName = modelName; }
    public String getModelYear() { return modelYear; }
    public void setModelYear(String modelYear) { this.modelYear = modelYear; }
    public BigDecimal getPriceAmount() { return priceAmount; }
    public void setPriceAmount(BigDecimal priceAmount) { this.priceAmount = priceAmount; }
    public String getPriceCurrency() { return priceCurrency; }
    public void setPriceCurrency(String priceCurrency) { this.priceCurrency = priceCurrency; }
    public String getVehicleCirculationId() { return vehicleCirculationId; }
    public void setVehicleCirculationId(String vehicleCirculationId) { this.vehicleCirculationId = vehicleCirculationId; }
    public String getHasPowerSupplyConversion() { return hasPowerSupplyConversion; }
    public void setHasPowerSupplyConversion(String hasPowerSupplyConversion) { this.hasPowerSupplyConversion = hasPowerSupplyConversion; }
    public String getLicenseNumber() { return licenseNumber; }
    public void setLicenseNumber(String licenseNumber) { this.licenseNumber = licenseNumber; }
    public String getProductType() { return productType; }
    public void setProductType(String productType) { this.productType = productType; }
    public String getProductDescription() { return productDescription; }
    public void setProductDescription(String productDescription) { this.productDescription = productDescription; }

}
