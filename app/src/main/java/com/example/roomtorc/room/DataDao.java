package com.example.roomtorc.room;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface DataDao {
    @Query("SELECT * FROM " + DataEntity.TABLE_NAME)
    List<DataEntity> getAllData();
    @Insert
    void insert(DataEntity dataEntity);
}
