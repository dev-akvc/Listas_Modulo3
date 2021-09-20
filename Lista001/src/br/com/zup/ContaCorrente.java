package br.com.zup;

public class ContaCorrente {
    String nome, numeroDaConta;
    double saldo = 0;

    public ContaCorrente(String nome, String numeroDaConta){
        this.nome = nome;
        this.numeroDaConta = numeroDaConta;
    }
}
