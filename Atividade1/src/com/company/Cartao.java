package com.company;

public class Cartao {
    private double taxaConversaoDolar;
    private int idCartao;
    private String label;
    private String emissorCartao;
    private String tipo;
    private String dataEmissao;
    private String validade;
    private int ccv;
    private int senha;
    private int numeroCartao;
    private int numeroConta;

    public Cartao (double taxaConversaoDolar, int idCartao, String label, String emissorCartao, String tipo, String dataEmissao, String validade, int ccv, int senha, int numeroCartao, int numeroConta){
        this.taxaConversaoDolar = taxaConversaoDolar;
        this.idCartao = idCartao;
        this.label = label;
        this.emissorCartao = emissorCartao;
        this.tipo = tipo;
        this.dataEmissao = dataEmissao;
        this.validade = validade;
        this.ccv = ccv;
        this.senha = senha;
        this.numeroCartao = numeroCartao;
        this.numeroConta = numeroConta;
    }

    public void setSenha(int novaSenha){
        this.senha = novaSenha;
    }

    public int getIdCartao(){
        return this.idCartao;
    }

    public String getTipo(){
        return this.tipo;
    }

    public String getCartao(){
        return "\t\tid Cartao:\t"+idCartao+"\n\t\tTaxa de conversao do dolar:\t"+taxaConversaoDolar+"\n\t\tBandeira:\t"+label+"\n\t\tBanco:\t"+emissorCartao;
    }


}
