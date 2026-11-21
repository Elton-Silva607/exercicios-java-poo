package dominio;

public class ComparadorAluno {


    public Aluno retornarAlunoComMaiorMedia(Aluno aluno1, Aluno aluno2) {
        return aluno1.calcularMedia() >= aluno2.calcularMedia() ? aluno1 : aluno2;
    }
}
