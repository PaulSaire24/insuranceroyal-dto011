package com.bbva.pisd.dto.insurance.aso.gifole;

import java.io.Serializable;

public class ProductDetailGifoleASO implements Serializable {

    private static final long serialVersionUID = 41507248073L;

    public ProductDetailGifoleASO() {
        this.productType = "LOAN";
    }

    private AccountGifoleASO account;
    private PendingAmountGifoleASO pendingAmount;
    private String productType;

    public AccountGifoleASO getAccount() { return account; }
    public void setAccount(AccountGifoleASO account) { this.account = account; }
    public PendingAmountGifoleASO getPendingAmount() { return pendingAmount; }
    public void setPendingAmount(PendingAmountGifoleASO pendingAmount) { this.pendingAmount = pendingAmount; }
    public String getProductType() { return productType; }
    public void setProductType(String productType) { this.productType = productType; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProductDetailGifoleASO{");
        sb.append("account=").append(account);
        sb.append(", pendingAmount=").append(pendingAmount);
        sb.append(", productType='").append(productType).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
