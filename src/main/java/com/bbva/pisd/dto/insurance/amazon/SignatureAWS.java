package com.bbva.pisd.dto.insurance.amazon;

public class SignatureAWS {

    private String authorization;
    private String xAmzDate;
    private String xApiKey;
    private String traceId;

    public SignatureAWS() {
    }

    public SignatureAWS(String authorization, String xAmzDate, String xApiKey, String traceId) {
        this.authorization = authorization;
        this.xAmzDate = xAmzDate;
        this.xApiKey = xApiKey;
        this.traceId = traceId;
    }

    public String getAuthorization() { return authorization; }
    public void setAuthorization(String authorization) { this.authorization = authorization; }
    public String getxAmzDate() { return xAmzDate; }
    public void setxAmzDate(String xAmzDate) { this.xAmzDate = xAmzDate; }
    public String getxApiKey() { return xApiKey; }
    public void setxApiKey(String xApiKey) { this.xApiKey = xApiKey; }
    public String getTraceId() { return traceId; }
    public void setTraceId(String traceId) { this.traceId = traceId; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SignatureAWS{");
        sb.append("authorization='").append(authorization).append('\'');
        sb.append(", xAmzDate='").append(xAmzDate).append('\'');
        sb.append(", xApiKey='").append(xApiKey).append('\'');
        sb.append(", traceId='").append(traceId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
