package objects.formulaOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties({"locality", "country"})
public class Location {
    private String lat;

    @JsonProperty("long")
    private String lon;
    private String locality;
    private String country;

    public String getLocality() {
        return locality;
    }

    public String getCountry() {
        return country;
    }

    public String getLat() {
        return lat;
    }

    public String getLon() {
        return lon;
    }
}
