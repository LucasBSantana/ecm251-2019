package com.company;

public class Cuidado {
    public static void main(String[] args) {
        String frase = null;
        String novaFrase = null;
        try {
            novaFrase = frase.toUpperCase();
        }
        catch (NullPointerException e){
            System.out.println("Execao:");
            System.out.println(e);
        }
        System.out.println("frase original: " + frase);
        System.out.println("nova frase: " + novaFrase);
    }
}
