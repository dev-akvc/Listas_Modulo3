package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    static Imobiliaria imobiliaria = new Imobiliaria();


    //    Método para automatizar entrada de dados (instancia o Scanner)
    private static Scanner capturarDados(String mensagem) {
        System.out.println(mensagem);
        return new Scanner(System.in);
    }

    public static void menuInicial() {
        System.out.println("=== Bem vindo(a) ao cadastro de imóveis === \n");
        System.out.println("=== Menu ===\n 1- Exibir imóveis \n 2- Cadastrar imóveis \n 3- Sair do menu\n");
    }

    public static Morador cadastrarMoradores() {
        String nome = capturarDados("Informe o nome do morador: ").nextLine();
        String cpf = capturarDados("Informe o CPF: ").nextLine();
        String ocupacao = capturarDados("Informe a ocupação: ").nextLine();
        Morador morador = new Morador(nome, cpf, ocupacao);

        return morador;
    }

    public static Corretor cadastrarCorretor() {
        String nomeCorretor = capturarDados("Quem é o corretor?").nextLine();
        Corretor novoCorretor = new Corretor(nomeCorretor);
        return novoCorretor;
    }

    public static double aluguel() {
        double leitorAluguel = capturarDados("Informe o valor do aluguel: ").nextDouble();
        return leitorAluguel;
    }

    public static String endereco() {
        String leitorEndereco = capturarDados("Informe o endereço: ").nextLine();
        return leitorEndereco;
    }

    public static Imovel cadastrarImovel() {
        Imovel novoImovel = new Imovel();
        List<Morador> listaMoradores = new ArrayList<>();
        novoImovel.escolherEndereco(endereco());
        novoImovel.adicionarCorretor(cadastrarCorretor());
        novoImovel.adicionarMorador(cadastrarMoradores());
        novoImovel.valorDoAluguel(aluguel());
        return novoImovel;
    }

    public static void run() {
        boolean executar = true;

        while (executar) {

            menuInicial();

            int opcaoEscolhida = capturarDados("Digite sua opção: ").nextInt();
            switch (opcaoEscolhida) {

                case 1:
                    System.out.println(imobiliaria);
                    break;

                case 2:
                    imobiliaria.adicionarImovel(cadastrarImovel());
                    break;

                case 3:
                    System.out.println(" * Bye *");
                    executar = false;
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

        }

    }


}
