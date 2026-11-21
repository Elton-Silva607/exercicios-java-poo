package dominio;

public class Oficina {


    public void trocarVelocidades(Carro carro1, Carro carro2) {
        double velocidade = carro1.velocidadeAtual;
        carro1.velocidadeAtual = carro2.velocidadeAtual;
        carro2.velocidadeAtual = velocidade;
    }
}
