package com.bbva.pisd.dto.insurance.aso.gifole;

import com.bbva.pisd.dto.insurance.aso.CommonFieldsASO;

public class GifoleASO extends CommonFieldsASO {

    private DataGifoleASO data;

    public DataGifoleASO getData() { return data; }
    public void setData(DataGifoleASO data) { this.data = data; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GifoleASO{");
        sb.append("data=").append(data);
        sb.append(", customer=").append(this.getCustomer());
        sb.append(", product=").append(this.getProduct());
        sb.append(", contract=").append(this.getContract());
        sb.append(", channel=").append(this.getChannel());
        sb.append('}');
        return sb.toString();
    }

}
