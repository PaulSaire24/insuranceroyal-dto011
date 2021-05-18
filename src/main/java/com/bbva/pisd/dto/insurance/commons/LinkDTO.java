package com.bbva.pisd.dto.insurance.commons;

import com.bbva.apx.dto.AbstractDTO;

public class LinkDTO extends AbstractDTO {

    private String href;
    private String rel;
    private String title;

    public String getHref() { return href; }
    public void setHref(String href) { this.href = href; }
    public String getRel() { return rel; }
    public void setRel(String rel) { this.rel = rel; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("LinkDTO{");
        sb.append("href='").append(href).append('\'');
        sb.append(", rel='").append(rel).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
