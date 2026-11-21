package test;

import dominio.*;

public class Ex06_ClasseCelular {
    public static void main(String[] args) {
        Celular a = new Celular();
        a.marca = "Samsung";
        a.modelo = "S25";
        a.armazenamento = 256;
        a.preco = 4500;
        System.out.printf("Celular %s %s com %dGB custa R$ %.2f%n", a.marca, a.modelo, a.armazenamento, a.preco);
    }
}
