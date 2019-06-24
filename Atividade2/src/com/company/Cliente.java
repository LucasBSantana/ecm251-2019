package com.company;

public class Cliente {
    private String cpf, nome, endereco, cep, email;

    public Cliente (String cpf,String nome,String endereco,String cep,String email){
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.cep = cep;
        this.email = email;
    }

    public void exibirCliente(){
        System.out.println("senhor " + nome + " um email foi enviado para: " + email + " e seu produto sera enviado para " + endereco +"\n");
    }
}
