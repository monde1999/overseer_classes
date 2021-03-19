import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args){
        Gson gson = new Gson();
        int timeout = 5000;

        String url = "http://localhost:8000/forecast/forecasts/?format=json"; 
        String json = APIHandler.getJSON(url, timeout);
        System.out.println("JSON = " + json + "\n");
        
        System.out.println("-------data-------------");
        FloodForecastData data[] = gson.fromJson(json, FloodForecastData[].class);
        for (int i=0; i<data.length; i++){
            System.out.println("obj " + i + " = " + data[i]);
        }

        System.out.println("-------reports------------");
        url = "http://localhost:8000/forecast/reports?format=json";
        String u = "";
        for (int i=0; i<data.length; i++){
            System.out.println("obj " + i + "{");
            u += url;
            u += "&latitude=" + data[i].getLocationX();
            u += "&longitude=" + data[i].getLocationY();
            json = APIHandler.getJSON(u, timeout);
            ReportData[] rd = gson.fromJson(json, ReportData[].class);
            for (ReportData d: rd){
                System.out.println(d);
            }
            System.out.println("}");
            u = "";
        }
    }
}
