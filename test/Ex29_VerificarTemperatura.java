package test;

import dominio.*;

public class Ex29_VerificarTemperatura {
    public static void main(String[] args) {
        Termometro termometro = new Termometro();
        termometro.temperaturaAtual = 31;
        System.out.println(termometro.passouDoLimite(30));
    }
}
