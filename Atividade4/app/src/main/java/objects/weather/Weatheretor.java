package objects.weather;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties({"cod", "message", "cnt", "city"})
public class Weatheretor {
    private ArrayList<Lister> list = new ArrayList<>();

    public ArrayList<Lister> getList() {
        return list;
    }
}
