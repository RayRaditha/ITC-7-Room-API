package com.example.roomtorc.room;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;

@Database(entities = DataEntity.class, exportSchema = false, version = 1)
public abstract class RoomDatabase extends androidx.room.RoomDatabase {

    public static RoomDatabase instance = null;

    public static synchronized RoomDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(), RoomDatabase.class, "Mhs_db")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }

    public abstract DataDao dataDao();


}
