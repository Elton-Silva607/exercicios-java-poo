package test;

import dominio.*;

public class Ex26_VerificarLimiteDeSaque {
    public static void main(String[] args) {
        ContaBancaria a = new ContaBancaria();
        a.titular = "Ana";
        a.numeroConta = "1001";
        a.saldo = 300;
        System.out.println(a.podeSacar(300));
        System.out.println(a.podeSacar(301));
    }
}
