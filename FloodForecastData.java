public class FloodForecastData {
    private FloodProneArea location;
    private Weather weather;
    private String time;

    private class Weather {
        int w_id;
        double w_temp;
        String w_description;
        String w_icon;
    
        public String toString(){
            return "Weather[id=" + w_id + ", temp=" + w_temp + ", decription=" + w_description
                + ", icon=" + w_icon + "]";
        }
    }

    private class FloodProneArea {
        double locationX;
        double locationY;
        double water_volume;
        double speed_to_subside;
    
        public String toString(){
            return "Area[altitude=" + locationX + ", longitude=" + locationY + ", water_volume=" 
                + water_volume + ", speed_to_subside=" + speed_to_subside + "]";
        }
    }

    public double getLocationX(){ return location.locationX; }

    public double getLocationY(){ return location.locationY; }

    public double getWeatherTemperature(){ return weather.w_temp; }

    public String getWeatherDescription(){ return weather.w_description; }

    public String getWeatherIcon(){ return weather.w_icon; }

    public String toString(){
        return "Data[\nlocation=" + location + ", \nweather=" + weather + ", \ntime=" + time + "\n]";
    }
}