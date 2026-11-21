package test;

import dominio.*;

public class Ex50_SistemaCompletoSimples {
    public static void main(String[] args) {
        Carro a = new Carro();
        Carro b = new Carro();
        CadastroCarro cadastro = new CadastroCarro();
        cadastro.cadastrar(a, "Fiat", "Uno", 2009, 70);
        cadastro.cadastrar(b, "Honda", "City", 2020, 92);
        ImpressoraCarro impressora = new ImpressoraCarro();
        impressora.imprimir(a, 80);
        impressora.imprimir(b, 80);
    }
}
