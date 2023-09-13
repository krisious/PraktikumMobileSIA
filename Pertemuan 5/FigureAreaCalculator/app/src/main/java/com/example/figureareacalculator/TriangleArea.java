package com.example.figureareacalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TriangleArea extends AppCompatActivity implements View.OnClickListener {
    private EditText inBase, inHeigth;
    private Button btnCalculate;
    private TextView tvResult;
    private static final String STATE_RESULT = "state_result";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triangle_area);

        inBase = findViewById(R.id.in_base);
        inHeigth = findViewById(R.id.in_heigth);
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
            String inputBase = inBase.getText().toString().trim();
            String inputHeigth = inHeigth.getText().toString().trim();
            boolean isEmptyFields = false;

            if (TextUtils.isEmpty(inputBase)) {
                isEmptyFields = true;
                inBase.setError("Field ini tidak boleh kosong");
            }

            if (TextUtils.isEmpty(inputHeigth)) {
                isEmptyFields = true;
                inHeigth.setError("Field ini tidak boleh kosong");
            }

            if (!isEmptyFields) {
                double area = (Double.valueOf(inputBase) * Double.valueOf(inputHeigth)) / 2;
                tvResult.setText(String.valueOf(area));
            }
        }
    }
}