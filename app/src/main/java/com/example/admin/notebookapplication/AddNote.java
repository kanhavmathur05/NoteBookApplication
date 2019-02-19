package com.example.admin.notebookapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddNote extends AppCompatActivity {

    EditText noteTitle,noteDescription;
    Button addNote;
    String newNoteTitle,newNoteDescriptiion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_note);

        noteTitle=findViewById(R.id.noteTitle);
        noteDescription=findViewById(R.id.noteDescription);

        addNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
