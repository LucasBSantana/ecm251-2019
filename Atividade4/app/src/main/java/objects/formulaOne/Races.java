package objects.formulaOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"season", "round", "url"})
public class Races {
    private String raceName;
    private String date;
    private String time;
    private Circuit circuit;

    public Circuit getCircuit() {
        return circuit;
    }

    public String getRaceName() {
        return raceName;
    }

    public String getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }
}
