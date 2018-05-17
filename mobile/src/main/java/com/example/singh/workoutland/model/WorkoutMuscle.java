package com.example.singh.workoutland.model;

import java.util.List;

/**
 * Author: singh on: 17-May-18.
 */
public class WorkoutMuscle {

    String muscleName;
    String description;
    List<ExerciseUnit> muscleExercises;

    public WorkoutMuscle(String muscleName, String description, List<ExerciseUnit> muscleExercises) {
        this.muscleName = muscleName;
        this.description = description;
        this.muscleExercises = muscleExercises;
    }

    public String getMuscleName() {
        return muscleName;
    }

    public void setMuscleName(String muscleName) {
        this.muscleName = muscleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<ExerciseUnit> getMuscleExercises() {
        return muscleExercises;
    }

    public void setMuscleExercises(List<ExerciseUnit> muscleExercises) {
        this.muscleExercises = muscleExercises;
    }
}
