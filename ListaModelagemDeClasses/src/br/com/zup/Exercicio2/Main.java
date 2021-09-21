package br.com.zup.Exercicio2;

public class Main {
    public static void main(String[] args) {

        //        Instanciando uma Conta
        ContaBancária karol = new ContaBancária("Karol", "4236-5", 10000);

        //        Exibindo informações da conta
        karol.exibirExtrato();

        //        Sacando dinheiro
        karol.sacarDinheiro(300.4);
        karol.exibirExtrato();

        //        Depositando dinheiro
        karol.depositarDinheiro(20000);
        karol.exibirExtrato();
    }
}
