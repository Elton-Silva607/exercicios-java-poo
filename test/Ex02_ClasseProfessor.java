package test;

import dominio.*;

public class Ex02_ClasseProfessor {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Rafael";
        professor.idade = 38;
        professor.disciplina = "Java";
        professor.salario = 5500;
        System.out.println(professor.nome + " | " + professor.idade + " | " + professor.disciplina + " | " + professor.salario);
    }
}
