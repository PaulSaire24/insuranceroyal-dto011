package com.bbva.pisd.dto.insurance.aso.gifole;

public class ValidityPeriodASO {
    private String startDate;
    private String endDate;

    public ValidityPeriodASO(String startDate, String endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getStartDate() {return startDate;}
    public void setStartDate(String startDate) {this.startDate = startDate;}
    public String getEndDate() {return endDate;}
    public void setEndDate(String endDate) {this.endDate = endDate;}

    @Override
    public String toString() {
        return "ValidityPeriodASO [endDate=" + endDate + ", startDate=" + startDate + "]";
    }

}
