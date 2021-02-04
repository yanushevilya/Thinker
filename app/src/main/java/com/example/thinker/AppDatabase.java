package com.example.thinker;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Person.class, History.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract PersonDao personDao();
    public abstract HistoryDao historyDao();

}
