package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnMoveActivity;
    private Button btnMoveWithDataActivity;
    private Button btnDialPhone;
    private Button btnMoveWithObject;
    private Button btnMoveForResult;
    private TextView tvResult;
    private int REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMoveActivity = (Button)findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        btnMoveWithDataActivity = (Button)findViewById(R.id.btn_move_activity_data);
        btnMoveWithDataActivity.setOnClickListener(this);

        btnDialPhone = (Button)findViewById(R.id.btn_dial_number);
        btnDialPhone.setOnClickListener(this);

        btnMoveWithObject = (Button)findViewById(R.id.btn_move_activity_object);
        btnMoveWithObject.setOnClickListener(this);

        btnMoveForResult = (Button)findViewById(R.id.btn_move_for_result);
        btnMoveForResult.setOnClickListener(this);
        tvResult = (TextView)findViewById(R.id.tv_result);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.btn_move_activity) {
            Intent moveIntent = new Intent(MainActivity.this, MoveActivity.class);
            startActivity(moveIntent);
        } else if (id == R.id.btn_move_activity_data) {
            Intent moveWithDataIntent = new Intent(MainActivity.this, MoveWithDataActivity.class);
            moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_NAME, "Dwi Krisidyanto");
            moveWithDataIntent.putExtra(MoveWithDataActivity.EXTRA_AGE, 5);
            startActivity(moveWithDataIntent);
        } else if (id == R.id.btn_dial_number) {
            String phoneNumber = "081210841382";
            Intent dialPhoneIntent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNumber));
            startActivity(dialPhoneIntent);
        } else if (id == R.id.btn_move_activity_object){
            Person mPerson = new Person();
            mPerson.setName("Dwi Krisdiyanto");
            mPerson.setAge(20);
            mPerson.setEmail("fransdwikrisdito20@gmail.com");
            mPerson.setCity("Kota Bekasi");

            Intent moveWithObjectIntent = new Intent(MainActivity.this, MoveWithObjectActivity.class);

            moveWithObjectIntent.putExtra(MoveWithObjectActivity.EXTRA_PERSON, mPerson);
            startActivity(moveWithObjectIntent);
        } else if(id == R.id.btn_move_for_result){
            Intent moveForResultIntent = new Intent(MainActivity.this, MoveForResultActivity.class);
            startActivityForResult(moveForResultIntent, REQUEST_CODE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE) {
            if (resultCode == MoveForResultActivity.RESULT_CODE) {
                int selectedValue = data.getIntExtra(MoveForResultActivity.EXTRA_SELECTED_VALUE, 0);
                tvResult.setText("Hasil : "+selectedValue);

            }
        }
    }
}