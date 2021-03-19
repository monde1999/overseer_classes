public class FloodProneArea {
    private double locationX;
    private double locationY;
    private double water_volume;
    private double speed_to_subside;

    public double getLocationX(){
        return locationX;
    }

    public double getLocationY(){
        return locationY;
    }

    public String toString(){
        return "Area[altitude=" + locationX + ", longitude=" + locationY + ", water_volume=" 
            + water_volume + ", speed_to_subside=" + speed_to_subside + "]";
    }
}
