package org.easyplanner.model;

import javax.persistence.Entity;


/**
 * 
 * A task, something to be done.
 * 
 */

@Entity
public class Task extends Deleteable {
	
	private String title;
	
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}