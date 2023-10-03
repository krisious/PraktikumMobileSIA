package com.example.tugas6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class halaman2 extends AppCompatActivity {
    public static String EXTRA_PERSON = "extra_person";
    private TextView object;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);

        object = (TextView) findViewById(R.id.object);

        Jadwal matkul = getIntent().getParcelableExtra(EXTRA_PERSON);
        String text = matkul.getJadwal();

        object.setText(text);

    }
}