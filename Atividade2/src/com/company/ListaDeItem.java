package com.company;

import java.util.LinkedList;
import java.util.List;

public abstract class ListaDeItem implements PipocaInterface{
    protected List<Produto> ListaDeProdutos;

    public ListaDeItem(){
        ListaDeProdutos = new LinkedList<>();
    }

    public boolean removerUltimoDaLista(){
        if(ListaDeProdutos.size()>0){
            ListaDeProdutos.remove((ListaDeProdutos.size() - 1));
            return true;
        }
        else{
            return false;
        }
    }

    public boolean retornarResumo(){
        if(ListaDeProdutos.size()>0){
            for (Produto user: ListaDeProdutos){
                System.out.println(user.exibirInfos());
            }
            return true;
        }
        else{
            return false;
        }
    }
}
