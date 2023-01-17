package com.example.ahmed.dummyapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import android.widget.ListView;

import java.util.ArrayList;

import static com.example.ahmed.dummyapp.NotesActivity.notes;

/**
 * Created by Ahmed on 8/9/2017.
 */

public class ContactsActivity extends AppCompatActivity {

    static ArrayList<Contact> contacts = new ArrayList<>();

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

            }
        });


        if (contacts.size() == 0 ){
            contacts.add(new Contact("ahmed chebil","ahmed@ahmed.com","+2156",R.drawable.birds));
            contacts.add(new Contact("ibtissem chalbi","ib@chalbi.com","+2156",R.drawable.fox));
            contacts.add(new Contact("foulen ben foulen","foulen@gmail.com","+2156",R.drawable.flamingo));
            contacts.add(new Contact("klk","klk@inconnu.com","+2156",R.drawable.birds));
        }





    ContactsAdapter itemsAdapter = new ContactsAdapter(this, contacts);

    final ListView listView2 = (ListView) findViewById(R.id.list);

    listView2.setAdapter(itemsAdapter);

        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(ContactsActivity.this,DisplayContactActivity.class);
                Contact not = (Contact) listView2.getItemAtPosition(position);
                intent.putExtra("name",not.getName());
                intent.putExtra("mail",not.getEmail());
                intent.putExtra("number",not.getNumber());
                intent.putExtra("resourceId",not.getImageId());
                startActivity(intent);


            }
        });











    }

}
