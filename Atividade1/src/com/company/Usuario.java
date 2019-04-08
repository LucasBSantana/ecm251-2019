package com.company;

public class Usuario {
    private String nome;
    private String email;
    private String CPF;
    private String nascimento;
    private Carteira carteira;

    public Usuario(String nome, String email, String CPF, String nascimento, Carteira carteira){
        this.nome = nome;
        this.email = email;
        this.CPF = CPF;
        this.nascimento = nascimento;
        this.carteira = carteira;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public void setEmail(String novoEmail){
        this.email = novoEmail;
    }

    public void pagamento(int senha){// tranfere o metodo pagamento para o usuario e nao para a carteira sem comprometer os dados
        System.out.println("O usuario "+nome);
        carteira.pagamento(senha);
    }

    public void getUsuario(){// printa as informacoes do usuario, do cartao e da carteira
        System.out.println("Usuario:\n\t"+nome+"\n\t"+email+"\nCarteira:\n"+carteira.getCarteira()+"\n");
    }
}
