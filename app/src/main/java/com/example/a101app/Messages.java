package com.example.a101app;

public class Messages {

    //model class
    String name;
    String imageUrl;

    //constructor
    public Messages(){

    }

    public Messages(String name, String imageUrl) {
        this.name = name;
        this.imageUrl = imageUrl;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
