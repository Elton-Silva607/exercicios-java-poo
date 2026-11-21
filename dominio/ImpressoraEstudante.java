package dominio;

public class ImpressoraEstudante {


    public void imprime(Estudante estudante) {
        System.out.printf("%s | %d anos | %c%n", estudante.nome, estudante.idade, estudante.sexo);
    }
}
