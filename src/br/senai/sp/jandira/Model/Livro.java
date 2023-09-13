package br.senai.sp.jandira.Model;
import java.util.Scanner;
public class Livro {

    public  String nome, autor, genero;
    int isbn;

    Scanner teclado = new Scanner(System.in);

    public Livro(){

        System.out.println("----- CADASTRAR LIVROS  ------");
        System.out.println("Qual é o nome: ");
        nome = teclado.nextLine();
        System.out.println("Qual é o Autor: ");
        autor = teclado.nextLine();
        System.out.println("Qual é a Gênero: ");
        genero = teclado.nextLine();
        System.out.println("Qual é a isbn: ");
        isbn = teclado.nextInt();
        teclado.nextLine();

    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

}
}



