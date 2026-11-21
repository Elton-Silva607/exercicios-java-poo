package test;

import dominio.*;

public class Ex10_ClasseAluno {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.nome = "Ana";
        a.nota1 = 8;
        a.nota2 = 7;
        System.out.println(a.nome + " | " + a.nota1 + " | " + a.nota2);
    }
}
