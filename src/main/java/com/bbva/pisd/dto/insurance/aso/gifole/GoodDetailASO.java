package com.bbva.pisd.dto.insurance.aso.gifole;

public class GoodDetailASO {

    private String insuranceType;
    private String licensePlate;
    private ModelASO model;
    private Boolean hasPowerSupplyConvertion;
    private AmountASO price;
    private VehicleCirculationASO vehicleCirculation;
    private UsageTypeASO usageType;

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

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GoodDetailASO{");
        sb.append("insuranceType='").append(insuranceType).append('\'');
        sb.append(", licensePlate='").append(licensePlate).append('\'');
        sb.append(", model=").append(model);
        sb.append(", hasPowerSupplyConvertion=").append(hasPowerSupplyConvertion);
        sb.append(", price=").append(price);
        sb.append(", vehicleCirculation=").append(vehicleCirculation);
        sb.append(", usageType=").append(usageType);
        sb.append('}');
        return sb.toString();
    }

}
