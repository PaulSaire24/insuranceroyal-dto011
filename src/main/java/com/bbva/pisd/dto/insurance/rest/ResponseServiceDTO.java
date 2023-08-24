package com.bbva.pisd.dto.insurance.rest;

public class ResponseServiceDTO {

    private String  statusProcess;
    private Boolean enabledService;
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

    public static final class ResponseServiceBuilder {
        private ResponseServiceDTO responseDetailQuotation;

        public ResponseServiceBuilder(){
            responseDetailQuotation = new ResponseServiceDTO();
        }

        public static ResponseServiceBuilder an(){
            return new ResponseServiceBuilder();
        }

        public ResponseServiceBuilder withStatusIndicatorProcess(String statusIndicatorProcess){
            this.responseDetailQuotation.setStatusProcess(statusIndicatorProcess);
            return this;
        }

        public ResponseServiceBuilder withEnabledService(Boolean enabledService){
            this.responseDetailQuotation.setEnabledService(enabledService);
            return this;
        }

        public ResponseServiceBuilder withBody(Object body){
            this.responseDetailQuotation.setBody(body);
            return this;
        }

        public ResponseServiceDTO build(){
            return this.responseDetailQuotation;
        }

    }
}
