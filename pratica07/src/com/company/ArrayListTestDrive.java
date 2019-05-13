<<<<<<< HEAD
package com.company;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTestDrive {
    public static void main(String[] args) {
        List<MinhaClasse> minhaLista;
        minhaLista = new ArrayList<MinhaClasse>();
        MinhaClasse minhaClasse = new MinhaClasse(10,"All Might");

        minhaLista.add(minhaClasse);
        minhaLista.add(new MinhaClasse(2,"Teu Pai"));

        minhaClasse = minhaLista.get(1);
        System.out.println(minhaClasse);

        for (MinhaClasse m : minhaLista){
            System.out.println(m);
        }
    }
=======
package com.company;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTestDrive {
    public static void main(String[] args) {
        List<MinhaClasse> minhaLista;
        minhaLista = new ArrayList<MinhaClasse>();
        MinhaClasse minhaClasse = new MinhaClasse(10,"All Might");

        minhaLista.add(minhaClasse);
        minhaLista.add(new MinhaClasse(2,"Teu Pai"));

        minhaClasse = minhaLista.get(1);
        System.out.println(minhaClasse);

        for (MinhaClasse m : minhaLista){
            System.out.println(m);
        }
    }
>>>>>>> 0843070bdfa97310a469e84c29c8beba746fee63
}