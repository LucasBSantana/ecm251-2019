package objects.formulaOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties({"season", "round"})
public class RaceTable {
    private ArrayList <Races> races = new ArrayList<>();

    public ArrayList<Races> getRaces() {
        return races;
    }
}
