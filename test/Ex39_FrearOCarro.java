package test;

import dominio.*;

public class Ex39_FrearOCarro {
    public static void main(String[] args) {
        Carro a = new Carro();
        a.nome = "Fiat";
        a.modelo = "Uno";
        a.ano = 2009;
        a.velocidadeAtual = 70;
        a.frear(100);
        System.out.println(a.velocidadeAtual);
    }
}
