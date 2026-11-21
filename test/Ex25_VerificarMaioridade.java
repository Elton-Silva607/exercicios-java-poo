package test;

import dominio.*;

public class Ex25_VerificarMaioridade {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Ana";
        pessoa.idade = 18;
        System.out.println(pessoa.isMaiorDeIdade(18));
    }
}
