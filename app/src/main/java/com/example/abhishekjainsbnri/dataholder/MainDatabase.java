package com.example.abhishekjainsbnri.dataholder;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {AllDetailTableData.class
}, version = 1, exportSchema = false)


public abstract class MainDatabase extends RoomDatabase {


    private static MainDatabase db;
    private static Context context;


    public static void setContext(Context context) {
        MainDatabase.context = context;
    }


    public static MainDatabase getDb() {

        if (db == null) {
            db = Room.databaseBuilder(context.getApplicationContext(), MainDatabase.class, "whole_db").allowMainThreadQueries().build();

        }
        return db;

    }

    public static MainDatabase getDb(Context context) {

        setContext(context);
        if (db == null) {
            db = Room.databaseBuilder(context.getApplicationContext(), MainDatabase.class, "whole_db").allowMainThreadQueries().build();

        }
        return db;

    }


    public abstract MainDAO getTodoDao();


}
