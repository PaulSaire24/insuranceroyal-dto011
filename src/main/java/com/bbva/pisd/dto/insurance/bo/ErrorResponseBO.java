package com.bbva.pisd.dto.insurance.bo;

import java.util.List;

public class ErrorResponseBO {

    private String code;
    private String message;
    private List<String> details;
    private Long httpStatus;

    public String getCode() {
        return this.code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getMessage() {
        return this.message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public List<String> getDetails() {
        return this.details;
    }
    public void setDetails(List<String> details) {
        this.details = details;
    }
    public Long getHttpStatus() {
        return this.httpStatus;
    }
    public void setHttpStatus(Long httpStatus) {
        this.httpStatus = httpStatus;
    }

}
