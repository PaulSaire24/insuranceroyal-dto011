package com.bbva.pisd.dto.insurance.aso.crypto;

import java.util.Collections;
import java.util.List;

public class CryptoASO {

    private static final String CONFIGURATION_NAME = "cryptoKey";
    private static final String CONFIGURATION_VALUE = "apx-pe-mask-customerId";
    private static final String CODEC_FORMAT = "PLAIN";

    private String stream;
    private List<ConfigurationParamCryptoASO> configurationParams;
    private String codecFormat;
    private CryptoDataASO data;

    public CryptoASO() {

    }

    public CryptoASO(String stream) {
        this.stream = stream;
        ConfigurationParamCryptoASO configurationParamCrypto = new ConfigurationParamCryptoASO(CONFIGURATION_NAME, CONFIGURATION_VALUE);
        this.configurationParams = Collections.singletonList(configurationParamCrypto);
        this.codecFormat = CODEC_FORMAT;
    }

    public String getStream() { return stream; }
    public void setStream(String stream) { this.stream = stream; }
    public List<ConfigurationParamCryptoASO> getConfigurationParams() { return configurationParams; }
    public void setConfigurationParams(List<ConfigurationParamCryptoASO> configurationParams) { this.configurationParams = configurationParams; }
    public String getCodecFormat() { return codecFormat; }
    public void setCodecFormat(String codecFormat) { this.codecFormat = codecFormat; }
    public CryptoDataASO getData() { return data; }
    public void setData(CryptoDataASO data) { this.data = data; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CryptoASO{");
        sb.append("stream='").append(stream).append('\'');
        sb.append(", configurationParams=").append(configurationParams);
        sb.append(", codecFormat='").append(codecFormat).append('\'');
        sb.append(", data=").append(data);
        sb.append('}');
        return sb.toString();
    }

}
