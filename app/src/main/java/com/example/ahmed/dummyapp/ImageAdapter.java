package com.example.ahmed.dummyapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import static android.R.attr.start;

/**
 * Created by Ahmed on 8/3/2017.
 */

public class ImageAdapter extends BaseAdapter {
    private Context context;

    public Integer[] images = {R.drawable.birds, R.drawable.civitadibagnero, R.drawable.flamingo, R.drawable.fox};

    public ImageAdapter(Context context){
        this.context = context;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(images[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setLayoutParams(new GridView.LayoutParams(240, 240));

        return imageView;
    }
}
