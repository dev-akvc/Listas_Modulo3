package br.com.zup.Exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        CartaoCredito nubank = new CartaoCredito();

        System.out.println("Qual nome do cliente?");
        nubank.nomeCliente = entrada.next();

        nubank.exibirFatura();

        nubank.aumentarLimite(1000);
        System.out.println("O limite é: " +nubank.limiteCartao);

        nubank.diminuirLimite(200);
        System.out.println("O limite é: " +nubank.limiteCartao);

        nubank.realizarCompra(5000);
        nubank.exibirFatura();

        nubank.aumentarLimite(1000);
        System.out.println("O limite é: " +nubank.limiteCartao);

        nubank.realizarCompra(1200);
        nubank.exibirFatura();

        nubank.realizarCompra(300);
        nubank.exibirFatura();





    }
}
