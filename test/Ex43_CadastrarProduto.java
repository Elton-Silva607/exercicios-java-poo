package test;

import dominio.*;

public class Ex43_CadastrarProduto {
    public static void main(String[] args) {
        Produto a = new Produto();
        Produto b = new Produto();
        CadastroProduto cadastro = new CadastroProduto();
        cadastro.cadastrar(a, "Teclado", 100, 3);
        cadastro.cadastrar(b, "Notebook", 3200, 5);
        new ImpressoraProduto().imprime(a);
        new ImpressoraProduto().imprime(b);
    }
}
