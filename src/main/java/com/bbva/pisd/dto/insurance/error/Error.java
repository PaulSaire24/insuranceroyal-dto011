package com.bbva.pisd.dto.insurance.error;

public class Error {

    private String code;
    private String message;
    private Integer httpStatus;

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

    public Integer getHttpStatus() {
        return this.httpStatus;
    }

    public void setHttpStatus(Integer httpStatus) {
        this.httpStatus = httpStatus;
    }
}
