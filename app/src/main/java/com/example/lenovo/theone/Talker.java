package com.example.lenovo.theone;

/**
 * Created by Lenovo on 2017/11/9.
 */

public class Talker {
    private String name;
    private int imageId;
    public Talker(String name,int imageId){
        this.name = name;
        this.imageId = imageId;
    }

    public int getImageId() {

        return imageId;
    }

    public String getName() {

        return name;
    }
}
