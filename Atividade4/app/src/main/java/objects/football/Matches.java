package objects.football;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"season", "status", "stage",
        "group", "lastUpdated", "score", "referees",
        "competition", "utcDate", "matchday", "homeTeam", "awayTeam"})
public class Matches {
    private int id;

    public int getId() {
        return id;
    }
}
