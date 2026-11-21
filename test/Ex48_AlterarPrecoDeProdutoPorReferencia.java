package test;

import dominio.*;

public class Ex48_AlterarPrecoDeProdutoPorReferencia {
    public static void main(String[] args) {
        Produto a = new Produto();
        a.nome = "Teclado";
        a.preco = 100;
        a.quantidade = 3;
        System.out.println(a.preco);
        new Promocao().aplicarDesconto(a, 10);
        System.out.println(a.preco);
    }
}
