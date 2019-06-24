package com.company;

public class Carrinho extends ListaDeItem {
    private int i = 0;

    public Carrinho(){
        super();
    }

    public boolean adicionarALista(Produto p1){
        ListaDeProdutos.add(p1);
        i++;
        if (i<=12) {
            return true;
        }
        else{
               return false;
        }

    }

    public int getRestantes(){
        return 12-i;
    }

    public void retornarResumoFinal(){
        for (Produto user: ListaDeProdutos){
            System.out.println(user.exibirResumo());
        }
    }

    public void limparLista(){
        ListaDeProdutos.clear();
    }

    public int tamanhoDaLista(){
        return ListaDeProdutos.size();
    }
}
