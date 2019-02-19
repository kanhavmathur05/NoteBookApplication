package com.example.admin.notebookapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class MyHelper extends SQLiteOpenHelper {

    private static final String dbname="myDB";
    private static final int version=1;
    public MyHelper(Context context)
    {
        super(context,dbname,null,version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql="CREATE TABLE NOTEDETAILS (_id INTEGER PRIMARY KEY AUTOINCREMENT, TITLE TEXT,DESCRIPTION TEXT)";
        db.execSQL(sql);
        Log.d("Check","Database CREATED");
        insertData("Note 1","Note 1 Description",db);
        //insertData("Note 2","Note 2 Description",db);
        Log.d("Values Check","DATA INSERTED");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    private void insertData(String title,String titleDescription,SQLiteDatabase database)
    {
        ContentValues values=new ContentValues();
        values.put("TITLE",title);
        values.put("DESCRIPTION",titleDescription);
        database.insert("PRODUCTS",null,values);
    }
}
