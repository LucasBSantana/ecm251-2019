package objects.football;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties({"count", "filters"})
public class Football {
    private ArrayList<Matches> matches = new ArrayList();

    public ArrayList<Matches> getMatches() {
        return matches;
    }

    @Override
    public String toString() {
        String results = "";
        for(Matches m : matches) {
            results += m.toString() + "\n\n";
        }
        return results;
    }
}

