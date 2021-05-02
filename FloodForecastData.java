package com.adventurers.overseer.server;

import androidx.annotation.NonNull;

public class FloodForecastData {
    private FloodProneArea location;
    private Weather weather;
    private String time;

    public class Weather {
        int w_id;
        double w_temp;
        String w_description;

        public int getW_id() {
            return w_id;
        }

        public double getW_temp() {
            return w_temp;
        }

        public String getW_description() {
            return w_description;
        }

        public String getW_icon() {
            return w_icon;
        }

        String w_icon;

        @NonNull
        public String toString(){
            return "Weather[id=" + w_id + ", temp=" + w_temp + ", description=" + w_description
                + ", icon=" + w_icon + "]";
        }
    }
    public class FloodProneArea {
        double locationX;
        double locationY;
        double water_volume;

        public double getLocationX() {
            return locationX;
        }

        public double getLocationY() {
            return locationY;
        }

        public double getWater_volume() {
            return water_volume;
        }

        public double getSpeed_to_subside() {
            return speed_to_subside;
        }

        double speed_to_subside;

        @NonNull
        public String toString(){
            return "Area[altitude=" + locationX + ", longitude=" + locationY + ", water_volume=" 
                + water_volume + ", speed_to_subside=" + speed_to_subside + "]";
        }
    }

    public FloodProneArea getLocation() {
        return location;
    }

    public Weather getWeather() {
        return weather;
    }

    public String getTime() {
        return time;
    }

    @NonNull
    public String toString(){
        return "Data[\nlocation=" + location.toString() + ", \nweather=" + weather.toString() + ", \ntime=" + time + "\n]";
    }
}