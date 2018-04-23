package com.example.ahmed.dummyapp;

/**
 * Created by Ahmed on 8/1/2017.
 */

public class TheError {
    private int layoutId;
    private int imageId;

    public TheError(int layoutId, int imageId){
        this.imageId = imageId;
        this.layoutId = layoutId;
    }
    public TheError(int layoutId){
        this.layoutId = layoutId;
    }

    public int getLayoutId(){
        return layoutId;
    }
    public int getImageId(){
        return imageId;
    }
}
