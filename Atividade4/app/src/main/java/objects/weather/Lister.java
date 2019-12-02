package objects.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties({"dt", "rain", "sys"})
public class Lister {
    private Main main;
    private ArrayList<Weather> weather = new ArrayList<>();
    private Clouds clouds;
    private Wind wind;
    private String dt_txt;

    public Clouds getClouds() {
        return clouds;
    }

    public Main getMain() {
        return main;
    }

    public String getDt_txt() {
        return dt_txt;
    }

    public ArrayList<Weather> getWeather() {
        return weather;
    }

    public Wind getWind() {
        return wind;
    }
}
