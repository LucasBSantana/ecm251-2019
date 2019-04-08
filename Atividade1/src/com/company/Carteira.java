package com.company;

public class Carteira {
    private int idCarteira;
    private String nomeCarteira;
    private int senhaAcesso;
    private Cartao cartaoCredito;
    private Cartao cartaoDebito;

    public Carteira(int idCarteira, String nomeCarteira, int senhaAcesso, Cartao cartao1, Cartao cartao2) {
        this.idCarteira = idCarteira;
        this.nomeCarteira = nomeCarteira;
        this.senhaAcesso = senhaAcesso;
        if (cartao1.getTipo().equals("credito"))
            this.cartaoCredito = cartao1;
        else
            this.cartaoDebito = cartao1;

        if (cartao2 == null) {// avalia se existem os dois cartoese caso nao exista 1 avalia qual dos dois tipos o cartao existente é e coloca o valor null para o outro
            if (cartao1.getTipo().equals("credito"))
                this.cartaoDebito = cartao2;
            else
                this.cartaoCredito = cartao2;
        }
        else {
            if (cartao2.getTipo().equals("credito"))
                this.cartaoCredito = cartao2;
            else
                this.cartaoDebito = cartao2;
        }
    }

    public void pagamento(int senhaInput){//efetua a conferencia entre a senha da conta e a senha inputada para enfim efetuar o pagamento
        if (senhaInput == senhaAcesso)
            System.out.println("\tefetuou o pagamento\n");
        else
            System.out.println("\terrou a senha\n");
    }

    public void setCartao(Cartao cartao){// caso o usuario mude seu cartao troca um cartao por outro ou adiciona no espaco vazio
        if (cartao.getTipo().equals("credito"))
            this.cartaoCredito = cartao;
        else
            this.cartaoDebito = cartao;
    }

    public void setNomeCarteira(String novoNomeCarteira){
        this.nomeCarteira = novoNomeCarteira;
    }

    public int getIdCarteira(){
        return this.idCarteira;
    }

    public String getCarteira(){// retorna as informacoes da carteira

        if (cartaoDebito == null)
            return "\tId da carteira:\t"+idCarteira+"\n\tNome da carteira:\t"+nomeCarteira+"\n\tCartao de credito:\n"+cartaoCredito.getCartao()+"\n\tCartao de debito:\n\t\tNão existe";
        else{
            if (cartaoCredito == null)
                return "\tId da carteira:\t"+idCarteira+"\n\tNome da carteira:\t"+nomeCarteira+"\n\tCartao de credito:\n\t\tNão exsite"+"\n\tCartao de debito:\n"+cartaoDebito.getCartao();
            else
                return "\tId da carteira:\t"+idCarteira+"\n\tNome da carteira:\t"+nomeCarteira+"\n\tCartao de credito:\n"+cartaoCredito.getCartao()+"\n\tCartao de debito:\n"+cartaoDebito.getCartao();

        }
    }
}
