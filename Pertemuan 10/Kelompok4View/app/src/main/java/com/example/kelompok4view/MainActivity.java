package com.example.kelompok4view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvPersons;
    private ArrayList<Person> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPersons = findViewById(R.id.rv_persons);
        rvPersons.setHasFixedSize(true);

        list.addAll(PersonData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvPersons.setLayoutManager(new LinearLayoutManager(this));
        ListPersonAdapter listPersonAdapter = new ListPersonAdapter(list);
        rvPersons.setAdapter(listPersonAdapter);
    }
}