package com.example.ahmed.dummyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayContactActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_contact);

        //hide the title bar
        getSupportActionBar().hide();

        ImageView image = (ImageView) findViewById(R.id.backforward_image_view);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DisplayContactActivity.this,ContactsActivity.class));
            }
        });



        TextView getName = (TextView) findViewById(R.id.get_contact_name_text_view);
        getName.setText(getIntent().getExtras().getString("name"));
        TextView getMail = (TextView) findViewById(R.id.get_mail_text_view);
        getMail.setText(getIntent().getExtras().getString("mail"));
        TextView getNumber = (TextView) findViewById(R.id.get_number_text_view);
        getNumber.setText(getIntent().getExtras().getString("number"));

        ImageView getImageid = (ImageView) findViewById(R.id.contact_image);
        getImageid.setImageResource(getIntent().getIntExtra("resourceId",0));

    }
}
