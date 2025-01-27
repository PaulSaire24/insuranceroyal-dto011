package com.bbva.pisd.dto.insurance.detail;

import com.bbva.pisd.dto.insurance.commons.CommonOutputFieldsDTO;

public class EntityOutQuotationDetailDTO extends CommonOutputFieldsDTO {

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("EntityOutQuotationDetailDTO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", holder=").append(this.getHolder());
        sb.append(", product=").append(this.getProduct());
        sb.append(", quotationCompany=").append(this.getQuotationCompany());
        sb.append(", operationDate=").append(this.getOperationDate());
        sb.append(", validityDays=").append(this.getValidityDays());
        sb.append(", maturityDate=").append(this.getMaturityDate());
        sb.append(", status=").append(this.getStatus());
        sb.append(", offerId='").append(this.getOfferId()).append('\'');
        sb.append(", contactDetails=").append(this.getContactDetails());
        sb.append(", scheduleContact=").append(this.getScheduleContact());
        sb.append(", insuranceCompany=").append(this.getInsuranceCompany());
        sb.append(", model=").append(this.getModel());
        sb.append(", price=").append(this.getPrice());
        sb.append(", vehicleCirculation=").append(this.getVehicleCirculation());
        sb.append(", hasPowerSupplyConvertion='").append(this.getHasPowerSupplyConvertion()).append('\'');
        sb.append(", licensePlate='").append(this.getLicensePlate()).append('\'');
        sb.append(", usageType=").append(this.getUsageType());
        sb.append(", isGpsRequired='").append(this.getIsGpsRequired()).append('\'');
        sb.append(", gpsRequired='").append(this.getGpsRequired()).append('\'');
        sb.append(", isInspectionRequired='").append(this.getIsInspectionRequired()).append('\'');
        sb.append(", inspectionRequired='").append(this.getInspectionRequired()).append('\'');
        sb.append(", hasSteeringWheelChanged='").append(this.getHasSteeringWheelChanged()).append('\'');
        sb.append(", tier=").append(this.getTier());
        sb.append(", bankingFactor=").append(this.getBankingFactor());
        sb.append(", campaignFactor=").append(this.getCampaignFactor());
        sb.append(", engineNumber='").append(this.getEngineNumber()).append('\'');
        sb.append(", vehicleIdentificationNumber='").append(this.getVehicleIdentificationNumber()).append('\'');
        sb.append(", seats=").append(this.getSeats());
        sb.append(", markedAsSaved='").append(this.getMarkedAsSaved()).append('\'');
        sb.append(", markedAsSavedBoolean='").append(this.getMarkedAsSavedBoolean()).append('\'');
        sb.append(", bank=").append(this.getBank());
        sb.append(", vehicle=").append(this.getVehicle());
        sb.append('}');
        return sb.toString();
    }

}
