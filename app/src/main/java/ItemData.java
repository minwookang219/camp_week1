package com.example.test_linearview;

public class ItemData {
    private int imageResId;
    private String text;

    public ItemData(int imageResId, String text){
        this.imageResId =  imageResId;
        this.text = text;
    }

    public int getImageResId(){
        return imageResId;
    }

    public String getText(){
        return text;
    }
}
