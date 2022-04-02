package org.easyplanner.model;

import java.math.BigDecimal;

public abstract class Measurable extends Identifiable {

    private String title;
    
    private String description;
    
    private BigDecimal total;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
