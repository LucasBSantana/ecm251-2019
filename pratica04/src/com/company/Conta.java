package com.company;

public class Conta {
    private double saldo;
    private int numeroConta;
    private String nome;

    private static int totalDeContas = 0;

    public String pegaDados(){
        return "\tSaldo: " + this.saldo + "\n\tNumero: " + this.numeroConta + "\n\tNome: " + this.nome + "\n";
    }

    public Conta(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
        this.numeroConta = totalDeContas;
        totalDeContas++;
    }

    public static int getTotalDeContas(){
        return Conta.totalDeContas;
    }
}
