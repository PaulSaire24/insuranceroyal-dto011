package com.bbva.pisd.dto.insurance.aso.gifole;

import com.bbva.pisd.dto.insurance.aso.CommonFieldsASO;

public class ProductGifoleASO extends CommonFieldsASO  {

    public ProductGifoleASO() {
        this.setId("4");
    }

    private ProductDetailGifoleASO productDetail;

    public ProductDetailGifoleASO getProductDetail() { return productDetail; }
    public void setProductDetail(ProductDetailGifoleASO productDetail) { this.productDetail = productDetail; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProductGifoleASO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", name='").append(this.getName()).append('\'');
        sb.append(", productDetail=").append(productDetail);
        sb.append('}');
        return sb.toString();
    }

}
