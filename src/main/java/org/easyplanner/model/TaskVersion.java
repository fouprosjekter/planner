package org.easyplanner.model;

import javax.persistence.Entity;


@Entity
public class TaskVersion extends Identifiable {
	
	private Task task;
	
	private int version;
	
	private PlanningSession sessionWhereUpdated;
	
	private String reason;
	
	public Task getTask() {
		return task;
	}

	public void setTask(Task task) {
		this.task = task;
	}
	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public PlanningSession getSessionWhereUpdated() {
		return sessionWhereUpdated;
	}

	public void setSessionWhereUpdated(PlanningSession sessionWhereUpdated) {
		this.sessionWhereUpdated = sessionWhereUpdated;
	}

	
}