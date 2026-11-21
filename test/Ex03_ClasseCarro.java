package test;

import dominio.*;

public class Ex03_ClasseCarro {
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
        System.out.println(a.nome + " | " + a.modelo + " | " + a.ano);
        System.out.println(b.nome + " | " + b.modelo + " | " + b.ano);
    }
}
