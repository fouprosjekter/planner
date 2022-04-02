package org.easyplanner.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public abstract class TaskPrioritization extends TaskDecision {

    @OneToOne
    @Column(nullable = false)
    private Task prioritizedAfter;
    
    @OneToMany
    private List<TaskPrioritizationReason> reasons;
}
