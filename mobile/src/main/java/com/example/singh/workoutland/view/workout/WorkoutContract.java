package com.example.singh.workoutland.view.workout;

import com.example.singh.workoutland.view.base.BasePresenter;
import com.example.singh.workoutland.view.base.BaseView;

public interface WorkoutContract {

    interface View extends BaseView {
    }


    interface Presenter extends BasePresenter<View> {
    }
}

