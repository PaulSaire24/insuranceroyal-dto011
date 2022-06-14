package com.bbva.pisd.dto.insurance.aso.gifole;

public class LocationASO {
    private String formattedAddress;
    private String district;
    private String province;
    private String department;
    private String zone;
    private String additionalInformation;

    public String getFormattedAddress() {return formattedAddress;}
    public void setFormattedAddress(String formattedAddress) {this.formattedAddress = formattedAddress;}
    public String getDistrict() {return district;}
    public void setDistrict(String district) {this.district = district;}
    public String getProvince() {return province;}
    public void setProvince(String province) {this.province = province;}
    public String getDepartment() {return department;}
    public void setDepartment(String department) {this.department = department;}
    public String getZone() {return zone;}
    public void setZone(String zone) {this.zone = zone;}
    public String getAdditionalInformation() {return additionalInformation;}
    public void setAdditionalInformation(String additionalInformation) {this.additionalInformation = additionalInformation;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LocationASO{");
        sb.append("formattedAddress='").append(formattedAddress).append('\'');
        sb.append(", district='").append(district).append('\'');
        sb.append(", province=").append(province);
        sb.append(", department=").append(department);
        sb.append(", zone=").append(zone);
        sb.append(", additionalInformation=").append(additionalInformation);
        sb.append('}');
        return sb.toString();
    }
}
