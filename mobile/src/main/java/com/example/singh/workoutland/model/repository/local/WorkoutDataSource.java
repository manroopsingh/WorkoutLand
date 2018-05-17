package com.example.singh.workoutland.model.repository.local;

import com.example.singh.workoutland.model.Workout;

/**
 * Author: singh on: 17-May-18.
 */
public class WorkoutDataSource {


    public static Workout getShredded(){

        return WorkoutGenerator.getShredded();

    }

}
