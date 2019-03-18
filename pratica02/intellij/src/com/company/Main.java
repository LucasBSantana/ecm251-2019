package com.company;

public class Main {

    public static void main(String[] args) {
	    Sayajin s1;
	    s1 = new Sayajin();
	    s1.nome = "Vegeta";
	    s1.ki = 1000;
	    s1.odio = true;
        System.out.println(s1.nome);
	    s1.treinar();

	    Sayajin s2 = new Sayajin();
	    s2.nome = "Brolly";
	    s2.ki = 1000000;
        System.out.println(s2.nome);
	    s2.treinar();

    }
}
