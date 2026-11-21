package test;

import dominio.*;

public class Ex20_CelularPremium {
    public static void main(String[] args) {
        Celular a = new Celular();
        a.marca = "Samsung";
        a.modelo = "S25";
        a.armazenamento = 256;
        a.preco = 4500;
        Celular b = new Celular();
        b.marca = "Motorola";
        b.modelo = "G";
        b.armazenamento = 128;
        b.preco = 1800;
        System.out.println(a.isPremium() + " | " + b.isPremium());
    }
}
