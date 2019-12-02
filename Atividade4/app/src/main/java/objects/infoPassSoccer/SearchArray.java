package objects.infoPassSoccer;

import java.util.ArrayList;

public class SearchArray{

    private ArrayList<SearchPrint> infoList = new ArrayList<>();

    public ArrayList<SearchPrint> getInfoList() {
        return infoList;
    }

    public void updateInfoList(SearchPrint info) {
        this.infoList.add(info);
    }
}
