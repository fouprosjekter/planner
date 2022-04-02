package org.easyplanner.model;

import javax.persistence.Entity;

@Entity
public class Team extends Identifiable {
    
    private String name;

    private String description;
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}