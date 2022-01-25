package com.bbva.pisd.dto.insurance.aso.gifole;

public class InstallmentPlanASO {

    private AmountASO premiumAmount;
    private PeriodASO period;

    public AmountASO getPremiumAmount() {return premiumAmount;}
    public void setPremiumAmount(AmountASO premiumAmount) {this.premiumAmount = premiumAmount;}
    public PeriodASO getPeriod() {return period;}
    public void setPeriod(PeriodASO period) {this.period = period;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("InstallmentPlanASO{");
        sb.append("premiumAmount=").append(premiumAmount);
        sb.append(", period=").append(period);
        sb.append('}');
        return sb.toString();
    }

}
