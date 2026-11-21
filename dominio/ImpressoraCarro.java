package dominio;

public class ImpressoraCarro {


    public void imprime(Carro carro) {
        System.out.printf("%s | %s | %d | %.1f km/h%n", carro.nome, carro.modelo, carro.ano, carro.velocidadeAtual);
    }

    public void imprimir(Carro carro, int limiteDaVia) {
        imprime(carro);
        System.out.println(carro.gerarMensagemMulta(limiteDaVia));
    }
}
