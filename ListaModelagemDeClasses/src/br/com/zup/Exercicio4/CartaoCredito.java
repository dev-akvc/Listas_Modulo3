package br.com.zup.Exercicio4;

public class CartaoCredito {
    //    Atributos do cartão
    String nomeCliente;
    double limiteCartao;
    double saldoFatura;

    public CartaoCredito() {
    } public void aumentarLimite(double valor) {
        limiteCartao += valor;
    }

    public void diminuirLimite(double valor) {
        limiteCartao -= valor;
    }

    public void realizarCompra(double valorDaCompra) {
        if (limiteCartao >= valorDaCompra) {
            limiteCartao -= valorDaCompra;
            saldoFatura += valorDaCompra;
        } else {
            System.out.println("Limite indisponível.");
        }
    }

    public void exibirFatura() {
        System.out.println("Cliente " + nomeCliente + " tem uma fatura de R$ " + saldoFatura);
    }


}
