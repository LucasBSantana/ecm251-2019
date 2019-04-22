package com.company;

public class Main {

    public static void main(String[] args) {
	    Funcionario g1 = new Gerente("Gervasio",123456);
	    g1.setSalario(10000);
        System.out.println("Gerente: " + g1.comissao());

        Funcionario d1 = new Diretor("Drauzio");
        d1.setSalario(20000);
        System.out.println("Diretor: " + d1.comissao());

        Funcionario e1 = new Engenheiro("Euclides");
        e1.setSalario(5000);
        System.out.println("Engenheiro: " + e1.comissao());

        Funcionario v1 = new Vendedor("Adolfredo");
        v1.setSalario(2000);
        System.out.println("Vendedor: " + v1.comissao());

        RH rh = new RH();
        rh.adicionaComissao(g1);
        rh.adicionaComissao(e1);
        System.out.println("\nTotal: " + rh.getTotalComissao());
    }
}
