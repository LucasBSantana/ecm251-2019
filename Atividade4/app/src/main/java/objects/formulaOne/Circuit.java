package objects.formulaOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"circuitId", "url"})
public class Circuit {
    private String circuitName;
    private Location location;

    public Location getLocation() {
        return location;
    }

    public String getCircuitName() {
        return circuitName;
    }
}

