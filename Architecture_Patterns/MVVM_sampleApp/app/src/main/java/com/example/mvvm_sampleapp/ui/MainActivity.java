package com.example.mvvm_sampleapp.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mvvm_sampleapp.R;
import com.example.mvvm_sampleapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // MVVM: Removing presenter from MVP

    // MVVM

    // added viewmodel dependency in buildgradle
    // implementing dependency of viewModel
    // creating viewmodel class

    // commenting coz using viewbinding
    // TextView displayText;
    // Button btn;

    // connecting view with viewmodel and listening for live data
    AppViewModel appViewModel ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // commenting coz using viewbinding
      //  setContentView(R.layout.activity_main);

        // commenting coz using viewbinding
        // displayText = findViewById(R.id.textView);
        // btn = findViewById(R.id.button);

        final ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        appViewModel = new ViewModelProvider(this).get(AppViewModel.class);

        // listening and observingchanges to livedata
        // no need for below code if using databinding, check the xml file
//
//        appViewModel.mutableLiveData.observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(String s) {
//                // any change in live data do this
//                binding.textView.setText(s);
//            }
//        });

        // viewbinding with textview will do the job of observing for live data changes
        binding.setViewModel(appViewModel);
        binding.setLifecycleOwner(this);

//      no need for below code if using databinding check the xml file, check xml file

//        binding.button.setOnClickListener(new View.OnClickListener() {
//            @Override
//               public void onClick(View view) {
//                   appViewModel.getAppName();
//               }
//            }
//        );
    }


}