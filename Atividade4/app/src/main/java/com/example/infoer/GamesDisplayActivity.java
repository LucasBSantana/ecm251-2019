package com.example.infoer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.picasso.Picasso;

import java.io.IOException;

import objects.infoPassSoccer.SearchArray;

public class GamesDisplayActivity extends AppCompatActivity {

    SearchArray searchArray;
    private ImageButton comeback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_games_display);
        comeback = (ImageButton) findViewById(R.id.backwards);
        Picasso.get().load("https://cdn.pixabay.com/photo/2016/09/05/10/50/app-1646213_960_720.png").fit().centerInside().into(comeback);
        comeback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), TeamSelectorActivity.class);
                startActivity(intent);
                finish();
            }
        });
        infoReciever();
        initRecyclerView();
    }

    private void initRecyclerView(){
        RecyclerView recyclerView = findViewById(R.id.recycler_view_matches);
        RecyclerViewAdapterMatches adapter = new RecyclerViewAdapterMatches(searchArray, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));
    }

    private void infoReciever(){
        Intent intent = getIntent();
        String jsonSearchArray = intent.getStringExtra("team_matches");
        Log.d("Debug", intent.getStringExtra("team_matches"));
        ObjectMapper om = new ObjectMapper();
        {
            try {
                searchArray = om.readValue(jsonSearchArray, SearchArray.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
