public class ReportData {
    private int user;
    private double locationX;
    private double locationY;
    private String time; // to be fixed
    private String image; //url

    public String toString(){
        return "Report[user=" + user + ", latitude=" + locationX + ", longitude="
            + locationY + ", time=" + time + ", image=" + image + "]";
    }
}