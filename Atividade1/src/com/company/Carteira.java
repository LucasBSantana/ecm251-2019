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

        if (cartao2 == null) {
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

    public void pagamento(int senhaInput){
        if (senhaInput == senhaAcesso)
            System.out.println("\tefetuou o pagamento\n");
        else
            System.out.println("\terrou a senha\n");
    }

    public void setCartao(Cartao cartao){
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

    public String getCarteira(){

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
