package dominio;

public class ImpressoraProduto {


    public void imprime(Produto produto) {
        System.out.printf("%s | R$ %.2f | %d un. | Total R$ %.2f%n", produto.nome, produto.preco, produto.quantidade, produto.calcularValorTotal());
    }
}
