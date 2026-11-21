package test;

import dominio.*;

public class Ex32_ImprimirDadosDoCarro {
    public static void main(String[] args) {
        Carro a = new Carro();
        a.nome = "Fiat";
        a.modelo = "Uno";
        a.ano = 2009;
        a.velocidadeAtual = 70;
        Carro b = new Carro();
        b.nome = "Honda";
        b.modelo = "City";
        b.ano = 2020;
        b.velocidadeAtual = 92;
        new ImpressoraCarro().imprime(a);
        new ImpressoraCarro().imprime(b);
    }
}
