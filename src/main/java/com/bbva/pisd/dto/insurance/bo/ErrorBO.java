package com.bbva.pisd.dto.insurance.bo;

import java.util.List;

public class ErrorBO {

    private String code;
    private List<String> message;
    private Long httpStatus;

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }
    public List<String> getMessage() { return message; }
    public void setMessage(List<String> message) { this.message = message; }
    public Long getHttpStatus() { return httpStatus; }
    public void setHttpStatus(Long httpStatus) { this.httpStatus = httpStatus; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ErrorBO{");
        sb.append("code='").append(code).append('\'');
        sb.append(", message=").append(message);
        sb.append(", httpStatus=").append(httpStatus);
        sb.append('}');
        return sb.toString();
    }

}
