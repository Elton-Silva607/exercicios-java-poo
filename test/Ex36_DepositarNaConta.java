package test;

import dominio.*;

public class Ex36_DepositarNaConta {
    public static void main(String[] args) {
        ContaBancaria a = new ContaBancaria();
        a.titular = "Ana";
        a.numeroConta = "1001";
        a.saldo = 300;
        System.out.println(a.saldo);
        a.depositar(50);
        System.out.println(a.saldo);
    }
}
