package test;

import dominio.*;

public class Ex42_CadastrarCarro {
    public static void main(String[] args) {
        Carro a = new Carro();
        Carro b = new Carro();
        CadastroCarro cadastro = new CadastroCarro();
        cadastro.cadastrar(a, "Fiat", "Uno", 2009, 70);
        cadastro.cadastrar(b, "Honda", "City", 2020, 92);
        new ImpressoraCarro().imprime(a);
        new ImpressoraCarro().imprime(b);
    }
}
