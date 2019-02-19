package com.example.admin.notebookapplication;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String tempTitle,tempDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyHelper myHelper=new MyHelper(this);
        SQLiteDatabase database=myHelper.getReadableDatabase();

        Cursor cursor=database.rawQuery("SELECT TITLE, DESCRIPTION FROM NOTEDETAILS",new String[]{});

        if(cursor!=null)
        {
            cursor.moveToFirst();
            Log.d("CURSOR MOVED To FIRST","CURRSOR ARROW MOVED TO FIRST ROW");

        }

        //   int tempID;
        do
        {
            tempTitle=cursor.getString(0);
            tempDescription=cursor.getString(1);
            Log.d("Column VALUES::",""+tempTitle);

            //          notesList.add(new Notes(cursor.getInt(0),cursor.getString(1),cursor.getString(2)));
        }
        while(cursor.moveToNext());

        RecyclerView noteList=findViewById(R.id.noteList);
        noteList.setLayoutManager(new LinearLayoutManager(this));
        List<Notes> notesList=new ArrayList<>();


/*
        Notes n=new Notes();
        n.setNoteID(1);
        n.setTitle("dfbdvd");
        n.setNoteDescription("dhfdhdgdfgdfgdfdgdfgdgdgdfgdgdfg");
        notesList.add(n);
*/

        noteList.setAdapter(new NoteListAdapter(notesList));
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.newnote,menu);
        return true;
    }

}
