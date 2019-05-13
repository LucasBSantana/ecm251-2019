package com.company;

public class SemLetraException extends Exception{
    @Override
    public String getMessage(){
        return "Nao existe a letra B";
    }
}
