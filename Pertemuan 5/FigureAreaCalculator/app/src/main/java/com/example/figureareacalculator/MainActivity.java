package com.example.figureareacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnSquare, btnRectangle, btnTriangle, btnCircle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSquare = (Button)findViewById(R.id.btn_square);
        btnSquare.setOnClickListener(this);

        btnRectangle = (Button)findViewById(R.id.btn_rectangle);
        btnRectangle.setOnClickListener(this);

        btnTriangle = (Button)findViewById(R.id.btn_triangle);
        btnTriangle.setOnClickListener(this);

        btnCircle = (Button)findViewById(R.id.btn_circle);
        btnCircle.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_square){
            Intent moveIntent = new Intent(MainActivity.this, );
        }
    }
}