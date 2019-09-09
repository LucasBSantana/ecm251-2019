package com.company;

import auxiliar_database.UsuariosDAO;
import model.Usuario;
import utilities.Constants;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {
    private UsuariosDAO usuariosDAO;
    private List<Usuario> users;

    public Aplicacao (){
        usuariosDAO = new UsuariosDAO(Constants.URL_MEU_BANCO);
        users = new ArrayList<>();
    }

    public void run(){
        Scanner scanner = new Scanner(System.in);
        do{
            menu();
            int op = scanner.nextInt();
            switch (op){
                case 1:
                    System.out.println("\n");
                    String nome, email, senha;
                    System.out.println("Informe: ");
                    nome = scanner.next();
                    email = scanner.next();
                    senha = scanner.next();
                    Usuario user = new Usuario(nome, email, senha);
                    usuariosDAO.insertUsuario(user);
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("\n");
                    users = usuariosDAO.getAllUsuario();
                    for(Usuario u : users){
                        System.out.println("ID: " + u.id);
                        System.out.println("Nome: " + u.nome);
                    }
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("\n");
                    System.out.println("digite a id do usuario");
                    int id = scanner.nextInt();
                    user = usuariosDAO.getUsuario(id);
                    if(user == null){
                        System.out.println("nao ha usuario com esse cadastro\n");
                    }else {
                        System.out.println("ID: " + user.id);
                        System.out.println("Nome: " + user.nome);
                        System.out.println("\n");
                    }
                    break;
                case 4:
                    System.out.println("Informe o ID:");
                    id = scanner.nextInt();
                    user = usuariosDAO.getUsuario(id);
                    if(user == null){
                        System.out.println("nao ha usuario com esse cadastro\n");
                    }else {
                        System.out.println("ID: " + user.id);
                        System.out.println("Nome: " + user.nome);
                        System.out.println("\n");
                        System.out.println("Qual campo atualizar");
                        System.out.println("1 - nome");
                        System.out.println("2 - Email");
                        System.out.println("3 - senha");
                        id = scanner.nextInt();
                        System.out.println("Novo valor");
                        String temp = scanner.next();
                        switch(id){
                            case 1: user.nome = temp; break;
                            case 2: user.email = temp; break;
                            case 3: user.senha = temp; break;
                        }
                        usuariosDAO.updateUserById(user);
                    }
                    break;
                case 5:
                    System.out.println("Informe o ID");
                    id  = scanner.nextInt();
                    usuariosDAO.deleteUserById(id);
                    break;
            }
            if (op == 0)break;
        } while(true);
    }

    public void menu(){
        System.out.println("1 - Inserir usuario");
        System.out.println("2 - Mostrar usuarios");
        System.out.println("3 - Buscar usuario");
        System.out.println("4 - Atualizar usuario");
        System.out.println("5 - Remover usuario");
        System.out.println("0 - Sair");
    }
}
