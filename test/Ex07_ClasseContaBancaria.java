package test;

import dominio.*;

public class Ex07_ClasseContaBancaria {
    public static void main(String[] args) {
        ContaBancaria a = new ContaBancaria();
        a.titular = "Ana";
        a.numeroConta = "1001";
        a.saldo = 300;
        System.out.println(a.titular + " | " + a.numeroConta + " | " + a.saldo);
    }
}
