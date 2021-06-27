package com.bbva.pisd.dto.insurance.bo;

public class AddressesBO {

    private String addressId;
    private AddressTypeBO addressType;
    private OwnershipTypeBO ownershipType;
    private LocationBO location;
    private String residenceStartDate;

    public String getAddressId() { return addressId; }
    public void setAddressId(String addressId) { this.addressId = addressId; }
    public AddressTypeBO getAddressType() { return addressType; }
    public void setAddressType(AddressTypeBO addressType) { this.addressType = addressType; }
    public OwnershipTypeBO getOwnershipType() { return ownershipType; }
    public void setOwnershipType(OwnershipTypeBO ownershipType) { this.ownershipType = ownershipType; }
    public LocationBO getLocation() { return location; }
    public void setLocation(LocationBO location) { this.location = location; }
    public String getResidenceStartDate() { return residenceStartDate; }
    public void setResidenceStartDate(String residenceStartDate) { this.residenceStartDate = residenceStartDate; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AddressesBO{");
        sb.append("addressId='").append(addressId).append('\'');
        sb.append(", addressType=").append(addressType);
        sb.append(", ownershipType=").append(ownershipType);
        sb.append(", location=").append(location);
        sb.append(", residenceStartDate='").append(residenceStartDate).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
