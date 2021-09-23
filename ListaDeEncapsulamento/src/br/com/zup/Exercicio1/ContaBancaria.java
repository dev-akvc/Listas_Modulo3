package br.com.zup.Exercicio1;

public class ContaBancaria {
    //    Criando atributos da Classe
    String nomeCorrentista;
    String numeroConta;
    double saldoConta;

    //    Criando construtor
    public ContaBancaria() {

    }

    public ContaBancaria(String nomeCorrentista, String numeroConta, double saldoConta) {
        this.nomeCorrentista = nomeCorrentista;
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;
    }

    //    Criando métodos
    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public void setNomeCorrentista(String nomeCorrentista) {
        this.nomeCorrentista = nomeCorrentista;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void depositar(double deposito){
        saldoConta += deposito;
    }

    public void sacar(double saque){
        saldoConta -= saque;
    }

    public void extrato(){
        System.out.println("Nome do correntista é " +nomeCorrentista);
        System.out.println("Número da conta é " +numeroConta);
        System.out.println("Saldo da conta R$" +saldoConta);
    }

}
