package com.bbva.pisd.dto.insurance.aso.gifole;

import java.math.BigDecimal;
import java.util.List;

public class GoodDetailASO {

    private String insuranceType;
    private String licensePlate;
    private ModelASO model;
    private Boolean hasPowerSupplyConvertion;
    private AmountASO price;
    private VehicleCirculationASO vehicleCirculation;
    private UsageTypeASO usageType;

    //home attributes
    private PropertyTypeASO propertyType;
    private LocationASO location;
    private BuildMaterialTypeASO buildMaterialType;
    private List<InsuredCapitalsASO> insuredCapitals;
    private BigDecimal buildingAge;
    private BigDecimal floorsNumber;
    private List<SurfaceASO> surfaces;
    private BigDecimal basementLevels;
    private HolderTypeASO holderType;
    
    public String getInsuranceType() {return insuranceType;}
    public void setInsuranceType(String insuranceType) {this.insuranceType = insuranceType;}
    public String getLicensePlate() {return licensePlate;}
    public void setLicensePlate(String licensePlate) {this.licensePlate = licensePlate;}
    public ModelASO getModel() {return model;}
    public void setModel(ModelASO model) {this.model = model;}
    public Boolean getHasPowerSupplyConvertion() {return hasPowerSupplyConvertion;}
    public void setHasPowerSupplyConvertion(Boolean hasPowerSupplyConvertion) {this.hasPowerSupplyConvertion = hasPowerSupplyConvertion;}
    public AmountASO getPrice() {return price;}
    public void setPrice(AmountASO price) {this.price = price;}
    public VehicleCirculationASO getVehicleCirculation() {return vehicleCirculation;}
    public void setVehicleCirculation(VehicleCirculationASO vehicleCirculation) {this.vehicleCirculation = vehicleCirculation;}
    public UsageTypeASO getUsageType() {return usageType;}
    public void setUsageType(UsageTypeASO usageType) {this.usageType = usageType;}
    public PropertyTypeASO getPropertyType() {return propertyType;}
    public void setPropertyType(PropertyTypeASO propertyType) {this.propertyType = propertyType;}
    public LocationASO getLocation() {return location;}
    public void setLocation(LocationASO location) {this.location = location;}
    public BuildMaterialTypeASO getBuildMaterialType() {return buildMaterialType;}
    public void setBuildMaterialType(BuildMaterialTypeASO buildMaterialType) {this.buildMaterialType = buildMaterialType;}
    public List<InsuredCapitalsASO> getInsuredCapitals() {return insuredCapitals;}
    public void setInsuredCapitals(List<InsuredCapitalsASO> insuredCapitals) {this.insuredCapitals = insuredCapitals;}
    public BigDecimal getBuildingAge() {return buildingAge;}
    public void setBuildingAge(BigDecimal buildingAge) {this.buildingAge = buildingAge;}
    public BigDecimal getFloorsNumber() {return floorsNumber;}
    public void setFloorsNumber(BigDecimal floorsNumber) {this.floorsNumber = floorsNumber;}
    public List<SurfaceASO> getSurfaces() {return surfaces;}
    public void setSurfaces(List<SurfaceASO> surfaces) {this.surfaces = surfaces;}
    public BigDecimal getBasementLevels() {return basementLevels;}
    public void setBasementLevels(BigDecimal basementLevels) {this.basementLevels = basementLevels;}
    public HolderTypeASO getHolderType() {return holderType;}
    public void setHolderType(HolderTypeASO holderType) {this.holderType = holderType;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GoodDetailASO{");
        sb.append("insuranceType='").append(insuranceType).append('\'');
        sb.append(", licensePlate='").append(licensePlate).append('\'');
        sb.append(", model=").append(model).append('\'');
        sb.append(", hasPowerSupplyConvertion=").append(hasPowerSupplyConvertion).append('\'');
        sb.append(", price=").append(price).append('\'');
        sb.append(", vehicleCirculation=").append(vehicleCirculation).append('\'');
        sb.append(", usageType=").append(usageType).append('\'');
        sb.append(", propertyType=").append(propertyType).append('\'');
        sb.append(", location=").append(location).append('\'');
        sb.append(", buildMaterialType=").append(buildMaterialType).append('\'');
        sb.append(", insuredCapitals=").append(insuredCapitals).append('\'');
        sb.append(", buildingAge=").append(buildingAge).append('\'');
        sb.append(", floorsNumber=").append(floorsNumber).append('\'');
        sb.append(", surfaces=").append(surfaces).append('\'');
        sb.append(", basementLevels=").append(basementLevels).append('\'');
        sb.append(", holderType=").append(holderType).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
