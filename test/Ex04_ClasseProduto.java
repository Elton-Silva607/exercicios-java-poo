package test;

import dominio.*;

public class Ex04_ClasseProduto {
    public static void main(String[] args) {
        Produto a = new Produto();
        a.nome = "Teclado";
        a.preco = 100;
        a.quantidade = 3;
        System.out.println(a.nome + " | " + a.preco + " | " + a.quantidade);
    }
}
