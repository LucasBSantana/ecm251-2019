package com.company;

public class ContaTesteDrive {

    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta c2 = new Conta();

        c1.numero = 771;
        c2.numero = 325;

        c1.depositar(500);
        c2.depositar(700);

        c1.visualizarSaldo();
        c2.visualizarSaldo();

        System.out.println("\ndepois do saque:");

        c1.sacar(100);

        c1.visualizarSaldo();

        System.out.println("\ndepois da transferencia:");
        c1.transferirDinheiro(c2, 200);

        c1.visualizarSaldo();
        c2.visualizarSaldo();
    }
}
