package test;

import dominio.*;

public class Ex33_ImprimirDadosDoProduto {
    public static void main(String[] args) {
        Produto a = new Produto();
        a.nome = "Teclado";
        a.preco = 100;
        a.quantidade = 3;
        Produto b = new Produto();
        b.nome = "Notebook";
        b.preco = 3200;
        b.quantidade = 5;
        new ImpressoraProduto().imprime(a);
        new ImpressoraProduto().imprime(b);
    }
}
