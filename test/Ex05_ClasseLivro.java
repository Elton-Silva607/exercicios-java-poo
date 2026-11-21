package test;

import dominio.*;

public class Ex05_ClasseLivro {
    public static void main(String[] args) {
        Livro a = new Livro();
        a.titulo = "Introdução a Java";
        a.autor = "Ana";
        a.numeroPaginas = 300;
        a.preco = 80;
        Livro b = new Livro();
        b.titulo = "Estruturas de Dados";
        b.autor = "Bruno";
        b.numeroPaginas = 410;
        b.preco = 96;
        System.out.println(a.titulo + " | " + a.autor + " | " + a.numeroPaginas + " | " + a.preco);
        System.out.println(b.titulo + " | " + b.autor + " | " + b.numeroPaginas + " | " + b.preco);
    }
}
