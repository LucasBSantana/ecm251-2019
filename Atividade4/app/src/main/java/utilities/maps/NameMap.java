package utilities.maps;

import android.util.SparseArray;

public class NameMap {

    public static SparseArray<String> setNameRef(){
        SparseArray<String> nameMap = new SparseArray<>();
        nameMap.put(1768, "Athletico-PR");
        nameMap.put(1766, "Atlético-MG");
        nameMap.put(1775, "Avaí");
        nameMap.put(1777, "Bahia");
        nameMap.put(1770, "Botafogo");
        nameMap.put(1837, "Ceará");
        nameMap.put(1772, "Chapecoense");
        nameMap.put(1779, "Corinthians");
        nameMap.put(1771, "Cruzeiro");
        nameMap.put(4244, "CSA");
        nameMap.put(1783, "Flamengo");
        nameMap.put(1765, "Fluminense");
        nameMap.put(3984, "Fortaleza");
        nameMap.put(4250, "Goiás");
        nameMap.put(1767, "Grêmio");
        nameMap.put(6684, "Internacional");
        nameMap.put(1769, "Palmeiras");
        nameMap.put(6685, "Santos");
        nameMap.put(1776, "São Paulo");
        nameMap.put(1780, "Vasco da Gama");
        return nameMap;
    }
}
