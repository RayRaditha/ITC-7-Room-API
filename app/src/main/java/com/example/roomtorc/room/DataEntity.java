package com.example.roomtorc.room;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "data")
public class DataEntity {
    public final static String TABLE_NAME = "data";
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "data")
    private String data;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Ignore
    public DataEntity(String data) {
        this.data = data;
    }

    public DataEntity(int id, String data) {
        this.id = id;
        this.data = data;
    }
}
