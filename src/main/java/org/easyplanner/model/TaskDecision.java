package org.easyplanner.model;

import java.time.Instant;

/**
 * A decision about a task, happend in a planning session.
 * 
 */
public abstract class TaskDecision extends Identifiable {
	
    private Task task;
    
    private PlanningSession planningSession;

    private Instant timeMade;

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public PlanningSession getPlanningSession() {
        return planningSession;
    }

    public void setPlanningSession(PlanningSession planningSession) {
        this.planningSession = planningSession;
    }

    public Instant getTimeMade() {
        return timeMade;
    }

    public void setTimeMade(Instant timeMade) {
        this.timeMade = timeMade;
    }
}