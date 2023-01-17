package com.example.ahmed.dummyapp;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.content.pm.PackageManager;
import java.util.ArrayList;
import java.util.List;

import static android.R.attr.versionName;
import static android.app.PendingIntent.getActivity;

/**
 * Created by Ahmed on 8/19/2017.
 */

class PInfo {
     String appname = "";
     String pname = "";
     String versionName = "";
     int versionCode = 0;
     Drawable icon;
     Context context;


    public void prettyPrint() {
        Log.v("applications", appname + "\t" + pname + "\t" + versionName + "\t" + versionCode);
    }

}

