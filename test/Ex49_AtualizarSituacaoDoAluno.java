package test;

import dominio.*;

public class Ex49_AtualizarSituacaoDoAluno {
    public static void main(String[] args) {
        Aluno b = new Aluno();
        b.nome = "Bruno";
        b.nota1 = 5;
        b.nota2 = 7;
        System.out.println(b.getSituacao());
        new Secretaria().atualizarAluno(b, 8, 9);
        System.out.println(b.getSituacao());
    }
}
