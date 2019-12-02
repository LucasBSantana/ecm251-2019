package objects.InfoPassFOne;

public class SearchPrintF1 {
    private String curcuitName;
    private String local;
    private String date;
    private String weatherPredct;
    private Double tempMin;
    private Double tempMax;
    private String weatherType;

    public SearchPrintF1(String curcuitName, String local, String date, String weatherPredct, Double tempMin, Double tempMax, String weatherType) {
        this.curcuitName = curcuitName;
        this.local = local;
        this.date = date;
        this.weatherPredct = weatherPredct;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.weatherType = weatherType;
    }

    public String getCurcuitName() {
        return curcuitName;
    }

    public String getLocal() {
        return local;
    }

    public String getDate() {
        return date;
    }

    public String getWeatherPredct() {
        return weatherPredct;
    }

    public Double getTempMin() {
        return tempMin;
    }

    public Double getTempMax() {
        return tempMax;
    }

    public String getWeatherType() {
        return weatherType;
    }
}
