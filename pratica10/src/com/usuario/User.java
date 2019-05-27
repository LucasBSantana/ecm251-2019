package com.usuario;

public class User extends Base {

    public USer (String nome, String senha){
        super.nome = nome;
        super.senha = senha;
    }

    @Override
    public String toString(){
        return super.nome + " " + super.senha;
    }
}
