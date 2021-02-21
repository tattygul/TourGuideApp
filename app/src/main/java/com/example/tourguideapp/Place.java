package com.example.tourguideapp;

public class Place {
    private int imageId;
    private String title;
    private String information;
    private String address;
    private String phone;

    public Place() {
    }

    public Place(int imageId, String title) {
        this.imageId = imageId;
        this.title = title;
    }

    public Place(int imageId, String title, String information) {
        this.imageId = imageId;
        this.title = title;
        this.information = information;
    }

    public Place(int imageId, String title, String information, String address) {
        this.imageId = imageId;
        this.title = title;
        this.information = information;
        this.address = address;
    }



    public Place(int imageId, String title, String information, String address, String phone) {
        this.imageId = imageId;
        this.title = title;
        this.information = information;
        this.address = address;
        this.phone = phone;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
