public class ReportData {
    private int user;
    private double locationX;
    private double locationY;
    private String time;
    private String image;

    public String toString(){
        return "Report[user=" + user + ", latitude=" + locationX + ", longitude="
            + locationY + ", time=" + time + ", image=" + image + "]";
    }
}