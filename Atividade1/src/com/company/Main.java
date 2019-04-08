package com.company;

public class Main {

    public static void main(String[] args) {
	    Cartao tao1 = new Cartao(3.90,1,"MasterCard","Itau","debito","12/12/2017","12/2020",135,9865,1234567890,50010);
        Cartao tao2 = new Cartao(3.90,2,"MasterCard","Itau","credito","12/11/2017","11/2021",131,9860,1234567190,50011);
        Cartao tao3 = new Cartao(3.90,3,"MasterCard","Itau","dedito","12/10/2017","10/2022",133,9861,1234577190,51011);
        Carteira c1 = new Carteira(1,"Carteira do Lucas", 2356,tao1,null);
        Carteira c2 = new Carteira(2,"Carteira do Felipe", 0000,tao2,tao3);
        Usuario s1 = new Usuario("Lucas Brancatelli","lucas.brancatelli@gmail.com", "12345678","12/12/2017",c1);
        Usuario s2 = new Usuario("Felipe Pereira","felipe.sanger@terra.com.br","58214793","12/10/2017",c2);



        s1.getUsuario();
        s2.getUsuario();
        s2.pagamento(0000);
        s2.pagamento(1000);
    }
}
