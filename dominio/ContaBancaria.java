package dominio;

public class ContaBancaria {
    public String titular;
    public String numeroConta;
    public double saldo;

    public boolean temSaldo() {
        return saldo > 0;
    }

    public boolean podeSacar(double valorSaque) {
        return valorSaque > 0 && valorSaque <= saldo;
    }

    public void depositar(double valor) {
        if (Double.isFinite(valor) && valor > 0) {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (podeSacar(valor)) {
            saldo -= valor;
        }
        else System.out.println("Saldo insuficiente");
    }
}
