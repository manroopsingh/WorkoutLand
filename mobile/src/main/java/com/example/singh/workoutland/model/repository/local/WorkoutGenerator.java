package com.example.singh.workoutland.model.repository.local;

import com.example.singh.workoutland.model.Exercise;
import com.example.singh.workoutland.model.ExerciseUnit;
import com.example.singh.workoutland.model.Workout;
import com.example.singh.workoutland.model.WorkoutDay;
import com.example.singh.workoutland.model.WorkoutMuscle;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: singh on: 17-May-18.
 */
public class WorkoutGenerator {

    public static Workout getShredded(){

        return null;
    }

    private static List<WorkoutDay>  getWorkoutDays(){

        List<WorkoutDay> workoutDays = new ArrayList<>();

        //day 1 SHOULDER
        List<ExerciseUnit> shoulderExercises = new ArrayList<>();
        ExerciseUnit ex1 = new ExerciseUnit(new Exercise("Dumbbell Military press", "Desc", "Url"), 8, 8, "Each Set");
        shoulderExercises.add(ex1);


        WorkoutMuscle shoulder = new WorkoutMuscle("Shoulder", "Desc", shoulderExercises);

        List<WorkoutMuscle> day1Muscles = new ArrayList<>();
        day1Muscles.add(shoulder);
        WorkoutDay day1 = new WorkoutDay(1, "Shoulder", day1Muscles, "10minutes walks, 5-10 minutes stretching");

        workoutDays.add(day1);

        return workoutDays;
    }


}
