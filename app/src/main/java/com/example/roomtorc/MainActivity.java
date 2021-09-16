package com.example.roomtorc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.roomtorc.rc.Adapter;
import com.example.roomtorc.room.DataEntity;
import com.example.roomtorc.room.RoomDatabase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static RoomDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        database = RoomDatabase.getInstance(this);

        RecyclerView recyclerView = findViewById(R.id.rc_main);


        //Insert Data (use 1 kali setiap running). dalam API nanti ini tempatnye di onSuccess tp datanya dari API
//        for (int i = 0; i < 10; i++){
//            database.dataDao().insert(new DataEntity("data" + i));
//        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //set adapter dengan data dari room database (getAllData())
        recyclerView.setAdapter(new Adapter(new ArrayList<>(database.dataDao().getAllData())));

    }
}