package org.easyplanner.model;

public abstract class TaskPrioritizationReason extends Identifiable {

    private Task task;

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }
}
