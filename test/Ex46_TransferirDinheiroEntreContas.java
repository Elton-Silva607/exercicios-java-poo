package test;

import dominio.*;

public class Ex46_TransferirDinheiroEntreContas {
    public static void main(String[] args) {
        ContaBancaria a = new ContaBancaria();
        a.titular = "Ana";
        a.numeroConta = "1001";
        a.saldo = 300;
        ContaBancaria b = new ContaBancaria();
        b.titular = "Bruno";
        b.numeroConta = "1002";
        b.saldo = 100;
        new Banco().transferir(a, b, 75);
        System.out.println(a.saldo + " | " + b.saldo);
    }
}
