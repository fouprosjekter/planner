package org.easyplanner.model;

import javax.persistence.Entity;

/**
 * A session where one plans and prioritizes tasks.
 * Stored here to track why one made a decission, decisions happn within planning sessions.
 * 
 */
@Entity
public class PlanningSession extends Deleteable {
	
	private String title;
	
	private String description;

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
}