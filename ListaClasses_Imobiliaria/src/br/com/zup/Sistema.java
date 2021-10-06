package br.com.zup;

import java.util.ArrayList;
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
        System.out.println("=== Menu ===\n 1- Exibir imóveis \n 2- Cadastrar imóveis \n 3- Sair do menu\n");
    }

    public static boolean validarCpf(Imobiliaria imobiliaria, Morador morador) {
        //Percorrer lista de imóveis
        String cpf = morador.getCpf();
        for (Imovel imovelReferencia : imobiliaria.getListaImoveis()) {
            //Percorrer todas as listas de moradores
            for (Morador moradorReferencia : imovelReferencia.getMoradores()) {
                if (moradorReferencia.getCpf().equals(cpf)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static Morador receberDadosMoradores() {
        String nome = capturarDados("Informe o nome do morador: ").nextLine();
        String cpf = capturarDados("Informe o CPF: ").nextLine();
        String ocupacao = capturarDados("Informe a ocupação: ").nextLine();
        Morador morador = new Morador(nome, cpf, ocupacao);

        return morador;
    }

    public static void cadastrarListaMoradores(Imobiliaria imobiliaria, Imovel imovel) {

        boolean novoMorador = true;
        while (novoMorador) {

            int cadastrarNovoMorador = capturarDados("=== Cadastrar novo morador? ===\n 1- Sim \n 2- Não ").nextInt();
            if (cadastrarNovoMorador == 1) {
                Morador morador = receberDadosMoradores();
                boolean cpfExistente = validarCpf(imobiliaria, morador);

                if (cpfExistente) {
                    System.out.println(" * CPF já registrado no sistema * ");

                } else {
                    imovel.adicionarMorador(morador);
                }
            }
            if (cadastrarNovoMorador == 2) {
                novoMorador = false;
            }
        }
    }

    public static Corretor cadastrarCorretor() {
        String nomeCorretor = capturarDados("Quem é o corretor?").nextLine();
        Corretor novoCorretor = new Corretor(nomeCorretor);
        return novoCorretor;
    }

    public static Imovel cadastrarImovel() {
        String novoEndereco = capturarDados("Informe o endereço: ").nextLine();
        double valorAluguel = capturarDados("Informe o valor do aluguel: ").nextDouble();
        Imovel imovel = new Imovel(novoEndereco, valorAluguel);

        return imovel;
    }

    public static void run() {
        boolean executar = true;
        Imobiliaria imobiliaria = new Imobiliaria();

        while (executar) {

            menuInicial();

            int opcaoEscolhida = capturarDados("Digite sua opção: ").nextInt();
            switch (opcaoEscolhida) {

                case 1:
                    System.out.println(imobiliaria);
                    break;

                case 2:
                    Imovel imovel = cadastrarImovel();
                    imobiliaria.adicionarImovel(imovel);
                    Corretor corretor = cadastrarCorretor();
                    imovel.setCorretor(corretor);
                    cadastrarListaMoradores(imobiliaria, imovel);

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
