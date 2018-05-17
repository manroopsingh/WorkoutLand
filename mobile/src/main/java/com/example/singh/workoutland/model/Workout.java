package com.example.singh.workoutland.model;

import java.util.List;

/**
 * Author: singh on: 17-May-18.
 */
public class Workout {

    Trainer trainer;
    List<WorkoutDay> workoutDays;
    String description;
    DietPlan dietPlan;
    Supplements supplements;

    public Workout(Trainer trainer, List<WorkoutDay> workoutDays, String description, DietPlan dietPlan, Supplements supplements) {
        this.trainer = trainer;
        this.workoutDays = workoutDays;
        this.description = description;
        this.dietPlan = dietPlan;
        this.supplements = supplements;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public List<WorkoutDay> getWorkoutDays() {
        return workoutDays;
    }

    public void setWorkoutDays(List<WorkoutDay> workoutDays) {
        this.workoutDays = workoutDays;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DietPlan getDietPlan() {
        return dietPlan;
    }

    public void setDietPlan(DietPlan dietPlan) {
        this.dietPlan = dietPlan;
    }

    public Supplements getSupplements() {
        return supplements;
    }

    public void setSupplements(Supplements supplements) {
        this.supplements = supplements;
    }
}
