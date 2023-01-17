package com.example.ahmed.dummyapp;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Gallery;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

import static android.R.attr.handle;

public class MainActivity extends AppCompatActivity {

    static TheError error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        //hide the status bar
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // set the layout visibility under the the status bar
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        //set the status bar to transparent
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        //set the content view
        setContentView(R.layout.activity_main);


        getSupportActionBar().hide();
    }

    //clicking on one of the icons
    public void btn(View view) {
        if (view.getId() == R.id.chrome_layout || view.getId() == R.id.songs_layout || view.getId() == R.id.twitter_layout
                || view.getId() == R.id.twitch_layout || view.getId() == R.id.netflix_layout ||
                view.getId() == R.id.spotify_layout || view.getId() == R.id.viber_layout ||
                view.getId() == R.id.skype_layout || view.getId() == R.id.camera_layout || view.getId() == R.id.instagram_layout
                || view.getId() == R.id.youtube_layout || view.getId() == R.id.maps_layout ||
                view.getId() == R.id.playstore_layout || view.getId() == R.id.clock_layout || view.getId() == R.id.calendar_layout
                || view.getId() == R.id.uber_layout || view.getId() == R.id.printest_layout
                || view.getId() == R.id.messenger_layout || view.getId() == R.id.weather_layout) {
            Intent errorActivity = new Intent(MainActivity.this, ErronedActivity.class);
            startActivity(errorActivity);
            error = new TheError(view.getId());

        }
        else if(view.getId() == R.id.gallery_layout){
            startActivity(new Intent(MainActivity.this , GalleryActivity.class));
        }
        else if (view.getId() == R.id.notes_layout){
            startActivity(new Intent(MainActivity.this, NotesActivity.class));
        }
        else if (view.getId() == R.id.contacts_layout) {
            startActivity(new Intent(MainActivity.this, ContactsActivity.class));

        }
        else if(view.getId() == R.id.settings_layout){
            startActivity(new Intent(MainActivity.this,SettingsActivity.class));
        }



    }

    public TheError getError() {
        return error;
    }


}
