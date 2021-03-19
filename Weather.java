public class Weather {
    private OpenWeatherWeather weather;
    private OpenWeatherMain main;

    private class OpenWeatherWeather {
        public int id;
        public String main;
        public String description;
        public String icon;

        public String toString(){
            return "OWWeather[id=" + id + ", main=" + main
                + ", description=" + description + ", icon=" + icon + "]";
        }
    }

    private class OpenWeatherMain {
        public double temp;
        public double feels_like;
        public double temp_min;
        public double temp_max;
        public double pressure;

        public String toString(){
            return "OWMain[temp=" + temp + ", feels_like=" + feels_like
                + ", temp_min=" + temp_min + ", temp_max=" + temp_max
                + ", pressure=" + pressure + "]";
        }
    }

    public String toString(){
        return "Weather[weather=" + weather + ", main=" + main + "]";
    }
}
