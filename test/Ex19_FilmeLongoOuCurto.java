package test;

import dominio.*;

public class Ex19_FilmeLongoOuCurto {
    public static void main(String[] args) {
        Filme filme = new Filme();
        filme.titulo = "A Jornada";
        filme.genero = "Aventura";
        filme.duracaoMinutos = 130;
        filme.classificacaoIndicativa = 12;
        System.out.println(filme.isFilmeLongo());
    }
}
