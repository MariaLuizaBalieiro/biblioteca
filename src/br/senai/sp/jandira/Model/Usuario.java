package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class Usuario {
    public  String nome, email, endereco, numeroTelefone;

    Scanner teclado = new Scanner(System.in);

    Usuario usuario = new Usuario();

    public Usuario usuarioRegister() {
        System.out.println("********** Cadstrar Bibliotecario **********");
        System.out.println("Digite seu nome: ");
        System.out.println("*Digite seu email:");
        System.out.println("Digite seu núnero de telefone:");

        return usuario;
    }

    }
