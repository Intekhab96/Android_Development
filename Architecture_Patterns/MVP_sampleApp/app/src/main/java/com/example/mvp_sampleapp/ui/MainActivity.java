package com.example.mvp_sampleapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mvp_sampleapp.R;

public class MainActivity extends AppCompatActivity implements AppView {

    // 1.  lets arrange the packages
    // 2.  implement MVP pattern


    // Model : mymodel
    // View :  Activity with view (ie mainactivity)
    // Presenter : AppPresenter


    TextView displayText;
    Button btn;
    // linking view with presenter
    AppPresenter appPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayText = findViewById(R.id.textView);
        btn = findViewById(R.id.button);
        // Instantiating the presenter
        appPresenter = new AppPresenter(this);

        btn.setOnClickListener(new View.OnClickListener() {
                   @Override
                   public void onClick(View view) {
                       // calling presenter to get data from model
                       // no direct linkage between view and model
                       // our mainactivity handling views only
                       // all data related logic is in presenter
                       appPresenter.getAppName();
                   }
            }
        );

    }


    @Override
    public void onGetAppName(String appName) {
      displayText.setText(appName);
    }
}