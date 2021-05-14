package com.bbva.pisd.dto.insurance.policy;

import com.bbva.apx.dto.AbstractDTO;

import java.util.Date;

public class ExchangeRateDTO extends AbstractDTO {

    private Date date;
    private DetailDTO detail;

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }
    public DetailDTO getDetail() { return detail; }
    public void setDetail(DetailDTO detail) { this.detail = detail; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ExchangeRateDTO{");
        sb.append("date=").append(date);
        sb.append(", detail=").append(detail);
        sb.append('}');
        return sb.toString();
    }

}
