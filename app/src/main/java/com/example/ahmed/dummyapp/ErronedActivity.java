package com.example.ahmed.dummyapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.GridLayout.LayoutParams;
import android.widget.LinearLayout;


import static com.example.ahmed.dummyapp.R.id.imageView;

public class ErronedActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //hide the status bar
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        //set the status bar to transparent
        getWindow().setStatusBarColor(Color.TRANSPARENT);

        setContentView(R.layout.activity_erroned);

        //hide the title bar
        getSupportActionBar().hide();

        //get the id of the bg view
        ImageView imageView = (ImageView) findViewById(R.id.background_logo);
        //change the app bg for the clicked app
        if (MainActivity.error.getLayoutId() == R.id.instagram_layout){

            imageView.setImageResource(R.drawable.ig_logo);
        }
        else if(MainActivity.error.getLayoutId() == R.id.chrome_layout){
            imageView.setImageResource(R.drawable.chrome_logo);
        }
        else if(MainActivity.error.getLayoutId() == R.id.songs_layout){
            imageView.setImageResource(R.drawable.songs_logo);
        }
        else if(MainActivity.error.getLayoutId() == R.id.messenger_layout){
            imageView.setImageResource(R.drawable.messenger_logo);
        }
        else if(MainActivity.error.getLayoutId() == R.id.twitch_layout){
            imageView.setImageResource(R.drawable.twitch_logo);
        }
        else if(MainActivity.error.getLayoutId() == R.id.youtube_layout){
            imageView.setImageResource(R.drawable.youtube_logo);
        }
        else if(MainActivity.error.getLayoutId() == R.id.spotify_layout){
            imageView.setImageResource(R.drawable.spotify_layer);
        }
        else if(MainActivity.error.getLayoutId() == R.id.uber_layout){
            imageView.setImageResource(R.drawable.uber_logo);
        }
        else if(MainActivity.error.getLayoutId() == R.id.netflix_layout){
            imageView.setImageResource(R.drawable.netflix_logo);
        }
        else if(MainActivity.error.getLayoutId() == R.id.viber_layout){
            imageView.setImageResource(R.drawable.viber_logo);
        }
        else if(MainActivity.error.getLayoutId() == R.id.printest_layout){
            imageView.setImageResource(R.drawable.printest_logo);
        }
        else if(MainActivity.error.getLayoutId() == R.id.camera_layout){
            imageView.setImageResource(R.drawable.camera_logo);
        }
        else if(MainActivity.error.getLayoutId() == R.id.calendar_layout){
            imageView.setImageResource(R.drawable.calendar_logo);
        }
        else if(MainActivity.error.getLayoutId() == R.id.clock_layout){
            imageView.setImageResource(R.drawable.clock_logo);
        }
        else if(MainActivity.error.getLayoutId() == R.id.maps_layout){
            imageView.setImageResource(R.drawable.maps_logo);
        }
        else if(MainActivity.error.getLayoutId() == R.id.playstore_layout){
            imageView.setImageResource(R.drawable.playstore_logo);
        }
        else if(MainActivity.error.getLayoutId() == R.id.skype_layout){
            imageView.setImageResource(R.drawable.skype_logo);
        }
        else if(MainActivity.error.getLayoutId() == R.id.weather_layout){
            imageView.setImageResource(R.drawable.weather_logo);
        }







        //opening the POPupwindow activity after a delay without clicking

       new Handler().postDelayed(new Runnable(){
            public void run(){
                //start new activity here

                startActivity(new Intent(ErronedActivity.this, Pop.class));
            }
        }, 2000);







    }
}
