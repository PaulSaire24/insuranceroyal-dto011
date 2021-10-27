package com.bbva.pisd.dto.insurance.aso.gifole;

public class GoodASO {

    private GoodDetailASO goodDetail;

    public GoodDetailASO getGoodDetail() {return goodDetail;}
    public void setGoodDetail(GoodDetailASO goodDetail) {this.goodDetail = goodDetail;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GoodASO{");
        sb.append("goodDetail=").append(goodDetail);
        sb.append('}');
        return sb.toString();
    }

}
