package com.company;

public class Desejo extends ListaDeItem {
    private int i = 0;

    public Desejo(){
        super();
    }

    public boolean adicionarALista(Produto p1){
        ListaDeProdutos.add(p1);
        i++;
        if (i<=5) {
            return true;
        }
        else{
            return false;
        }

    }

    public int getRestantes(){
        return 5-i;
    }

}
