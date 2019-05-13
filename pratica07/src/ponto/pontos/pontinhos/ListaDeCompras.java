<<<<<<< HEAD
package ponto.pontos.pontinhos;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras {
    private List<Produto> produtos;

    public ListaDeCompras(){
        produtos = new ArrayList<Produto>();
    }

    public boolean AdicionarProduto(Produto p){
        if(p == null) return false;
        produtos.add(p);
        return true;
    }

    public boolean Remover(String nome){
        return produtos.remove(new Produto(nome));
    }
=======
package ponto.pontos.pontinhos;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras {
    private List<Produto> produtos;

    public ListaDeCompras(){
        produtos = new ArrayList<Produto>();
    }

    public boolean AdicionarProduto(Produto p){
        if(p == null) return false;
        produtos.add(p);
        return true;
    }

    public boolean Remover(String nome){
        return produtos.remove(new Produto(nome));
    }
>>>>>>> 0843070bdfa97310a469e84c29c8beba746fee63
}