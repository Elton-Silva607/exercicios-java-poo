package test;

import dominio.*;

public class Ex44_CompararDoisAlunos {
    public static void main(String[] args) {
        Aluno a = new Aluno();
        a.nome = "Ana";
        a.nota1 = 8;
        a.nota2 = 7;
        Aluno b = new Aluno();
        b.nome = "Bruno";
        b.nota1 = 5;
        b.nota2 = 7;
        Aluno maiorMedia = new ComparadorAluno().retornarAlunoComMaiorMedia(a, b);
        System.out.println(maiorMedia.nome);
    }
}
