package com.example.ahmed.dummyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;



public class DisplayNoteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_note);



        TextView getTitle = (TextView) findViewById(R.id.get_title_text_view);
        getTitle.setText(getIntent().getExtras().getString("TITLE"));
        TextView getContext = (TextView) findViewById(R.id.get_context_text_view);
        getContext.setText(getIntent().getExtras().getString("CONTEXT"));
    }
}
