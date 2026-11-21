package test;

import dominio.*;

public class Ex47_TrocarVelocidadesEntreCarros {
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
        System.out.println(a.velocidadeAtual + " | " + b.velocidadeAtual);
        new Oficina().trocarVelocidades(a, b);
        System.out.println(a.velocidadeAtual + " | " + b.velocidadeAtual);
    }
}
