package com.example.a11347.materialtest;

/**
 * Created by 11347 on 2018/2/28.
 */

public class Fruit {
    private String name;
    private int imageId;
    public Fruit(String name , int imageId){
        this.name = name;
        this.imageId = imageId;
    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return imageId;
    }
}
