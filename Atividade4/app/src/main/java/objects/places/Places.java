package objects.places;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties({"status", "error_message"})
public class Places {
    private ArrayList<Candidates> candidates = new ArrayList<>();

    public ArrayList<Candidates> getCandidates() {
        return candidates;
    }

    @Override
    public String toString(){
        return ""+candidates.size();
    }
}
