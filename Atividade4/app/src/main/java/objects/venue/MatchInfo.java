package objects.venue;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"id", "season", "status", "stage", "group",
        "lastUpdated", "score", "referees"})
public class MatchInfo {
    private String venue;
    private String utcDate;
    private Competition competition;
    private int matchday;
    private Team homeTeam;
    private Team awayTeam;

    public String getUtcDate() {
        return utcDate;
    }

    public Competition getCompetition() {
        return competition;
    }

    public int getMatchday() {
        return matchday;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public Team getAwayTeam() {
        return awayTeam;
    }

    public String getVenue() {
        return venue;
    }

    //@Override
    //public String toString(){
    //    return venue.replaceAll("\\s","%20");
    //}
}
