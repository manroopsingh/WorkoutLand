package com.example.singh.workoutland.model.repository;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

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
        static final String SHOULDER = "Shoulder";
        static final String BICEP = "Bicep";
        static final String LAHTS_BACK = "Back/Lahts";
        static final String CHEST = "Chest";
        static final String ABS = "Abs";
        public static final String CARDIO = "Cardio";
        static final String LEG = "Leg";
        static final String TRICEP = "Tricep";
        static final String SIDES = "Sides";
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
                                                     @Nullable String muscle2Name, List<ExerciseUnit> muscle2Units,
                                                     @Nullable String muscle3Name, List<ExerciseUnit> muscle3Units) {

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
                return new WorkoutDay(dayNumber, defaultDesc, getMuscleList(Muscle.SHOULDER, getShoulderUnits(), Muscle.BICEP, getBicepsUnits(), null, null), instructions1);
            case 2:
                return new WorkoutDay(dayNumber, defaultDesc, getMuscleList(Muscle.LAHTS_BACK, getBackUnits(), Muscle.ABS, getAbsUnits(),null, null) , instructions2);
            case 3:
                return new WorkoutDay(dayNumber, defaultDesc, getMuscleList(Muscle.CHEST, getChestUnits(), Muscle.TRICEP, getBicepsUnits(),null, null), instructions3);
            case 4:
                return new WorkoutDay(dayNumber, defaultDesc, getMuscleList(Muscle.ABS, getAbs2Units(), Muscle.SIDES, getSidesUnits(),null, null), instructions4);
            case 5:
                return new WorkoutDay(dayNumber, defaultDesc, getMuscleList(Muscle.LEG, getLegsUnits(), Muscle.SHOULDER, getShoulder2Units(),null, null), instructions5);
            case 6:
                return new WorkoutDay(dayNumber, defaultDesc, getMuscleList(Muscle.CHEST, getChest2Units(), Muscle.BICEP, getBiceps2Units(), Muscle.TRICEP, getTriceps2Units()), instructions6);

            default:
                return null;
        }
    }

    //shoulder
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

    //biceps
    private static List<ExerciseUnit> getBicepsUnits() {
        List<ExerciseUnit> exerciseUnits = new ArrayList<>();

        exerciseUnits.add(new ExerciseUnit(new Exercise("Standing/Seated Dumbbell Curls", "Desc", "Url"), 4, 8, "Each Set Each Arm"));
        exerciseUnits.add(new ExerciseUnit(new Exercise("EZ Or Straight Barbell Curl", "Desc", "Url"), 8, 8, "Each Set"));

        return exerciseUnits;
    }

    //back and lahts
    private static List<ExerciseUnit> getBackUnits(){
        List<ExerciseUnit> exerciseUnits = new ArrayList<>();

        exerciseUnits.add(new ExerciseUnit(new Exercise("Chin ups", "Desc", "Url"), 4, 8, "Each Set Each Arm"));
        exerciseUnits.add(new ExerciseUnit(new Exercise("DeadLifts", "Desc", "Url"), 8, 8, "Each Set"));
        exerciseUnits.add(new ExerciseUnit(new Exercise("Lahts Pull Down", "Desc", "Url"), 4, 10, "Each Set"));
        exerciseUnits.add(new ExerciseUnit(new Exercise("Seated Rowing Machine", "Desc", "Url"), 4, 10, "Each Set Each Arm"));
        exerciseUnits.add(new ExerciseUnit(new Exercise("Unilateral Dumbbell", "Desc", "Url"), 4, 10, "Each Set"));
        exerciseUnits.add(new ExerciseUnit(new Exercise("Hyper Extension", "Desc", "Url"), 8, 10, "Each Set"));

        return exerciseUnits;
    }


    //abs
    private static List<ExerciseUnit> getAbsUnits(){
        List<ExerciseUnit> exerciseUnits = new ArrayList<>();

        exerciseUnits.add(new ExerciseUnit(new Exercise("Standing/Seated Dumbbell Curls", "Desc", "Url"), 4, 8, "Each Set Each Arm"));
        exerciseUnits.add(new ExerciseUnit(new Exercise("EZ Or Straight Barbell Curl", "Desc", "Url"), 8, 8, "Each Set"));

        return exerciseUnits;
    }

    //chest
    private static List<ExerciseUnit> getChestUnits(){
        List<ExerciseUnit> exerciseUnits = new ArrayList<>();

        exerciseUnits.add(new ExerciseUnit(new Exercise("Standing/Seated Dumbbell Curls", "Desc", "Url"), 4, 8, "Each Set Each Arm"));
        exerciseUnits.add(new ExerciseUnit(new Exercise("EZ Or Straight Barbell Curl", "Desc", "Url"), 8, 8, "Each Set"));

        return exerciseUnits;
    }

    //triceps
    private static List<ExerciseUnit> getTricepsUnits(){
        List<ExerciseUnit> exerciseUnits = new ArrayList<>();

        exerciseUnits.add(new ExerciseUnit(new Exercise("Standing/Seated Dumbbell Curls", "Desc", "Url"), 4, 8, "Each Set Each Arm"));
        exerciseUnits.add(new ExerciseUnit(new Exercise("EZ Or Straight Barbell Curl", "Desc", "Url"), 8, 8, "Each Set"));

        return exerciseUnits;
    }

    //abs2
    private static List<ExerciseUnit> getAbs2Units(){
        List<ExerciseUnit> exerciseUnits = new ArrayList<>();

        exerciseUnits.add(new ExerciseUnit(new Exercise("Standing/Seated Dumbbell Curls", "Desc", "Url"), 4, 8, "Each Set Each Arm"));
        exerciseUnits.add(new ExerciseUnit(new Exercise("EZ Or Straight Barbell Curl", "Desc", "Url"), 8, 8, "Each Set"));

        return exerciseUnits;
    }

    //sides
    private static List<ExerciseUnit> getSidesUnits(){
        List<ExerciseUnit> exerciseUnits = new ArrayList<>();

        exerciseUnits.add(new ExerciseUnit(new Exercise("Standing/Seated Dumbbell Curls", "Desc", "Url"), 4, 8, "Each Set Each Arm"));
        exerciseUnits.add(new ExerciseUnit(new Exercise("EZ Or Straight Barbell Curl", "Desc", "Url"), 8, 8, "Each Set"));

        return exerciseUnits;
    }

    //legs
    private static List<ExerciseUnit> getLegsUnits(){
        List<ExerciseUnit> exerciseUnits = new ArrayList<>();

        exerciseUnits.add(new ExerciseUnit(new Exercise("Standing/Seated Dumbbell Curls", "Desc", "Url"), 4, 8, "Each Set Each Arm"));
        exerciseUnits.add(new ExerciseUnit(new Exercise("EZ Or Straight Barbell Curl", "Desc", "Url"), 8, 8, "Each Set"));

        return exerciseUnits;
    }

    //shoulder2
    private static List<ExerciseUnit> getShoulder2Units(){
        List<ExerciseUnit> exerciseUnits = new ArrayList<>();

        exerciseUnits.add(new ExerciseUnit(new Exercise("Standing/Seated Dumbbell Curls", "Desc", "Url"), 4, 8, "Each Set Each Arm"));
        exerciseUnits.add(new ExerciseUnit(new Exercise("EZ Or Straight Barbell Curl", "Desc", "Url"), 8, 8, "Each Set"));

        return exerciseUnits;
    }

    //chest2
    private static List<ExerciseUnit> getChest2Units(){
        List<ExerciseUnit> exerciseUnits = new ArrayList<>();

        exerciseUnits.add(new ExerciseUnit(new Exercise("Standing/Seated Dumbbell Curls", "Desc", "Url"), 4, 8, "Each Set Each Arm"));
        exerciseUnits.add(new ExerciseUnit(new Exercise("EZ Or Straight Barbell Curl", "Desc", "Url"), 8, 8, "Each Set"));

        return exerciseUnits;
    }

    ///biceps
    private static List<ExerciseUnit> getBiceps2Units(){
        List<ExerciseUnit> exerciseUnits = new ArrayList<>();

        exerciseUnits.add(new ExerciseUnit(new Exercise("Standing/Seated Dumbbell Curls", "Desc", "Url"), 4, 8, "Each Set Each Arm"));
        exerciseUnits.add(new ExerciseUnit(new Exercise("EZ Or Straight Barbell Curl", "Desc", "Url"), 8, 8, "Each Set"));

        return exerciseUnits;
    }

    //triceps2
    private static List<ExerciseUnit> getTriceps2Units(){
        List<ExerciseUnit> exerciseUnits = new ArrayList<>();

        exerciseUnits.add(new ExerciseUnit(new Exercise("Standing/Seated Dumbbell Curls", "Desc", "Url"), 4, 8, "Each Set Each Arm"));
        exerciseUnits.add(new ExerciseUnit(new Exercise("EZ Or Straight Barbell Curl", "Desc", "Url"), 8, 8, "Each Set"));

        return exerciseUnits;
    }

    //sides
    private static List<ExerciseUnit> getSides2Units(){
        List<ExerciseUnit> exerciseUnits = new ArrayList<>();

        exerciseUnits.add(new ExerciseUnit(new Exercise("Standing/Seated Dumbbell Curls", "Desc", "Url"), 4, 8, "Each Set Each Arm"));
        exerciseUnits.add(new ExerciseUnit(new Exercise("EZ Or Straight Barbell Curl", "Desc", "Url"), 8, 8, "Each Set"));

        return exerciseUnits;
    }


}
