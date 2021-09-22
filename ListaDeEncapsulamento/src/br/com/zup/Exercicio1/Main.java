package br.com.zup.Exercicio1;

public class Main {
    public static void main(String[] args) {
        ContaBancaria itau = new ContaBancaria ();

        itau.extrato();
        itau.setNomeCorrentista("Karol Souza");
        itau.setNumeroConta("1256-9");
        itau.extrato();

        itau.depositar(15000);
        itau.extrato();

        itau.sacar(1000.5);
        itau.extrato();

    }
}
