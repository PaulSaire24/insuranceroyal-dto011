package com.bbva.pisd.dto.insurance.rest;

import com.bbva.pisd.dto.insurance.interfaces.PISDErrorsInterface;

public class ResponseServiceDTO {

    private String  statusProcess;
    private Boolean enabledService;
    private PISDErrorsInterface errorPISD;

    private Object  body;

    public String getStatusProcess() {
        return statusProcess;
    }

    public void setStatusProcess(String statusProcess) {
        this.statusProcess = statusProcess;
    }

    public Boolean getEnabledService() {
        return enabledService;
    }

    public void setEnabledService(Boolean enabledService) {
        this.enabledService = enabledService;
    }

    public Object getBody() {
        return body;
    }

    public void setBody(Object body) {
        this.body = body;
    }

    public void setErrorPISD(PISDErrorsInterface errorPISD) {
        this.errorPISD = errorPISD;
    }

    public PISDErrorsInterface getErrorPISD() {
        return errorPISD;
    }

    public static final class ResponseServiceBuilder {
        private ResponseServiceDTO responseService;

        public ResponseServiceBuilder(){
            responseService = new ResponseServiceDTO();
        }

        public static ResponseServiceBuilder an(){
            return new ResponseServiceBuilder();
        }

        public ResponseServiceBuilder withStatusIndicatorProcess(String statusIndicatorProcess){
            this.responseService.setStatusProcess(statusIndicatorProcess);
            return this;
        }

        public ResponseServiceBuilder withEnabledService(Boolean enabledService){
            this.responseService.setEnabledService(enabledService);
            return this;
        }

        public ResponseServiceBuilder withBody(Object body){
            this.responseService.setBody(body);
            return this;
        }

        public ResponseServiceBuilder withPISDError(PISDErrorsInterface pisdErrorsInterface){
            this.responseService.setErrorPISD(pisdErrorsInterface);
            return this;
        }

        public ResponseServiceDTO build(){
            return this.responseService;
        }

    }

    @Override
    public String toString() {
        return "ResponseServiceDTO{" +
                "statusProcess='" + statusProcess + '\'' +
                ", enabledService=" + enabledService +
                ", errorPISD=" + errorPISD +
                ", body=" + body +
                '}';
    }
}
