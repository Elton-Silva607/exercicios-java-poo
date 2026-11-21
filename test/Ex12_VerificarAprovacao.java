package test;

import dominio.*;

public class Ex12_VerificarAprovacao {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.nome = "Ana";
        a.nota1 = 8;
        a.nota2 = 7;
        System.out.println(a.isAprovado());
    }
}
