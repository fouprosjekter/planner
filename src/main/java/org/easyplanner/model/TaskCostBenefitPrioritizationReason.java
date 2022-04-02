package org.easyplanner.model;

public class TaskCostBenefitPrioritizationReason extends TaskPrioritizationReason {

    private Integer yearlySavings;
    
    private String yearlySavingsCurrency;
    
    private String howWasComputed;

    public Integer getYearlySavings() {
        return yearlySavings;
    }

    public void setYearlySavings(Integer yearlySavings) {
        this.yearlySavings = yearlySavings;
    }

    public String getYearlySavingsCurrency() {
        return yearlySavingsCurrency;
    }

    public void setYearlySavingsCurrency(String yearlySavingsCurrency) {
        this.yearlySavingsCurrency = yearlySavingsCurrency;
    }

    public String getHowWasComputed() {
        return howWasComputed;
    }

    public void setHowWasComputed(String howWasComputed) {
        this.howWasComputed = howWasComputed;
    }
}
