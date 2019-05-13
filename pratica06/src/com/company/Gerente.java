<<<<<<< HEAD
package com.company;

public class Gerente extends Funcionario {

    private int senha;

    public Gerente (String nome, int senha){
        super(nome);
        this.senha = senha;
    }

    public boolean autenticar( int senha){
        return senha == this.senha;
    }

    @Override
    public double comissao(){
        return 0.6*super.salario;
    }
}
=======
package com.company;

public class Gerente extends Funcionario {

    private int senha;

    public Gerente (String nome, int senha){
        super(nome);
        this.senha = senha;
    }

    public boolean autenticar( int senha){
        return senha == this.senha;
    }

    @Override
    public double comissao(){
        return 0.6*super.salario;
    }
}
>>>>>>> 0843070bdfa97310a469e84c29c8beba746fee63
