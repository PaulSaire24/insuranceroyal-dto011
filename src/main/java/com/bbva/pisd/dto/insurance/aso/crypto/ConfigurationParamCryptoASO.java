package com.bbva.pisd.dto.insurance.aso.crypto;

public class ConfigurationParamCryptoASO {

    private String name;
    private String value;

    public ConfigurationParamCryptoASO(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public String getName() { return name; }
    public String getValue() { return value; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ConfigurationParamCryptoASO{");
        sb.append("name='").append(name).append('\'');
        sb.append(", value='").append(value).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
