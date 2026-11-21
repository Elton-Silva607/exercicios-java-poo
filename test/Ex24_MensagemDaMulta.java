package test;

import dominio.*;

public class Ex24_MensagemDaMulta {
    public static void main(String[] args) {
        Carro b = new Carro();
        b.nome = "Honda";
        b.modelo = "City";
        b.ano = 2020;
        b.velocidadeAtual = 92;
        System.out.println(b.gerarMensagemMulta(80));
    }
}
