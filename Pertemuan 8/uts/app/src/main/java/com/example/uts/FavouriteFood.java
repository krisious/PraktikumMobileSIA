package com.example.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FavouriteFood extends AppCompatActivity implements View.OnClickListener {
    private Button btnTour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite_food);

        btnTour = (Button)findViewById(R.id.btn_tour);
        btnTour.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_tour) {
            Intent moveSchedule = new Intent(FavouriteFood.this, DreamTour.class);
            startActivity(moveSchedule);
        }
    }
}