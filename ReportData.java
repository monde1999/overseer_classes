package com.adventurers.overseer.server;

import androidx.annotation.NonNull;

public class ReportData {
    private int user;
    private double locationX;
    private double locationY;
    private String timestamp;
    private String image;

    public int getUser() {
        return user;
    }

    public double getLocationX() {
        return locationX;
    }

    public double getLocationY() {
        return locationY;
    }

    public String getTime() {
        return timestamp;
    }

    public String getImage() {
        return image;
    }

    @NonNull
    public String toString(){
        return "Report[user=" + user + ", latitude=" + locationX + ", longitude="
            + locationY + ", time=" + timestamp + ", image=" + image + "]";
    }
}