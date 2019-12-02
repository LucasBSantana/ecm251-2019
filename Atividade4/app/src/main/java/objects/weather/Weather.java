package objects.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"id", "main", "icon"})
public class Weather {
    private String description;

    public String getDescription() {
        return description;
    }
}
