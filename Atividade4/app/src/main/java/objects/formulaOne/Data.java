package objects.formulaOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"xmlns", "series", "url", "limit", "offset", "total"})
public class Data {
    private RaceTable raceTable;

    public RaceTable getRaceTable() {
        return raceTable;
    }
}
