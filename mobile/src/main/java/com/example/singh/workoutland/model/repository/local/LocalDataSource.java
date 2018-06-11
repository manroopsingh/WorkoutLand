package com.example.singh.workoutland.model.repository.local;

import com.example.singh.workoutland.model.Workout;
import com.example.singh.workoutland.model.repository.WorkoutGenerator;

/**
 * Author: singh on: 17-May-18.
 */
public class LocalDataSource {


    public static Workout getShredded(){

        return WorkoutGenerator.getShredded();

    }

}
