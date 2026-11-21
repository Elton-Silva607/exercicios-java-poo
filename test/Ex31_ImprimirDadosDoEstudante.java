package test;

import dominio.*;

public class Ex31_ImprimirDadosDoEstudante {
    public static void main(String[] args) {
        Estudante a = new Estudante();
        a.nome = "Ana";
        a.idade = 20;
        a.sexo = 'F';
        Estudante b = new Estudante();
        b.nome = "Bruno";
        b.idade = 19;
        b.sexo = 'M';
        new ImpressoraEstudante().imprime(a);
        new ImpressoraEstudante().imprime(b);
    }
}
