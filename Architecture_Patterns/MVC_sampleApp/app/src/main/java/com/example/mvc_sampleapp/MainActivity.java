package com.example.mvc_sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView displayName;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayName = findViewById(R.id.textView);


        //   MVC Patterns
        // Model : myModel
        // view :  textview
        // controller is our MainActivity

        // Professional coders dont use mvc
    }

    public MyModel getAppFromModel(){
        return new MyModel("My Patterns App",450000,4.5);
    }

    public void displayAppInText(View view) {
      long downloads =  getAppFromModel().getAppDownloads();
      String appName = getAppFromModel().getAppName();
      displayName.setText( appName+ " with "+  downloads+" Downloads ");
    }
}