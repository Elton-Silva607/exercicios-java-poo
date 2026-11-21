package test;

import dominio.*;

public class Ex08_ClasseAnimal {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.nome = "Rex";
        a.especie = "Cão";
        a.idade = 3;
        Animal b = new Animal();
        b.nome = "Luna";
        b.especie = "Gato";
        b.idade = 4;
        System.out.println(a.nome + " | " + a.especie + " | " + a.idade);
        System.out.println(b.nome + " | " + b.especie + " | " + b.idade);
    }
}
