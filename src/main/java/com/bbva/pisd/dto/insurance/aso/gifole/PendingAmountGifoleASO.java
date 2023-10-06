package com.bbva.pisd.dto.insurance.aso.gifole;

import java.io.Serializable;

public class PendingAmountGifoleASO implements Serializable {

    private static final long serialVersionUID = 8489807248073L;

    private TotalGifoleASO total;

    public TotalGifoleASO getTotal() { return total; }
    public void setTotal(TotalGifoleASO total) { this.total = total; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PendingAmountGifoleASO{");
        sb.append("total=").append(total);
        sb.append('}');
        return sb.toString();
    }

}
