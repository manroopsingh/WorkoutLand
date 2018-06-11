package com.example.singh.workoutland.view.base;

public interface BasePresenter<V extends BaseView> {


    void attachView(V View);

    void detachView();


}
