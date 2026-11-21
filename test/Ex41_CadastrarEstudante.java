package test;

import dominio.*;

public class Ex41_CadastrarEstudante {
    public static void main(String[] args) {
        Estudante a = new Estudante();
        Estudante b = new Estudante();
        CadastroEstudante cadastro = new CadastroEstudante();
        cadastro.cadastrar(a, "Ana", 20, 'F');
        cadastro.cadastrar(b, "Bruno", 19, 'M');
        new ImpressoraEstudante().imprime(a);
        new ImpressoraEstudante().imprime(b);
    }
}
