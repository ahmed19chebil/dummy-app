package com.example.ahmed.dummyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static android.R.string.no;
import static com.example.ahmed.dummyapp.NotesActivity.notes;

public class NewNoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_note);



        final EditText title = (EditText) findViewById(R.id.title_text_View2);
        final EditText context = (EditText) findViewById(R.id.context_text_view2);
        TextView button = (TextView) findViewById(R.id.add_note_text_view);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                notes.add(new Note(title.getText().toString(),context.getText().toString()));
                startActivity(new Intent(NewNoteActivity.this, NotesActivity.class));
            }
        });


    }
}
