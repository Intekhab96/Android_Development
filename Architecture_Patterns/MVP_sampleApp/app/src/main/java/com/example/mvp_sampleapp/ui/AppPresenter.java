package com.example.mvp_sampleapp.ui;


// this will act as Presenter {the waiter ;)}

import com.example.mvp_sampleapp.util.MyModel;

public class AppPresenter {

    // link between presenter and view(mainActivity) is done by Interface
    // Link instance
    AppView appView ;

    public AppPresenter(AppView appView) {
        this.appView = appView;
    }

    // linkage between presenter and model
    public MyModel getAppFromModel(){
        return new MyModel("My Patterns App",450000,4.5);
    }

    // linkage between presenter and view(mainactivity)  calling the interface

    public void getAppName(){
        //  passing here the results from model using interface
        appView.onGetAppName(getAppFromModel().getAppName());
    }

}
