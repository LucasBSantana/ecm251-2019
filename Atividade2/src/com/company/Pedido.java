package com.company;

public class Pedido{
    private Cliente cliente;
    private Carrinho carrinho;
    private int i = 0;

    public Pedido(Cliente cliente, Carrinho carrinho){
        this.cliente = cliente;
        this.carrinho = carrinho;
    }

    public boolean resumoPedido(){
        if(carrinho.tamanhoDaLista()>0) {
            i++;
            cliente.exibirCliente();
            carrinho.retornarResumoFinal();
            System.out.println("id do pedido: " + i);
            return true;
        }
        else {
            return false;
        }
    }
}
