package test;

import dominio.*;

public class Ex40_AtualizarNotaDoAluno {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.nome = "Ana";
        a.nota1 = 8;
        a.nota2 = 7;
        System.out.println(a.calcularMedia());
        a.atualizarNotas(9, 10);
        System.out.println(a.calcularMedia());
    }
}
