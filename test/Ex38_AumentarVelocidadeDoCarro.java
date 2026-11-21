package test;

import dominio.*;

public class Ex38_AumentarVelocidadeDoCarro {
    public static void main(String[] args) {
        Carro a = new Carro();
        a.nome = "Fiat";
        a.modelo = "Uno";
        a.ano = 2009;
        a.velocidadeAtual = 70;
        System.out.println(a.velocidadeAtual);
        a.acelerar(10);
        System.out.println(a.velocidadeAtual);
    }
}
