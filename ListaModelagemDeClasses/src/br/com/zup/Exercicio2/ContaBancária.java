package br.com.zup.Exercicio2;

public class ContaBancária {
    //    Criando atributos da Classe
    String nomeCorrentista, numeroConta;
    double saldoConta;

    //    Criando construtor
    public ContaBancária() {

    }

    public ContaBancária(String nomeCorrentista, String numeroConta, double saldoConta) {
        this.nomeCorrentista = nomeCorrentista;
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
    }

    //    Criando métodos
    public void sacarDinheiro(double valorSacado) {
        saldoConta -= valorSacado;
    }

    public void depositarDinheiro(double valorDepositado) {

        saldoConta += valorDepositado;
    }

    public void exibirExtrato() {
        System.out.print("O(a) correntista " +nomeCorrentista+ ", titular da conta: " +numeroConta);
        System.out.println(", tem o saldo de R$" +saldoConta);
    }

}
