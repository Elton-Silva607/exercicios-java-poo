package dominio;

public class Banco {


    public void transferir(ContaBancaria origem, ContaBancaria destino, double valor) {
        if (!origem.podeSacar(valor)) {
            System.out.println("Saldo insuficiente");
            return;
        }
        origem.sacar(valor);
        destino.depositar(valor);
    }
}
