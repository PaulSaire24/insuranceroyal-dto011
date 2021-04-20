package com.bbva.pisd.dto.insurance.aso.email;

public class CreateEmailASO {

    private String applicationId;
    private String recipient;
    private String subject;
    private String body;
    private String sender;

    public String getApplicationId() { return applicationId; }
    public void setApplicationId(String applicationId) { this.applicationId = applicationId; }
    public String getRecipient() { return recipient; }
    public void setRecipient(String recipient) { this.recipient = recipient; }
    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }
    public String getBody() { return body; }
    public void setBody(String body) { this.body = body; }
    public String getSender() { return sender; }
    public void setSender(String sender) { this.sender = sender; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CreateEmailASO{");
        sb.append("applicationId='").append(applicationId).append('\'');
        sb.append(", recipient='").append(recipient).append('\'');
        sb.append(", subject='").append(subject).append('\'');
        sb.append(", body='").append(body).append('\'');
        sb.append(", sender='").append(sender).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
