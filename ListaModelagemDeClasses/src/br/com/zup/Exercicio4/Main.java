package br.com.zup.Exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        CartaoCredito nubank = new CartaoCredito();

        System.out.println("Qual nome do cliente?");
        nubank.nomeCliente = entrada.next();

        nubank.exibirFatura();



    }
}
