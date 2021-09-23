package br.com.zup.Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual o nome?");
        String nome = entrada.nextLine();

        System.out.println("Qual é a altura?");
        double altura = entrada.nextDouble();

        System.out.println("Qual a data de nascimento?");
        System.out.print("Dia: ");
        int dia = entrada.nextInt();
        System.out.print("Mês: ");
        int mes = entrada.nextInt();
        System.out.print("Ano: ");
        int ano = entrada.nextInt();
        Data dataDeNascimento = new Data(dia, mes, ano);

        Pessoa people = new Pessoa(nome, dataDeNascimento,altura);
        people.idade(9,2021);
        people.exibirPessoa();

    }
}
