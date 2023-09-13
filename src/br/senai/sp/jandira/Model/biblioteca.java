package br.senai.sp.jandira.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class biblioteca {
    List <Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro){

        livros.add(livro);


    }

    public void listarLivros(){

        for (Livro livros : livros){
            System.out.println(livros.nome);
        }

    }


}