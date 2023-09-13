package com.example.figureareacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SquareArea extends AppCompatActivity implements View.OnClickListener {
    private EditText inSide;
    private Button btnCalculate;
    private TextView tvResult;
    private static final String STATE_RESULT = "state_result";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_square_area);

        inSide = findViewById(R.id.in_side);
        btnCalculate = findViewById(R.id.btn_calculate);
        tvResult = findViewById(R.id.tv_result);

        btnCalculate.setOnClickListener(this);

        if (savedInstanceState != null){
            String result = savedInstanceState.getString(STATE_RESULT);
            tvResult.setText(result);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(STATE_RESULT, tvResult.getText().toString());
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_calculate) {
            String inputSide = inSide.getText().toString().trim();
            boolean isEmptyFields = false;

            if (TextUtils.isEmpty(inputSide)) {
                isEmptyFields = true;
                inSide.setError("Field ini tidak boleh kosong");
            }

            if (!isEmptyFields) {
                double area = Double.valueOf(inputSide) * Double.valueOf(inputSide);
                tvResult.setText(String.valueOf(area));
            }
        }
    }
}