package com.example.singh.workoutland.model.repository.local;

import android.support.annotation.NonNull;

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


    public static class Muscle{
        public static final String SHOULDER = "Shoulder";
        public static final String BICEP = "Bicep";
        public static final String LAHTS_BACK = "Back/Lahts";
        public static final String CHEST = "Chest";
        public static final String ABS = "Abs";
        public static final String CARDIO = "Cardio";
        public static final String LEG = "Leg";
        public static final String TRICEP = "Tricep";
    }

    public static Workout getShredded(){

        return null;
    }

    private static List<WorkoutDay>  getWorkoutDays(){

        List<WorkoutDay> workoutDays = new ArrayList<>();



        workoutDays.add(createWorkoutDay(1));
        workoutDays.add(createWorkoutDay(2));
        workoutDays.add(createWorkoutDay(3));
        workoutDays.add(createWorkoutDay(4));
        workoutDays.add(createWorkoutDay(5));
        workoutDays.add(createWorkoutDay(6));

        return workoutDays;
    }



    private static List<WorkoutMuscle> getMuscleList(String muscle1Name, List<ExerciseUnit> muscle1Units,
                                                     String muscle2Name, List<ExerciseUnit> muscle2Units) {

        List<WorkoutMuscle> muscleList = new ArrayList<>();
        muscleList.add(new WorkoutMuscle(muscle1Name, "Desc", muscle1Units));
        muscleList.add(new WorkoutMuscle(muscle2Name, "Desc", muscle2Units));
        return muscleList;

    }

    private static WorkoutDay createWorkoutDay(int dayNumber){

        String defaultDesc = "desc";
        String instructions1 = "";
        String instructions2 = "";
        String instructions3 = "";
        String instructions4 = "";
        String instructions5 = "";
        String instructions6 = "";

        switch (dayNumber) {
            case 1:
                return new WorkoutDay(dayNumber, defaultDesc, getMuscleList(Muscle.SHOULDER, getShoulderUnits(), Muscle.BICEP, getBicepsUnits()), instructions1);
            case 2:
                return new WorkoutDay(dayNumber, defaultDesc, getMuscleList(Muscle.LAHTS_BACK, getShoulderUnits(), Muscle.ABS, getBicepsUnits()), instructions2);
            case 3:
                return new WorkoutDay(dayNumber, defaultDesc, getMuscleList(Muscle.CHEST, getShoulderUnits(), Muscle.TRICEP, getBicepsUnits()), instructions3);
            case 4:
                return new WorkoutDay(dayNumber, defaultDesc, getMuscleList(Muscle.CARDIO, getShoulderUnits(), Muscle.ABS, getBicepsUnits()), instructions4);
            case 5:
                return new WorkoutDay(dayNumber, defaultDesc, getMuscleList(Muscle.LEG, getShoulderUnits(), Muscle.SHOULDER, getBicepsUnits()), instructions5);
            case 6:
                return new WorkoutDay(dayNumber, defaultDesc, getMuscleList(Muscle.CHEST, getShoulderUnits(), Muscle.BICEP, getBicepsUnits()), instructions6);

            default:
                return null;
        }
    }

    private static List<ExerciseUnit> getBicepsUnits() {
        List<ExerciseUnit> exerciseUnits = new ArrayList<>();

        exerciseUnits.add(new ExerciseUnit(new Exercise("Standing/Seated Dumbbell Curls", "Desc", "Url"), 4, 8, "Each Set Each Arm"));
        exerciseUnits.add(new ExerciseUnit(new Exercise("EZ Or Straight Barbell Curl", "Desc", "Url"), 8, 8, "Each Set"));

        return exerciseUnits;
    }

    @NonNull
    private static List<ExerciseUnit> getShoulderUnits() {
        List<ExerciseUnit> exerciseUnits = new ArrayList<>();

        exerciseUnits.add(new ExerciseUnit(new Exercise("Dumbbell Military Press", "Desc", "Url"), 8, 8, "Each Set"));
        exerciseUnits.add(new ExerciseUnit(new Exercise("Standing Side Dumbbell Raise", "Desc", "Url"), 12, 4, "Each Set"));
        exerciseUnits.add(new ExerciseUnit(new Exercise("Standing Front Dumbbell Raise", "Desc", "Url"), 10, 4, "Each Set"));
        exerciseUnits.add(new ExerciseUnit(new Exercise("Pec Dec Rear Delt Machine", "Desc", "Url"), 10, 8, "Each Set"));
        exerciseUnits.add(new ExerciseUnit(new Exercise("Cable Machine Up Right", "Desc", "Url"), 12, 4, "Each Set"));
        exerciseUnits.add(new ExerciseUnit(new Exercise("Shrugs(Barbell or Dumbbell", "Desc", "Url"), 10, 4, "Each Set"));

        return exerciseUnits;
    }


}
