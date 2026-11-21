package test;

import dominio.*;

public class Ex37_SacarDaConta {
    public static void main(String[] args) {
        ContaBancaria a = new ContaBancaria();
        a.titular = "Ana";
        a.numeroConta = "1001";
        a.saldo = 300;
        a.sacar(100);
        System.out.println(a.saldo);
        a.sacar(500);
        System.out.println(a.saldo);
    }
}
