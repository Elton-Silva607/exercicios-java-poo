package test;

import dominio.*;

public class Ex13_SituacaoDoAluno {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.nome = "Ana";
        a.nota1 = 8;
        a.nota2 = 7;
        Aluno b = new Aluno();
        b.nome = "Bruno";
        b.nota1 = 5;
        b.nota2 = 7;
        Aluno c = new Aluno();
        c.nome = "Carla";
        c.nota1 = 3;
        c.nota2 = 4;
        System.out.println(a.getSituacao());
        System.out.println(b.getSituacao());
        System.out.println(c.getSituacao());
    }
}
