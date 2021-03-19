public class FloodForecastData {
    private FloodProneArea location;
    private Weather weather;
    private String time;

    public double getLocationX(){
        return location.getLocationX();
    }

    public double getLocationY(){
        return location.getLocationY();
    }

    public String toString(){
        return "Data[\nlocation=" + location + ", \nweather=" + weather + ", \ntime=" + time + "\n]";
    }
}