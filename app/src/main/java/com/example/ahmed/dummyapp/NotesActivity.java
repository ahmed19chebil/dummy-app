package com.example.ahmed.dummyapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.attr.data;
import static android.R.attr.value;
import static android.icu.text.Normalizer.NO;
import static android.media.CamcorderProfile.get;
import static android.os.Build.VERSION_CODES.N;

public class NotesActivity extends AppCompatActivity {
     static ArrayList<Note> notes = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setImageResource(R.drawable.ic_add_white_24dp);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(NotesActivity.this,NewNoteActivity.class));


            }
        });



        //add 3 fake notes
        if (notes.size() == 0 ){
                notes.add(new Note("Note1","lutti1"));
                notes.add(new Note("Note2","lol"));
                notes.add(new Note("Note3","xdd"));
            }



        NotesAdapter itemsAdapter = new NotesAdapter(this, notes);

        final ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        //set a an onItemCLickLIstener on adapter items
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(NotesActivity.this,DisplayNoteActivity.class);
                Note not = (Note) listView.getItemAtPosition(position);
                intent.putExtra("TITLE",not.getTitle());
                intent.putExtra("CONTEXT",not.getContext());
                startActivity(intent);


            }
        });


    }

}
