package com.company;

public class FuncionarioTestDrive {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario("Joaquim","12345678900",0.05, 10000);
        System.out.println("salario do mes de " + f1.getNome() + " é de " + f1.getSalarioMes(700000));
    }
}
