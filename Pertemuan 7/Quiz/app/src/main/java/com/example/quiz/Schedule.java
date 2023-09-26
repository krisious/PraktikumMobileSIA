package com.example.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Schedule extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("Jadwal Kuliah Saya di Semester 5");
        }
    }
}