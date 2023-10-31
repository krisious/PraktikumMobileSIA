package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvHeroes;
    private ArrayList<Hero> list = new ArrayList<>();
    private String title = "Mode List";
    private void showSelectedHero(Hero hero) {
        Toast.makeText(this, "Kamu memilih " + hero.getName(),
                Toast.LENGTH_SHORT).show();
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvHeroes = findViewById(R.id.rv_heroes);
        rvHeroes.setHasFixedSize(true);

        list.addAll(HeroesData.getListData());
        showRecyclerList();

        setActionBarTitle(title);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    private void showRecyclerGrid() {
        RecyclerView rvHeroes = findViewById(R.id.rv_heroes); // Ganti dengan ID RecyclerView Anda
        rvHeroes.setLayoutManager(new GridLayoutManager(this, 2)); // Ganti jumlah kolom grid jika diperlukan
        GridHeroAdapter gridHeroAdapter = new GridHeroAdapter(list); // Ganti dengan nama list Anda
        rvHeroes.setAdapter(gridHeroAdapter);

        gridHeroAdapter.setOnItemClickCallback(new GridHeroAdapter.OnItemClickCallback(){
            @Override
            public void onItemClicked(Hero data){
                showSelectedHero(data);
            }
        });
    }

    private void showRecyclerList() {
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        ListHeroAdapter listHeroAdapter = new ListHeroAdapter(list);
        rvHeroes.setAdapter(listHeroAdapter);
        listHeroAdapter.setOnItemClickCallback(new ListHeroAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Hero data) {
                showSelectedHero(data);
            }
        });
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }

    public void setMode(int selectedMode) {
        String title = ""; // Inisialisasi judul
        if (selectedMode == R.id.action_list) {
            title = "Mode List";
            showRecyclerList();
        } else if (selectedMode == R.id.action_grid) {
            title = "Mode Grid";
            showRecyclerGrid();
        } else if (selectedMode == R.id.action_cardview) {
            title = "Mode CardView";
            showRecyclerCardView();
        }
        setActionBarTitle(title);
    }

    private void showRecyclerCardView() {
        RecyclerView rvHeroes = findViewById(R.id.rv_heroes); // Ganti dengan ID RecyclerView Anda
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rvHeroes.setLayoutManager(layoutManager);
        CardViewHeroAdapter cardViewHeroAdapter = new CardViewHeroAdapter(list); // Ganti dengan nama list Anda
        rvHeroes.setAdapter(cardViewHeroAdapter);
    }
}
