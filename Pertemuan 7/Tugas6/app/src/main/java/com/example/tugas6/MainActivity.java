package com.example.tugas6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btn_jadwal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_jadwal = (Button) findViewById(R.id.btn_jadwal);
        btn_jadwal.setOnClickListener(this);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Google Pixel");
        }

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btn_jadwal){
            Jadwal matkul = new Jadwal();
            matkul.setJadwal("Senin : Pembelajaran Mesin, Pemrograman Mobile \n" +
                    "\nSelasa   : ARVR, ProgService, Bahasa Inggris\n" +
                    "\nRabu : Praktikum Mesin, Praktikum Mobilem Big data\n" +
                    "\nKamis    : Sistem Terdistribusi, Internet of Thing\n" +
                    "\nJumat    : Praktikum BIg Data");
            Intent pindah = new Intent(MainActivity.this, com.example.tugas6.halaman2.class);
            pindah.putExtra(halaman2.EXTRA_PERSON, matkul);
            startActivity(pindah);
        }

    }
}