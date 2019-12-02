package objects.venue;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"id"})
public class Competition {
    private String name;

    public String getName() {
        return name;
    }
}
