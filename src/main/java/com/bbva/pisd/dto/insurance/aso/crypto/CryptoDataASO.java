package com.bbva.pisd.dto.insurance.aso.crypto;

public class CryptoDataASO {

    private String document;

    public String getDocument() { return document; }
    public void setDocument(String document) { this.document = document; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CryptoDataASO{");
        sb.append("document='").append(document).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
