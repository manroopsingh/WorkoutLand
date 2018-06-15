package com.example.singh.workoutland.view.workout;

import com.example.singh.workoutland.model.Workout;
import com.example.singh.workoutland.view.base.BasePresenter;
import com.example.singh.workoutland.view.base.BaseView;

public interface WorkoutContract {

    interface View extends BaseView {

        void getWorkout();
    }


    interface Presenter extends BasePresenter<View> {

        void onWorkoutReceived(Workout workout);
    }
}

