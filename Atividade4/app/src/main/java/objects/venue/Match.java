package objects.venue;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"head2head"})
public class Match {
    private MatchInfo match;

    public MatchInfo getMatch() {
        return match;
    }
}
