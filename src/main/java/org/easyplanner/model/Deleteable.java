package org.easyplanner.model;

public abstract class Deleteable extends Identifiable {

    private boolean deleted;

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }
}
