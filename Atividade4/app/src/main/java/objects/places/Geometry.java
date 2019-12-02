package objects.places;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"viewport"})
public class Geometry {
    private Location location;

    public Location getLocation() {
        return location;
    }
}
