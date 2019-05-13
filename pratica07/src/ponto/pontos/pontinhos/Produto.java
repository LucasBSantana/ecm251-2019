<<<<<<< HEAD
package ponto.pontos.pontinhos;

public class Produto {
    private String nome;
    public Produto(String nome){
        this.nome = nome;
    }
    @Override
    public String toString() {
        return nome;
    }

    @Override
    public boolean equals(Object obj) {
        return this.nome.equals(obj.toString());
    }
=======
package ponto.pontos.pontinhos;

public class Produto {
    private String nome;
    public Produto(String nome){
        this.nome = nome;
    }
    @Override
    public String toString() {
        return nome;
    }

    @Override
    public boolean equals(Object obj) {
        return this.nome.equals(obj.toString());
    }
>>>>>>> 0843070bdfa97310a469e84c29c8beba746fee63
}