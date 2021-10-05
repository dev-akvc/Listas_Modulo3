package br.com.zup;

import java.util.List;
import java.util.Scanner;

public class Sistema {

    //    Método para automatizar entrada de dados (instancia o Scanner)
    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menuInicial() {
        System.out.println("=== Bem vindo(a) ao cadastro de imóveis === \n");
        System.out.println("Digite:\n 1- Exibir imóveis \n 2- Cadastrar imóveis \n 3- Excluir imóveis \n 4- Sair do menu");
    }

    public static List<Morador> cadastrarMoradores() {
        String nome = capturarDados("Informe o nome: ").nextLine();
        String cpf = capturarDados("Informe o CPF: ").nextLine();
        String ocupacao = capturarDados("Informe a ocupação: ").nextLine();
        boolean animalDeEstimacao = capturarDados("Tem animal de estimação? ").nextBoolean();

        Morador morador = new Morador(nome, cpf, ocupacao, animalDeEstimacao);
        return (List<Morador>) morador;
    }

//    public static Imovel cadastrarImoveis() {
//
//        return imovel;
//    }

}
