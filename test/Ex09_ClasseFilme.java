package test;

import dominio.*;

public class Ex09_ClasseFilme {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.titulo = "A Jornada";
        filme.genero = "Aventura";
        filme.duracaoMinutos = 130;
        filme.classificacaoIndicativa = 12;
        System.out.println(filme.titulo + " | " + filme.genero + " | " + filme.duracaoMinutos + " | " + filme.classificacaoIndicativa);
    }
}
