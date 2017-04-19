package com.mdb.wingit.wingit.modelClasses;

/**
 * Location for a single food or activity within an adventure
 */

public class Pin {
    private String name;
    private String placeID;
    private String latitude;
    private String longitude;
    private String rating;
    private String startTime;
    private String imageURL;
    private String address;
    private String phone;

    public Pin() {

    }

    public Pin(String name, String placeID, String latitude, String longitude, String rating, String startTime, String imageURL, String address, String phone) {
        this.name = name;
        this.placeID = placeID;
        this.latitude = latitude;
        this.longitude = longitude;
        this.rating = rating;
        this.startTime = startTime;
        this.imageURL = imageURL;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPlaceID() {
        return placeID;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getRating() {
        return rating;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return name + " " + placeID + " " + latitude + " " + longitude + " " + rating + " " + startTime;
    }
}