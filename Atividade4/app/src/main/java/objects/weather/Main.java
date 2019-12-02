package objects.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"pressure", "sea_level", "grnd_level", "temp_kf"})
public class Main {
    private double temp;
    private double temp_min;
    private double temp_max;
    private double humidity;

    public double getHumidity() {
        return humidity;
    }

    public double getTemp() {
        return temp;
    }

    public double getTemp_max() {
        return temp_max;
    }

    public double getTemp_min() {
        return temp_min;
    }
}
