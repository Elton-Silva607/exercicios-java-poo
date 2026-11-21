package test;

import dominio.*;

public class Ex45_CompararDoisProdutos {
    public static void main(String[] args) {
        Produto a = new Produto();
        a.nome = "Teclado";
        a.preco = 100;
        a.quantidade = 3;
        Produto b = new Produto();
        b.nome = "Notebook";
        b.preco = 3200;
        b.quantidade = 5;
        Produto maisCaro = new ComparadorProduto().retornarProdutoMaisCaro(a, b);
        System.out.println(maisCaro.nome);
    }
}
