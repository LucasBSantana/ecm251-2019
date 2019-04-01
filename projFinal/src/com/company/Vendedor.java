package com.company;

public class Vendedor {
    private String nome;
    private String CPF;
    private double comissao;
    private double salarioBase;
    private Gerente gerente;


    public Vendedor(String nome, String CPF, double comissao, double salarioBase, Gerente gerente) {
        this.nome = nome;
        this.CPF = CPF;
        this.comissao = comissao;
        this.salarioBase = salarioBase;
        this.gerente = gerente;
    }

    public String getNome() {
        return this.nome;
    }

    public double getSalarioBase() {
        return this.salarioBase;
    }

    public double getComissao(double totalDeVendas) {
        return this.comissao * totalDeVendas;
    }

    public String getCPF() {
        return this.CPF;
    }

    public double getSalarioMes(double totalDeVendas) {
        return getComissao(totalDeVendas) + this.salarioBase;
    }

    public Gerente getGerente(){
        return this.gerente;
    }
}
