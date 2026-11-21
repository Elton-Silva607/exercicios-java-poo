package test;

import dominio.*;

public class Ex01_ClasseEstudante {
    public static void main(String[] args) {
        Estudante a = new Estudante();
        a.nome = "Ana";
        a.idade = 20;
        a.sexo = 'F';
        System.out.println(a.nome + " | " + a.idade + " | " + a.sexo);
    }
}
