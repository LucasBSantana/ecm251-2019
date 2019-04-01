package com.company;

public class ConcessionariaTestDrive {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Carlos", "98765432199", 0.1, 6500);
        Vendedor v1 = new Vendedor("Joao", "12345678910",0.05,5000,g1);

        double totalVendasMes = 10000;

        System.out.println("Vendedor: ");
        System.out.println("comissao: " + v1.getComissao(totalVendasMes));
        System.out.println("Gerente: ");
        System.out.println("comissao: " + g1.getComissao(totalVendasMes));
        if(g1.aumentarSalarioBaseVendedor(v1))
            System.out.println("aumento neles");
        else
            System.out.println("sem aumento neles");
    }
}
