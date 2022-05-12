package com.bbva.pisd.dto.insurance.aso.gifole;

public class InstallmentPlanASO {

    private AmountASO premiumAmount;
    private PeriodASO period;
    private Long totalInstallmentsNumber;

    public AmountASO getPremiumAmount() {return premiumAmount;}
    public void setPremiumAmount(AmountASO premiumAmount) {this.premiumAmount = premiumAmount;}
    public PeriodASO getPeriod() {return period;}
    public void setPeriod(PeriodASO period) {this.period = period;}
    public Long getTotalInstallmentsNumber() {return totalInstallmentsNumber;}
    public void setTotalInstallmentsNumber(Long totalInstallmentsNumber) {this.totalInstallmentsNumber = totalInstallmentsNumber;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InstallmentPlanASO{");
        sb.append("premiumAmount=").append(premiumAmount);
        sb.append(", period=").append(period);
        sb.append(", totalInstallmentsNumber=").append(totalInstallmentsNumber);
        sb.append('}');
        return sb.toString();
    }

}
