package com.example.chelseaplayer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.chelseaplayer.model.Player;
import com.example.chelseaplayer.model.PlayerData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvPlayer;
    private ArrayList<Player> list = new ArrayList<>();


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.info, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.openBrowser:
                Intent browserIntent = new Intent(this, About.class);

                startActivity(browserIntent);

                return true;
        }
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvPlayer = findViewById(R.id.rvPlayer);
        rvPlayer.setHasFixedSize(true);
        list.addAll(PlayerData.getListData());
        showRecyclerList();

    }

    private void showRecyclerList() {
        rvPlayer.setLayoutManager(new LinearLayoutManager(this));
        ListPlayerAdapter listPlayerAdapter = new ListPlayerAdapter(list);
        rvPlayer.setAdapter(listPlayerAdapter);
    }
}
