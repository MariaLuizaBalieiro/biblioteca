package br.senai.sp.jandira.Model;

import java.util.Scanner;

public class bibliotecario {
    public  String nome, email, endereco, numeroTelefone;

    Scanner teclado = new Scanner(System.in);
    bibliotecario Bibliotecario = new bibliotecario();

    public bibliotecario bibliotecarioRegister() {
        System.out.println("********** Cadstrar Bibliotecario**********");
        System.out.println("Digite seu nome: ");
        System.out.println("*Digite seu email:");
        System.out.println("Digite seu núnero de telefone:");
        System.out.println("********** Digite seu nome: **********");

        return Bibliotecario;

    }



}
