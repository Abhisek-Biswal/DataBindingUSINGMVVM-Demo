package com.example.databindingusingmvvm;

import androidx.appcompat.app.AppCompatActivity;


import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import com.example.databindingusingmvvm.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {


    ActivityMainBinding activityMainXML;
    MyViewModel myViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainXML= DataBindingUtil.setContentView(this, R.layout.activity_main);

        myViewModel = ViewModelProviders.of(this).get(MyViewModel.class);


        activityMainXML.setStudent(myViewModel.getStudent());

    }
}