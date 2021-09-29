package br.com.zup;

import java.util.Scanner;

public class Sistema {
    //  Método para automatizar entrada de dados
    private static Scanner receberDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    //  Método para exibir menu
    public static void menu() {
        System.out.println(" ** Restaurante VemComFome ** ");
        System.out.println("Digite: \n 1- Cadastrar um prato \n 2- Exibir os pratos \n 3- Excluir um prato \n 4- Sair");
    }

    //  Método para cadastrar um prato
    public static Prato cadastrarPrato() {
        String nomePrato = receberDados("Nome do prato: ").nextLine();
        double valorPrato = receberDados("Valor do prato: ").nextDouble();
        Prato pratos = new Prato(nomePrato, valorPrato);
        return pratos;
    }


}
