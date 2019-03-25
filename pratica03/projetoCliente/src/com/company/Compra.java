package com.company;

public class Compra {
    private int id;
    private Cliente cli;
    private Produto prod;

    public Compra (int id, Cliente cli, Produto prod){
        this.id = id;
        this.cli = cli;
        this.prod = prod;
    }

    public String pegarDetalhes(){
        return "ID: " + id + " Nome: " + cli.getNome() + " Produto: "+ prod.getNome();
    }

}
