package org.easyplanner.model;

import java.util.List;

public class Immeasurable extends Identifiable {

    private String title;
    
    private String description;

    private List<Effect> effects;

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

    public List<Effect> getEffects() {
        return effects;
    }

    public void setEffects(List<Effect> effects) {
        this.effects = effects;
    }

}
