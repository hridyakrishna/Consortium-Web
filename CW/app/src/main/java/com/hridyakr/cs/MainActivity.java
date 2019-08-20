package com.hridyakr.cs;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(linearLayoutManager);
        MyListData[] myListData = new MyListData[] {
                new MyListData("Tailoring",R.drawable.ic_launcher_tailoring),
                new MyListData("Painting",R.drawable.ic_launcher_painting),
                new MyListData("Carpentry",R.drawable.ic_launcher_carpentry),
                new MyListData("Writing",R.drawable.ic_launcher_wriring),
                new MyListData("Orating",R.drawable.ic_launcher_orating),
                new MyListData("Sports",R.drawable.ic_launcher_sports),
                new MyListData("Domestic works",R.drawable.ic_launcher_domestic),
                new MyListData("Farming",R.drawable.ic_launcher_farming),
                new MyListData("Beautician",R.drawable.ic_launcher_beautician),
                new MyListData("Artist",R.drawable.ic_launcher_artist),
                new MyListData("Dance",R.drawable.ic_launcher_dance),
                new MyListData("Music",R.drawable.ic_launcher_music),
        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        MyListAdapter adapter = new MyListAdapter(this, myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

}

