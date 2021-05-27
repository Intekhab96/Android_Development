package com.example.mvvm_sampleapp.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvvm_sampleapp.util.MyModel;

public class AppViewModel  extends ViewModel {


   public MutableLiveData<String> mutableLiveData = new MutableLiveData<>();


   // mutablelivedata : we can set and post value in livedata

   // connecting viewmodel with database (Model)
   public MyModel getAppFromModel(){
       return new MyModel("My Patterns App",450000,4.5);
   }


   public void getAppName(){
       String appName = getAppFromModel().getAppName();
       mutableLiveData.setValue(appName);  // setting live data
   }

}
