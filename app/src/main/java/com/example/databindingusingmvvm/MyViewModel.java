package com.example.databindingusingmvvm;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class MyViewModel extends AndroidViewModel {
    Student student;
    public MyViewModel(@NonNull Application application) {
        super(application);

        student=new Student("Ann",69,100);
    }
    public Student getStudent(){
        return this.student;
    }
}
