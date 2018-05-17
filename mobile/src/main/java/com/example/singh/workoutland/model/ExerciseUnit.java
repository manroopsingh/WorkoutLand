package com.example.singh.workoutland.model;

/**
 * Author: singh on: 17-May-18.
 */
public class ExerciseUnit {
    Exercise exercise;
    int reps;
    int sets;
    String instruction;

    public ExerciseUnit(Exercise exercise, int reps, int sets, String instruction) {
        this.exercise = exercise;
        this.reps = reps;
        this.sets = sets;
        this.instruction = instruction;
    }

    public Exercise getExercise() {
        return exercise;
    }

    public void setExercise(Exercise exercise) {
        this.exercise = exercise;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }
}
