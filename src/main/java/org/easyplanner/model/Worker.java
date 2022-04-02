package org.easyplanner.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Worker extends Identifiable {
    
    private String name;
    
    @ManyToOne
    private Team team;

	public String getName() {
		return name;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public void setName(String name) {
		this.name = name;
	}
}