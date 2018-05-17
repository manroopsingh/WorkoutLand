package com.example.singh.workoutland.model;

import java.util.List;

/**
 * Author: singh on: 17-May-18.
 */
public class WorkoutDay {


    private int day;
    private String description;
    private List<WorkoutMuscle> workoutMuscles;
    private String instruction;

    public WorkoutDay(int day, String description, List<WorkoutMuscle> workoutMuscles, String instruction) {
        this.day = day;
        this.description = description;
        this.workoutMuscles = workoutMuscles;
        this.instruction = instruction;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<WorkoutMuscle> getWorkoutMuscles() {
        return workoutMuscles;
    }

    public void setWorkoutMuscles(List<WorkoutMuscle> workoutMuscles) {
        this.workoutMuscles = workoutMuscles;
    }
}
