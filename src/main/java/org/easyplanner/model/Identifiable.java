package org.easyplanner.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public abstract class Identifiable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}