package com.company;

public class TesteMinhaExcecao {
    public static void main(String[] args) {
        String frase = "All might é melhor que Endevour";
        try {
            testaFrase(frase);
        } catch (SemLetraException e) {
            System.out.println(e);
        }
    }

    private static void testaFrase(String frase) throws SemLetraException{
        if( !frase.toUpperCase().contains("B")){
            throw new SemLetraException();
        }
    }
}
