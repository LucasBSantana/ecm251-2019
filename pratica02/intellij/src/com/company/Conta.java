package com.company;

public class Conta {
    int numero;
    String titular;
    double saldo;
    String CPF;

    public void visualizarSaldo(){
        System.out.println("Conta " + numero + " com saldo de " + saldo);
    }

    public void depositar(double soma){
        saldo += soma;
    }

    public void sacar(double menos){
        saldo -= menos;
    }

    public void transferirDinheiro(Conta benef, double valor){
        sacar(valor);
        benef.depositar(valor);
    }
}
